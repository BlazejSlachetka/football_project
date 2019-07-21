package com.sport.football_project.clients;


import com.sport.football_project.model.football.Football;
import com.sport.football_project.model.matches.Matches;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route("football")
public class FootballGuiApp extends VerticalLayout {

@Autowired
    public FootballGuiApp (MatchesClient matchesClient){

    Matches matches = matchesClient.getMatchesFormFormApi();
    Label textLabel = new Label("TO JEST FOOTBALL");
    add(textLabel);

    Label labelMatches = new Label(matchesClient.getMatchesFormFormApi().getGroup());
    add(labelMatches);

}


}
