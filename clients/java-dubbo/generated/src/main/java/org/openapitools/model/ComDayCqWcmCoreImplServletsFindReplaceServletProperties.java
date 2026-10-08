package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmCoreImplServletsFindReplaceServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("scope")
  private ConfigNodePropertyArray scope;

  /**
   * 
   * @return scope
   */
  public ConfigNodePropertyArray getScope() {
    return scope;
  }

  public void setScope(ConfigNodePropertyArray scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsFindReplaceServletProperties comDayCqWcmCoreImplServletsFindReplaceServletProperties = (ComDayCqWcmCoreImplServletsFindReplaceServletProperties) o;
    return Objects.equals(this.scope, comDayCqWcmCoreImplServletsFindReplaceServletProperties.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
