package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingModelsImplModelAdapterFactoryProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingModelsImplModelAdapterFactoryProperties   {
  private ConfigNodePropertyString osgiHttpWhiteboardListener;
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect;
  private ConfigNodePropertyInteger maxRecursionDepth;
  private ConfigNodePropertyInteger cleanupJobPeriod;

  public OrgApacheSlingModelsImplModelAdapterFactoryProperties() {
  }

  /**
   **/
  public OrgApacheSlingModelsImplModelAdapterFactoryProperties osgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.listener")
  @Valid public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }

  @JsonProperty("osgi.http.whiteboard.listener")
  public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

  /**
   **/
  public OrgApacheSlingModelsImplModelAdapterFactoryProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.context.select")
  @Valid public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  @JsonProperty("osgi.http.whiteboard.context.select")
  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  /**
   **/
  public OrgApacheSlingModelsImplModelAdapterFactoryProperties maxRecursionDepth(ConfigNodePropertyInteger maxRecursionDepth) {
    this.maxRecursionDepth = maxRecursionDepth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.recursion.depth")
  @Valid public ConfigNodePropertyInteger getMaxRecursionDepth() {
    return maxRecursionDepth;
  }

  @JsonProperty("max.recursion.depth")
  public void setMaxRecursionDepth(ConfigNodePropertyInteger maxRecursionDepth) {
    this.maxRecursionDepth = maxRecursionDepth;
  }

  /**
   **/
  public OrgApacheSlingModelsImplModelAdapterFactoryProperties cleanupJobPeriod(ConfigNodePropertyInteger cleanupJobPeriod) {
    this.cleanupJobPeriod = cleanupJobPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cleanup.job.period")
  @Valid public ConfigNodePropertyInteger getCleanupJobPeriod() {
    return cleanupJobPeriod;
  }

  @JsonProperty("cleanup.job.period")
  public void setCleanupJobPeriod(ConfigNodePropertyInteger cleanupJobPeriod) {
    this.cleanupJobPeriod = cleanupJobPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingModelsImplModelAdapterFactoryProperties orgApacheSlingModelsImplModelAdapterFactoryProperties = (OrgApacheSlingModelsImplModelAdapterFactoryProperties) o;
    return Objects.equals(this.osgiHttpWhiteboardListener, orgApacheSlingModelsImplModelAdapterFactoryProperties.osgiHttpWhiteboardListener) &&
        Objects.equals(this.osgiHttpWhiteboardContextSelect, orgApacheSlingModelsImplModelAdapterFactoryProperties.osgiHttpWhiteboardContextSelect) &&
        Objects.equals(this.maxRecursionDepth, orgApacheSlingModelsImplModelAdapterFactoryProperties.maxRecursionDepth) &&
        Objects.equals(this.cleanupJobPeriod, orgApacheSlingModelsImplModelAdapterFactoryProperties.cleanupJobPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osgiHttpWhiteboardListener, osgiHttpWhiteboardContextSelect, maxRecursionDepth, cleanupJobPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingModelsImplModelAdapterFactoryProperties {\n");
    
    sb.append("    osgiHttpWhiteboardListener: ").append(toIndentedString(osgiHttpWhiteboardListener)).append("\n");
    sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
    sb.append("    maxRecursionDepth: ").append(toIndentedString(maxRecursionDepth)).append("\n");
    sb.append("    cleanupJobPeriod: ").append(toIndentedString(cleanupJobPeriod)).append("\n");
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
