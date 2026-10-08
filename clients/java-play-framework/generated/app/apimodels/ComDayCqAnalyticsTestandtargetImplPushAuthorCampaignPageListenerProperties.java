package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties   {
  @JsonProperty("cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled")
  @Valid

  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;

  public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled) {
    this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
    return this;
  }

   /**
   * Get cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
   * @return cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

