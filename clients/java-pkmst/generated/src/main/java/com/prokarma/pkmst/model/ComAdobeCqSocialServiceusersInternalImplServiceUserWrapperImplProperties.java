package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties   {
  @JsonProperty("enableFallback")
  private ConfigNodePropertyBoolean enableFallback = null;

  public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties enableFallback(ConfigNodePropertyBoolean enableFallback) {
    this.enableFallback = enableFallback;
    return this;
  }

   /**
   * Get enableFallback
   * @return enableFallback
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.enableFallback, comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.enableFallback);
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
