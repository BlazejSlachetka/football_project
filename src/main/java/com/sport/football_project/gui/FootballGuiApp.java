package com.sport.football_project.gui;

import com.sport.football_project.clients.AreasClient;
import com.sport.football_project.clients.CompetitionsClient;
import com.sport.football_project.clients.MatchesClient;
import com.sport.football_project.clients.TeamsClient;
import com.sport.football_project.model.matches.Match;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route("football")
public class FootballGuiApp extends VerticalLayout {

    @Autowired
    public FootballGuiApp(MatchesClient matchesClient,
                          AreasClient areasClient,
                          CompetitionsClient competitionsClient,
                          TeamsClient teamsClient) {


    }
}
