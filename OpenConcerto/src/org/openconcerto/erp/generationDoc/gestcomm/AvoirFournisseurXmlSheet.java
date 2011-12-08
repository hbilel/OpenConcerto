/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 2011 OpenConcerto, by ILM Informatique. All rights reserved.
 * 
 * The contents of this file are subject to the terms of the GNU General Public License Version 3
 * only ("GPL"). You may not use this file except in compliance with the License. You can obtain a
 * copy of the License at http://www.gnu.org/licenses/gpl-3.0.html See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each file.
 */
 
 package org.openconcerto.erp.generationDoc.gestcomm;

import org.openconcerto.erp.generationDoc.AbstractSheetXMLWithDate;
import org.openconcerto.erp.preferences.PrinterNXProps;
import org.openconcerto.sql.Configuration;
import org.openconcerto.sql.model.SQLRow;

public class AvoirFournisseurXmlSheet extends AbstractSheetXMLWithDate {

    public static final String TEMPLATE_ID = "AvoirF";
    public static final String TEMPLATE_PROPERTY_NAME = "LocationAvoirF";

    public AvoirFournisseurXmlSheet(SQLRow row) {
        super(row);
        this.printer = PrinterNXProps.getInstance().getStringProperty("BonPrinter");
        this.elt = Configuration.getInstance().getDirectory().getElement("AVOIR_FOURNISSEUR");
    }

    @Override
    public String getDefaultTemplateId() {
        return TEMPLATE_ID;
    }

    @Override
    public String getName() {
        return "AvoirF_" + this.row.getID();
    }
}
