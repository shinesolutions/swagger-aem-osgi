package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
 /**
   * Get cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
   * @return cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
  **/
  @JsonProperty("cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled() {
    return cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
  }

  public void setCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled) {
    this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
  }

  public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled) {
    this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
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
    ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties = (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties) o;
    return Objects.equals(this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled, comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

