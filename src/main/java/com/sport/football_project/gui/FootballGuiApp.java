package com.sport.football_project.gui;

import com.sport.football_project.clients.*;
import com.sport.football_project.common.*;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route("football")
public class FootballGuiApp extends VerticalLayout {


    @Autowired
    public FootballGuiApp(MatchesClient matchesClient,
                          AreasClient areasClient,
                          CompetitionsClient competitionsClient,
                          TeamsClient teamsClient,
                          PlayersClient playersClient) {

       // Matches matches = matchesClient.getMatchesFormFormApi();
       // Areas areas = areasClient.getAreasFormFormApi();
       // Players players = playersClient.getPlayersFormFormApi();
       // Teams teams = teamsClient.getTeamsFormFormApi();
        // Competitions competitions = competitionsClient.getCompetitionsFormFormApi();


        Label label = new Label("Podaj Nazwę Klubu");
        add(label);
        TextField textField = new TextField("Klub");
        add(textField);

       // label.setText("Klub" + textField.equals(teamsClient));





    }
}
