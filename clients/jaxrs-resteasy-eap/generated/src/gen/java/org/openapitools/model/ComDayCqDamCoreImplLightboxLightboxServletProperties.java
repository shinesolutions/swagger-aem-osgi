package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamCoreImplLightboxLightboxServletProperties   {
  

  private ConfigNodePropertyString slingServletPaths = null;

  private ConfigNodePropertyArray slingServletMethods = null;

  private ConfigNodePropertyBoolean cqDamEnableAnonymous = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.paths")
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }
  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }
  public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.enable.anonymous")
  public ConfigNodePropertyBoolean getCqDamEnableAnonymous() {
    return cqDamEnableAnonymous;
  }
  public void setCqDamEnableAnonymous(ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplLightboxLightboxServletProperties comDayCqDamCoreImplLightboxLightboxServletProperties = (ComDayCqDamCoreImplLightboxLightboxServletProperties) o;
    return Objects.equals(slingServletPaths, comDayCqDamCoreImplLightboxLightboxServletProperties.slingServletPaths) &&
        Objects.equals(slingServletMethods, comDayCqDamCoreImplLightboxLightboxServletProperties.slingServletMethods) &&
        Objects.equals(cqDamEnableAnonymous, comDayCqDamCoreImplLightboxLightboxServletProperties.cqDamEnableAnonymous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletPaths, slingServletMethods, cqDamEnableAnonymous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplLightboxLightboxServletProperties {\n");
    
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    cqDamEnableAnonymous: ").append(toIndentedString(cqDamEnableAnonymous)).append("\n");
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

