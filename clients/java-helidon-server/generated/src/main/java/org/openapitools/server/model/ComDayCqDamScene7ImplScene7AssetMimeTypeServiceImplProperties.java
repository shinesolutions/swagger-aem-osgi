package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties   {

    private ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping;

    /**
     * Default constructor.
     */
    public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.
     *
     * @param cqDamScene7AssetmimetypeserviceMapping cqDamScene7AssetmimetypeserviceMapping
     */
    public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(
        ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping
    ) {
        this.cqDamScene7AssetmimetypeserviceMapping = cqDamScene7AssetmimetypeserviceMapping;
    }



    /**
     * Get cqDamScene7AssetmimetypeserviceMapping
     * @return cqDamScene7AssetmimetypeserviceMapping
     */
    public ConfigNodePropertyArray getCqDamScene7AssetmimetypeserviceMapping() {
        return cqDamScene7AssetmimetypeserviceMapping;
    }

    public void setCqDamScene7AssetmimetypeserviceMapping(ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping) {
        this.cqDamScene7AssetmimetypeserviceMapping = cqDamScene7AssetmimetypeserviceMapping;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties {\n");
        
        sb.append("    cqDamScene7AssetmimetypeserviceMapping: ").append(toIndentedString(cqDamScene7AssetmimetypeserviceMapping)).append("\n");
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

