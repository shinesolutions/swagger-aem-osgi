package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties   {

    private ConfigNodePropertyString orgApacheSlingCommonsLogFile;
    private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber;
    private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize;
    private ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.
     *
     * @param orgApacheSlingCommonsLogFile orgApacheSlingCommonsLogFile
     * @param orgApacheSlingCommonsLogFileNumber orgApacheSlingCommonsLogFileNumber
     * @param orgApacheSlingCommonsLogFileSize orgApacheSlingCommonsLogFileSize
     * @param orgApacheSlingCommonsLogFileBuffered orgApacheSlingCommonsLogFileBuffered
     */
    public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(
        ConfigNodePropertyString orgApacheSlingCommonsLogFile, 
        ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber, 
        ConfigNodePropertyString orgApacheSlingCommonsLogFileSize, 
        ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered
    ) {
        this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
        this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
        this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
        this.orgApacheSlingCommonsLogFileBuffered = orgApacheSlingCommonsLogFileBuffered;
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
     * Get orgApacheSlingCommonsLogFileNumber
     * @return orgApacheSlingCommonsLogFileNumber
     */
    public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
        return orgApacheSlingCommonsLogFileNumber;
    }

    public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
        this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    }

    /**
     * Get orgApacheSlingCommonsLogFileSize
     * @return orgApacheSlingCommonsLogFileSize
     */
    public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
        return orgApacheSlingCommonsLogFileSize;
    }

    public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
        this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    }

    /**
     * Get orgApacheSlingCommonsLogFileBuffered
     * @return orgApacheSlingCommonsLogFileBuffered
     */
    public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogFileBuffered() {
        return orgApacheSlingCommonsLogFileBuffered;
    }

    public void setOrgApacheSlingCommonsLogFileBuffered(ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered) {
        this.orgApacheSlingCommonsLogFileBuffered = orgApacheSlingCommonsLogFileBuffered;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {\n");
        
        sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
        sb.append("    orgApacheSlingCommonsLogFileNumber: ").append(toIndentedString(orgApacheSlingCommonsLogFileNumber)).append("\n");
        sb.append("    orgApacheSlingCommonsLogFileSize: ").append(toIndentedString(orgApacheSlingCommonsLogFileSize)).append("\n");
        sb.append("    orgApacheSlingCommonsLogFileBuffered: ").append(toIndentedString(orgApacheSlingCommonsLogFileBuffered)).append("\n");
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

