/**
 * Copyright (C) 2013, University of Manchester and University of Southampton
 *
 * Licensed under the GNU Lesser General Public License v2.1
 * See the "LICENSE" file that is distributed with the source code for license terms. 
 */
package uk.ac.soton.mib104.t2.activities.json.ui.serviceprovider;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import net.sf.taverna.t2.workbench.activityicons.ActivityIconSPI;
import net.sf.taverna.t2.workflowmodel.processor.activity.Activity;

import uk.ac.soton.mib104.t2.activities.json.JSONPathActivity;

public final class JSONPathServiceIcon implements ActivityIconSPI {

	private static Icon icon;

	public static Icon getIcon() {
		if (icon == null) {
			icon = new ImageIcon(JSONPathServiceIcon.class.getResource("/goessner.png"));
		}
		
		return icon;
	}

	public int canProvideIconScore(final Activity<?> activity) {
		if (activity == null) {
			return NO_ICON;
		} else if (activity instanceof JSONPathActivity) {
			return DEFAULT_ICON;
		} else {
			return NO_ICON;
		}
	}
	
	public Icon getIcon(final Activity<?> activity) {
		return getIcon();
	}

}
