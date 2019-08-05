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

public class GuideLocalizationServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray supportedLocales = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray localizableProperties = null;
 /**
   * Get supportedLocales
   * @return supportedLocales
  **/
  @JsonProperty("supportedLocales")
  public ConfigNodePropertyArray getSupportedLocales() {
    return supportedLocales;
  }

  public void setSupportedLocales(ConfigNodePropertyArray supportedLocales) {
    this.supportedLocales = supportedLocales;
  }

  public GuideLocalizationServiceProperties supportedLocales(ConfigNodePropertyArray supportedLocales) {
    this.supportedLocales = supportedLocales;
    return this;
  }

 /**
   * Get localizableProperties
   * @return localizableProperties
  **/
  @JsonProperty("Localizable Properties")
  public ConfigNodePropertyArray getLocalizableProperties() {
    return localizableProperties;
  }

  public void setLocalizableProperties(ConfigNodePropertyArray localizableProperties) {
    this.localizableProperties = localizableProperties;
  }

  public GuideLocalizationServiceProperties localizableProperties(ConfigNodePropertyArray localizableProperties) {
    this.localizableProperties = localizableProperties;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideLocalizationServiceProperties {\n");
    
    sb.append("    supportedLocales: ").append(toIndentedString(supportedLocales)).append("\n");
    sb.append("    localizableProperties: ").append(toIndentedString(localizableProperties)).append("\n");
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

