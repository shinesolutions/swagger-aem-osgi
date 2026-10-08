package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties   {

    private ConfigNodePropertyInteger binaryThreshold;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.
     *
     * @param binaryThreshold binaryThreshold
     */
    public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties(
        ConfigNodePropertyInteger binaryThreshold
    ) {
        this.binaryThreshold = binaryThreshold;
    }



    /**
     * Get binaryThreshold
     * @return binaryThreshold
     */
    public ConfigNodePropertyInteger getBinaryThreshold() {
        return binaryThreshold;
    }

    public void setBinaryThreshold(ConfigNodePropertyInteger binaryThreshold) {
        this.binaryThreshold = binaryThreshold;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties {\n");
        
        sb.append("    binaryThreshold: ").append(toIndentedString(binaryThreshold)).append("\n");
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

