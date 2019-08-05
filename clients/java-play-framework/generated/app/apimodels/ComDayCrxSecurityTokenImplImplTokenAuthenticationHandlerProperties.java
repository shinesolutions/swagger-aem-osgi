package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties   {
  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("token.required.attr")
  private ConfigNodePropertyDropDown tokenRequiredAttr = null;

  @JsonProperty("token.alternate.url")
  private ConfigNodePropertyString tokenAlternateUrl = null;

  @JsonProperty("token.encapsulated")
  private ConfigNodePropertyBoolean tokenEncapsulated = null;

  @JsonProperty("skip.token.refresh")
  private ConfigNodePropertyArray skipTokenRefresh = null;

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Valid
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
    return this;
  }

   /**
   * Get tokenRequiredAttr
   * @return tokenRequiredAttr
  **/
  @Valid
  public ConfigNodePropertyDropDown getTokenRequiredAttr() {
    return tokenRequiredAttr;
  }

  public void setTokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
    return this;
  }

   /**
   * Get tokenAlternateUrl
   * @return tokenAlternateUrl
  **/
  @Valid
  public ConfigNodePropertyString getTokenAlternateUrl() {
    return tokenAlternateUrl;
  }

  public void setTokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
    return this;
  }

   /**
   * Get tokenEncapsulated
   * @return tokenEncapsulated
  **/
  @Valid
  public ConfigNodePropertyBoolean getTokenEncapsulated() {
    return tokenEncapsulated;
  }

  public void setTokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties skipTokenRefresh(ConfigNodePropertyArray skipTokenRefresh) {
    this.skipTokenRefresh = skipTokenRefresh;
    return this;
  }

   /**
   * Get skipTokenRefresh
   * @return skipTokenRefresh
  **/
  @Valid
  public ConfigNodePropertyArray getSkipTokenRefresh() {
    return skipTokenRefresh;
  }

  public void setSkipTokenRefresh(ConfigNodePropertyArray skipTokenRefresh) {
    this.skipTokenRefresh = skipTokenRefresh;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties = (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties) o;
    return Objects.equals(path, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.path) &&
        Objects.equals(tokenRequiredAttr, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenRequiredAttr) &&
        Objects.equals(tokenAlternateUrl, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenAlternateUrl) &&
        Objects.equals(tokenEncapsulated, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenEncapsulated) &&
        Objects.equals(skipTokenRefresh, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.skipTokenRefresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, tokenRequiredAttr, tokenAlternateUrl, tokenEncapsulated, skipTokenRefresh);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    tokenRequiredAttr: ").append(toIndentedString(tokenRequiredAttr)).append("\n");
    sb.append("    tokenAlternateUrl: ").append(toIndentedString(tokenAlternateUrl)).append("\n");
    sb.append("    tokenEncapsulated: ").append(toIndentedString(tokenEncapsulated)).append("\n");
    sb.append("    skipTokenRefresh: ").append(toIndentedString(skipTokenRefresh)).append("\n");
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

