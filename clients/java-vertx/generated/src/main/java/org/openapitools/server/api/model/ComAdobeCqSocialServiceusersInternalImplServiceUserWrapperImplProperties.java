package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties   {
  
  private ConfigNodePropertyBoolean enableFallback = null;

  public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties () {

  }

  public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties (ConfigNodePropertyBoolean enableFallback) {
    this.enableFallback = enableFallback;
  }

    
  @JsonProperty("enableFallback")
  public ConfigNodePropertyBoolean getEnableFallback() {
    return enableFallback;
  }
  public void setEnableFallback(ConfigNodePropertyBoolean enableFallback) {
    this.enableFallback = enableFallback;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
