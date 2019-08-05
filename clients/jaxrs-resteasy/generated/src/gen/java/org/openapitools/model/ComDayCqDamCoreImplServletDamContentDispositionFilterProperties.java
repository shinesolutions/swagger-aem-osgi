package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties   {
  
  private ConfigNodePropertyArray cqMimeTypeBlacklist = null;
  private ConfigNodePropertyBoolean cqDamEmptyMime = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.mime.type.blacklist")
  public ConfigNodePropertyArray getCqMimeTypeBlacklist() {
    return cqMimeTypeBlacklist;
  }
  public void setCqMimeTypeBlacklist(ConfigNodePropertyArray cqMimeTypeBlacklist) {
    this.cqMimeTypeBlacklist = cqMimeTypeBlacklist;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.empty.mime")
  public ConfigNodePropertyBoolean getCqDamEmptyMime() {
    return cqDamEmptyMime;
  }
  public void setCqDamEmptyMime(ConfigNodePropertyBoolean cqDamEmptyMime) {
    this.cqDamEmptyMime = cqDamEmptyMime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletDamContentDispositionFilterProperties comDayCqDamCoreImplServletDamContentDispositionFilterProperties = (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties) o;
    return Objects.equals(cqMimeTypeBlacklist, comDayCqDamCoreImplServletDamContentDispositionFilterProperties.cqMimeTypeBlacklist) &&
        Objects.equals(cqDamEmptyMime, comDayCqDamCoreImplServletDamContentDispositionFilterProperties.cqDamEmptyMime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqMimeTypeBlacklist, cqDamEmptyMime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {\n");
    
    sb.append("    cqMimeTypeBlacklist: ").append(toIndentedString(cqMimeTypeBlacklist)).append("\n");
    sb.append("    cqDamEmptyMime: ").append(toIndentedString(cqDamEmptyMime)).append("\n");
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

