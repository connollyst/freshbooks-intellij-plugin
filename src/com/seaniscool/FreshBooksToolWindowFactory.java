package com.seaniscool;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;

/**
 * @author Sean Connolly
 */
public class FreshBooksToolWindowFactory implements ToolWindowFactory {

	@Override
	public void createToolWindowContent(Project project, ToolWindow toolWindow) {
        System.out.println("Creating a tool window!");
	}

}
