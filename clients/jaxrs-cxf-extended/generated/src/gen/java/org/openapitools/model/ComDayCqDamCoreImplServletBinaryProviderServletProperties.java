package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplServletBinaryProviderServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletResourceTypes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletMethods;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqDamDrmEnable;
 /**
  * Get slingServletResourceTypes
  * @return slingServletResourceTypes
  */
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  /**
   * Sets the <code>slingServletResourceTypes</code> property.
   */
 public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  /**
   * Sets the <code>slingServletResourceTypes</code> property.
   */
  public ComDayCqDamCoreImplServletBinaryProviderServletProperties slingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

 /**
  * Get slingServletMethods
  * @return slingServletMethods
  */
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  /**
   * Sets the <code>slingServletMethods</code> property.
   */
 public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  /**
   * Sets the <code>slingServletMethods</code> property.
   */
  public ComDayCqDamCoreImplServletBinaryProviderServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

 /**
  * Get cqDamDrmEnable
  * @return cqDamDrmEnable
  */
  @JsonProperty("cq.dam.drm.enable")
  public ConfigNodePropertyBoolean getCqDamDrmEnable() {
    return cqDamDrmEnable;
  }

  /**
   * Sets the <code>cqDamDrmEnable</code> property.
   */
 public void setCqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
  }

  /**
   * Sets the <code>cqDamDrmEnable</code> property.
   */
  public ComDayCqDamCoreImplServletBinaryProviderServletProperties cqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

