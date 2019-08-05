package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties   {
  
  private ConfigNodePropertyBoolean redirectEnabled = null;
  private ConfigNodePropertyBoolean redirectStatsEnabled = null;
  private ConfigNodePropertyArray redirectExtensions = null;
  private ConfigNodePropertyArray redirectPaths = null;

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties () {

  }

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties (ConfigNodePropertyBoolean redirectEnabled, ConfigNodePropertyBoolean redirectStatsEnabled, ConfigNodePropertyArray redirectExtensions, ConfigNodePropertyArray redirectPaths) {
    this.redirectEnabled = redirectEnabled;
    this.redirectStatsEnabled = redirectStatsEnabled;
    this.redirectExtensions = redirectExtensions;
    this.redirectPaths = redirectPaths;
  }

    
  @JsonProperty("redirect.enabled")
  public ConfigNodePropertyBoolean getRedirectEnabled() {
    return redirectEnabled;
  }
  public void setRedirectEnabled(ConfigNodePropertyBoolean redirectEnabled) {
    this.redirectEnabled = redirectEnabled;
  }

    
  @JsonProperty("redirect.stats.enabled")
  public ConfigNodePropertyBoolean getRedirectStatsEnabled() {
    return redirectStatsEnabled;
  }
  public void setRedirectStatsEnabled(ConfigNodePropertyBoolean redirectStatsEnabled) {
    this.redirectStatsEnabled = redirectStatsEnabled;
  }

    
  @JsonProperty("redirect.extensions")
  public ConfigNodePropertyArray getRedirectExtensions() {
    return redirectExtensions;
  }
  public void setRedirectExtensions(ConfigNodePropertyArray redirectExtensions) {
    this.redirectExtensions = redirectExtensions;
  }

    
  @JsonProperty("redirect.paths")
  public ConfigNodePropertyArray getRedirectPaths() {
    return redirectPaths;
  }
  public void setRedirectPaths(ConfigNodePropertyArray redirectPaths) {
    this.redirectPaths = redirectPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties = (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties) o;
    return Objects.equals(redirectEnabled, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectEnabled) &&
        Objects.equals(redirectStatsEnabled, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectStatsEnabled) &&
        Objects.equals(redirectExtensions, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectExtensions) &&
        Objects.equals(redirectPaths, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectEnabled, redirectStatsEnabled, redirectExtensions, redirectPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {\n");
    
    sb.append("    redirectEnabled: ").append(toIndentedString(redirectEnabled)).append("\n");
    sb.append("    redirectStatsEnabled: ").append(toIndentedString(redirectStatsEnabled)).append("\n");
    sb.append("    redirectExtensions: ").append(toIndentedString(redirectExtensions)).append("\n");
    sb.append("    redirectPaths: ").append(toIndentedString(redirectPaths)).append("\n");
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
