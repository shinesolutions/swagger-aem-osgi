package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray includedPaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableAsyncObserver = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger observerQueueSize = null;
 /**
   * Get includedPaths
   * @return includedPaths
  **/
  @JsonProperty("includedPaths")
  public ConfigNodePropertyArray getIncludedPaths() {
    return includedPaths;
  }

  public void setIncludedPaths(ConfigNodePropertyArray includedPaths) {
    this.includedPaths = includedPaths;
  }

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties includedPaths(ConfigNodePropertyArray includedPaths) {
    this.includedPaths = includedPaths;
    return this;
  }

 /**
   * Get enableAsyncObserver
   * @return enableAsyncObserver
  **/
  @JsonProperty("enableAsyncObserver")
  public ConfigNodePropertyBoolean getEnableAsyncObserver() {
    return enableAsyncObserver;
  }

  public void setEnableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver) {
    this.enableAsyncObserver = enableAsyncObserver;
  }

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties enableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver) {
    this.enableAsyncObserver = enableAsyncObserver;
    return this;
  }

 /**
   * Get observerQueueSize
   * @return observerQueueSize
  **/
  @JsonProperty("observerQueueSize")
  public ConfigNodePropertyInteger getObserverQueueSize() {
    return observerQueueSize;
  }

  public void setObserverQueueSize(ConfigNodePropertyInteger observerQueueSize) {
    this.observerQueueSize = observerQueueSize;
  }

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties observerQueueSize(ConfigNodePropertyInteger observerQueueSize) {
    this.observerQueueSize = observerQueueSize;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

