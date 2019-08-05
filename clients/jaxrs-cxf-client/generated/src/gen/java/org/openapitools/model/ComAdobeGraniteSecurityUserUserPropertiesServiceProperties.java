package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString adapterCondition = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray graniteUserpropertiesNodetypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray graniteUserpropertiesResourcetypes = null;
 /**
   * Get adapterCondition
   * @return adapterCondition
  **/
  @JsonProperty("adapter.condition")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties adapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

 /**
   * Get graniteUserpropertiesNodetypes
   * @return graniteUserpropertiesNodetypes
  **/
  @JsonProperty("granite.userproperties.nodetypes")
  public ConfigNodePropertyArray getGraniteUserpropertiesNodetypes() {
    return graniteUserpropertiesNodetypes;
  }

  public void setGraniteUserpropertiesNodetypes(ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
  }

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties graniteUserpropertiesNodetypes(ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
    return this;
  }

 /**
   * Get graniteUserpropertiesResourcetypes
   * @return graniteUserpropertiesResourcetypes
  **/
  @JsonProperty("granite.userproperties.resourcetypes")
  public ConfigNodePropertyArray getGraniteUserpropertiesResourcetypes() {
    return graniteUserpropertiesResourcetypes;
  }

  public void setGraniteUserpropertiesResourcetypes(ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
    this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
  }

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties graniteUserpropertiesResourcetypes(ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
    this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {\n");
    
    sb.append("    adapterCondition: ").append(toIndentedString(adapterCondition)).append("\n");
    sb.append("    graniteUserpropertiesNodetypes: ").append(toIndentedString(graniteUserpropertiesNodetypes)).append("\n");
    sb.append("    graniteUserpropertiesResourcetypes: ").append(toIndentedString(graniteUserpropertiesResourcetypes)).append("\n");
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

