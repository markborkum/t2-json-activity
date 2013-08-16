package uk.ac.soton.mib104.t2.activities.json.ui.serviceprovider;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import net.sf.taverna.t2.workbench.activityicons.ActivityIconSPI;
import net.sf.taverna.t2.workflowmodel.processor.activity.Activity;

import uk.ac.soton.mib104.t2.activities.json.JSONTemplateActivity;

public final class JSONTemplateServiceIcon implements ActivityIconSPI {

	private static Icon icon;

	public static final Icon getIcon() {
		if (icon == null) {
			icon = new ImageIcon(JSONTemplateServiceIcon.class.getResource("/json.png"));
		}
		
		return icon;
	}

	@Override
	public int canProvideIconScore(final Activity<?> activity) {
		if (activity == null) {
			return NO_ICON;
		} else if (activity instanceof JSONTemplateActivity) {
			return DEFAULT_ICON;
		} else {
			return NO_ICON;
		}
	}
	
	@Override
	public Icon getIcon(final Activity<?> activity) {
		return getIcon();
	}

}