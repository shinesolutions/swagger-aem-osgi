package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties   {
  
  private ConfigNodePropertyString illegalCharMapping = null;
  private ConfigNodePropertyBoolean pageSubTreeActivationCheck = null;

  public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties () {

  }

  public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties (ConfigNodePropertyString illegalCharMapping, ConfigNodePropertyBoolean pageSubTreeActivationCheck) {
    this.illegalCharMapping = illegalCharMapping;
    this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
  }

    
  @JsonProperty("illegalCharMapping")
  public ConfigNodePropertyString getIllegalCharMapping() {
    return illegalCharMapping;
  }
  public void setIllegalCharMapping(ConfigNodePropertyString illegalCharMapping) {
    this.illegalCharMapping = illegalCharMapping;
  }

    
  @JsonProperty("pageSubTreeActivationCheck")
  public ConfigNodePropertyBoolean getPageSubTreeActivationCheck() {
    return pageSubTreeActivationCheck;
  }
  public void setPageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck) {
    this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties comDayCqWcmCoreImplPagePageManagerFactoryImplProperties = (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties) o;
    return Objects.equals(illegalCharMapping, comDayCqWcmCoreImplPagePageManagerFactoryImplProperties.illegalCharMapping) &&
        Objects.equals(pageSubTreeActivationCheck, comDayCqWcmCoreImplPagePageManagerFactoryImplProperties.pageSubTreeActivationCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(illegalCharMapping, pageSubTreeActivationCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {\n");
    
    sb.append("    illegalCharMapping: ").append(toIndentedString(illegalCharMapping)).append("\n");
    sb.append("    pageSubTreeActivationCheck: ").append(toIndentedString(pageSubTreeActivationCheck)).append("\n");
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
