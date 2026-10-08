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
 * ComAdobeGraniteContexthubImplContextHubImplProperties
 */

@JsonTypeName("comAdobeGraniteContexthubImplContextHubImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteContexthubImplContextHubImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi;

  public ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubSilentMode(@Nullable ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode) {
    this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
    return this;
  }

  /**
   * Get comAdobeGraniteContexthubSilentMode
   * @return comAdobeGraniteContexthubSilentMode
   */
  @Valid 
  @Schema(name = "com.adobe.granite.contexthub.silent_mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.contexthub.silent_mode")
  public @Nullable ConfigNodePropertyBoolean getComAdobeGraniteContexthubSilentMode() {
    return comAdobeGraniteContexthubSilentMode;
  }

  @JsonProperty("com.adobe.granite.contexthub.silent_mode")
  public void setComAdobeGraniteContexthubSilentMode(@Nullable ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode) {
    this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
  }

  public ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubShowUi(@Nullable ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi) {
    this.comAdobeGraniteContexthubShowUi = comAdobeGraniteContexthubShowUi;
    return this;
  }

  /**
   * Get comAdobeGraniteContexthubShowUi
   * @return comAdobeGraniteContexthubShowUi
   */
  @Valid 
  @Schema(name = "com.adobe.granite.contexthub.show_ui", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.contexthub.show_ui")
  public @Nullable ConfigNodePropertyBoolean getComAdobeGraniteContexthubShowUi() {
    return comAdobeGraniteContexthubShowUi;
  }

  @JsonProperty("com.adobe.granite.contexthub.show_ui")
  public void setComAdobeGraniteContexthubShowUi(@Nullable ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi) {
    this.comAdobeGraniteContexthubShowUi = comAdobeGraniteContexthubShowUi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubImplContextHubImplProperties = (ComAdobeGraniteContexthubImplContextHubImplProperties) o;
    return Objects.equals(this.comAdobeGraniteContexthubSilentMode, comAdobeGraniteContexthubImplContextHubImplProperties.comAdobeGraniteContexthubSilentMode) &&
        Objects.equals(this.comAdobeGraniteContexthubShowUi, comAdobeGraniteContexthubImplContextHubImplProperties.comAdobeGraniteContexthubShowUi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeGraniteContexthubSilentMode, comAdobeGraniteContexthubShowUi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteContexthubImplContextHubImplProperties {\n");
    sb.append("    comAdobeGraniteContexthubSilentMode: ").append(toIndentedString(comAdobeGraniteContexthubSilentMode)).append("\n");
    sb.append("    comAdobeGraniteContexthubShowUi: ").append(toIndentedString(comAdobeGraniteContexthubShowUi)).append("\n");
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

