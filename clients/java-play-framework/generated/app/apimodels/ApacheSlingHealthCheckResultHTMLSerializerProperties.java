package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ApacheSlingHealthCheckResultHTMLSerializerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ApacheSlingHealthCheckResultHTMLSerializerProperties   {
  @JsonProperty("styleString")
  private ConfigNodePropertyString styleString = null;

  public ApacheSlingHealthCheckResultHTMLSerializerProperties styleString(ConfigNodePropertyString styleString) {
    this.styleString = styleString;
    return this;
  }

   /**
   * Get styleString
   * @return styleString
  **/
  @Valid
  public ConfigNodePropertyString getStyleString() {
    return styleString;
  }

  public void setStyleString(ConfigNodePropertyString styleString) {
    this.styleString = styleString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApacheSlingHealthCheckResultHTMLSerializerProperties apacheSlingHealthCheckResultHTMLSerializerProperties = (ApacheSlingHealthCheckResultHTMLSerializerProperties) o;
    return Objects.equals(styleString, apacheSlingHealthCheckResultHTMLSerializerProperties.styleString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(styleString);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApacheSlingHealthCheckResultHTMLSerializerProperties {\n");
    
    sb.append("    styleString: ").append(toIndentedString(styleString)).append("\n");
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

