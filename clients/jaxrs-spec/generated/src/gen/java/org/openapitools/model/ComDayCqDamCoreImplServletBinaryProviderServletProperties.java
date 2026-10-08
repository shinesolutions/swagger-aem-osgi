package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamCoreImplServletBinaryProviderServletProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletBinaryProviderServletProperties   {
  private ConfigNodePropertyArray slingServletResourceTypes;
  private ConfigNodePropertyArray slingServletMethods;
  private ConfigNodePropertyBoolean cqDamDrmEnable;

  public ComDayCqDamCoreImplServletBinaryProviderServletProperties() {
  }

  /**
   **/
  public ComDayCqDamCoreImplServletBinaryProviderServletProperties slingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.resourceTypes")
  @Valid public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  @JsonProperty("sling.servlet.resourceTypes")
  public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  /**
   **/
  public ComDayCqDamCoreImplServletBinaryProviderServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.methods")
  @Valid public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  @JsonProperty("sling.servlet.methods")
  public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  /**
   **/
  public ComDayCqDamCoreImplServletBinaryProviderServletProperties cqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.drm.enable")
  @Valid public ConfigNodePropertyBoolean getCqDamDrmEnable() {
    return cqDamDrmEnable;
  }

  @JsonProperty("cq.dam.drm.enable")
  public void setCqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletBinaryProviderServletProperties comDayCqDamCoreImplServletBinaryProviderServletProperties = (ComDayCqDamCoreImplServletBinaryProviderServletProperties) o;
    return Objects.equals(this.slingServletResourceTypes, comDayCqDamCoreImplServletBinaryProviderServletProperties.slingServletResourceTypes) &&
        Objects.equals(this.slingServletMethods, comDayCqDamCoreImplServletBinaryProviderServletProperties.slingServletMethods) &&
        Objects.equals(this.cqDamDrmEnable, comDayCqDamCoreImplServletBinaryProviderServletProperties.cqDamDrmEnable);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
