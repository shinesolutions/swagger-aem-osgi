package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties   {
  @JsonProperty("includedPaths")
  private ConfigNodePropertyArray includedPaths = null;

  @JsonProperty("enableAsyncObserver")
  private ConfigNodePropertyBoolean enableAsyncObserver = null;

  @JsonProperty("observerQueueSize")
  private ConfigNodePropertyInteger observerQueueSize = null;

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties includedPaths(ConfigNodePropertyArray includedPaths) {
    this.includedPaths = includedPaths;
    return this;
  }

  /**
   * Get includedPaths
   * @return includedPaths
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getIncludedPaths() {
    return includedPaths;
  }

  public void setIncludedPaths(ConfigNodePropertyArray includedPaths) {
    this.includedPaths = includedPaths;
  }

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties enableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver) {
    this.enableAsyncObserver = enableAsyncObserver;
    return this;
  }

  /**
   * Get enableAsyncObserver
   * @return enableAsyncObserver
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getEnableAsyncObserver() {
    return enableAsyncObserver;
  }

  public void setEnableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver) {
    this.enableAsyncObserver = enableAsyncObserver;
  }

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties observerQueueSize(ConfigNodePropertyInteger observerQueueSize) {
    this.observerQueueSize = observerQueueSize;
    return this;
  }

  /**
   * Get observerQueueSize
   * @return observerQueueSize
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.includedPaths, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.includedPaths) &&
        Objects.equals(this.enableAsyncObserver, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.enableAsyncObserver) &&
        Objects.equals(this.observerQueueSize, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.observerQueueSize);
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

