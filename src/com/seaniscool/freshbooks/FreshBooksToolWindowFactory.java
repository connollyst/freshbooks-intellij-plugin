package com.seaniscool.freshbooks;

import java.awt.*;

import javax.swing.*;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;

/**
 * @author Sean Connolly
 */
public class FreshBooksToolWindowFactory implements ToolWindowFactory {

	@Override
	public void createToolWindowContent(Project project, ToolWindow toolWindow) {
		Component component = toolWindow.getComponent();
		component.getParent().add(new JLabel("Hello, World!"));
	}

}
