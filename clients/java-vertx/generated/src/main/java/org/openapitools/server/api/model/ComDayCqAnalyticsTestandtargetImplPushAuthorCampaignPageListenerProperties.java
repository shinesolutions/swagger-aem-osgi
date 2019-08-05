package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties   {
  
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = null;

  public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties () {

  }

  public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties (ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled) {
    this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
  }

    
  @JsonProperty("cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled() {
    return cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
  }
  public void setCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled) {
    this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties = (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties) o;
    return Objects.equals(cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled, comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties {\n");
    
    sb.append("    cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled)).append("\n");
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
