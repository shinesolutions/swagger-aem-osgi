package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamCoreImplServletBinaryProviderServletProperties   {
  
  private ConfigNodePropertyArray slingServletResourceTypes = null;
  private ConfigNodePropertyArray slingServletMethods = null;
  private ConfigNodePropertyBoolean cqDamDrmEnable = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
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
  @JsonProperty("cq.dam.drm.enable")
  public ConfigNodePropertyBoolean getCqDamDrmEnable() {
    return cqDamDrmEnable;
  }
  public void setCqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletBinaryProviderServletProperties comDayCqDamCoreImplServletBinaryProviderServletProperties = (ComDayCqDamCoreImplServletBinaryProviderServletProperties) o;
    return Objects.equals(slingServletResourceTypes, comDayCqDamCoreImplServletBinaryProviderServletProperties.slingServletResourceTypes) &&
        Objects.equals(slingServletMethods, comDayCqDamCoreImplServletBinaryProviderServletProperties.slingServletMethods) &&
        Objects.equals(cqDamDrmEnable, comDayCqDamCoreImplServletBinaryProviderServletProperties.cqDamDrmEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletMethods, cqDamDrmEnable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletBinaryProviderServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    cqDamDrmEnable: ").append(toIndentedString(cqDamDrmEnable)).append("\n");
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

