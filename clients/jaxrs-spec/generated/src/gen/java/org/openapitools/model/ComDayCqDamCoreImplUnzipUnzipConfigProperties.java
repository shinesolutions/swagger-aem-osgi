package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamCoreImplUnzipUnzipConfigProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplUnzipUnzipConfigProperties   {
  private ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize;
  private ConfigNodePropertyString cqDamConfigUnzipEncoding;

  public ComDayCqDamCoreImplUnzipUnzipConfigProperties() {
  }

  /**
   **/
  public ComDayCqDamCoreImplUnzipUnzipConfigProperties cqDamConfigUnzipMaxuncompressedsize(ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize) {
    this.cqDamConfigUnzipMaxuncompressedsize = cqDamConfigUnzipMaxuncompressedsize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.unzip.maxuncompressedsize")
  @Valid public ConfigNodePropertyInteger getCqDamConfigUnzipMaxuncompressedsize() {
    return cqDamConfigUnzipMaxuncompressedsize;
  }

  @JsonProperty("cq.dam.config.unzip.maxuncompressedsize")
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
  @Valid public ConfigNodePropertyString getCqDamConfigUnzipEncoding() {
    return cqDamConfigUnzipEncoding;
  }

  @JsonProperty("cq.dam.config.unzip.encoding")
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
    return Objects.equals(this.cqDamConfigUnzipMaxuncompressedsize, comDayCqDamCoreImplUnzipUnzipConfigProperties.cqDamConfigUnzipMaxuncompressedsize) &&
        Objects.equals(this.cqDamConfigUnzipEncoding, comDayCqDamCoreImplUnzipUnzipConfigProperties.cqDamConfigUnzipEncoding);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
