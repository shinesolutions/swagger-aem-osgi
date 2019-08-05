package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmCoreImplServletsFindReplaceServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplServletsFindReplaceServletProperties   {
  @JsonProperty("scope")
  private ConfigNodePropertyArray scope = null;

  public ComDayCqWcmCoreImplServletsFindReplaceServletProperties scope(ConfigNodePropertyArray scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Valid
  public ConfigNodePropertyArray getScope() {
    return scope;
  }

  public void setScope(ConfigNodePropertyArray scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsFindReplaceServletProperties comDayCqWcmCoreImplServletsFindReplaceServletProperties = (ComDayCqWcmCoreImplServletsFindReplaceServletProperties) o;
    return Objects.equals(scope, comDayCqWcmCoreImplServletsFindReplaceServletProperties.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsFindReplaceServletProperties {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

