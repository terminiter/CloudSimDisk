/*
 * Title:        CloudSim EES Extention
 * Description:  CloudSim extention for Energy Efficient Storage
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2015, Luleå University of Techonology
 */
package org.cloudbus.cloudsim.power.models.harddrives;

/**
 * The power model of a Toshiba MG04SCA Enterprise.
 *
 * Info source: http://www.storagereview.com/toshiba_mg04sca_enterprise_hdd_review
 * 
 * @author Baptiste Louis
 */
public class PowerModeHddToshibaMG04SCAEnterprise extends PowerModelHdd{

    /**
     * The power consumption of the HDD in idle mode in W.
     */
    private final double powerIdle = 6.2;
    
    /**
     * The power consumption of the HDD in operation mode in W.
     */
    private final double powerOpe = 11.3;
    
    /*
     * Gets the power data. See PowerModelSpecPower.java fore more understanding.
     * 
     * @param key 0 for Idle mode, 1 for operation mode.
     * @return the power data
     */
    @Override
    protected double getPowerData(int key) {
        if (key == 0) {
            return powerIdle;
        } else {
            return powerOpe;
        }
    }

}