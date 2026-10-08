package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties   {

    private ConfigNodePropertyBoolean cqDamAllowAllMime;
    private ConfigNodePropertyArray cqDamAllowedAssetMimes;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.
     *
     * @param cqDamAllowAllMime cqDamAllowAllMime
     * @param cqDamAllowedAssetMimes cqDamAllowedAssetMimes
     */
    public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(
        ConfigNodePropertyBoolean cqDamAllowAllMime, 
        ConfigNodePropertyArray cqDamAllowedAssetMimes
    ) {
        this.cqDamAllowAllMime = cqDamAllowAllMime;
        this.cqDamAllowedAssetMimes = cqDamAllowedAssetMimes;
    }



    /**
     * Get cqDamAllowAllMime
     * @return cqDamAllowAllMime
     */
    public ConfigNodePropertyBoolean getCqDamAllowAllMime() {
        return cqDamAllowAllMime;
    }

    public void setCqDamAllowAllMime(ConfigNodePropertyBoolean cqDamAllowAllMime) {
        this.cqDamAllowAllMime = cqDamAllowAllMime;
    }

    /**
     * Get cqDamAllowedAssetMimes
     * @return cqDamAllowedAssetMimes
     */
    public ConfigNodePropertyArray getCqDamAllowedAssetMimes() {
        return cqDamAllowedAssetMimes;
    }

    public void setCqDamAllowedAssetMimes(ConfigNodePropertyArray cqDamAllowedAssetMimes) {
        this.cqDamAllowedAssetMimes = cqDamAllowedAssetMimes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties {\n");
        
        sb.append("    cqDamAllowAllMime: ").append(toIndentedString(cqDamAllowAllMime)).append("\n");
        sb.append("    cqDamAllowedAssetMimes: ").append(toIndentedString(cqDamAllowedAssetMimes)).append("\n");
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

