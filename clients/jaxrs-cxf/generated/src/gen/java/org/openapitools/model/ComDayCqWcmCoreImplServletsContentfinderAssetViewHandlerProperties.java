package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean damShowexpired = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean damShowhidden = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean tagTitleSearch = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString guessTotal = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString damExpiryProperty = null;
 /**
   * Get damShowexpired
   * @return damShowexpired
  **/
  @JsonProperty("dam.showexpired")
  public ConfigNodePropertyBoolean getDamShowexpired() {
    return damShowexpired;
  }

  public void setDamShowexpired(ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damShowexpired(ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
    return this;
  }

 /**
   * Get damShowhidden
   * @return damShowhidden
  **/
  @JsonProperty("dam.showhidden")
  public ConfigNodePropertyBoolean getDamShowhidden() {
    return damShowhidden;
  }

  public void setDamShowhidden(ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damShowhidden(ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
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

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties tagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }

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

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties guessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

 /**
   * Get damExpiryProperty
   * @return damExpiryProperty
  **/
  @JsonProperty("dam.expiryProperty")
  public ConfigNodePropertyString getDamExpiryProperty() {
    return damExpiryProperty;
  }

  public void setDamExpiryProperty(ConfigNodePropertyString damExpiryProperty) {
    this.damExpiryProperty = damExpiryProperty;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damExpiryProperty(ConfigNodePropertyString damExpiryProperty) {
    this.damExpiryProperty = damExpiryProperty;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {\n");
    
    sb.append("    damShowexpired: ").append(toIndentedString(damShowexpired)).append("\n");
    sb.append("    damShowhidden: ").append(toIndentedString(damShowhidden)).append("\n");
    sb.append("    tagTitleSearch: ").append(toIndentedString(tagTitleSearch)).append("\n");
    sb.append("    guessTotal: ").append(toIndentedString(guessTotal)).append("\n");
    sb.append("    damExpiryProperty: ").append(toIndentedString(damExpiryProperty)).append("\n");
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

