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
 
 package org.openconcerto.erp.injector;

import org.openconcerto.sql.model.DBRoot;
import org.openconcerto.sql.model.SQLInjector;
import org.openconcerto.sql.model.SQLTable;

public class AchatAvoirSQLInjector extends SQLInjector {
    public AchatAvoirSQLInjector(final DBRoot root) {
        super(root, "SAISIE_ACHAT", "AVOIR_FOURNISSEUR");
        final SQLTable tableFacture = getSource();
        final SQLTable tableAvoir = getDestination();
        map(tableFacture.getField("ID_FOURNISSEUR"), tableAvoir.getField("ID_FOURNISSEUR"));

        map(tableFacture.getField("NUMERO_FACTURE"), tableAvoir.getField("NOM"));
        // map(tableFacture.getField("INFOS"), tableAvoir.getField("INFOS"));
    }
}
