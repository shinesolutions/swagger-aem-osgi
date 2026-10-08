package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties   {
  @JsonProperty("authoringUIModeService.default")
  @Valid

  private ConfigNodePropertyString authoringUIModeServiceDefault;

  public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties authoringUIModeServiceDefault(ConfigNodePropertyString authoringUIModeServiceDefault) {
    this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
    return this;
  }

   /**
   * Get authoringUIModeServiceDefault
   * @return authoringUIModeServiceDefault
  **/
  public ConfigNodePropertyString getAuthoringUIModeServiceDefault() {
    return authoringUIModeServiceDefault;
  }

  public void setAuthoringUIModeServiceDefault(ConfigNodePropertyString authoringUIModeServiceDefault) {
    this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

