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
 * ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties
 */

@JsonTypeName("comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString searchPattern;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString replacePattern;

  public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties searchPattern(@Nullable ConfigNodePropertyString searchPattern) {
    this.searchPattern = searchPattern;
    return this;
  }

  /**
   * Get searchPattern
   * @return searchPattern
   */
  @Valid 
  @Schema(name = "search.pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search.pattern")
  public @Nullable ConfigNodePropertyString getSearchPattern() {
    return searchPattern;
  }

  @JsonProperty("search.pattern")
  public void setSearchPattern(@Nullable ConfigNodePropertyString searchPattern) {
    this.searchPattern = searchPattern;
  }

  public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties replacePattern(@Nullable ConfigNodePropertyString replacePattern) {
    this.replacePattern = replacePattern;
    return this;
  }

  /**
   * Get replacePattern
   * @return replacePattern
   */
  @Valid 
  @Schema(name = "replace.pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replace.pattern")
  public @Nullable ConfigNodePropertyString getReplacePattern() {
    return replacePattern;
  }

  @JsonProperty("replace.pattern")
  public void setReplacePattern(@Nullable ConfigNodePropertyString replacePattern) {
    this.replacePattern = replacePattern;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties = (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties) o;
    return Objects.equals(this.searchPattern, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.searchPattern) &&
        Objects.equals(this.replacePattern, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.replacePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchPattern, replacePattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {\n");
    sb.append("    searchPattern: ").append(toIndentedString(searchPattern)).append("\n");
    sb.append("    replacePattern: ").append(toIndentedString(replacePattern)).append("\n");
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

