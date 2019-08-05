package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteRepositoryServiceUserConfigurationProperties   {
  

  private ConfigNodePropertyInteger serviceRanking = null;

  private ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation = null;

  private ConfigNodePropertyArray serviceusersList = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceusers.simpleSubjectPopulation")
  public ConfigNodePropertyBoolean getServiceusersSimpleSubjectPopulation() {
    return serviceusersSimpleSubjectPopulation;
  }
  public void setServiceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation) {
    this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

