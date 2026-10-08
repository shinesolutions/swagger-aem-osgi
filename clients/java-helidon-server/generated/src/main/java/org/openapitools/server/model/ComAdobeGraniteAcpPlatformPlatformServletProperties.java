package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAcpPlatformPlatformServletProperties   {

    private ConfigNodePropertyInteger queryLimit;
    private ConfigNodePropertyArray fileTypeExtensionMap;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAcpPlatformPlatformServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAcpPlatformPlatformServletProperties.
     *
     * @param queryLimit queryLimit
     * @param fileTypeExtensionMap fileTypeExtensionMap
     */
    public ComAdobeGraniteAcpPlatformPlatformServletProperties(
        ConfigNodePropertyInteger queryLimit, 
        ConfigNodePropertyArray fileTypeExtensionMap
    ) {
        this.queryLimit = queryLimit;
        this.fileTypeExtensionMap = fileTypeExtensionMap;
    }



    /**
     * Get queryLimit
     * @return queryLimit
     */
    public ConfigNodePropertyInteger getQueryLimit() {
        return queryLimit;
    }

    public void setQueryLimit(ConfigNodePropertyInteger queryLimit) {
        this.queryLimit = queryLimit;
    }

    /**
     * Get fileTypeExtensionMap
     * @return fileTypeExtensionMap
     */
    public ConfigNodePropertyArray getFileTypeExtensionMap() {
        return fileTypeExtensionMap;
    }

    public void setFileTypeExtensionMap(ConfigNodePropertyArray fileTypeExtensionMap) {
        this.fileTypeExtensionMap = fileTypeExtensionMap;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAcpPlatformPlatformServletProperties {\n");
        
        sb.append("    queryLimit: ").append(toIndentedString(queryLimit)).append("\n");
        sb.append("    fileTypeExtensionMap: ").append(toIndentedString(fileTypeExtensionMap)).append("\n");
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

