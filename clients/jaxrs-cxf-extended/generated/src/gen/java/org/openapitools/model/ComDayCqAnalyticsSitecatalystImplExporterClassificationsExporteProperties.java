package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray allowedPaths;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize;
 /**
  * Get allowedPaths
  * @return allowedPaths
  */
  @JsonProperty("allowed.paths")
  public ConfigNodePropertyArray getAllowedPaths() {
    return allowedPaths;
  }

  /**
   * Sets the <code>allowedPaths</code> property.
   */
 public void setAllowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
  }

  /**
   * Sets the <code>allowedPaths</code> property.
   */
  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties allowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
    return this;
  }

 /**
  * Get cqAnalyticsSaintExporterPagesize
  * @return cqAnalyticsSaintExporterPagesize
  */
  @JsonProperty("cq.analytics.saint.exporter.pagesize")
  public ConfigNodePropertyInteger getCqAnalyticsSaintExporterPagesize() {
    return cqAnalyticsSaintExporterPagesize;
  }

  /**
   * Sets the <code>cqAnalyticsSaintExporterPagesize</code> property.
   */
 public void setCqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
  }

  /**
   * Sets the <code>cqAnalyticsSaintExporterPagesize</code> property.
   */
  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties cqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
    return this;
  }


  @Override
  public boolean equals(Object o) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

