package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties   {
  private ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter;

  public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties() {
  }

  /**
   **/
  public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties communitiesIntegrationLivefyreSlingEventFilter(ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter) {
    this.communitiesIntegrationLivefyreSlingEventFilter = communitiesIntegrationLivefyreSlingEventFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("communities.integration.livefyre.sling.event.filter")
  @Valid public ConfigNodePropertyString getCommunitiesIntegrationLivefyreSlingEventFilter() {
    return communitiesIntegrationLivefyreSlingEventFilter;
  }

  @JsonProperty("communities.integration.livefyre.sling.event.filter")
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
    return Objects.equals(this.communitiesIntegrationLivefyreSlingEventFilter, comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.communitiesIntegrationLivefyreSlingEventFilter);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
