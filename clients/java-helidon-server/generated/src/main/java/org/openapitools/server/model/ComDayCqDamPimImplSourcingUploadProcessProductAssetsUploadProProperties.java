package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties   {

    private ConfigNodePropertyBoolean deleteZipFile;

    /**
     * Default constructor.
     */
    public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.
     *
     * @param deleteZipFile deleteZipFile
     */
    public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(
        ConfigNodePropertyBoolean deleteZipFile
    ) {
        this.deleteZipFile = deleteZipFile;
    }



    /**
     * Get deleteZipFile
     * @return deleteZipFile
     */
    public ConfigNodePropertyBoolean getDeleteZipFile() {
        return deleteZipFile;
    }

    public void setDeleteZipFile(ConfigNodePropertyBoolean deleteZipFile) {
        this.deleteZipFile = deleteZipFile;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties {\n");
        
        sb.append("    deleteZipFile: ").append(toIndentedString(deleteZipFile)).append("\n");
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

