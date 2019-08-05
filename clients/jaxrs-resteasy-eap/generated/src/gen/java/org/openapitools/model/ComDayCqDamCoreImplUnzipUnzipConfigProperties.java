package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamCoreImplUnzipUnzipConfigProperties   {
  

  private ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize = null;

  private ConfigNodePropertyString cqDamConfigUnzipEncoding = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.unzip.maxuncompressedsize")
  public ConfigNodePropertyInteger getCqDamConfigUnzipMaxuncompressedsize() {
    return cqDamConfigUnzipMaxuncompressedsize;
  }
  public void setCqDamConfigUnzipMaxuncompressedsize(ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize) {
    this.cqDamConfigUnzipMaxuncompressedsize = cqDamConfigUnzipMaxuncompressedsize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.unzip.encoding")
  public ConfigNodePropertyString getCqDamConfigUnzipEncoding() {
    return cqDamConfigUnzipEncoding;
  }
  public void setCqDamConfigUnzipEncoding(ConfigNodePropertyString cqDamConfigUnzipEncoding) {
    this.cqDamConfigUnzipEncoding = cqDamConfigUnzipEncoding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplUnzipUnzipConfigProperties comDayCqDamCoreImplUnzipUnzipConfigProperties = (ComDayCqDamCoreImplUnzipUnzipConfigProperties) o;
    return Objects.equals(cqDamConfigUnzipMaxuncompressedsize, comDayCqDamCoreImplUnzipUnzipConfigProperties.cqDamConfigUnzipMaxuncompressedsize) &&
        Objects.equals(cqDamConfigUnzipEncoding, comDayCqDamCoreImplUnzipUnzipConfigProperties.cqDamConfigUnzipEncoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamConfigUnzipMaxuncompressedsize, cqDamConfigUnzipEncoding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplUnzipUnzipConfigProperties {\n");
    
    sb.append("    cqDamConfigUnzipMaxuncompressedsize: ").append(toIndentedString(cqDamConfigUnzipMaxuncompressedsize)).append("\n");
    sb.append("    cqDamConfigUnzipEncoding: ").append(toIndentedString(cqDamConfigUnzipEncoding)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

