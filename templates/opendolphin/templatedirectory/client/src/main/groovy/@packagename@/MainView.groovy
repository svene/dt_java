package ${packagename}

import javafx.collections.ObservableList
import javafx.collections.FXCollections
import org.opendolphin.core.client.ClientDolphin
import org.opendolphin.core.client.ClientPresentationModel

import static groovyx.javafx.GroovyFX.start

class MainView {
	static show(ClientDolphin clientDolphin) {

		start { app ->
			def sgb = delegate
			stage title:'${projectName}', {
				scene(fill: BLACK, width: 650, height: 250) {
					hbox(padding: 60) {
						text(text: 'Open', font: '80pt sanserif') {
							fill linearGradient(endX: 0, stops: [PALEGREEN, SEAGREEN])
						}
						text(text: ' Dolphin', font: '80pt sanserif') {
							fill linearGradient(endX: 0, stops: [CYAN, DODGERBLUE])
							effect dropShadow(color: DODGERBLUE, radius: 25, spread: 0.25)
						}
					}
				}
			}
			primaryStage.show()
		}
	}
}
