package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties   {
  
  private ConfigNodePropertyArray includedPaths = null;
  private ConfigNodePropertyBoolean enableAsyncObserver = null;
  private ConfigNodePropertyInteger observerQueueSize = null;

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties () {

  }

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties (ConfigNodePropertyArray includedPaths, ConfigNodePropertyBoolean enableAsyncObserver, ConfigNodePropertyInteger observerQueueSize) {
    this.includedPaths = includedPaths;
    this.enableAsyncObserver = enableAsyncObserver;
    this.observerQueueSize = observerQueueSize;
  }

    
  @JsonProperty("includedPaths")
  public ConfigNodePropertyArray getIncludedPaths() {
    return includedPaths;
  }
  public void setIncludedPaths(ConfigNodePropertyArray includedPaths) {
    this.includedPaths = includedPaths;
  }

    
  @JsonProperty("enableAsyncObserver")
  public ConfigNodePropertyBoolean getEnableAsyncObserver() {
    return enableAsyncObserver;
  }
  public void setEnableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver) {
    this.enableAsyncObserver = enableAsyncObserver;
  }

    
  @JsonProperty("observerQueueSize")
  public ConfigNodePropertyInteger getObserverQueueSize() {
    return observerQueueSize;
  }
  public void setObserverQueueSize(ConfigNodePropertyInteger observerQueueSize) {
    this.observerQueueSize = observerQueueSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties = (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties) o;
    return Objects.equals(includedPaths, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.includedPaths) &&
        Objects.equals(enableAsyncObserver, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.enableAsyncObserver) &&
        Objects.equals(observerQueueSize, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.observerQueueSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includedPaths, enableAsyncObserver, observerQueueSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties {\n");
    
    sb.append("    includedPaths: ").append(toIndentedString(includedPaths)).append("\n");
    sb.append("    enableAsyncObserver: ").append(toIndentedString(enableAsyncObserver)).append("\n");
    sb.append("    observerQueueSize: ").append(toIndentedString(observerQueueSize)).append("\n");
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
