package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties   {
  
  private @Valid ConfigNodePropertyInteger binaryThreshold = null;

  /**
   **/
  public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties binaryThreshold(ConfigNodePropertyInteger binaryThreshold) {
    this.binaryThreshold = binaryThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("binary.threshold")
  public ConfigNodePropertyInteger getBinaryThreshold() {
    return binaryThreshold;
  }
  public void setBinaryThreshold(ConfigNodePropertyInteger binaryThreshold) {
    this.binaryThreshold = binaryThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties = (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties) o;
    return Objects.equals(binaryThreshold, comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.binaryThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties {\n");
    
    sb.append("    binaryThreshold: ").append(toIndentedString(binaryThreshold)).append("\n");
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

