package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties   {
  @JsonProperty("includedPaths")
  @Valid

  private ConfigNodePropertyArray includedPaths;

  @JsonProperty("enableAsyncObserver")
  @Valid

  private ConfigNodePropertyBoolean enableAsyncObserver;

  @JsonProperty("observerQueueSize")
  @Valid

  private ConfigNodePropertyInteger observerQueueSize;

  public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties includedPaths(ConfigNodePropertyArray includedPaths) {
    this.includedPaths = includedPaths;
    return this;
  }

   /**
   * Get includedPaths
   * @return includedPaths
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

