package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
 */

@JsonTypeName("comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString guessTotal;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean tagTitleSearch;

  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties guessTotal(@Nullable ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

  /**
   * Get guessTotal
   * @return guessTotal
   */
  @Valid 
  @Schema(name = "guessTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guessTotal")
  public @Nullable ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }

  @JsonProperty("guessTotal")
  public void setGuessTotal(@Nullable ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties tagTitleSearch(@Nullable ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }

  /**
   * Get tagTitleSearch
   * @return tagTitleSearch
   */
  @Valid 
  @Schema(name = "tagTitleSearch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tagTitleSearch")
  public @Nullable ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }

  @JsonProperty("tagTitleSearch")
  public void setTagTitleSearch(@Nullable ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties = (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties) o;
    return Objects.equals(this.guessTotal, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.guessTotal) &&
        Objects.equals(this.tagTitleSearch, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.tagTitleSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guessTotal, tagTitleSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {\n");
    sb.append("    guessTotal: ").append(toIndentedString(guessTotal)).append("\n");
    sb.append("    tagTitleSearch: ").append(toIndentedString(tagTitleSearch)).append("\n");
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

