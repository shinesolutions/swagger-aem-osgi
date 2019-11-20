package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;

  public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties () {

  }

  public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties (ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties = (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties) o;
    return Objects.equals(serviceRanking, comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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