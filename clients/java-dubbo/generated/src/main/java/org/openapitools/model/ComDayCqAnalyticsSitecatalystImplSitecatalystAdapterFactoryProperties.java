package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.analytics.adapterfactory.contextstores")
  private ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores;

  /**
   * 
   * @return cqAnalyticsAdapterfactoryContextstores
   */
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
