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
 * ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties
 */

@JsonTypeName("comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;

  public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties cqAnalyticsTestandtargetAccountoptionsupdaterEnabled(@Nullable ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled) {
    this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
    return this;
  }

  /**
   * Get cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
   * @return cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
   */
  @Valid 
  @Schema(name = "cq.analytics.testandtarget.accountoptionsupdater.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.testandtarget.accountoptionsupdater.enabled")
  public @Nullable ConfigNodePropertyBoolean getCqAnalyticsTestandtargetAccountoptionsupdaterEnabled() {
    return cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
  }

  @JsonProperty("cq.analytics.testandtarget.accountoptionsupdater.enabled")
  public void setCqAnalyticsTestandtargetAccountoptionsupdaterEnabled(@Nullable ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled) {
    this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties = (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties) o;
    return Objects.equals(this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled, comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsTestandtargetAccountoptionsupdaterEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties {\n");
    sb.append("    cqAnalyticsTestandtargetAccountoptionsupdaterEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetAccountoptionsupdaterEnabled)).append("\n");
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

