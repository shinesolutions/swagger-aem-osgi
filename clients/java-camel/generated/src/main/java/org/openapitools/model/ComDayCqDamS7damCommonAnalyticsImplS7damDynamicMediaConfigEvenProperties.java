package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
 */

@JsonTypeName("comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {

  private ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled;

  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties cqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
    this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
    return this;
  }

  /**
   * Get cqDamS7damDynamicmediaconfigeventlistenerEnabled
   * @return cqDamS7damDynamicmediaconfigeventlistenerEnabled
   */
  @Valid 
  @Schema(name = "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqDamS7damDynamicmediaconfigeventlistenerEnabled() {
    return cqDamS7damDynamicmediaconfigeventlistenerEnabled;
  }

  public void setCqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
    this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties = (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties) o;
    return Objects.equals(this.cqDamS7damDynamicmediaconfigeventlistenerEnabled, comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.cqDamS7damDynamicmediaconfigeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamS7damDynamicmediaconfigeventlistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {\n");
    sb.append("    cqDamS7damDynamicmediaconfigeventlistenerEnabled: ").append(toIndentedString(cqDamS7damDynamicmediaconfigeventlistenerEnabled)).append("\n");
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

