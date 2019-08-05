package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqDamCoreImplLightboxLightboxServletProperties   {
  @JsonProperty("sling.servlet.paths")
  private ConfigNodePropertyString slingServletPaths = null;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyArray slingServletMethods = null;

  @JsonProperty("cq.dam.enable.anonymous")
  private ConfigNodePropertyBoolean cqDamEnableAnonymous = null;

  /**
   **/
  public ComDayCqDamCoreImplLightboxLightboxServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

  
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
  public ComDayCqDamCoreImplLightboxLightboxServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  
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
  public ComDayCqDamCoreImplLightboxLightboxServletProperties cqDamEnableAnonymous(ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.enable.anonymous")
  public ConfigNodePropertyBoolean getCqDamEnableAnonymous() {
    return cqDamEnableAnonymous;
  }
  public void setCqDamEnableAnonymous(ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

