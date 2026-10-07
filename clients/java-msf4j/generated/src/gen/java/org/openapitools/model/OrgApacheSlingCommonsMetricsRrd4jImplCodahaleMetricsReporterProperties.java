package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties   {
  @JsonProperty("datasources")
  private ConfigNodePropertyArray datasources;

  @JsonProperty("step")
  private ConfigNodePropertyInteger step;

  @JsonProperty("archives")
  private ConfigNodePropertyArray archives;

  @JsonProperty("path")
  private ConfigNodePropertyString path;

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties datasources(ConfigNodePropertyArray datasources) {
    this.datasources = datasources;
    return this;
  }

   /**
   * Get datasources
   * @return datasources
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getDatasources() {
    return datasources;
  }

  public void setDatasources(ConfigNodePropertyArray datasources) {
    this.datasources = datasources;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties step(ConfigNodePropertyInteger step) {
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getStep() {
    return step;
  }

  public void setStep(ConfigNodePropertyInteger step) {
    this.step = step;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties archives(ConfigNodePropertyArray archives) {
    this.archives = archives;
    return this;
  }

   /**
   * Get archives
   * @return archives
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getArchives() {
    return archives;
  }

  public void setArchives(ConfigNodePropertyArray archives) {
    this.archives = archives;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties = (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties) o;
    return Objects.equals(this.datasources, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.datasources) &&
        Objects.equals(this.step, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.step) &&
        Objects.equals(this.archives, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.archives) &&
        Objects.equals(this.path, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.path);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

