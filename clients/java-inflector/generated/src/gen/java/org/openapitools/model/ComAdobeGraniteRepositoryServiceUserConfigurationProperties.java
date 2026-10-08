package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRepositoryServiceUserConfigurationProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking;

  @JsonProperty("serviceusers.simpleSubjectPopulation")
  private ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation;

  @JsonProperty("serviceusers.list")
  private ConfigNodePropertyArray serviceusersList;

  /**
   **/
  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
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
  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation) {
    this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
    return this;
  }

  
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
  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceusersList(ConfigNodePropertyArray serviceusersList) {
    this.serviceusersList = serviceusersList;
    return this;
  }

  
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

