package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxItems = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxPathDepth = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean enabled = null;
 /**
   * Get maxItems
   * @return maxItems
  **/
  @JsonProperty("maxItems")
  public ConfigNodePropertyInteger getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(ConfigNodePropertyInteger maxItems) {
    this.maxItems = maxItems;
  }

  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties maxItems(ConfigNodePropertyInteger maxItems) {
    this.maxItems = maxItems;
    return this;
  }

 /**
   * Get maxPathDepth
   * @return maxPathDepth
  **/
  @JsonProperty("maxPathDepth")
  public ConfigNodePropertyInteger getMaxPathDepth() {
    return maxPathDepth;
  }

  public void setMaxPathDepth(ConfigNodePropertyInteger maxPathDepth) {
    this.maxPathDepth = maxPathDepth;
  }

  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties maxPathDepth(ConfigNodePropertyInteger maxPathDepth) {
    this.maxPathDepth = maxPathDepth;
    return this;
  }

 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {\n");
    
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    maxPathDepth: ").append(toIndentedString(maxPathDepth)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

