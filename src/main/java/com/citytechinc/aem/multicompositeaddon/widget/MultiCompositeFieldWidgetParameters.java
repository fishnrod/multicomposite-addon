package com.citytechinc.aem.multicompositeaddon.widget;

import com.citytechinc.cq.component.dialog.widget.DefaultWidgetParameters;
import com.citytechinc.cq.component.util.Constants;

public final class MultiCompositeFieldWidgetParameters extends DefaultWidgetParameters {

	private boolean matchBaseName;

	private String baseName;
	
	private String prefix;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(final String prefix) {
		this.prefix = prefix;
	}

	@Override
	public String getPrimaryType() {
		return Constants.CQ_WIDGET;
	}

	@Override
	public void setPrimaryType(final String primaryType) {
		throw new UnsupportedOperationException("PrimaryType is Static for DialogFieldSetWidget");
	}

	@Override
	public String getXtype() {
		return MultiCompositeFieldWidget.XTYPE;
	}

	@Override
	public void setXtype(final String xtype) {
		throw new UnsupportedOperationException("xtype is Static for DialogFieldSetWidget");
	}

	public boolean isMatchBaseName() {
		return matchBaseName;
	}

	public void setMatchBaseName(final boolean matchBaseName) {
		this.matchBaseName = matchBaseName;
	}
	
	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(final String baseName) {
		this.baseName = baseName;
	}
	
}