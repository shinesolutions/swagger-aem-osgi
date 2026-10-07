package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteRepositoryServiceUserConfigurationProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger serviceRanking;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray serviceusersList;
 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get serviceusersSimpleSubjectPopulation
   * @return serviceusersSimpleSubjectPopulation
  **/
  @JsonProperty("serviceusers.simpleSubjectPopulation")
  public ConfigNodePropertyBoolean getServiceusersSimpleSubjectPopulation() {
    return serviceusersSimpleSubjectPopulation;
  }

  public void setServiceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation) {
    this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
  }

  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation) {
    this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
    return this;
  }

 /**
   * Get serviceusersList
   * @return serviceusersList
  **/
  @JsonProperty("serviceusers.list")
  public ConfigNodePropertyArray getServiceusersList() {
    return serviceusersList;
  }

  public void setServiceusersList(ConfigNodePropertyArray serviceusersList) {
    this.serviceusersList = serviceusersList;
  }

  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceusersList(ConfigNodePropertyArray serviceusersList) {
    this.serviceusersList = serviceusersList;
    return this;
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
    return Objects.equals(this.serviceRanking, comAdobeGraniteRepositoryServiceUserConfigurationProperties.serviceRanking) &&
        Objects.equals(this.serviceusersSimpleSubjectPopulation, comAdobeGraniteRepositoryServiceUserConfigurationProperties.serviceusersSimpleSubjectPopulation) &&
        Objects.equals(this.serviceusersList, comAdobeGraniteRepositoryServiceUserConfigurationProperties.serviceusersList);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

