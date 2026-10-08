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
 * ComAdobeCqHistoryImplHistoryRequestFilterProperties
 */

@JsonTypeName("comAdobeCqHistoryImplHistoryRequestFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqHistoryImplHistoryRequestFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray historyRequestFilterExcludedSelectors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray historyRequestFilterExcludedExtensions;

  public ComAdobeCqHistoryImplHistoryRequestFilterProperties historyRequestFilterExcludedSelectors(@Nullable ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
    this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
    return this;
  }

  /**
   * Get historyRequestFilterExcludedSelectors
   * @return historyRequestFilterExcludedSelectors
   */
  @Valid 
  @Schema(name = "history.requestFilter.excludedSelectors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("history.requestFilter.excludedSelectors")
  public @Nullable ConfigNodePropertyArray getHistoryRequestFilterExcludedSelectors() {
    return historyRequestFilterExcludedSelectors;
  }

  @JsonProperty("history.requestFilter.excludedSelectors")
  public void setHistoryRequestFilterExcludedSelectors(@Nullable ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
    this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
  }

  public ComAdobeCqHistoryImplHistoryRequestFilterProperties historyRequestFilterExcludedExtensions(@Nullable ConfigNodePropertyArray historyRequestFilterExcludedExtensions) {
    this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
    return this;
  }

  /**
   * Get historyRequestFilterExcludedExtensions
   * @return historyRequestFilterExcludedExtensions
   */
  @Valid 
  @Schema(name = "history.requestFilter.excludedExtensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("history.requestFilter.excludedExtensions")
  public @Nullable ConfigNodePropertyArray getHistoryRequestFilterExcludedExtensions() {
    return historyRequestFilterExcludedExtensions;
  }

  @JsonProperty("history.requestFilter.excludedExtensions")
  public void setHistoryRequestFilterExcludedExtensions(@Nullable ConfigNodePropertyArray historyRequestFilterExcludedExtensions) {
    this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqHistoryImplHistoryRequestFilterProperties comAdobeCqHistoryImplHistoryRequestFilterProperties = (ComAdobeCqHistoryImplHistoryRequestFilterProperties) o;
    return Objects.equals(this.historyRequestFilterExcludedSelectors, comAdobeCqHistoryImplHistoryRequestFilterProperties.historyRequestFilterExcludedSelectors) &&
        Objects.equals(this.historyRequestFilterExcludedExtensions, comAdobeCqHistoryImplHistoryRequestFilterProperties.historyRequestFilterExcludedExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyRequestFilterExcludedSelectors, historyRequestFilterExcludedExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqHistoryImplHistoryRequestFilterProperties {\n");
    sb.append("    historyRequestFilterExcludedSelectors: ").append(toIndentedString(historyRequestFilterExcludedSelectors)).append("\n");
    sb.append("    historyRequestFilterExcludedExtensions: ").append(toIndentedString(historyRequestFilterExcludedExtensions)).append("\n");
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

