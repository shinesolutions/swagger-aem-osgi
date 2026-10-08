package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheAriesJmxFrameworkStateConfigProperties   {

    private ConfigNodePropertyBoolean attributeChangeNotificationEnabled;

    /**
     * Default constructor.
     */
    public OrgApacheAriesJmxFrameworkStateConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheAriesJmxFrameworkStateConfigProperties.
     *
     * @param attributeChangeNotificationEnabled attributeChangeNotificationEnabled
     */
    public OrgApacheAriesJmxFrameworkStateConfigProperties(
        ConfigNodePropertyBoolean attributeChangeNotificationEnabled
    ) {
        this.attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
    }



    /**
     * Get attributeChangeNotificationEnabled
     * @return attributeChangeNotificationEnabled
     */
    public ConfigNodePropertyBoolean getAttributeChangeNotificationEnabled() {
        return attributeChangeNotificationEnabled;
    }

    public void setAttributeChangeNotificationEnabled(ConfigNodePropertyBoolean attributeChangeNotificationEnabled) {
        this.attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheAriesJmxFrameworkStateConfigProperties {\n");
        
        sb.append("    attributeChangeNotificationEnabled: ").append(toIndentedString(attributeChangeNotificationEnabled)).append("\n");
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

