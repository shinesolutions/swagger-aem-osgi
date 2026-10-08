package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyString typeCollections;
    private ConfigNodePropertyString typeNoncollections;
    private ConfigNodePropertyString typeContent;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.
     *
     * @param serviceRanking serviceRanking
     * @param typeCollections typeCollections
     * @param typeNoncollections typeNoncollections
     * @param typeContent typeContent
     */
    public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyString typeCollections, 
        ConfigNodePropertyString typeNoncollections, 
        ConfigNodePropertyString typeContent
    ) {
        this.serviceRanking = serviceRanking;
        this.typeCollections = typeCollections;
        this.typeNoncollections = typeNoncollections;
        this.typeContent = typeContent;
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
     * Get typeCollections
     * @return typeCollections
     */
    public ConfigNodePropertyString getTypeCollections() {
        return typeCollections;
    }

    public void setTypeCollections(ConfigNodePropertyString typeCollections) {
        this.typeCollections = typeCollections;
    }

    /**
     * Get typeNoncollections
     * @return typeNoncollections
     */
    public ConfigNodePropertyString getTypeNoncollections() {
        return typeNoncollections;
    }

    public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
        this.typeNoncollections = typeNoncollections;
    }

    /**
     * Get typeContent
     * @return typeContent
     */
    public ConfigNodePropertyString getTypeContent() {
        return typeContent;
    }

    public void setTypeContent(ConfigNodePropertyString typeContent) {
        this.typeContent = typeContent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {\n");
        
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    typeCollections: ").append(toIndentedString(typeCollections)).append("\n");
        sb.append("    typeNoncollections: ").append(toIndentedString(typeNoncollections)).append("\n");
        sb.append("    typeContent: ").append(toIndentedString(typeContent)).append("\n");
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

