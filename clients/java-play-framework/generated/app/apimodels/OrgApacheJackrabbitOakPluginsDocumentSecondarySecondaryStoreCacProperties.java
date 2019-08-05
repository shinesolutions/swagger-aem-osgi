package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

