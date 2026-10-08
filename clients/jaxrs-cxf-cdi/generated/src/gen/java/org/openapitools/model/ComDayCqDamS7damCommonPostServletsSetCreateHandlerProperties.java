package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties   {
  
  private ConfigNodePropertyString slingPostOperation;

  private ConfigNodePropertyString slingServletMethods;

  /**
   **/
  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties slingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.post.operation")
  public ConfigNodePropertyString getSlingPostOperation() {
    return slingPostOperation;
  }
  public void setSlingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
  }


  /**
   **/
  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }
  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties = (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties) o;
    return Objects.equals(this.slingPostOperation, comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.slingPostOperation) &&
        Objects.equals(this.slingServletMethods, comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.slingServletMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingPostOperation, slingServletMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties {\n");
    
    sb.append("    slingPostOperation: ").append(toIndentedString(slingPostOperation)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

