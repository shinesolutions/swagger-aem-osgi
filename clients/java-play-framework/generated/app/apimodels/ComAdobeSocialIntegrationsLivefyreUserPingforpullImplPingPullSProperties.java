package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties   {
  @JsonProperty("communities.integration.livefyre.sling.event.filter")
  private ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter = null;

  public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties communitiesIntegrationLivefyreSlingEventFilter(ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter) {
    this.communitiesIntegrationLivefyreSlingEventFilter = communitiesIntegrationLivefyreSlingEventFilter;
    return this;
  }

   /**
   * Get communitiesIntegrationLivefyreSlingEventFilter
   * @return communitiesIntegrationLivefyreSlingEventFilter
  **/
  @Valid
  public ConfigNodePropertyString getCommunitiesIntegrationLivefyreSlingEventFilter() {
    return communitiesIntegrationLivefyreSlingEventFilter;
  }

  public void setCommunitiesIntegrationLivefyreSlingEventFilter(ConfigNodePropertyString communitiesIntegrationLivefyreSlingEventFilter) {
    this.communitiesIntegrationLivefyreSlingEventFilter = communitiesIntegrationLivefyreSlingEventFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

