package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString guessTotal = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean tagTitleSearch = null;
 /**
   * Get guessTotal
   * @return guessTotal
  **/
  @JsonProperty("guessTotal")
  public ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }

  public void setGuessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties guessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

 /**
   * Get tagTitleSearch
   * @return tagTitleSearch
  **/
  @JsonProperty("tagTitleSearch")
  public ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }

  public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }

  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties tagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {\n");
    
    sb.append("    guessTotal: ").append(toIndentedString(guessTotal)).append("\n");
    sb.append("    tagTitleSearch: ").append(toIndentedString(tagTitleSearch)).append("\n");
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

