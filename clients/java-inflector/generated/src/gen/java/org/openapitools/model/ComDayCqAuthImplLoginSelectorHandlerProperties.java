package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqAuthImplLoginSelectorHandlerProperties   {
  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("auth.loginselector.mappings")
  private ConfigNodePropertyArray authLoginselectorMappings = null;

  @JsonProperty("auth.loginselector.changepw.mappings")
  private ConfigNodePropertyArray authLoginselectorChangepwMappings = null;

  @JsonProperty("auth.loginselector.defaultloginpage")
  private ConfigNodePropertyString authLoginselectorDefaultloginpage = null;

  @JsonProperty("auth.loginselector.defaultchangepwpage")
  private ConfigNodePropertyString authLoginselectorDefaultchangepwpage = null;

  @JsonProperty("auth.loginselector.handle")
  private ConfigNodePropertyArray authLoginselectorHandle = null;

  @JsonProperty("auth.loginselector.handle.all.extensions")
  private ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions = null;

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorMappings(ConfigNodePropertyArray authLoginselectorMappings) {
    this.authLoginselectorMappings = authLoginselectorMappings;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.loginselector.mappings")
  public ConfigNodePropertyArray getAuthLoginselectorMappings() {
    return authLoginselectorMappings;
  }
  public void setAuthLoginselectorMappings(ConfigNodePropertyArray authLoginselectorMappings) {
    this.authLoginselectorMappings = authLoginselectorMappings;
  }

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorChangepwMappings(ConfigNodePropertyArray authLoginselectorChangepwMappings) {
    this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.loginselector.changepw.mappings")
  public ConfigNodePropertyArray getAuthLoginselectorChangepwMappings() {
    return authLoginselectorChangepwMappings;
  }
  public void setAuthLoginselectorChangepwMappings(ConfigNodePropertyArray authLoginselectorChangepwMappings) {
    this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
  }

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorDefaultloginpage(ConfigNodePropertyString authLoginselectorDefaultloginpage) {
    this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.loginselector.defaultloginpage")
  public ConfigNodePropertyString getAuthLoginselectorDefaultloginpage() {
    return authLoginselectorDefaultloginpage;
  }
  public void setAuthLoginselectorDefaultloginpage(ConfigNodePropertyString authLoginselectorDefaultloginpage) {
    this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
  }

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorDefaultchangepwpage(ConfigNodePropertyString authLoginselectorDefaultchangepwpage) {
    this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.loginselector.defaultchangepwpage")
  public ConfigNodePropertyString getAuthLoginselectorDefaultchangepwpage() {
    return authLoginselectorDefaultchangepwpage;
  }
  public void setAuthLoginselectorDefaultchangepwpage(ConfigNodePropertyString authLoginselectorDefaultchangepwpage) {
    this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
  }

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorHandle(ConfigNodePropertyArray authLoginselectorHandle) {
    this.authLoginselectorHandle = authLoginselectorHandle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.loginselector.handle")
  public ConfigNodePropertyArray getAuthLoginselectorHandle() {
    return authLoginselectorHandle;
  }
  public void setAuthLoginselectorHandle(ConfigNodePropertyArray authLoginselectorHandle) {
    this.authLoginselectorHandle = authLoginselectorHandle;
  }

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.loginselector.handle.all.extensions")
  public ConfigNodePropertyBoolean getAuthLoginselectorHandleAllExtensions() {
    return authLoginselectorHandleAllExtensions;
  }
  public void setAuthLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAuthImplLoginSelectorHandlerProperties comDayCqAuthImplLoginSelectorHandlerProperties = (ComDayCqAuthImplLoginSelectorHandlerProperties) o;
    return Objects.equals(path, comDayCqAuthImplLoginSelectorHandlerProperties.path) &&
        Objects.equals(serviceRanking, comDayCqAuthImplLoginSelectorHandlerProperties.serviceRanking) &&
        Objects.equals(authLoginselectorMappings, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorMappings) &&
        Objects.equals(authLoginselectorChangepwMappings, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorChangepwMappings) &&
        Objects.equals(authLoginselectorDefaultloginpage, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorDefaultloginpage) &&
        Objects.equals(authLoginselectorDefaultchangepwpage, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorDefaultchangepwpage) &&
        Objects.equals(authLoginselectorHandle, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorHandle) &&
        Objects.equals(authLoginselectorHandleAllExtensions, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorHandleAllExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking, authLoginselectorMappings, authLoginselectorChangepwMappings, authLoginselectorDefaultloginpage, authLoginselectorDefaultchangepwpage, authLoginselectorHandle, authLoginselectorHandleAllExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAuthImplLoginSelectorHandlerProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    authLoginselectorMappings: ").append(toIndentedString(authLoginselectorMappings)).append("\n");
    sb.append("    authLoginselectorChangepwMappings: ").append(toIndentedString(authLoginselectorChangepwMappings)).append("\n");
    sb.append("    authLoginselectorDefaultloginpage: ").append(toIndentedString(authLoginselectorDefaultloginpage)).append("\n");
    sb.append("    authLoginselectorDefaultchangepwpage: ").append(toIndentedString(authLoginselectorDefaultchangepwpage)).append("\n");
    sb.append("    authLoginselectorHandle: ").append(toIndentedString(authLoginselectorHandle)).append("\n");
    sb.append("    authLoginselectorHandleAllExtensions: ").append(toIndentedString(authLoginselectorHandleAllExtensions)).append("\n");
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

