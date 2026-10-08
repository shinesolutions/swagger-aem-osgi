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
 * ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties
 */

@JsonTypeName("comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pageInfoProviderPropertyRegexDefault;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pageInfoProviderPropertyName;

  public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties pageInfoProviderPropertyRegexDefault(@Nullable ConfigNodePropertyString pageInfoProviderPropertyRegexDefault) {
    this.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault;
    return this;
  }

  /**
   * Get pageInfoProviderPropertyRegexDefault
   * @return pageInfoProviderPropertyRegexDefault
   */
  @Valid 
  @Schema(name = "page.info.provider.property.regex.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page.info.provider.property.regex.default")
  public @Nullable ConfigNodePropertyString getPageInfoProviderPropertyRegexDefault() {
    return pageInfoProviderPropertyRegexDefault;
  }

  @JsonProperty("page.info.provider.property.regex.default")
  public void setPageInfoProviderPropertyRegexDefault(@Nullable ConfigNodePropertyString pageInfoProviderPropertyRegexDefault) {
    this.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault;
  }

  public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties pageInfoProviderPropertyName(@Nullable ConfigNodePropertyString pageInfoProviderPropertyName) {
    this.pageInfoProviderPropertyName = pageInfoProviderPropertyName;
    return this;
  }

  /**
   * Get pageInfoProviderPropertyName
   * @return pageInfoProviderPropertyName
   */
  @Valid 
  @Schema(name = "page.info.provider.property.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page.info.provider.property.name")
  public @Nullable ConfigNodePropertyString getPageInfoProviderPropertyName() {
    return pageInfoProviderPropertyName;
  }

  @JsonProperty("page.info.provider.property.name")
  public void setPageInfoProviderPropertyName(@Nullable ConfigNodePropertyString pageInfoProviderPropertyName) {
    this.pageInfoProviderPropertyName = pageInfoProviderPropertyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties = (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties) o;
    return Objects.equals(this.pageInfoProviderPropertyRegexDefault, comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.pageInfoProviderPropertyRegexDefault) &&
        Objects.equals(this.pageInfoProviderPropertyName, comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.pageInfoProviderPropertyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfoProviderPropertyRegexDefault, pageInfoProviderPropertyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {\n");
    sb.append("    pageInfoProviderPropertyRegexDefault: ").append(toIndentedString(pageInfoProviderPropertyRegexDefault)).append("\n");
    sb.append("    pageInfoProviderPropertyName: ").append(toIndentedString(pageInfoProviderPropertyName)).append("\n");
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

