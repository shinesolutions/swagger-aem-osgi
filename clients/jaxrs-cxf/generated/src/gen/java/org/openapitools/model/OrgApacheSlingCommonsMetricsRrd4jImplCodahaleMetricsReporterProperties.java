package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
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

public class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray datasources = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger step = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray archives = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString path = null;
 /**
   * Get datasources
   * @return datasources
  **/
  @JsonProperty("datasources")
  public ConfigNodePropertyArray getDatasources() {
    return datasources;
  }

  public void setDatasources(ConfigNodePropertyArray datasources) {
    this.datasources = datasources;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties datasources(ConfigNodePropertyArray datasources) {
    this.datasources = datasources;
    return this;
  }

 /**
   * Get step
   * @return step
  **/
  @JsonProperty("step")
  public ConfigNodePropertyInteger getStep() {
    return step;
  }

  public void setStep(ConfigNodePropertyInteger step) {
    this.step = step;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties step(ConfigNodePropertyInteger step) {
    this.step = step;
    return this;
  }

 /**
   * Get archives
   * @return archives
  **/
  @JsonProperty("archives")
  public ConfigNodePropertyArray getArchives() {
    return archives;
  }

  public void setArchives(ConfigNodePropertyArray archives) {
    this.archives = archives;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties archives(ConfigNodePropertyArray archives) {
    this.archives = archives;
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {\n");
    
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    archives: ").append(toIndentedString(archives)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

