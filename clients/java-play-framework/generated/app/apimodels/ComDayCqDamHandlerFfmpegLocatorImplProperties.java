package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamHandlerFfmpegLocatorImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamHandlerFfmpegLocatorImplProperties   {
  @JsonProperty("executable.searchpath")
  @Valid

  private ConfigNodePropertyArray executableSearchpath;

  public ComDayCqDamHandlerFfmpegLocatorImplProperties executableSearchpath(ConfigNodePropertyArray executableSearchpath) {
    this.executableSearchpath = executableSearchpath;
    return this;
  }

   /**
   * Get executableSearchpath
   * @return executableSearchpath
  **/
  public ConfigNodePropertyArray getExecutableSearchpath() {
    return executableSearchpath;
  }

  public void setExecutableSearchpath(ConfigNodePropertyArray executableSearchpath) {
    this.executableSearchpath = executableSearchpath;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

