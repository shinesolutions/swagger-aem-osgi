package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingModelsImplModelAdapterFactoryProperties   {
  

  private ConfigNodePropertyString osgiHttpWhiteboardListener = null;

  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;

  private ConfigNodePropertyInteger maxRecursionDepth = null;

  private ConfigNodePropertyInteger cleanupJobPeriod = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.listener")
  public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }
  public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }
  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("max.recursion.depth")
  public ConfigNodePropertyInteger getMaxRecursionDepth() {
    return maxRecursionDepth;
  }
  public void setMaxRecursionDepth(ConfigNodePropertyInteger maxRecursionDepth) {
    this.maxRecursionDepth = maxRecursionDepth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cleanup.job.period")
  public ConfigNodePropertyInteger getCleanupJobPeriod() {
    return cleanupJobPeriod;
  }
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
    return Objects.equals(osgiHttpWhiteboardListener, orgApacheSlingModelsImplModelAdapterFactoryProperties.osgiHttpWhiteboardListener) &&
        Objects.equals(osgiHttpWhiteboardContextSelect, orgApacheSlingModelsImplModelAdapterFactoryProperties.osgiHttpWhiteboardContextSelect) &&
        Objects.equals(maxRecursionDepth, orgApacheSlingModelsImplModelAdapterFactoryProperties.maxRecursionDepth) &&
        Objects.equals(cleanupJobPeriod, orgApacheSlingModelsImplModelAdapterFactoryProperties.cleanupJobPeriod);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

