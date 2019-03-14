package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	//private AlienDictionary dictionary;
	private AlienDictionaryEnhanced dictionary;

	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    
    @FXML
    void doReset(ActionEvent event) {
    	
    	txtWord.clear();
    	txtResult.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String parolaInserita = txtWord.getText().toLowerCase();
    	txtWord.clear();
    	
    	String[] s = parolaInserita.trim().split(" ");
    	
    	if(s.length == 2) {
    	if(s[0].matches("[a-zA-Z]*") && s[1].matches("[a-zA-Z]*")) {
    		dictionary.addWord(s[0], s[1]);
    		txtResult.setText("Parola inserita correttamente!\n");
    	}
    	
    	}else {
    		if(parolaInserita.matches("[a-zA-Z]*")) {
    			txtResult.setText(dictionary.translateWord(parolaInserita));
    			
    		}
    	}

    }

    @FXML
    void initialize() {
    	
    	//dictionary = new AlienDictionary();
    	dictionary = new AlienDictionaryEnhanced();
    	
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}
