package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingModelsImplModelAdapterFactoryProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString osgiHttpWhiteboardListener;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger maxRecursionDepth;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger cleanupJobPeriod;
 /**
   * Get osgiHttpWhiteboardListener
   * @return osgiHttpWhiteboardListener
  **/
  @JsonProperty("osgi.http.whiteboard.listener")
  public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }

  public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

  public OrgApacheSlingModelsImplModelAdapterFactoryProperties osgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    return this;
  }

 /**
   * Get osgiHttpWhiteboardContextSelect
   * @return osgiHttpWhiteboardContextSelect
  **/
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  public OrgApacheSlingModelsImplModelAdapterFactoryProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

 /**
   * Get maxRecursionDepth
   * @return maxRecursionDepth
  **/
  @JsonProperty("max.recursion.depth")
  public ConfigNodePropertyInteger getMaxRecursionDepth() {
    return maxRecursionDepth;
  }

  public void setMaxRecursionDepth(ConfigNodePropertyInteger maxRecursionDepth) {
    this.maxRecursionDepth = maxRecursionDepth;
  }

  public OrgApacheSlingModelsImplModelAdapterFactoryProperties maxRecursionDepth(ConfigNodePropertyInteger maxRecursionDepth) {
    this.maxRecursionDepth = maxRecursionDepth;
    return this;
  }

 /**
   * Get cleanupJobPeriod
   * @return cleanupJobPeriod
  **/
  @JsonProperty("cleanup.job.period")
  public ConfigNodePropertyInteger getCleanupJobPeriod() {
    return cleanupJobPeriod;
  }

  public void setCleanupJobPeriod(ConfigNodePropertyInteger cleanupJobPeriod) {
    this.cleanupJobPeriod = cleanupJobPeriod;
  }

  public OrgApacheSlingModelsImplModelAdapterFactoryProperties cleanupJobPeriod(ConfigNodePropertyInteger cleanupJobPeriod) {
    this.cleanupJobPeriod = cleanupJobPeriod;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

