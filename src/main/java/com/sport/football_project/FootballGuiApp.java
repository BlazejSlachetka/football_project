package com.sport.football_project;


import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route("football")
public class FootballGuiApp extends VerticalLayout {

@Autowired
    public FootballGuiApp (FootballClient footballClient){

    Football football = footballClient.getFootballFormApi();

    Label labelFootball = new Label(footballClient.getFootballFormApi().getFilters().getDateFrom());
    add(labelFootball);

    System.out.println("");



}



}
