package org.eclipse.e4.ui.workbench.renderers.swt;

import org.eclipse.e4.ui.workbench.renderers.swt.CTabRendering;
import org.eclipse.swt.custom.CTabFolder;

@SuppressWarnings("restriction")
public class ExtendedCTabRendering extends CTabRendering {

    public ExtendedCTabRendering(CTabFolder parent) {
        super(parent);
        setCornerRadius(2);
    }
}
