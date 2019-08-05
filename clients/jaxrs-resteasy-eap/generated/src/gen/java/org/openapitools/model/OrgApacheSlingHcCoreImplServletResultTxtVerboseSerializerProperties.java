package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties   {
  

  private ConfigNodePropertyInteger totalWidth = null;

  private ConfigNodePropertyInteger colWidthName = null;

  private ConfigNodePropertyInteger colWidthResult = null;

  private ConfigNodePropertyInteger colWidthTiming = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("colWidthTiming")
  public ConfigNodePropertyInteger getColWidthTiming() {
    return colWidthTiming;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

