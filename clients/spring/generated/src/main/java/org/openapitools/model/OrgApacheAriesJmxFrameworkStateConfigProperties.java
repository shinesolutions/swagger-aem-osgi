package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheAriesJmxFrameworkStateConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheAriesJmxFrameworkStateConfigProperties   {
  @JsonProperty("attributeChangeNotificationEnabled")
  private ConfigNodePropertyBoolean attributeChangeNotificationEnabled = null;

  public OrgApacheAriesJmxFrameworkStateConfigProperties attributeChangeNotificationEnabled(ConfigNodePropertyBoolean attributeChangeNotificationEnabled) {
    this.attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
    return this;
  }

  /**
   * Get attributeChangeNotificationEnabled
   * @return attributeChangeNotificationEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getAttributeChangeNotificationEnabled() {
    return attributeChangeNotificationEnabled;
  }

  public void setAttributeChangeNotificationEnabled(ConfigNodePropertyBoolean attributeChangeNotificationEnabled) {
    this.attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheAriesJmxFrameworkStateConfigProperties orgApacheAriesJmxFrameworkStateConfigProperties = (OrgApacheAriesJmxFrameworkStateConfigProperties) o;
    return Objects.equals(this.attributeChangeNotificationEnabled, orgApacheAriesJmxFrameworkStateConfigProperties.attributeChangeNotificationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeChangeNotificationEnabled);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

