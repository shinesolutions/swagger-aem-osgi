package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties   {

    private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel;
    private ConfigNodePropertyString orgApacheSlingCommonsLogFile;
    private ConfigNodePropertyString orgApacheSlingCommonsLogPattern;
    private ConfigNodePropertyArray orgApacheSlingCommonsLogNames;
    private ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.
     *
     * @param orgApacheSlingCommonsLogLevel orgApacheSlingCommonsLogLevel
     * @param orgApacheSlingCommonsLogFile orgApacheSlingCommonsLogFile
     * @param orgApacheSlingCommonsLogPattern orgApacheSlingCommonsLogPattern
     * @param orgApacheSlingCommonsLogNames orgApacheSlingCommonsLogNames
     * @param orgApacheSlingCommonsLogAdditiv orgApacheSlingCommonsLogAdditiv
     */
    public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(
        ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel, 
        ConfigNodePropertyString orgApacheSlingCommonsLogFile, 
        ConfigNodePropertyString orgApacheSlingCommonsLogPattern, 
        ConfigNodePropertyArray orgApacheSlingCommonsLogNames, 
        ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv
    ) {
        this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
        this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
        this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
        this.orgApacheSlingCommonsLogNames = orgApacheSlingCommonsLogNames;
        this.orgApacheSlingCommonsLogAdditiv = orgApacheSlingCommonsLogAdditiv;
    }



    /**
     * Get orgApacheSlingCommonsLogLevel
     * @return orgApacheSlingCommonsLogLevel
     */
    public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
        return orgApacheSlingCommonsLogLevel;
    }

    public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
        this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    }

    /**
     * Get orgApacheSlingCommonsLogFile
     * @return orgApacheSlingCommonsLogFile
     */
    public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
        return orgApacheSlingCommonsLogFile;
    }

    public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
        this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    }

    /**
     * Get orgApacheSlingCommonsLogPattern
     * @return orgApacheSlingCommonsLogPattern
     */
    public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
        return orgApacheSlingCommonsLogPattern;
    }

    public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
        this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    }

    /**
     * Get orgApacheSlingCommonsLogNames
     * @return orgApacheSlingCommonsLogNames
     */
    public ConfigNodePropertyArray getOrgApacheSlingCommonsLogNames() {
        return orgApacheSlingCommonsLogNames;
    }

    public void setOrgApacheSlingCommonsLogNames(ConfigNodePropertyArray orgApacheSlingCommonsLogNames) {
        this.orgApacheSlingCommonsLogNames = orgApacheSlingCommonsLogNames;
    }

    /**
     * Get orgApacheSlingCommonsLogAdditiv
     * @return orgApacheSlingCommonsLogAdditiv
     */
    public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogAdditiv() {
        return orgApacheSlingCommonsLogAdditiv;
    }

    public void setOrgApacheSlingCommonsLogAdditiv(ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv) {
        this.orgApacheSlingCommonsLogAdditiv = orgApacheSlingCommonsLogAdditiv;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {\n");
        
        sb.append("    orgApacheSlingCommonsLogLevel: ").append(toIndentedString(orgApacheSlingCommonsLogLevel)).append("\n");
        sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
        sb.append("    orgApacheSlingCommonsLogPattern: ").append(toIndentedString(orgApacheSlingCommonsLogPattern)).append("\n");
        sb.append("    orgApacheSlingCommonsLogNames: ").append(toIndentedString(orgApacheSlingCommonsLogNames)).append("\n");
        sb.append("    orgApacheSlingCommonsLogAdditiv: ").append(toIndentedString(orgApacheSlingCommonsLogAdditiv)).append("\n");
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

