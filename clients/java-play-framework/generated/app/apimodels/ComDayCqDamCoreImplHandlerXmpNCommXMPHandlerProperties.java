package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties   {
  @JsonProperty("xmphandler.cq.formats")
  private ConfigNodePropertyArray xmphandlerCqFormats = null;

  public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties xmphandlerCqFormats(ConfigNodePropertyArray xmphandlerCqFormats) {
    this.xmphandlerCqFormats = xmphandlerCqFormats;
    return this;
  }

   /**
   * Get xmphandlerCqFormats
   * @return xmphandlerCqFormats
  **/
  @Valid
  public ConfigNodePropertyArray getXmphandlerCqFormats() {
    return xmphandlerCqFormats;
  }

  public void setXmphandlerCqFormats(ConfigNodePropertyArray xmphandlerCqFormats) {
    this.xmphandlerCqFormats = xmphandlerCqFormats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties = (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties) o;
    return Objects.equals(xmphandlerCqFormats, comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.xmphandlerCqFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xmphandlerCqFormats);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {\n");
    
    sb.append("    xmphandlerCqFormats: ").append(toIndentedString(xmphandlerCqFormats)).append("\n");
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

