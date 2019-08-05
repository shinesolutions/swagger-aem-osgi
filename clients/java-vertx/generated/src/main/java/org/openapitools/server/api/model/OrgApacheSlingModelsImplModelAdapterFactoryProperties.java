package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingModelsImplModelAdapterFactoryProperties   {
  
  private ConfigNodePropertyString osgiHttpWhiteboardListener = null;
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;
  private ConfigNodePropertyInteger maxRecursionDepth = null;
  private ConfigNodePropertyInteger cleanupJobPeriod = null;

  public OrgApacheSlingModelsImplModelAdapterFactoryProperties () {

  }

  public OrgApacheSlingModelsImplModelAdapterFactoryProperties (ConfigNodePropertyString osgiHttpWhiteboardListener, ConfigNodePropertyString osgiHttpWhiteboardContextSelect, ConfigNodePropertyInteger maxRecursionDepth, ConfigNodePropertyInteger cleanupJobPeriod) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    this.maxRecursionDepth = maxRecursionDepth;
    this.cleanupJobPeriod = cleanupJobPeriod;
  }

    
  @JsonProperty("osgi.http.whiteboard.listener")
  public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
    return osgiHttpWhiteboardListener;
  }
  public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
    this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
  }

    
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }
  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

    
  @JsonProperty("max.recursion.depth")
  public ConfigNodePropertyInteger getMaxRecursionDepth() {
    return maxRecursionDepth;
  }
  public void setMaxRecursionDepth(ConfigNodePropertyInteger maxRecursionDepth) {
    this.maxRecursionDepth = maxRecursionDepth;
  }

    
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
