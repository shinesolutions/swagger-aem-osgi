package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties   {
  @JsonProperty("name.whitelist")
  private ConfigNodePropertyString nameWhitelist = null;

  @JsonProperty("allow.expressions")
  private ConfigNodePropertyBoolean allowExpressions = null;

  public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties nameWhitelist(ConfigNodePropertyString nameWhitelist) {
    this.nameWhitelist = nameWhitelist;
    return this;
  }

   /**
   * Get nameWhitelist
   * @return nameWhitelist
  **/
  @Valid
  public ConfigNodePropertyString getNameWhitelist() {
    return nameWhitelist;
  }

  public void setNameWhitelist(ConfigNodePropertyString nameWhitelist) {
    this.nameWhitelist = nameWhitelist;
  }

  public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties allowExpressions(ConfigNodePropertyBoolean allowExpressions) {
    this.allowExpressions = allowExpressions;
    return this;
  }

   /**
   * Get allowExpressions
   * @return allowExpressions
  **/
  @Valid
  public ConfigNodePropertyBoolean getAllowExpressions() {
    return allowExpressions;
  }

  public void setAllowExpressions(ConfigNodePropertyBoolean allowExpressions) {
    this.allowExpressions = allowExpressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties comDayCqWcmFoundationFormsImplFormsHandlingServletProperties = (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties) o;
    return Objects.equals(nameWhitelist, comDayCqWcmFoundationFormsImplFormsHandlingServletProperties.nameWhitelist) &&
        Objects.equals(allowExpressions, comDayCqWcmFoundationFormsImplFormsHandlingServletProperties.allowExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameWhitelist, allowExpressions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties {\n");
    
    sb.append("    nameWhitelist: ").append(toIndentedString(nameWhitelist)).append("\n");
    sb.append("    allowExpressions: ").append(toIndentedString(allowExpressions)).append("\n");
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

