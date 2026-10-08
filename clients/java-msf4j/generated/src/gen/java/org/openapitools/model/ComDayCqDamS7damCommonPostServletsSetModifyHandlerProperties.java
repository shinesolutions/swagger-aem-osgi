package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties   {
  @JsonProperty("sling.post.operation")
  private ConfigNodePropertyString slingPostOperation;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyString slingServletMethods;

  public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties slingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
    return this;
  }

   /**
   * Get slingPostOperation
   * @return slingPostOperation
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingPostOperation() {
    return slingPostOperation;
  }

  public void setSlingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
  }

  public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

   /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

