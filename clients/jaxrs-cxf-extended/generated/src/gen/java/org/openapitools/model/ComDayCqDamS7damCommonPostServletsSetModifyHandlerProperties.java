package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingPostOperation;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletMethods;
 /**
  * Get slingPostOperation
  * @return slingPostOperation
  */
  @JsonProperty("sling.post.operation")
  public ConfigNodePropertyString getSlingPostOperation() {
    return slingPostOperation;
  }

  /**
   * Sets the <code>slingPostOperation</code> property.
   */
 public void setSlingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
  }

  /**
   * Sets the <code>slingPostOperation</code> property.
   */
  public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties slingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
    return this;
  }

 /**
  * Get slingServletMethods
  * @return slingServletMethods
  */
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  /**
   * Sets the <code>slingServletMethods</code> property.
   */
 public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  /**
   * Sets the <code>slingServletMethods</code> property.
   */
  public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
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
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties = (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties) o;
    return Objects.equals(this.slingPostOperation, comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.slingPostOperation) &&
        Objects.equals(this.slingServletMethods, comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.slingServletMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingPostOperation, slingServletMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties {\n");
    
    sb.append("    slingPostOperation: ").append(toIndentedString(slingPostOperation)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

