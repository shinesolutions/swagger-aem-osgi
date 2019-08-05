package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties   {
  @JsonProperty("cq.analytics.adapterfactory.contextstores")
  private ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores = null;

  public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties cqAnalyticsAdapterfactoryContextstores(ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores) {
    this.cqAnalyticsAdapterfactoryContextstores = cqAnalyticsAdapterfactoryContextstores;
    return this;
  }

   /**
   * Get cqAnalyticsAdapterfactoryContextstores
   * @return cqAnalyticsAdapterfactoryContextstores
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqAnalyticsAdapterfactoryContextstores() {
    return cqAnalyticsAdapterfactoryContextstores;
  }

  public void setCqAnalyticsAdapterfactoryContextstores(ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores) {
    this.cqAnalyticsAdapterfactoryContextstores = cqAnalyticsAdapterfactoryContextstores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

