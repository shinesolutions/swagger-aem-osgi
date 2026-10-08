package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmCoreWCMRequestFilterProperties
 */

@JsonTypeName("comDayCqWcmCoreWCMRequestFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreWCMRequestFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown wcmfilterMode;

  public ComDayCqWcmCoreWCMRequestFilterProperties wcmfilterMode(@Nullable ConfigNodePropertyDropDown wcmfilterMode) {
    this.wcmfilterMode = wcmfilterMode;
    return this;
  }

  /**
   * Get wcmfilterMode
   * @return wcmfilterMode
   */
  @Valid 
  @Schema(name = "wcmfilter.mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wcmfilter.mode")
  public @Nullable ConfigNodePropertyDropDown getWcmfilterMode() {
    return wcmfilterMode;
  }

  @JsonProperty("wcmfilter.mode")
  public void setWcmfilterMode(@Nullable ConfigNodePropertyDropDown wcmfilterMode) {
    this.wcmfilterMode = wcmfilterMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreWCMRequestFilterProperties comDayCqWcmCoreWCMRequestFilterProperties = (ComDayCqWcmCoreWCMRequestFilterProperties) o;
    return Objects.equals(this.wcmfilterMode, comDayCqWcmCoreWCMRequestFilterProperties.wcmfilterMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmfilterMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreWCMRequestFilterProperties {\n");
    sb.append("    wcmfilterMode: ").append(toIndentedString(wcmfilterMode)).append("\n");
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

