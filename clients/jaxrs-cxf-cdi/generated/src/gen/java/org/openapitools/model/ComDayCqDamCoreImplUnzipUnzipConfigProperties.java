package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamCoreImplUnzipUnzipConfigProperties   {
  
  private ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize = null;

  private ConfigNodePropertyString cqDamConfigUnzipEncoding = null;


  /**
   **/
  public ComDayCqDamCoreImplUnzipUnzipConfigProperties cqDamConfigUnzipMaxuncompressedsize(ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize) {
    this.cqDamConfigUnzipMaxuncompressedsize = cqDamConfigUnzipMaxuncompressedsize;
    return this;
  }

  
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
  public ComDayCqDamCoreImplUnzipUnzipConfigProperties cqDamConfigUnzipEncoding(ConfigNodePropertyString cqDamConfigUnzipEncoding) {
    this.cqDamConfigUnzipEncoding = cqDamConfigUnzipEncoding;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.unzip.encoding")
  public ConfigNodePropertyString getCqDamConfigUnzipEncoding() {
    return cqDamConfigUnzipEncoding;
  }
  public void setCqDamConfigUnzipEncoding(ConfigNodePropertyString cqDamConfigUnzipEncoding) {
    this.cqDamConfigUnzipEncoding = cqDamConfigUnzipEncoding;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

