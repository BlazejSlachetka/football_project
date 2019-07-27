package com.sport.football_project.gui;

import com.sport.football_project.clients.*;
import com.sport.football_project.common.*;
import com.sport.football_project.model.teams.Team;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

;


@Route("football")
public class FootballGuiApp extends VerticalLayout {


    @Autowired
    public FootballGuiApp(MatchesClient matchesClient,
                          AreasClient areasClient,
                          CompetitionsClient competitionsClient,
                          TeamsClient teamsClient,
                          PlayersClient playersClient) {

        Matches matches = matchesClient.getMatchesFormFormApi();
        Areas areas = areasClient.getAreasFormFormApi();
        Players players = playersClient.getPlayersFormFormApi();
        Teams teams = teamsClient.getTeamsFormFormApi();
        Competitions competitions = competitionsClient.getCompetitionsFormFormApi();

        Label labelMatches = new Label(matchesClient.getMatchesFormFormApi().getFilters().getPermission());
        add(labelMatches);







    }
}
