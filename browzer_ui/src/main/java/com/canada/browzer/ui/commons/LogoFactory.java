/**
* 
*/
package com.canada.browzer.ui.commons;


import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.VerticalLayout;

/**
 * @author MENAD
 *
 */
@org.springframework.stereotype.Component
public class LogoFactory implements UIComponentsBuilder {

	private class LogoLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Embedded logo;


		
		
		public LogoLayout createInstance() {
			logo = new Embedded();
			logo.setSource(new ThemeResource("../../images/logoSample.png"));
			logo.setWidth("200px");
			logo.setHeight("200px");
			return this;
		}
		
		public LogoLayout layout() {
			addComponent(logo);
			setComponentAlignment(logo, Alignment.MIDDLE_CENTER);
			return this; 
		}

	}

	@Override
	public Component createComponent() {
		return new LogoLayout().createInstance().layout(); 
	}

}
