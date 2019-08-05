package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties   {
  
  private @Valid ConfigNodePropertyString authoringUIModeServiceDefault = null;

  /**
   **/
  public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties authoringUIModeServiceDefault(ConfigNodePropertyString authoringUIModeServiceDefault) {
    this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authoringUIModeService.default")
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

