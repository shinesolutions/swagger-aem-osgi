package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingI18nImplI18NFilterProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyArray slingFilterScope;

    /**
     * Default constructor.
     */
    public OrgApacheSlingI18nImplI18NFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingI18nImplI18NFilterProperties.
     *
     * @param serviceRanking serviceRanking
     * @param slingFilterScope slingFilterScope
     */
    public OrgApacheSlingI18nImplI18NFilterProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyArray slingFilterScope
    ) {
        this.serviceRanking = serviceRanking;
        this.slingFilterScope = slingFilterScope;
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
     * Get slingFilterScope
     * @return slingFilterScope
     */
    public ConfigNodePropertyArray getSlingFilterScope() {
        return slingFilterScope;
    }

    public void setSlingFilterScope(ConfigNodePropertyArray slingFilterScope) {
        this.slingFilterScope = slingFilterScope;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingI18nImplI18NFilterProperties {\n");
        
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    slingFilterScope: ").append(toIndentedString(slingFilterScope)).append("\n");
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

