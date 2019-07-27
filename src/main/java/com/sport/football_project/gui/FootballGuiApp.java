package com.sport.football_project.gui;

import com.sport.football_project.clients.AreasClient;
import com.sport.football_project.clients.CompetitionsClient;
import com.sport.football_project.clients.MatchesClient;
import com.sport.football_project.clients.TeamsClient;;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.beans.factory.annotation.Autowired;


@Route("football")
public class FootballGuiApp extends VerticalLayout {


    @Push
    @Theme(Lumo.class)
    @BodySize(height = "100vh", width = "100vw")
    public class DemoRouterLayout extends HybridMenu {
        private static final long serialVersionUID = 2766167599243004212L;

    }

    @Autowired
    public FootballGuiApp(MatchesClient matchesClient,
                          AreasClient areasClient,
                          CompetitionsClient competitionsClient,
                          TeamsClient teamsClient) {


    }
}
