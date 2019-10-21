package com.example.josycom.aad_team_44_animation_challenge.utilities;

import java.util.ArrayList;
import java.util.HashMap;

public class DataManager {
    private ArrayList<Questions> questionsList = new ArrayList<>();

    public static DataManager ourInstance = null;
    public static DataManager getInstance(int i){
        if(ourInstance == null){
            if(i==0){
                ourInstance = new DataManager();
                ourInstance.initializeSportsQuiz();
            }else if(i==1){
                ourInstance = new DataManager();
               ourInstance.initializeCurrentAffairsQuiz();
            }
        }
        return ourInstance;
    }

    public static ArrayList<HashMap<String, String>> getQuestions(){
        return Questions.getArrayList();
    }

    private void initializeSportsQuiz(){
        Questions.getArrayList().clear();

        Questions question = new Questions(1,
                "Who won the 2018 Russia world cup","sports",
                "Spain","Belgium",
                "Croatia","France","France");

        Questions question1 = new Questions(2,
                "Who won the 2019 women world cup","sports",
                "Spain","USA",
                "Croatia","France","USA");

        Questions question2 = new Questions(3,
                "Who won the 2006 world cup","sports",
                "Spain","Belgium",
                "Italy","France","Italy");

        Questions question3 = new Questions(4,
                "The Best player in football after messi and ronaldo is","sports",
                "mikel obi","neymar junior",
                "mesut ozil","mbambe young","mbambe young");

        Questions question4 = new Questions(5,
                "Which team won the European Champions league last season","sports",
                "Barcelona","Manchester United",
                "Inter milan","Liverpool","Liverpool");

        Questions question5 = new Questions(6,
                "Which team won the La Liga title 2018/2019 season","sports",
                "chelsea","PSG",
                "Barcelona","Monaco","Barcelona");
    }


    private void initializeCurrentAffairsQuiz(){
        Questions.getArrayList().clear();
        Questions question = new Questions(1,
                "Who formed the first political party in Nigeria?","currentAffairs",
                "Herbert Macaulay","Nnamdi Azikwe",
                "Abubakar Tafawa Balewa","Ahadu Bello","Herbert Macaulay");

        Questions question1 = new Questions(2,
                " What was the first political party in Nigeria?","currentAffairs",
                "Advances People’s Democratic Alliance(APDA)"," Nigerian National Democratic Party(NNDP)",
                "Social Democratic Mega Party (SDMP)","Labour Party","Nigerian National Democratic party (NNDP)");

        Questions question2 = new Questions(3,
                "What does the eagle in the Nigerian coat of arm represent?","currentAffairs",
                "Patience","Dignity",
                "Strength","Peace","Strength");

        Questions question3 = new Questions(4,
                "What do the two horses on the Nigerian coat of arm represent?","currentAffairs",
                "Strength","Love",
                "Peace","Dignity","Dignity");

        Questions question4 = new Questions(5,
                "What was the black shield in the Nigerian coat of arm stand for?","currentAffairs",
                "Nigerian’s Unity","Nigerian’s Freedom",
                "Nigerian’s Fertile Soil","Nigerians Dignity","Nigerian’s fertile soil");

        Questions question5 = new Questions(6,
                "Nigeria is divided into how many geopolitical zones?","currentAffairs",
                "four","six",
                "eight","twelve","six");
    }

}