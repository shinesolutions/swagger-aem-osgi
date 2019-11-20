/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {
  
  @SerializedName("totalWidth")
  private ConfigNodePropertyInteger totalWidth = null;
  @SerializedName("colWidthName")
  private ConfigNodePropertyInteger colWidthName = null;
  @SerializedName("colWidthResult")
  private ConfigNodePropertyInteger colWidthResult = null;
  @SerializedName("colWidthTiming")
  private ConfigNodePropertyInteger colWidthTiming = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getTotalWidth() {
    return totalWidth;
  }
  public void setTotalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getColWidthName() {
    return colWidthName;
  }
  public void setColWidthName(ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getColWidthResult() {
    return colWidthResult;
  }
  public void setColWidthResult(ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.totalWidth == null ? orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.totalWidth == null : this.totalWidth.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.totalWidth)) &&
        (this.colWidthName == null ? orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthName == null : this.colWidthName.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthName)) &&
        (this.colWidthResult == null ? orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthResult == null : this.colWidthResult.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthResult)) &&
        (this.colWidthTiming == null ? orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthTiming == null : this.colWidthTiming.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthTiming));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.totalWidth == null ? 0: this.totalWidth.hashCode());
    result = 31 * result + (this.colWidthName == null ? 0: this.colWidthName.hashCode());
    result = 31 * result + (this.colWidthResult == null ? 0: this.colWidthResult.hashCode());
    result = 31 * result + (this.colWidthTiming == null ? 0: this.colWidthTiming.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {\n");
    
    sb.append("  totalWidth: ").append(totalWidth).append("\n");
    sb.append("  colWidthName: ").append(colWidthName).append("\n");
    sb.append("  colWidthResult: ").append(colWidthResult).append("\n");
    sb.append("  colWidthTiming: ").append(colWidthTiming).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}