package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
 */

@JsonTypeName("adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray fontList;

  public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties fontList(@Nullable ConfigNodePropertyArray fontList) {
    this.fontList = fontList;
    return this;
  }

  /**
   * Get fontList
   * @return fontList
   */
  @Valid 
  @Schema(name = "fontList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fontList")
  public @Nullable ConfigNodePropertyArray getFontList() {
    return fontList;
  }

  @JsonProperty("fontList")
  public void setFontList(@Nullable ConfigNodePropertyArray fontList) {
    this.fontList = fontList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties = (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties) o;
    return Objects.equals(this.fontList, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.fontList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {\n");
    sb.append("    fontList: ").append(toIndentedString(fontList)).append("\n");
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

