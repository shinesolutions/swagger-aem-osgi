package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties   {
  @JsonProperty("allowed.paths")
  private ConfigNodePropertyArray allowedPaths = null;

  @JsonProperty("cq.analytics.saint.exporter.pagesize")
  private ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize = null;

  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties allowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
    return this;
  }

   /**
   * Get allowedPaths
   * @return allowedPaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAllowedPaths() {
    return allowedPaths;
  }

  public void setAllowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
  }

  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties cqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
    return this;
  }

   /**
   * Get cqAnalyticsSaintExporterPagesize
   * @return cqAnalyticsSaintExporterPagesize
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.allowedPaths, comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.allowedPaths) &&
        Objects.equals(this.cqAnalyticsSaintExporterPagesize, comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.cqAnalyticsSaintExporterPagesize);
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

