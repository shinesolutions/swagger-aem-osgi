package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties   {

    private ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
    private ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.
     *
     * @param comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
     * @param comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
     */
    public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(
        ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, 
        ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
    ) {
        this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
        this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
    }



    /**
     * Get comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
     * @return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
     */
    public ConfigNodePropertyArray getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath() {
        return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
    }

    public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
        this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
    }

    /**
     * Get comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
     * @return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
     */
    public ConfigNodePropertyString getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency() {
        return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
    }

    public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
        this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {\n");
        
        sb.append("    comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath: ").append(toIndentedString(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath)).append("\n");
        sb.append("    comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency: ").append(toIndentedString(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency)).append("\n");
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

