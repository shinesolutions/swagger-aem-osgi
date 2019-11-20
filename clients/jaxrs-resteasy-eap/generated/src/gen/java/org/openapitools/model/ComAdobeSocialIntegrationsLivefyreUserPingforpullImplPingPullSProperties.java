package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties   {
  

  private ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("communities.integration.livefyre.sling.event.filter")
  public ConfigNodePropertyString getCommunitiesIntegrationLivefyreSlingEventFilter() {
    return communitiesIntegrationLivefyreSlingEventFilter;
  }
  public void setCommunitiesIntegrationLivefyreSlingEventFilter(ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter) {
    this.communitiesIntegrationLivefyreSlingEventFilter = communitiesIntegrationLivefyreSlingEventFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties = (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties) o;
    return Objects.equals(communitiesIntegrationLivefyreSlingEventFilter, comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.communitiesIntegrationLivefyreSlingEventFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communitiesIntegrationLivefyreSlingEventFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties {\n");
    
    sb.append("    communitiesIntegrationLivefyreSlingEventFilter: ").append(toIndentedString(communitiesIntegrationLivefyreSlingEventFilter)).append("\n");
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
