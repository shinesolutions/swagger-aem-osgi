package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties   {
  
  private ConfigNodePropertyString felixInventoryPrinterName = null;
  private ConfigNodePropertyString felixInventoryPrinterTitle = null;
  private ConfigNodePropertyString path = null;

  public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties () {

  }

  public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties (ConfigNodePropertyString felixInventoryPrinterName, ConfigNodePropertyString felixInventoryPrinterTitle, ConfigNodePropertyString path) {
    this.felixInventoryPrinterName = felixInventoryPrinterName;
    this.felixInventoryPrinterTitle = felixInventoryPrinterTitle;
    this.path = path;
  }

    
  @JsonProperty("felix.inventory.printer.name")
  public ConfigNodePropertyString getFelixInventoryPrinterName() {
    return felixInventoryPrinterName;
  }
  public void setFelixInventoryPrinterName(ConfigNodePropertyString felixInventoryPrinterName) {
    this.felixInventoryPrinterName = felixInventoryPrinterName;
  }

    
  @JsonProperty("felix.inventory.printer.title")
  public ConfigNodePropertyString getFelixInventoryPrinterTitle() {
    return felixInventoryPrinterTitle;
  }
  public void setFelixInventoryPrinterTitle(ConfigNodePropertyString felixInventoryPrinterTitle) {
    this.felixInventoryPrinterTitle = felixInventoryPrinterTitle;
  }

    
  @JsonProperty("path")
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
    return Objects.equals(felixInventoryPrinterName, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.felixInventoryPrinterName) &&
        Objects.equals(felixInventoryPrinterTitle, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.felixInventoryPrinterTitle) &&
        Objects.equals(path, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.path);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
