package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties   {
  @JsonProperty("felix.inventory.printer.name")
  private ConfigNodePropertyString felixInventoryPrinterName;

  @JsonProperty("felix.inventory.printer.title")
  private ConfigNodePropertyString felixInventoryPrinterTitle;

  @JsonProperty("path")
  private ConfigNodePropertyString path;

  public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties felixInventoryPrinterName(ConfigNodePropertyString felixInventoryPrinterName) {
    this.felixInventoryPrinterName = felixInventoryPrinterName;
    return this;
  }

  /**
   * Get felixInventoryPrinterName
   * @return felixInventoryPrinterName
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFelixInventoryPrinterName() {
    return felixInventoryPrinterName;
  }

  public void setFelixInventoryPrinterName(ConfigNodePropertyString felixInventoryPrinterName) {
    this.felixInventoryPrinterName = felixInventoryPrinterName;
  }

  public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties felixInventoryPrinterTitle(ConfigNodePropertyString felixInventoryPrinterTitle) {
    this.felixInventoryPrinterTitle = felixInventoryPrinterTitle;
    return this;
  }

  /**
   * Get felixInventoryPrinterTitle
   * @return felixInventoryPrinterTitle
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFelixInventoryPrinterTitle() {
    return felixInventoryPrinterTitle;
  }

  public void setFelixInventoryPrinterTitle(ConfigNodePropertyString felixInventoryPrinterTitle) {
    this.felixInventoryPrinterTitle = felixInventoryPrinterTitle;
  }

  public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
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
    return Objects.equals(this.felixInventoryPrinterName, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.felixInventoryPrinterName) &&
        Objects.equals(this.felixInventoryPrinterTitle, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.felixInventoryPrinterTitle) &&
        Objects.equals(this.path, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(felixInventoryPrinterName, felixInventoryPrinterTitle, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {\n");
    
    sb.append("    felixInventoryPrinterName: ").append(toIndentedString(felixInventoryPrinterName)).append("\n");
    sb.append("    felixInventoryPrinterTitle: ").append(toIndentedString(felixInventoryPrinterTitle)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

