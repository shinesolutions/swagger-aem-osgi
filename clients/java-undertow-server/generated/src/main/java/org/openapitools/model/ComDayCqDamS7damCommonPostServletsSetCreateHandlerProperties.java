package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties   {
  
  private ConfigNodePropertyString slingPostOperation = null;
  private ConfigNodePropertyString slingServletMethods = null;

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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties = (ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties) o;
    return Objects.equals(slingPostOperation, comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.slingPostOperation) &&
        Objects.equals(slingServletMethods, comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.slingServletMethods);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
