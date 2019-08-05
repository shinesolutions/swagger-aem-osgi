package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray allowedPaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize = null;
 /**
   * Get allowedPaths
   * @return allowedPaths
  **/
  @JsonProperty("allowed.paths")
  public ConfigNodePropertyArray getAllowedPaths() {
    return allowedPaths;
  }

  public void setAllowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
  }

  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties allowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
    return this;
  }

 /**
   * Get cqAnalyticsSaintExporterPagesize
   * @return cqAnalyticsSaintExporterPagesize
  **/
  @JsonProperty("cq.analytics.saint.exporter.pagesize")
  public ConfigNodePropertyInteger getCqAnalyticsSaintExporterPagesize() {
    return cqAnalyticsSaintExporterPagesize;
  }

  public void setCqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
  }

  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties cqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

