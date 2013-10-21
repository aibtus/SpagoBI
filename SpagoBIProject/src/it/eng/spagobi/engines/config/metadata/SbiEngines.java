/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.spagobi.engines.config.metadata;

import it.eng.spagobi.commons.metadata.SbiDomains;
import it.eng.spagobi.commons.metadata.SbiHibernateModel;

import java.util.HashSet;
import java.util.Set;





/**
 * SbiEngines generated by hbm2java
 */
public class SbiEngines  extends SbiHibernateModel {

    // Fields    

     private Integer engineId;
     private Short encrypt;
     private String name;
     private String descr;
     private String mainUrl;
     private String secnUrl;
     private String objUplDir;
     private String objUseDir;
     private String driverNm;
     private String label;     
     private SbiDomains engineType;
     private String classNm;
     private SbiDomains biobjType; 
     private Boolean useDataSource;
     private Boolean useDataSet;
     private Set sbiExporterses = new HashSet(0);


    // Constructors

	/**
     * default constructor.
     */
    public SbiEngines() {
    }
    
    /**
     * constructor with id.
     * 
     * @param engineId the engine id
     */
    public SbiEngines(Integer engineId) {
        this.engineId = engineId;
    }
   
    
    

    // Property accessors

    /**
     * Gets the engine id.
     * 
     * @return the engine id
     */
    public Integer getEngineId() {
        return this.engineId;
    }
    
    /**
     * Sets the engine id.
     * 
     * @param engineId the new engine id
     */
    public void setEngineId(Integer engineId) {
        this.engineId = engineId;
    }

    /**
     * Gets the encrypt.
     * 
     * @return the encrypt
     */
    public Short getEncrypt() {
        return this.encrypt;
    }
    
    /**
     * Sets the encrypt.
     * 
     * @param encrypt the new encrypt
     */
    public void setEncrypt(Short encrypt) {
        this.encrypt = encrypt;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Sets the name.
     * 
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the descr.
     * 
     * @return the descr
     */
    public String getDescr() {
        return this.descr;
    }
    
    /**
     * Sets the descr.
     * 
     * @param descr the new descr
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * Gets the main url.
     * 
     * @return the main url
     */
    public String getMainUrl() {
        return this.mainUrl;
    }
    
    /**
     * Sets the main url.
     * 
     * @param mainUrl the new main url
     */
    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    /**
     * Gets the secn url.
     * 
     * @return the secn url
     */
    public String getSecnUrl() {
        return this.secnUrl;
    }
    
    /**
     * Sets the secn url.
     * 
     * @param secnUrl the new secn url
     */
    public void setSecnUrl(String secnUrl) {
        this.secnUrl = secnUrl;
    }

    /**
     * Gets the obj upl dir.
     * 
     * @return the obj upl dir
     */
    public String getObjUplDir() {
        return this.objUplDir;
    }
    
    /**
     * Sets the obj upl dir.
     * 
     * @param objUplDir the new obj upl dir
     */
    public void setObjUplDir(String objUplDir) {
        this.objUplDir = objUplDir;
    }

    /**
     * Gets the obj use dir.
     * 
     * @return the obj use dir
     */
    public String getObjUseDir() {
        return this.objUseDir;
    }
    
    /**
     * Sets the obj use dir.
     * 
     * @param objUseDir the new obj use dir
     */
    public void setObjUseDir(String objUseDir) {
        this.objUseDir = objUseDir;
    }

    /**
     * Gets the driver nm.
     * 
     * @return the driver nm
     */
    public String getDriverNm() {
        return this.driverNm;
    }
    
    /**
     * Sets the driver nm.
     * 
     * @param driverNm the new driver nm
     */
    public void setDriverNm(String driverNm) {
        this.driverNm = driverNm;
    }

	/**
	 * Gets the label.
	 * 
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Sets the label.
	 * 
	 * @param label the new label
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
    /**
     * Gets the biobj type.
     * 
     * @return the biobj type
     */
    public SbiDomains getBiobjType() {
		return biobjType;
	}

	/**
	 * Sets the biobj type.
	 * 
	 * @param biobjType the new biobj type
	 */
	public void setBiobjType(SbiDomains biobjType) {
		this.biobjType = biobjType;
	}

	/**
	 * Gets the class nm.
	 * 
	 * @return the class nm
	 */
	public String getClassNm() {
		return classNm;
	}

	/**
	 * Sets the class nm.
	 * 
	 * @param classNm the new class nm
	 */
	public void setClassNm(String classNm) {
		this.classNm = classNm;
	}

	/**
	 * Gets the engine type.
	 * 
	 * @return the engine type
	 */
	public SbiDomains getEngineType() {
		return engineType;
	}

	/**
	 * Sets the engine type.
	 * 
	 * @param engineType the new engine type
	 */
	public void setEngineType(SbiDomains engineType) {
		this.engineType = engineType;
	}


	/**
	 * Gets the use data source.
	 * 
	 * @return the use data source
	 */
	public Boolean getUseDataSource() {
		return useDataSource;
	}

	/**
	 * Sets the use data source.
	 * 
	 * @param useDataSource the new use data source
	 */
	public void setUseDataSource(Boolean useDataSource) {
		this.useDataSource = useDataSource;
	}

	/**
	 * Gets the use data set.
	 * 
	 * @return the use data set
	 */
	public Boolean getUseDataSet() {
		return useDataSet;
	}

	/**
	 * Sets the use data set.
	 * 
	 * @param useDataSet the new use data set
	 */
	public void setUseDataSet(Boolean useDataSet) {
		this.useDataSet = useDataSet;
	}

	public Set getSbiExporterses() {
		return sbiExporterses;
	}

	public void setSbiExporterses(Set sbiExporterses) {
		this.sbiExporterses = sbiExporterses;
	}


	
}