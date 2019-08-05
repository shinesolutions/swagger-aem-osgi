package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
    return Objects.equals(cqAnalyticsAdapterfactoryContextstores, comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.cqAnalyticsAdapterfactoryContextstores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsAdapterfactoryContextstores);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

