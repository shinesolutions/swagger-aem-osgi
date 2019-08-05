package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamHandlerFfmpegLocatorImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamHandlerFfmpegLocatorImplProperties   {
  @JsonProperty("executable.searchpath")
  private ConfigNodePropertyArray executableSearchpath = null;

  public ComDayCqDamHandlerFfmpegLocatorImplProperties executableSearchpath(ConfigNodePropertyArray executableSearchpath) {
    this.executableSearchpath = executableSearchpath;
    return this;
  }

   /**
   * Get executableSearchpath
   * @return executableSearchpath
  **/
  @Valid
  public ConfigNodePropertyArray getExecutableSearchpath() {
    return executableSearchpath;
  }

  public void setExecutableSearchpath(ConfigNodePropertyArray executableSearchpath) {
    this.executableSearchpath = executableSearchpath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamHandlerFfmpegLocatorImplProperties comDayCqDamHandlerFfmpegLocatorImplProperties = (ComDayCqDamHandlerFfmpegLocatorImplProperties) o;
    return Objects.equals(executableSearchpath, comDayCqDamHandlerFfmpegLocatorImplProperties.executableSearchpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executableSearchpath);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerFfmpegLocatorImplProperties {\n");
    
    sb.append("    executableSearchpath: ").append(toIndentedString(executableSearchpath)).append("\n");
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

