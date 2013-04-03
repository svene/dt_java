package ${packagename};

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBuilder;
import javafx.scene.layout.Pane;
import javafx.scene.layout.PaneBuilder;
import javafx.scene.layout.VBoxBuilder;
import javafx.stage.Stage;
import org.opendolphin.core.PresentationModel;
import org.opendolphin.core.client.ClientAttribute;
import org.opendolphin.core.client.ClientDolphin;
import org.opendolphin.core.client.ClientPresentationModel;
import org.opendolphin.core.client.comm.OnFinishedHandlerAdapter;

import java.util.List;

import static ${packagename}.ApplicationConstants.*;


public class Application extends javafx.application.Application {
    static ClientDolphin clientDolphin;

    private PresentationModel textAttributeModel;

    private Button button;

    public Application() {
        textAttributeModel = clientDolphin.presentationModel(PM_APP, new ClientAttribute(ATT_ATTR_ID, null));
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Application Title");

        Pane root = setupStage();
        addClientSideAction();
        setupBinding();


        stage.setScene(new Scene(root, 300, 300));
        stage.setTitle(getClass().getName());
        stage.show();

    }

    private Pane setupStage() {
        return PaneBuilder.create().children(
                VBoxBuilder.create().children(
                        button = ButtonBuilder.create()
                                .text("click me")
                                .build()).build()
        ).build();
    }

    private void setupBinding() {

    }

    private void addClientSideAction() {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                clientDolphin.send(COMMAND_ID, new OnFinishedHandlerAdapter() {
                    @Override
                    public void onFinished(List<ClientPresentationModel> presentationModels) {
                        textAttributeModel.getAt(ATT_ATTR_ID).rebase();
                    }
                });
            }
        });
    }
}
