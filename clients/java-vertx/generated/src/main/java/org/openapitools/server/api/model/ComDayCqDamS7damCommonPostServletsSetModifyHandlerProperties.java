package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties   {
  
  private ConfigNodePropertyString slingPostOperation = null;
  private ConfigNodePropertyString slingServletMethods = null;

  public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties () {

  }

  public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties (ConfigNodePropertyString slingPostOperation, ConfigNodePropertyString slingServletMethods) {
    this.slingPostOperation = slingPostOperation;
    this.slingServletMethods = slingServletMethods;
  }

    
  @JsonProperty("sling.post.operation")
  public ConfigNodePropertyString getSlingPostOperation() {
    return slingPostOperation;
  }
  public void setSlingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
  }

    
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
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties = (ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties) o;
    return Objects.equals(slingPostOperation, comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.slingPostOperation) &&
        Objects.equals(slingServletMethods, comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.slingServletMethods);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
