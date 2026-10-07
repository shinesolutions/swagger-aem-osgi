package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties   {

    private ConfigNodePropertyInteger serviceRanking;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.
     *
     * @param serviceRanking serviceRanking
     */
    public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties(
        ConfigNodePropertyInteger serviceRanking
    ) {
        this.serviceRanking = serviceRanking;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties {\n");
        
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

