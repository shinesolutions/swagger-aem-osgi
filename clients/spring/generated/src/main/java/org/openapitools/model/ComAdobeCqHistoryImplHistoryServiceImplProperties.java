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
 * ComAdobeCqHistoryImplHistoryServiceImplProperties
 */

@JsonTypeName("comAdobeCqHistoryImplHistoryServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqHistoryImplHistoryServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray historyServiceResourceTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray historyServicePathFilter;

  public ComAdobeCqHistoryImplHistoryServiceImplProperties historyServiceResourceTypes(@Nullable ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
    return this;
  }

  /**
   * Get historyServiceResourceTypes
   * @return historyServiceResourceTypes
   */
  @Valid 
  @Schema(name = "history.service.resourceTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("history.service.resourceTypes")
  public @Nullable ConfigNodePropertyArray getHistoryServiceResourceTypes() {
    return historyServiceResourceTypes;
  }

  @JsonProperty("history.service.resourceTypes")
  public void setHistoryServiceResourceTypes(@Nullable ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
  }

  public ComAdobeCqHistoryImplHistoryServiceImplProperties historyServicePathFilter(@Nullable ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServicePathFilter = historyServicePathFilter;
    return this;
  }

  /**
   * Get historyServicePathFilter
   * @return historyServicePathFilter
   */
  @Valid 
  @Schema(name = "history.service.pathFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("history.service.pathFilter")
  public @Nullable ConfigNodePropertyArray getHistoryServicePathFilter() {
    return historyServicePathFilter;
  }

  @JsonProperty("history.service.pathFilter")
  public void setHistoryServicePathFilter(@Nullable ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServicePathFilter = historyServicePathFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqHistoryImplHistoryServiceImplProperties comAdobeCqHistoryImplHistoryServiceImplProperties = (ComAdobeCqHistoryImplHistoryServiceImplProperties) o;
    return Objects.equals(this.historyServiceResourceTypes, comAdobeCqHistoryImplHistoryServiceImplProperties.historyServiceResourceTypes) &&
        Objects.equals(this.historyServicePathFilter, comAdobeCqHistoryImplHistoryServiceImplProperties.historyServicePathFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyServiceResourceTypes, historyServicePathFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqHistoryImplHistoryServiceImplProperties {\n");
    sb.append("    historyServiceResourceTypes: ").append(toIndentedString(historyServiceResourceTypes)).append("\n");
    sb.append("    historyServicePathFilter: ").append(toIndentedString(historyServicePathFilter)).append("\n");
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

