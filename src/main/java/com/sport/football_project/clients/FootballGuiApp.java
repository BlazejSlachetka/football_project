package com.sport.football_project.clients;


import com.sport.football_project.clients.FiltersClient;
import com.sport.football_project.clients.FootballClient;
import com.sport.football_project.model.football.Football;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route("football")
public class FootballGuiApp extends VerticalLayout {

@Autowired
    public FootballGuiApp (FootballClient footballClient, FiltersClient filtersClient){

    Football football = footballClient.getFootballFormApi();

    Label textLabel = new Label("TO JEST FOOTBALL");
    add(textLabel);

    Label labelFootball = new Label("10");
    add(labelFootball);

}



}
