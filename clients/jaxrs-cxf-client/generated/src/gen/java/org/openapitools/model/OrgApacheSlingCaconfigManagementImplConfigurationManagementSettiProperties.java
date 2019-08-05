package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray ignorePropertyNameRegex = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray configCollectionPropertiesResourceNames = null;
 /**
   * Get ignorePropertyNameRegex
   * @return ignorePropertyNameRegex
  **/
  @JsonProperty("ignorePropertyNameRegex")
  public ConfigNodePropertyArray getIgnorePropertyNameRegex() {
    return ignorePropertyNameRegex;
  }

  public void setIgnorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
  }

  public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties ignorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
    return this;
  }

 /**
   * Get configCollectionPropertiesResourceNames
   * @return configCollectionPropertiesResourceNames
  **/
  @JsonProperty("configCollectionPropertiesResourceNames")
  public ConfigNodePropertyArray getConfigCollectionPropertiesResourceNames() {
    return configCollectionPropertiesResourceNames;
  }

  public void setConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray configCollectionPropertiesResourceNames) {
    this.configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
  }

  public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties configCollectionPropertiesResourceNames(ConfigNodePropertyArray configCollectionPropertiesResourceNames) {
    this.configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {\n");
    
    sb.append("    ignorePropertyNameRegex: ").append(toIndentedString(ignorePropertyNameRegex)).append("\n");
    sb.append("    configCollectionPropertiesResourceNames: ").append(toIndentedString(configCollectionPropertiesResourceNames)).append("\n");
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

