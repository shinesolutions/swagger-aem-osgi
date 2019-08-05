package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties   {
  
  private ConfigNodePropertyArray allowedPaths = null;
  private ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize = null;

  /**
   **/
  
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

