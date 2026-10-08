package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("redirect.enabled")
  private ConfigNodePropertyBoolean redirectEnabled;

  @JsonProperty("redirect.stats.enabled")
  private ConfigNodePropertyBoolean redirectStatsEnabled;

  @JsonProperty("redirect.extensions")
  private ConfigNodePropertyArray redirectExtensions;

  @JsonProperty("redirect.paths")
  private ConfigNodePropertyArray redirectPaths;

  /**
   * 
   * @return redirectEnabled
   */
  public ConfigNodePropertyBoolean getRedirectEnabled() {
    return redirectEnabled;
  }

  public void setRedirectEnabled(ConfigNodePropertyBoolean redirectEnabled) {
    this.redirectEnabled = redirectEnabled;
  }

  /**
   * 
   * @return redirectStatsEnabled
   */
  public ConfigNodePropertyBoolean getRedirectStatsEnabled() {
    return redirectStatsEnabled;
  }

  public void setRedirectStatsEnabled(ConfigNodePropertyBoolean redirectStatsEnabled) {
    this.redirectStatsEnabled = redirectStatsEnabled;
  }

  /**
   * 
   * @return redirectExtensions
   */
  public ConfigNodePropertyArray getRedirectExtensions() {
    return redirectExtensions;
  }

  public void setRedirectExtensions(ConfigNodePropertyArray redirectExtensions) {
    this.redirectExtensions = redirectExtensions;
  }

  /**
   * 
   * @return redirectPaths
   */
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
    return Objects.equals(this.redirectEnabled, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectEnabled) &&
        Objects.equals(this.redirectStatsEnabled, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectStatsEnabled) &&
        Objects.equals(this.redirectExtensions, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectExtensions) &&
        Objects.equals(this.redirectPaths, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectPaths);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
