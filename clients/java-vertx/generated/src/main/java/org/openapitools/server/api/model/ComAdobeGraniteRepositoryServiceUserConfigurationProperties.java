package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteRepositoryServiceUserConfigurationProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation = null;
  private ConfigNodePropertyArray serviceusersList = null;

  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties () {

  }

  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties (ConfigNodePropertyInteger serviceRanking, ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation, ConfigNodePropertyArray serviceusersList) {
    this.serviceRanking = serviceRanking;
    this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
    this.serviceusersList = serviceusersList;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("serviceusers.simpleSubjectPopulation")
  public ConfigNodePropertyBoolean getServiceusersSimpleSubjectPopulation() {
    return serviceusersSimpleSubjectPopulation;
  }
  public void setServiceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation) {
    this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
  }

    
  @JsonProperty("serviceusers.list")
  public ConfigNodePropertyArray getServiceusersList() {
    return serviceusersList;
  }
  public void setServiceusersList(ConfigNodePropertyArray serviceusersList) {
    this.serviceusersList = serviceusersList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryServiceUserConfigurationProperties comAdobeGraniteRepositoryServiceUserConfigurationProperties = (ComAdobeGraniteRepositoryServiceUserConfigurationProperties) o;
    return Objects.equals(serviceRanking, comAdobeGraniteRepositoryServiceUserConfigurationProperties.serviceRanking) &&
        Objects.equals(serviceusersSimpleSubjectPopulation, comAdobeGraniteRepositoryServiceUserConfigurationProperties.serviceusersSimpleSubjectPopulation) &&
        Objects.equals(serviceusersList, comAdobeGraniteRepositoryServiceUserConfigurationProperties.serviceusersList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, serviceusersSimpleSubjectPopulation, serviceusersList);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
