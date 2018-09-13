/**
 * 
 */
package com.canada.browzer.ui.commons;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.org.apache.xerces.internal.util.NamespaceContextWrapper;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 * @author MENAD
 *
 */
@SpringUI(path = "/ui")
@Title("Browzer")
@Theme("valo")
public class BrowzerMainUi extends com.vaadin.ui.UI {
	
	@Autowired
	private UIComponentsBuilder uiComponentsBuilder;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final String NAME = "/ui";

	

	@Override
	protected void init(VaadinRequest request) {
		
		// Components for the UI
		final Panel changePanel = new Panel();
		final Panel LogoPanel = new Panel();
		final Panel contentPanel = new Panel();
		final Component logo =  uiComponentsBuilder.createComponent();
		final Component menu =  uiComponentsBuilder.createComponent();
		
		changePanel.setHeight("100%");
		
		VerticalLayout rootLayout = new VerticalLayout(); 
		rootLayout.setSizeFull();
		rootLayout.setMargin(true);
		
		contentPanel.setHeight("100%");
		contentPanel.setWidth("75%");
		LogoPanel.setWidth("75");
		LogoPanel.setHeightUndefined();
		
		//Set up the horizontal layout for the ui
		
		final HorizontalLayout horizontalLayout = new HorizontalLayout();
		horizontalLayout.setSizeFull();
		horizontalLayout.setMargin(true);
		 
		
		//Set up the components in the layout
		horizontalLayout.addComponent(menu);
		horizontalLayout.addComponent(changePanel);
		
		
		horizontalLayout.setComponentAlignment(changePanel,Alignment.TOP_CENTER);
		horizontalLayout.setComponentAlignment(menu, Alignment.TOP_CENTER);
		
		
		horizontalLayout.setExpandRatio(menu, 1);
		horizontalLayout.setExpandRatio(changePanel, 4 );
		
		
		
		LogoPanel.setContent(logo);
		
		contentPanel.setContent(horizontalLayout);
		 
		rootLayout.addComponent(LogoPanel);
		rootLayout.addComponent(contentPanel); 
		
		rootLayout.setComponentAlignment(LogoPanel, Alignment.TOP_LEFT);
		rootLayout.setComponentAlignment(contentPanel, Alignment.TOP_CENTER);
		 
		rootLayout.setExpandRatio(contentPanel,1);
		 

		setContent(rootLayout);

	}

}
