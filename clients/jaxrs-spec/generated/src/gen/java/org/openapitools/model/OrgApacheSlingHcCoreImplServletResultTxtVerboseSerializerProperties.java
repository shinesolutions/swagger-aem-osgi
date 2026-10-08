package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties   {
  private ConfigNodePropertyInteger totalWidth;
  private ConfigNodePropertyInteger colWidthName;
  private ConfigNodePropertyInteger colWidthResult;
  private ConfigNodePropertyInteger colWidthTiming;

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties() {
  }

  /**
   **/
  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties totalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalWidth")
  @Valid public ConfigNodePropertyInteger getTotalWidth() {
    return totalWidth;
  }

  @JsonProperty("totalWidth")
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
  @Valid public ConfigNodePropertyInteger getColWidthName() {
    return colWidthName;
  }

  @JsonProperty("colWidthName")
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
  @Valid public ConfigNodePropertyInteger getColWidthResult() {
    return colWidthResult;
  }

  @JsonProperty("colWidthResult")
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
  @Valid public ConfigNodePropertyInteger getColWidthTiming() {
    return colWidthTiming;
  }

  @JsonProperty("colWidthTiming")
  public void setColWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
    this.colWidthTiming = colWidthTiming;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties = (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties) o;
    return Objects.equals(this.totalWidth, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.totalWidth) &&
        Objects.equals(this.colWidthName, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthName) &&
        Objects.equals(this.colWidthResult, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthResult) &&
        Objects.equals(this.colWidthTiming, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthTiming);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
