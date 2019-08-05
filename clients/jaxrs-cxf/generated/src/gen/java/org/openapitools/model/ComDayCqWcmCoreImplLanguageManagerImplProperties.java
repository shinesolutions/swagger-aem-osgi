package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmCoreImplLanguageManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString langmgrListPath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray langmgrCountryDefault = null;
 /**
   * Get langmgrListPath
   * @return langmgrListPath
  **/
  @JsonProperty("langmgr.list.path")
  public ConfigNodePropertyString getLangmgrListPath() {
    return langmgrListPath;
  }

  public void setLangmgrListPath(ConfigNodePropertyString langmgrListPath) {
    this.langmgrListPath = langmgrListPath;
  }

  public ComDayCqWcmCoreImplLanguageManagerImplProperties langmgrListPath(ConfigNodePropertyString langmgrListPath) {
    this.langmgrListPath = langmgrListPath;
    return this;
  }

 /**
   * Get langmgrCountryDefault
   * @return langmgrCountryDefault
  **/
  @JsonProperty("langmgr.country.default")
  public ConfigNodePropertyArray getLangmgrCountryDefault() {
    return langmgrCountryDefault;
  }

  public void setLangmgrCountryDefault(ConfigNodePropertyArray langmgrCountryDefault) {
    this.langmgrCountryDefault = langmgrCountryDefault;
  }

  public ComDayCqWcmCoreImplLanguageManagerImplProperties langmgrCountryDefault(ConfigNodePropertyArray langmgrCountryDefault) {
    this.langmgrCountryDefault = langmgrCountryDefault;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplLanguageManagerImplProperties {\n");
    
    sb.append("    langmgrListPath: ").append(toIndentedString(langmgrListPath)).append("\n");
    sb.append("    langmgrCountryDefault: ").append(toIndentedString(langmgrCountryDefault)).append("\n");
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

