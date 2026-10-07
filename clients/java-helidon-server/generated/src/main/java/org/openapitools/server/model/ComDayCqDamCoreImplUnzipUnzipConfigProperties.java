package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplUnzipUnzipConfigProperties   {

    private ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize;
    private ConfigNodePropertyString cqDamConfigUnzipEncoding;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplUnzipUnzipConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplUnzipUnzipConfigProperties.
     *
     * @param cqDamConfigUnzipMaxuncompressedsize cqDamConfigUnzipMaxuncompressedsize
     * @param cqDamConfigUnzipEncoding cqDamConfigUnzipEncoding
     */
    public ComDayCqDamCoreImplUnzipUnzipConfigProperties(
        ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize, 
        ConfigNodePropertyString cqDamConfigUnzipEncoding
    ) {
        this.cqDamConfigUnzipMaxuncompressedsize = cqDamConfigUnzipMaxuncompressedsize;
        this.cqDamConfigUnzipEncoding = cqDamConfigUnzipEncoding;
    }



    /**
     * Get cqDamConfigUnzipMaxuncompressedsize
     * @return cqDamConfigUnzipMaxuncompressedsize
     */
    public ConfigNodePropertyInteger getCqDamConfigUnzipMaxuncompressedsize() {
        return cqDamConfigUnzipMaxuncompressedsize;
    }

    public void setCqDamConfigUnzipMaxuncompressedsize(ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize) {
        this.cqDamConfigUnzipMaxuncompressedsize = cqDamConfigUnzipMaxuncompressedsize;
    }

    /**
     * Get cqDamConfigUnzipEncoding
     * @return cqDamConfigUnzipEncoding
     */
    public ConfigNodePropertyString getCqDamConfigUnzipEncoding() {
        return cqDamConfigUnzipEncoding;
    }

    public void setCqDamConfigUnzipEncoding(ConfigNodePropertyString cqDamConfigUnzipEncoding) {
        this.cqDamConfigUnzipEncoding = cqDamConfigUnzipEncoding;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplUnzipUnzipConfigProperties {\n");
        
        sb.append("    cqDamConfigUnzipMaxuncompressedsize: ").append(toIndentedString(cqDamConfigUnzipMaxuncompressedsize)).append("\n");
        sb.append("    cqDamConfigUnzipEncoding: ").append(toIndentedString(cqDamConfigUnzipEncoding)).append("\n");
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

