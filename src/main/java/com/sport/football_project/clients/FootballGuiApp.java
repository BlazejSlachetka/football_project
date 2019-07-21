package com.sport.football_project.clients;


import com.sport.football_project.model.football.Filters;
import com.sport.football_project.model.football.Football;
import com.sport.football_project.model.matches.Matches;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;


@Route("football")
public class FootballGuiApp extends VerticalLayout {

@Autowired
    public FootballGuiApp (MatchesClient matchesClient, FiltersClient filtersClient){

    Filters filters = filtersClient.getFiltersFormApi();
    Matches matches = matchesClient.getMatchesFormFormApi();

    Label textLabel = new Label("TO JEST FOOTBALL");
    add(textLabel);


    Label filterLabel = new Label(filtersClient.getFiltersFormApi().getDateTo());
    add(filterLabel);

    Label filterLabel2 = new Label(filtersClient.getFiltersFormApi().getDateFrom());
    add(filterLabel2);

    Label matchesLabel =  new Label(matchesClient.getMatchesFormFormApi().getGroup());
    add(matchesLabel);

}

    private void addListener(Label filterLabel) {
    }


}
