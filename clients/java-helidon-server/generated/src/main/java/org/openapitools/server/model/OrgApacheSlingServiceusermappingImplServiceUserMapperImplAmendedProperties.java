package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyArray userMapping;

    /**
     * Default constructor.
     */
    public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.
     *
     * @param serviceRanking serviceRanking
     * @param userMapping userMapping
     */
    public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyArray userMapping
    ) {
        this.serviceRanking = serviceRanking;
        this.userMapping = userMapping;
    }



    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
     * Get userMapping
     * @return userMapping
     */
    public ConfigNodePropertyArray getUserMapping() {
        return userMapping;
    }

    public void setUserMapping(ConfigNodePropertyArray userMapping) {
        this.userMapping = userMapping;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties {\n");
        
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    userMapping: ").append(toIndentedString(userMapping)).append("\n");
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

