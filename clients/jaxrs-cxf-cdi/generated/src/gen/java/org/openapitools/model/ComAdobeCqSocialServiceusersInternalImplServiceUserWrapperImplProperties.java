package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties   {
  
  private ConfigNodePropertyBoolean enableFallback = null;


  /**
   **/
  public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties enableFallback(ConfigNodePropertyBoolean enableFallback) {
    this.enableFallback = enableFallback;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableFallback")
  public ConfigNodePropertyBoolean getEnableFallback() {
    return enableFallback;
  }
  public void setEnableFallback(ConfigNodePropertyBoolean enableFallback) {
    this.enableFallback = enableFallback;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties = (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties) o;
    return Objects.equals(enableFallback, comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.enableFallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableFallback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties {\n");
    
    sb.append("    enableFallback: ").append(toIndentedString(enableFallback)).append("\n");
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
