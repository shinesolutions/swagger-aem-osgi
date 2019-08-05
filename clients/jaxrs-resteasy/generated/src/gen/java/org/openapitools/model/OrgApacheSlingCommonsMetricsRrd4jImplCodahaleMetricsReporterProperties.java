package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties   {
  
  private ConfigNodePropertyArray datasources = null;
  private ConfigNodePropertyInteger step = null;
  private ConfigNodePropertyArray archives = null;
  private ConfigNodePropertyString path = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("datasources")
  public ConfigNodePropertyArray getDatasources() {
    return datasources;
  }
  public void setDatasources(ConfigNodePropertyArray datasources) {
    this.datasources = datasources;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("step")
  public ConfigNodePropertyInteger getStep() {
    return step;
  }
  public void setStep(ConfigNodePropertyInteger step) {
    this.step = step;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("archives")
  public ConfigNodePropertyArray getArchives() {
    return archives;
  }
  public void setArchives(ConfigNodePropertyArray archives) {
    this.archives = archives;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties = (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties) o;
    return Objects.equals(datasources, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.datasources) &&
        Objects.equals(step, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.step) &&
        Objects.equals(archives, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.archives) &&
        Objects.equals(path, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasources, step, archives, path);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

