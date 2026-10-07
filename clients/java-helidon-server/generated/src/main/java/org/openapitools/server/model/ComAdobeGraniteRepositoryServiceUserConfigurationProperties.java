package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteRepositoryServiceUserConfigurationProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation;
    private ConfigNodePropertyArray serviceusersList;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteRepositoryServiceUserConfigurationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteRepositoryServiceUserConfigurationProperties.
     *
     * @param serviceRanking serviceRanking
     * @param serviceusersSimpleSubjectPopulation serviceusersSimpleSubjectPopulation
     * @param serviceusersList serviceusersList
     */
    public ComAdobeGraniteRepositoryServiceUserConfigurationProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation, 
        ConfigNodePropertyArray serviceusersList
    ) {
        this.serviceRanking = serviceRanking;
        this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
        this.serviceusersList = serviceusersList;
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
     * Get serviceusersSimpleSubjectPopulation
     * @return serviceusersSimpleSubjectPopulation
     */
    public ConfigNodePropertyBoolean getServiceusersSimpleSubjectPopulation() {
        return serviceusersSimpleSubjectPopulation;
    }

    public void setServiceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation) {
        this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
    }

    /**
     * Get serviceusersList
     * @return serviceusersList
     */
    public ConfigNodePropertyArray getServiceusersList() {
        return serviceusersList;
    }

    public void setServiceusersList(ConfigNodePropertyArray serviceusersList) {
        this.serviceusersList = serviceusersList;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteRepositoryServiceUserConfigurationProperties {\n");
        
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    serviceusersSimpleSubjectPopulation: ").append(toIndentedString(serviceusersSimpleSubjectPopulation)).append("\n");
        sb.append("    serviceusersList: ").append(toIndentedString(serviceusersList)).append("\n");
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

