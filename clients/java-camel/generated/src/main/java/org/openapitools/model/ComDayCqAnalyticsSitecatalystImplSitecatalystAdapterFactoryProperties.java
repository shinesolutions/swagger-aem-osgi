package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
 */

@JsonTypeName("comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {

  private ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores;

  public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties cqAnalyticsAdapterfactoryContextstores(ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores) {
    this.cqAnalyticsAdapterfactoryContextstores = cqAnalyticsAdapterfactoryContextstores;
    return this;
  }

  /**
   * Get cqAnalyticsAdapterfactoryContextstores
   * @return cqAnalyticsAdapterfactoryContextstores
   */
  @Valid 
  @Schema(name = "cq.analytics.adapterfactory.contextstores", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.adapterfactory.contextstores")
  public ConfigNodePropertyArray getCqAnalyticsAdapterfactoryContextstores() {
    return cqAnalyticsAdapterfactoryContextstores;
  }

  public void setCqAnalyticsAdapterfactoryContextstores(ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores) {
    this.cqAnalyticsAdapterfactoryContextstores = cqAnalyticsAdapterfactoryContextstores;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties = (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties) o;
    return Objects.equals(this.cqAnalyticsAdapterfactoryContextstores, comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.cqAnalyticsAdapterfactoryContextstores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsAdapterfactoryContextstores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {\n");
    sb.append("    cqAnalyticsAdapterfactoryContextstores: ").append(toIndentedString(cqAnalyticsAdapterfactoryContextstores)).append("\n");
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

