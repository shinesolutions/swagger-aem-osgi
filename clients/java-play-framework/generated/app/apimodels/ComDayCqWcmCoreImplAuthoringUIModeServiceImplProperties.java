package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties   {
  @JsonProperty("authoringUIModeService.default")
  private ConfigNodePropertyString authoringUIModeServiceDefault = null;

  public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties authoringUIModeServiceDefault(ConfigNodePropertyString authoringUIModeServiceDefault) {
    this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
    return this;
  }

   /**
   * Get authoringUIModeServiceDefault
   * @return authoringUIModeServiceDefault
  **/
  @Valid
  public ConfigNodePropertyString getAuthoringUIModeServiceDefault() {
    return authoringUIModeServiceDefault;
  }

  public void setAuthoringUIModeServiceDefault(ConfigNodePropertyString authoringUIModeServiceDefault) {
    this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties = (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties) o;
    return Objects.equals(authoringUIModeServiceDefault, comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.authoringUIModeServiceDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authoringUIModeServiceDefault);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties {\n");
    
    sb.append("    authoringUIModeServiceDefault: ").append(toIndentedString(authoringUIModeServiceDefault)).append("\n");
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

