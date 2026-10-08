package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties   {

    private ConfigNodePropertyString felixInventoryPrinterName;
    private ConfigNodePropertyString felixInventoryPrinterTitle;
    private ConfigNodePropertyString path;

    /**
     * Default constructor.
     */
    public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.
     *
     * @param felixInventoryPrinterName felixInventoryPrinterName
     * @param felixInventoryPrinterTitle felixInventoryPrinterTitle
     * @param path path
     */
    public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(
        ConfigNodePropertyString felixInventoryPrinterName, 
        ConfigNodePropertyString felixInventoryPrinterTitle, 
        ConfigNodePropertyString path
    ) {
        this.felixInventoryPrinterName = felixInventoryPrinterName;
        this.felixInventoryPrinterTitle = felixInventoryPrinterTitle;
        this.path = path;
    }



    /**
     * Get felixInventoryPrinterName
     * @return felixInventoryPrinterName
     */
    public ConfigNodePropertyString getFelixInventoryPrinterName() {
        return felixInventoryPrinterName;
    }

    public void setFelixInventoryPrinterName(ConfigNodePropertyString felixInventoryPrinterName) {
        this.felixInventoryPrinterName = felixInventoryPrinterName;
    }

    /**
     * Get felixInventoryPrinterTitle
     * @return felixInventoryPrinterTitle
     */
    public ConfigNodePropertyString getFelixInventoryPrinterTitle() {
        return felixInventoryPrinterTitle;
    }

    public void setFelixInventoryPrinterTitle(ConfigNodePropertyString felixInventoryPrinterTitle) {
        this.felixInventoryPrinterTitle = felixInventoryPrinterTitle;
    }

    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyString getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyString path) {
        this.path = path;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {\n");
        
        sb.append("    felixInventoryPrinterName: ").append(toIndentedString(felixInventoryPrinterName)).append("\n");
        sb.append("    felixInventoryPrinterTitle: ").append(toIndentedString(felixInventoryPrinterTitle)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

