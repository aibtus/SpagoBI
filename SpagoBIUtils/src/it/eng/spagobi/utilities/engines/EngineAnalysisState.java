/*
 * SpagoBI, the Open Source Business Intelligence suite
 * � 2005-2015 Engineering Group
 *
 * This file is part of SpagoBI. SpagoBI is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 2.1 of the License, or any later version. 
 * SpagoBI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details. You should have received
 * a copy of the GNU Lesser General Public License along with SpagoBI. If not, see: http://www.gnu.org/licenses/.
 * The complete text of SpagoBI license is included in the COPYING.LESSER file. 
 */
package it.eng.spagobi.utilities.engines;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Andrea Gioia (andrea.gioia@eng.it)
 *
 */
public abstract class EngineAnalysisState implements IEngineAnalysisState {
	
	Map properties;
	
	/**
	 * Instantiates a new engine analysis state.
	 * 
	 * @param rowData the row data
	 */
	public EngineAnalysisState() {
		properties = new HashMap();
	}
	

	/* (non-Javadoc)
	 * @see it.eng.spagobi.utilities.engines.IEngineAnalysisState#getProperty(java.lang.Object)
	 */
	public Object getProperty(Object pName) {
		return properties.get( pName ); 
	}
	
	/* (non-Javadoc)
	 * @see it.eng.spagobi.utilities.engines.IEngineAnalysisState#setProperty(java.lang.Object, java.lang.Object)
	 */
	public void setProperty(Object pName, Object pValue) {
		properties.put( pName, pValue ); 
	}
	
	/* (non-Javadoc)
	 * @see it.eng.spagobi.utilities.engines.IEngineAnalysisState#containsProperty(java.lang.Object)
	 */
	public boolean containsProperty(Object pName) {
		return properties.containsKey( pName ); 
	}
	
	/* (non-Javadoc)
	 * @see it.eng.spagobi.utilities.engines.IEngineAnalysisState#propertyNameSet()
	 */
	public Set propertyNameSet() {
		return properties.keySet(); 
	}
	
	public String toString() {
		StringBuffer buffer = null;
		Iterator it = null;
		
		buffer = new StringBuffer();
		it = propertyNameSet().iterator();
		while( it.hasNext() ) {
			Object pName = it.next();
			Object pValue = getProperty( pName );
			buffer.append( pName.toString() + "=" + pValue.toString() + "; ");
		}
		
		return buffer.toString();
	}
	
}
