package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties   {

    private ConfigNodePropertyInteger totalWidth;
    private ConfigNodePropertyInteger colWidthName;
    private ConfigNodePropertyInteger colWidthResult;
    private ConfigNodePropertyInteger colWidthTiming;

    /**
     * Default constructor.
     */
    public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.
     *
     * @param totalWidth totalWidth
     * @param colWidthName colWidthName
     * @param colWidthResult colWidthResult
     * @param colWidthTiming colWidthTiming
     */
    public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(
        ConfigNodePropertyInteger totalWidth, 
        ConfigNodePropertyInteger colWidthName, 
        ConfigNodePropertyInteger colWidthResult, 
        ConfigNodePropertyInteger colWidthTiming
    ) {
        this.totalWidth = totalWidth;
        this.colWidthName = colWidthName;
        this.colWidthResult = colWidthResult;
        this.colWidthTiming = colWidthTiming;
    }



    /**
     * Get totalWidth
     * @return totalWidth
     */
    public ConfigNodePropertyInteger getTotalWidth() {
        return totalWidth;
    }

    public void setTotalWidth(ConfigNodePropertyInteger totalWidth) {
        this.totalWidth = totalWidth;
    }

    /**
     * Get colWidthName
     * @return colWidthName
     */
    public ConfigNodePropertyInteger getColWidthName() {
        return colWidthName;
    }

    public void setColWidthName(ConfigNodePropertyInteger colWidthName) {
        this.colWidthName = colWidthName;
    }

    /**
     * Get colWidthResult
     * @return colWidthResult
     */
    public ConfigNodePropertyInteger getColWidthResult() {
        return colWidthResult;
    }

    public void setColWidthResult(ConfigNodePropertyInteger colWidthResult) {
        this.colWidthResult = colWidthResult;
    }

    /**
     * Get colWidthTiming
     * @return colWidthTiming
     */
    public ConfigNodePropertyInteger getColWidthTiming() {
        return colWidthTiming;
    }

    public void setColWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
        this.colWidthTiming = colWidthTiming;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {\n");
        
        sb.append("    totalWidth: ").append(toIndentedString(totalWidth)).append("\n");
        sb.append("    colWidthName: ").append(toIndentedString(colWidthName)).append("\n");
        sb.append("    colWidthResult: ").append(toIndentedString(colWidthResult)).append("\n");
        sb.append("    colWidthTiming: ").append(toIndentedString(colWidthTiming)).append("\n");
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

