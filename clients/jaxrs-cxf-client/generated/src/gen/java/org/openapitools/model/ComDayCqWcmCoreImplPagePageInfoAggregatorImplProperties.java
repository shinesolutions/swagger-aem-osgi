package org.openapitools.model;

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

public class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString pageInfoProviderPropertyRegexDefault = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString pageInfoProviderPropertyName = null;
 /**
   * Get pageInfoProviderPropertyRegexDefault
   * @return pageInfoProviderPropertyRegexDefault
  **/
  @JsonProperty("page.info.provider.property.regex.default")
  public ConfigNodePropertyString getPageInfoProviderPropertyRegexDefault() {
    return pageInfoProviderPropertyRegexDefault;
  }

  public void setPageInfoProviderPropertyRegexDefault(ConfigNodePropertyString pageInfoProviderPropertyRegexDefault) {
    this.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault;
  }

  public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties pageInfoProviderPropertyRegexDefault(ConfigNodePropertyString pageInfoProviderPropertyRegexDefault) {
    this.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault;
    return this;
  }

 /**
   * Get pageInfoProviderPropertyName
   * @return pageInfoProviderPropertyName
  **/
  @JsonProperty("page.info.provider.property.name")
  public ConfigNodePropertyString getPageInfoProviderPropertyName() {
    return pageInfoProviderPropertyName;
  }

  public void setPageInfoProviderPropertyName(ConfigNodePropertyString pageInfoProviderPropertyName) {
    this.pageInfoProviderPropertyName = pageInfoProviderPropertyName;
  }

  public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties pageInfoProviderPropertyName(ConfigNodePropertyString pageInfoProviderPropertyName) {
    this.pageInfoProviderPropertyName = pageInfoProviderPropertyName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {\n");
    
    sb.append("    pageInfoProviderPropertyRegexDefault: ").append(toIndentedString(pageInfoProviderPropertyRegexDefault)).append("\n");
    sb.append("    pageInfoProviderPropertyName: ").append(toIndentedString(pageInfoProviderPropertyName)).append("\n");
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

