package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqAuthImplLoginSelectorHandlerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAuthImplLoginSelectorHandlerProperties   {
  private ConfigNodePropertyString path;
  private ConfigNodePropertyInteger serviceRanking;
  private ConfigNodePropertyArray authLoginselectorMappings;
  private ConfigNodePropertyArray authLoginselectorChangepwMappings;
  private ConfigNodePropertyString authLoginselectorDefaultloginpage;
  private ConfigNodePropertyString authLoginselectorDefaultchangepwpage;
  private ConfigNodePropertyArray authLoginselectorHandle;
  private ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions;

  public ComDayCqAuthImplLoginSelectorHandlerProperties() {
  }

  /**
   **/
  public ComDayCqAuthImplLoginSelectorHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  @Valid public ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
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
  @Valid public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
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
  @Valid public ConfigNodePropertyArray getAuthLoginselectorMappings() {
    return authLoginselectorMappings;
  }

  @JsonProperty("auth.loginselector.mappings")
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
  @Valid public ConfigNodePropertyArray getAuthLoginselectorChangepwMappings() {
    return authLoginselectorChangepwMappings;
  }

  @JsonProperty("auth.loginselector.changepw.mappings")
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
  @Valid public ConfigNodePropertyString getAuthLoginselectorDefaultloginpage() {
    return authLoginselectorDefaultloginpage;
  }

  @JsonProperty("auth.loginselector.defaultloginpage")
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
  @Valid public ConfigNodePropertyString getAuthLoginselectorDefaultchangepwpage() {
    return authLoginselectorDefaultchangepwpage;
  }

  @JsonProperty("auth.loginselector.defaultchangepwpage")
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
  @Valid public ConfigNodePropertyArray getAuthLoginselectorHandle() {
    return authLoginselectorHandle;
  }

  @JsonProperty("auth.loginselector.handle")
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
  @Valid public ConfigNodePropertyBoolean getAuthLoginselectorHandleAllExtensions() {
    return authLoginselectorHandleAllExtensions;
  }

  @JsonProperty("auth.loginselector.handle.all.extensions")
  public void setAuthLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAuthImplLoginSelectorHandlerProperties comDayCqAuthImplLoginSelectorHandlerProperties = (ComDayCqAuthImplLoginSelectorHandlerProperties) o;
    return Objects.equals(this.path, comDayCqAuthImplLoginSelectorHandlerProperties.path) &&
        Objects.equals(this.serviceRanking, comDayCqAuthImplLoginSelectorHandlerProperties.serviceRanking) &&
        Objects.equals(this.authLoginselectorMappings, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorMappings) &&
        Objects.equals(this.authLoginselectorChangepwMappings, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorChangepwMappings) &&
        Objects.equals(this.authLoginselectorDefaultloginpage, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorDefaultloginpage) &&
        Objects.equals(this.authLoginselectorDefaultchangepwpage, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorDefaultchangepwpage) &&
        Objects.equals(this.authLoginselectorHandle, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorHandle) &&
        Objects.equals(this.authLoginselectorHandleAllExtensions, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorHandleAllExtensions);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
