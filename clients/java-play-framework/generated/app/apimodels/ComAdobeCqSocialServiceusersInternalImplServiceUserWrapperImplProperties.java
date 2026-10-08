package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties   {
  @JsonProperty("enableFallback")
  @Valid

  private ConfigNodePropertyBoolean enableFallback;

  public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties enableFallback(ConfigNodePropertyBoolean enableFallback) {
    this.enableFallback = enableFallback;
    return this;
  }

   /**
   * Get enableFallback
   * @return enableFallback
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

