package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties   {
  
  private @Valid ConfigNodePropertyInteger totalWidth = null;
  private @Valid ConfigNodePropertyInteger colWidthName = null;
  private @Valid ConfigNodePropertyInteger colWidthResult = null;
  private @Valid ConfigNodePropertyInteger colWidthTiming = null;

  /**
   **/
  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties totalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalWidth")
  public ConfigNodePropertyInteger getTotalWidth() {
    return totalWidth;
  }
  public void setTotalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
  }

  /**
   **/
  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthName(ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("colWidthName")
  public ConfigNodePropertyInteger getColWidthName() {
    return colWidthName;
  }
  public void setColWidthName(ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
  }

  /**
   **/
  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthResult(ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("colWidthResult")
  public ConfigNodePropertyInteger getColWidthResult() {
    return colWidthResult;
  }
  public void setColWidthResult(ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
  }

  /**
   **/
  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
    this.colWidthTiming = colWidthTiming;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("colWidthTiming")
  public ConfigNodePropertyInteger getColWidthTiming() {
    return colWidthTiming;
  }
  public void setColWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
    this.colWidthTiming = colWidthTiming;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties = (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties) o;
    return Objects.equals(totalWidth, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.totalWidth) &&
        Objects.equals(colWidthName, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthName) &&
        Objects.equals(colWidthResult, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthResult) &&
        Objects.equals(colWidthTiming, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthTiming);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalWidth, colWidthName, colWidthResult, colWidthTiming);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {\n");
    
    sb.append("    totalWidth: ").append(toIndentedString(totalWidth)).append("\n");
    sb.append("    colWidthName: ").append(toIndentedString(colWidthName)).append("\n");
    sb.append("    colWidthResult: ").append(toIndentedString(colWidthResult)).append("\n");
    sb.append("    colWidthTiming: ").append(toIndentedString(colWidthTiming)).append("\n");
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

