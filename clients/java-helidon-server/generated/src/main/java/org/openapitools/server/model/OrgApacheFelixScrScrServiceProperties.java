package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixScrScrServiceProperties   {

    private ConfigNodePropertyDropDown dsLoglevel;
    private ConfigNodePropertyBoolean dsFactoryEnabled;
    private ConfigNodePropertyBoolean dsDelayedKeepInstances;
    private ConfigNodePropertyInteger dsLockTimeoutMilliseconds;
    private ConfigNodePropertyInteger dsStopTimeoutMilliseconds;
    private ConfigNodePropertyBoolean dsGlobalExtender;

    /**
     * Default constructor.
     */
    public OrgApacheFelixScrScrServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixScrScrServiceProperties.
     *
     * @param dsLoglevel dsLoglevel
     * @param dsFactoryEnabled dsFactoryEnabled
     * @param dsDelayedKeepInstances dsDelayedKeepInstances
     * @param dsLockTimeoutMilliseconds dsLockTimeoutMilliseconds
     * @param dsStopTimeoutMilliseconds dsStopTimeoutMilliseconds
     * @param dsGlobalExtender dsGlobalExtender
     */
    public OrgApacheFelixScrScrServiceProperties(
        ConfigNodePropertyDropDown dsLoglevel, 
        ConfigNodePropertyBoolean dsFactoryEnabled, 
        ConfigNodePropertyBoolean dsDelayedKeepInstances, 
        ConfigNodePropertyInteger dsLockTimeoutMilliseconds, 
        ConfigNodePropertyInteger dsStopTimeoutMilliseconds, 
        ConfigNodePropertyBoolean dsGlobalExtender
    ) {
        this.dsLoglevel = dsLoglevel;
        this.dsFactoryEnabled = dsFactoryEnabled;
        this.dsDelayedKeepInstances = dsDelayedKeepInstances;
        this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
        this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
        this.dsGlobalExtender = dsGlobalExtender;
    }



    /**
     * Get dsLoglevel
     * @return dsLoglevel
     */
    public ConfigNodePropertyDropDown getDsLoglevel() {
        return dsLoglevel;
    }

    public void setDsLoglevel(ConfigNodePropertyDropDown dsLoglevel) {
        this.dsLoglevel = dsLoglevel;
    }

    /**
     * Get dsFactoryEnabled
     * @return dsFactoryEnabled
     */
    public ConfigNodePropertyBoolean getDsFactoryEnabled() {
        return dsFactoryEnabled;
    }

    public void setDsFactoryEnabled(ConfigNodePropertyBoolean dsFactoryEnabled) {
        this.dsFactoryEnabled = dsFactoryEnabled;
    }

    /**
     * Get dsDelayedKeepInstances
     * @return dsDelayedKeepInstances
     */
    public ConfigNodePropertyBoolean getDsDelayedKeepInstances() {
        return dsDelayedKeepInstances;
    }

    public void setDsDelayedKeepInstances(ConfigNodePropertyBoolean dsDelayedKeepInstances) {
        this.dsDelayedKeepInstances = dsDelayedKeepInstances;
    }

    /**
     * Get dsLockTimeoutMilliseconds
     * @return dsLockTimeoutMilliseconds
     */
    public ConfigNodePropertyInteger getDsLockTimeoutMilliseconds() {
        return dsLockTimeoutMilliseconds;
    }

    public void setDsLockTimeoutMilliseconds(ConfigNodePropertyInteger dsLockTimeoutMilliseconds) {
        this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
    }

    /**
     * Get dsStopTimeoutMilliseconds
     * @return dsStopTimeoutMilliseconds
     */
    public ConfigNodePropertyInteger getDsStopTimeoutMilliseconds() {
        return dsStopTimeoutMilliseconds;
    }

    public void setDsStopTimeoutMilliseconds(ConfigNodePropertyInteger dsStopTimeoutMilliseconds) {
        this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
    }

    /**
     * Get dsGlobalExtender
     * @return dsGlobalExtender
     */
    public ConfigNodePropertyBoolean getDsGlobalExtender() {
        return dsGlobalExtender;
    }

    public void setDsGlobalExtender(ConfigNodePropertyBoolean dsGlobalExtender) {
        this.dsGlobalExtender = dsGlobalExtender;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixScrScrServiceProperties {\n");
        
        sb.append("    dsLoglevel: ").append(toIndentedString(dsLoglevel)).append("\n");
        sb.append("    dsFactoryEnabled: ").append(toIndentedString(dsFactoryEnabled)).append("\n");
        sb.append("    dsDelayedKeepInstances: ").append(toIndentedString(dsDelayedKeepInstances)).append("\n");
        sb.append("    dsLockTimeoutMilliseconds: ").append(toIndentedString(dsLockTimeoutMilliseconds)).append("\n");
        sb.append("    dsStopTimeoutMilliseconds: ").append(toIndentedString(dsStopTimeoutMilliseconds)).append("\n");
        sb.append("    dsGlobalExtender: ").append(toIndentedString(dsGlobalExtender)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

