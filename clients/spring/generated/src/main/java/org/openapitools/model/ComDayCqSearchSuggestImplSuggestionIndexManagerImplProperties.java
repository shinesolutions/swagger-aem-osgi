package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties
 */

@JsonTypeName("comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pathBuilderTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString suggestBasepath;

  public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties pathBuilderTarget(@Nullable ConfigNodePropertyString pathBuilderTarget) {
    this.pathBuilderTarget = pathBuilderTarget;
    return this;
  }

  /**
   * Get pathBuilderTarget
   * @return pathBuilderTarget
   */
  @Valid 
  @Schema(name = "pathBuilder.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pathBuilder.target")
  public @Nullable ConfigNodePropertyString getPathBuilderTarget() {
    return pathBuilderTarget;
  }

  @JsonProperty("pathBuilder.target")
  public void setPathBuilderTarget(@Nullable ConfigNodePropertyString pathBuilderTarget) {
    this.pathBuilderTarget = pathBuilderTarget;
  }

  public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties suggestBasepath(@Nullable ConfigNodePropertyString suggestBasepath) {
    this.suggestBasepath = suggestBasepath;
    return this;
  }

  /**
   * Get suggestBasepath
   * @return suggestBasepath
   */
  @Valid 
  @Schema(name = "suggest.basepath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggest.basepath")
  public @Nullable ConfigNodePropertyString getSuggestBasepath() {
    return suggestBasepath;
  }

  @JsonProperty("suggest.basepath")
  public void setSuggestBasepath(@Nullable ConfigNodePropertyString suggestBasepath) {
    this.suggestBasepath = suggestBasepath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties = (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties) o;
    return Objects.equals(this.pathBuilderTarget, comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.pathBuilderTarget) &&
        Objects.equals(this.suggestBasepath, comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.suggestBasepath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathBuilderTarget, suggestBasepath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {\n");
    sb.append("    pathBuilderTarget: ").append(toIndentedString(pathBuilderTarget)).append("\n");
    sb.append("    suggestBasepath: ").append(toIndentedString(suggestBasepath)).append("\n");
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

