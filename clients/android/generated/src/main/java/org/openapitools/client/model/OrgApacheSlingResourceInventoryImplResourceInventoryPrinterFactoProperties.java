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

import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {
  
  @SerializedName("felix.inventory.printer.name")
  private ConfigNodePropertyString felixInventoryPrinterName = null;
  @SerializedName("felix.inventory.printer.title")
  private ConfigNodePropertyString felixInventoryPrinterTitle = null;
  @SerializedName("path")
  private ConfigNodePropertyString path = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFelixInventoryPrinterName() {
    return felixInventoryPrinterName;
  }
  public void setFelixInventoryPrinterName(ConfigNodePropertyString felixInventoryPrinterName) {
    this.felixInventoryPrinterName = felixInventoryPrinterName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFelixInventoryPrinterTitle() {
    return felixInventoryPrinterTitle;
  }
  public void setFelixInventoryPrinterTitle(ConfigNodePropertyString felixInventoryPrinterTitle) {
    this.felixInventoryPrinterTitle = felixInventoryPrinterTitle;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties = (OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties) o;
    return (this.felixInventoryPrinterName == null ? orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.felixInventoryPrinterName == null : this.felixInventoryPrinterName.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.felixInventoryPrinterName)) &&
        (this.felixInventoryPrinterTitle == null ? orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.felixInventoryPrinterTitle == null : this.felixInventoryPrinterTitle.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.felixInventoryPrinterTitle)) &&
        (this.path == null ? orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.path == null : this.path.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.path));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.felixInventoryPrinterName == null ? 0: this.felixInventoryPrinterName.hashCode());
    result = 31 * result + (this.felixInventoryPrinterTitle == null ? 0: this.felixInventoryPrinterTitle.hashCode());
    result = 31 * result + (this.path == null ? 0: this.path.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {\n");
    
    sb.append("  felixInventoryPrinterName: ").append(felixInventoryPrinterName).append("\n");
    sb.append("  felixInventoryPrinterTitle: ").append(felixInventoryPrinterTitle).append("\n");
    sb.append("  path: ").append(path).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}