package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties   {
  @JsonProperty("allowed.paths")
  private ConfigNodePropertyArray allowedPaths = null;

  @JsonProperty("cq.analytics.saint.exporter.pagesize")
  private ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize = null;

  /**
   **/
  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties allowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allowed.paths")
  public ConfigNodePropertyArray getAllowedPaths() {
    return allowedPaths;
  }
  public void setAllowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
  }

  /**
   **/
  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties cqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.saint.exporter.pagesize")
  public ConfigNodePropertyInteger getCqAnalyticsSaintExporterPagesize() {
    return cqAnalyticsSaintExporterPagesize;
  }
  public void setCqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties = (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties) o;
    return Objects.equals(allowedPaths, comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.allowedPaths) &&
        Objects.equals(cqAnalyticsSaintExporterPagesize, comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.cqAnalyticsSaintExporterPagesize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaths, cqAnalyticsSaintExporterPagesize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {\n");
    
    sb.append("    allowedPaths: ").append(toIndentedString(allowedPaths)).append("\n");
    sb.append("    cqAnalyticsSaintExporterPagesize: ").append(toIndentedString(cqAnalyticsSaintExporterPagesize)).append("\n");
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

