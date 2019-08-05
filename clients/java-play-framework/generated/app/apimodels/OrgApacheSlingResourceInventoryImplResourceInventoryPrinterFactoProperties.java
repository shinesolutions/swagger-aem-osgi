package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties   {
  @JsonProperty("felix.inventory.printer.name")
  private ConfigNodePropertyString felixInventoryPrinterName = null;

  @JsonProperty("felix.inventory.printer.title")
  private ConfigNodePropertyString felixInventoryPrinterTitle = null;

  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  public OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties felixInventoryPrinterName(ConfigNodePropertyString felixInventoryPrinterName) {
    this.felixInventoryPrinterName = felixInventoryPrinterName;
    return this;
  }

   /**
   * Get felixInventoryPrinterName
   * @return felixInventoryPrinterName
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

