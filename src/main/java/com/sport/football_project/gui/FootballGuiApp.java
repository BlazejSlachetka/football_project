package com.sport.football_project.gui;

import com.sport.football_project.clients.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
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
        String teams;
        // Competitions competitions = competitionsClient.getCompetitionsFormFormApi();


        Label label = new Label("Podaj Nazwę Klubu");
        add(label);
        TextField textField = new TextField("Klub");
        add(textField);
        Button buttonOK = new Button(new Icon(VaadinIcon.ACADEMY_CAP));
        add(buttonOK);

       // Label labelTeam = new Label(teamsClient.getTeamsFormFormApi().toString());
       // add(labelTeam);

        buttonOK.addClickListener(click -> {
            Label labelTeam = new Label(teamsClient.getTeamsFormFormApi().toString());
            add(labelTeam);
            labelTeam.setText("Klub" + textField);
        });

    }
}
