package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties   {
  
  private ConfigNodePropertyString illegalCharMapping = null;
  private ConfigNodePropertyBoolean pageSubTreeActivationCheck = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("illegalCharMapping")
  public ConfigNodePropertyString getIllegalCharMapping() {
    return illegalCharMapping;
  }
  public void setIllegalCharMapping(ConfigNodePropertyString illegalCharMapping) {
    this.illegalCharMapping = illegalCharMapping;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pageSubTreeActivationCheck")
  public ConfigNodePropertyBoolean getPageSubTreeActivationCheck() {
    return pageSubTreeActivationCheck;
  }
  public void setPageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck) {
    this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

