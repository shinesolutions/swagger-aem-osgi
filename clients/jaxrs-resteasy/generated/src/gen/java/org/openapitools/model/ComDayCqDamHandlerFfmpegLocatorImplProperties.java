package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamHandlerFfmpegLocatorImplProperties   {
  
  private ConfigNodePropertyArray executableSearchpath = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("executable.searchpath")
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

