package ${packagename}

import javafx.collections.ObservableList
import javafx.collections.FXCollections
import org.opendolphin.core.client.ClientDolphin
import org.opendolphin.core.client.ClientPresentationModel

import static groovyx.javafx.GroovyFX.start

class LibraryView {
	static show(ClientDolphin clientDolphin) {

		start { app ->
			def sgb = delegate
			stage title:'Dolphin Library', {
				scene width: 1000, height: 600, stylesheets: 'main.css', {
					pane {
						text "Hello!", id: 'hello'
					}
				}
			}
			primaryStage.show()
		}
	}
}
