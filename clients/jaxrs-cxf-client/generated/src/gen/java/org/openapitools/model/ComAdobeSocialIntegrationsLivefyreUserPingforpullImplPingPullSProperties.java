package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter = null;
 /**
   * Get communitiesIntegrationLivefyreSlingEventFilter
   * @return communitiesIntegrationLivefyreSlingEventFilter
  **/
  @JsonProperty("communities.integration.livefyre.sling.event.filter")
  public ConfigNodePropertyString getCommunitiesIntegrationLivefyreSlingEventFilter() {
    return communitiesIntegrationLivefyreSlingEventFilter;
  }

  public void setCommunitiesIntegrationLivefyreSlingEventFilter(ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter) {
    this.communitiesIntegrationLivefyreSlingEventFilter = communitiesIntegrationLivefyreSlingEventFilter;
  }

  public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties communitiesIntegrationLivefyreSlingEventFilter(ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter) {
    this.communitiesIntegrationLivefyreSlingEventFilter = communitiesIntegrationLivefyreSlingEventFilter;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

