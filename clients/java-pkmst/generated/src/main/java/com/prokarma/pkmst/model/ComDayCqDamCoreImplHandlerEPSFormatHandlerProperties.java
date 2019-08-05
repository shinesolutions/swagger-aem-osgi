package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties   {
  @JsonProperty("mimetype")
  private ConfigNodePropertyString mimetype = null;

  public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties mimetype(ConfigNodePropertyString mimetype) {
    this.mimetype = mimetype;
    return this;
  }

   /**
   * Get mimetype
   * @return mimetype
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getMimetype() {
    return mimetype;
  }

  public void setMimetype(ConfigNodePropertyString mimetype) {
    this.mimetype = mimetype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties comDayCqDamCoreImplHandlerEPSFormatHandlerProperties = (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties) o;
    return Objects.equals(this.mimetype, comDayCqDamCoreImplHandlerEPSFormatHandlerProperties.mimetype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimetype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties {\n");
    
    sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
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

