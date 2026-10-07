package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
 */

@JsonTypeName("comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;

  public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(@Nullable ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled) {
    this.cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
   * @return cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
   */
  @Valid 
  @Schema(name = "cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled")
  public @Nullable ConfigNodePropertyBoolean getCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled() {
    return cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
  }

  @JsonProperty("cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled")
  public void setCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(@Nullable ConfigNodePropertyBoolean cqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

