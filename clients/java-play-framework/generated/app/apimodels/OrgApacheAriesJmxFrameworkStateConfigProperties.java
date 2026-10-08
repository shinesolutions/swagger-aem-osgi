package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheAriesJmxFrameworkStateConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheAriesJmxFrameworkStateConfigProperties   {
  @JsonProperty("attributeChangeNotificationEnabled")
  @Valid

  private ConfigNodePropertyBoolean attributeChangeNotificationEnabled;

  public OrgApacheAriesJmxFrameworkStateConfigProperties attributeChangeNotificationEnabled(ConfigNodePropertyBoolean attributeChangeNotificationEnabled) {
    this.attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
    return this;
  }

   /**
   * Get attributeChangeNotificationEnabled
   * @return attributeChangeNotificationEnabled
  **/
  public ConfigNodePropertyBoolean getAttributeChangeNotificationEnabled() {
    return attributeChangeNotificationEnabled;
  }

  public void setAttributeChangeNotificationEnabled(ConfigNodePropertyBoolean attributeChangeNotificationEnabled) {
    this.attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheAriesJmxFrameworkStateConfigProperties orgApacheAriesJmxFrameworkStateConfigProperties = (OrgApacheAriesJmxFrameworkStateConfigProperties) o;
    return Objects.equals(attributeChangeNotificationEnabled, orgApacheAriesJmxFrameworkStateConfigProperties.attributeChangeNotificationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeChangeNotificationEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheAriesJmxFrameworkStateConfigProperties {\n");
    
    sb.append("    attributeChangeNotificationEnabled: ").append(toIndentedString(attributeChangeNotificationEnabled)).append("\n");
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

