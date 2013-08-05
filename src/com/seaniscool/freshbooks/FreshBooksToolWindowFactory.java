package com.seaniscool.freshbooks;

import java.awt.*;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.seaniscool.freshbooks.ui.FreshBooksPanel;

/**
 * A {@link ToolWindow} factory.<br/>
 * Lazy initializes the window when called.
 *
 * @author Sean Connolly
 */
public class FreshBooksToolWindowFactory implements ToolWindowFactory {

	/**
	 * Create the given {@code toolWindow}, adding a {@link FreshBooksPanel} to
	 * it's contents.
	 *
	 * @param project
	 *            the current active project
	 * @param toolWindow
	 *            the tool window which needs to be created
	 */
	@Override
	public void createToolWindowContent(Project project, ToolWindow toolWindow) {
		Component component = toolWindow.getComponent();
		component.getParent().add(new FreshBooksPanel());
	}

}
