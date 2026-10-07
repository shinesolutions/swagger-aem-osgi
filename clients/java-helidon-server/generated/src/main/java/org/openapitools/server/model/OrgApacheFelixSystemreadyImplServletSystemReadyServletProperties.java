package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties   {

    private ConfigNodePropertyString osgiHttpWhiteboardServletPattern;
    private ConfigNodePropertyString osgiHttpWhiteboardContextSelect;

    /**
     * Default constructor.
     */
    public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.
     *
     * @param osgiHttpWhiteboardServletPattern osgiHttpWhiteboardServletPattern
     * @param osgiHttpWhiteboardContextSelect osgiHttpWhiteboardContextSelect
     */
    public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties(
        ConfigNodePropertyString osgiHttpWhiteboardServletPattern, 
        ConfigNodePropertyString osgiHttpWhiteboardContextSelect
    ) {
        this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
        this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    }



    /**
     * Get osgiHttpWhiteboardServletPattern
     * @return osgiHttpWhiteboardServletPattern
     */
    public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
        return osgiHttpWhiteboardServletPattern;
    }

    public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
        this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    }

    /**
     * Get osgiHttpWhiteboardContextSelect
     * @return osgiHttpWhiteboardContextSelect
     */
    public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
        return osgiHttpWhiteboardContextSelect;
    }

    public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
        this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties {\n");
        
        sb.append("    osgiHttpWhiteboardServletPattern: ").append(toIndentedString(osgiHttpWhiteboardServletPattern)).append("\n");
        sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
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

