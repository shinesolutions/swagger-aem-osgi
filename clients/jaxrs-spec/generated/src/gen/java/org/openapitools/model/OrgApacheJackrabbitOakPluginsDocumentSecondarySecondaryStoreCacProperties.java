package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties   {
  
  private @Valid ConfigNodePropertyArray includedPaths = null;
  private @Valid ConfigNodePropertyBoolean enableAsyncObserver = null;
  private @Valid ConfigNodePropertyInteger observerQueueSize = null;

  /**
   **/
  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties includedPaths(ConfigNodePropertyArray includedPaths) {
    this.includedPaths = includedPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("includedPaths")
  public ConfigNodePropertyArray getIncludedPaths() {
    return includedPaths;
  }
  public void setIncludedPaths(ConfigNodePropertyArray includedPaths) {
    this.includedPaths = includedPaths;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties enableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver) {
    this.enableAsyncObserver = enableAsyncObserver;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableAsyncObserver")
  public ConfigNodePropertyBoolean getEnableAsyncObserver() {
    return enableAsyncObserver;
  }
  public void setEnableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver) {
    this.enableAsyncObserver = enableAsyncObserver;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties observerQueueSize(ConfigNodePropertyInteger observerQueueSize) {
    this.observerQueueSize = observerQueueSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("observerQueueSize")
  public ConfigNodePropertyInteger getObserverQueueSize() {
    return observerQueueSize;
  }
  public void setObserverQueueSize(ConfigNodePropertyInteger observerQueueSize) {
    this.observerQueueSize = observerQueueSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

