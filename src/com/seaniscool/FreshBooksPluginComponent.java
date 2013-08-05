package com.seaniscool;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.components.ApplicationComponent;

/**
 * @author Sean Connolly
 */
public class FreshBooksPluginComponent implements ApplicationComponent {

	public FreshBooksPluginComponent() {
	}

	@Override
	public void initComponent() {

	}

	@Override
	public void disposeComponent() {
	}

	@NotNull
	@Override
	public String getComponentName() {
		return "FreshBooksPluginComponent";
	}

}
