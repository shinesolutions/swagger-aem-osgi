package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteRepositoryServiceUserConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteRepositoryServiceUserConfigurationProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("serviceusers.simpleSubjectPopulation")
  private ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation = null;

  @JsonProperty("serviceusers.list")
  private ConfigNodePropertyArray serviceusersList = null;

  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation) {
    this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
    return this;
  }

   /**
   * Get serviceusersSimpleSubjectPopulation
   * @return serviceusersSimpleSubjectPopulation
  **/
  @Valid
  public ConfigNodePropertyBoolean getServiceusersSimpleSubjectPopulation() {
    return serviceusersSimpleSubjectPopulation;
  }

  public void setServiceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation) {
    this.serviceusersSimpleSubjectPopulation = serviceusersSimpleSubjectPopulation;
  }

  public ComAdobeGraniteRepositoryServiceUserConfigurationProperties serviceusersList(ConfigNodePropertyArray serviceusersList) {
    this.serviceusersList = serviceusersList;
    return this;
  }

   /**
   * Get serviceusersList
   * @return serviceusersList
  **/
  @Valid
  public ConfigNodePropertyArray getServiceusersList() {
    return serviceusersList;
  }

  public void setServiceusersList(ConfigNodePropertyArray serviceusersList) {
    this.serviceusersList = serviceusersList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

