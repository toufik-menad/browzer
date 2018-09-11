/**
 * 
 */
package com.canada.browzer.ui.commons;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * @author MENAD
 *
 */
@SpringUI(path = "/ui")
@Title("Browzer")
@Theme("valo")
public class BrowzerMainUi extends com.vaadin.ui.UI{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final String NAME ="/ui";

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout rootLayout = new VerticalLayout();
		
		rootLayout.addComponent(new Label("test"));
		
		setContent(rootLayout); 
		
	}

}
