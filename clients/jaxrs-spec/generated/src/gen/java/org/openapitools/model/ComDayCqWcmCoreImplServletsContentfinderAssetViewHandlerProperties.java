package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties   {
  
  private @Valid ConfigNodePropertyBoolean damShowexpired = null;
  private @Valid ConfigNodePropertyBoolean damShowhidden = null;
  private @Valid ConfigNodePropertyBoolean tagTitleSearch = null;
  private @Valid ConfigNodePropertyString guessTotal = null;
  private @Valid ConfigNodePropertyString damExpiryProperty = null;

  /**
   **/
  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damShowexpired(ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.showexpired")
  public ConfigNodePropertyBoolean getDamShowexpired() {
    return damShowexpired;
  }
  public void setDamShowexpired(ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
  }

  /**
   **/
  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damShowhidden(ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.showhidden")
  public ConfigNodePropertyBoolean getDamShowhidden() {
    return damShowhidden;
  }
  public void setDamShowhidden(ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
  }

  /**
   **/
  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties tagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tagTitleSearch")
  public ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }
  public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }

  /**
   **/
  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties guessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("guessTotal")
  public ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }
  public void setGuessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  /**
   **/
  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damExpiryProperty(ConfigNodePropertyString damExpiryProperty) {
    this.damExpiryProperty = damExpiryProperty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.expiryProperty")
  public ConfigNodePropertyString getDamExpiryProperty() {
    return damExpiryProperty;
  }
  public void setDamExpiryProperty(ConfigNodePropertyString damExpiryProperty) {
    this.damExpiryProperty = damExpiryProperty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties = (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties) o;
    return Objects.equals(damShowexpired, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damShowexpired) &&
        Objects.equals(damShowhidden, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damShowhidden) &&
        Objects.equals(tagTitleSearch, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.tagTitleSearch) &&
        Objects.equals(guessTotal, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.guessTotal) &&
        Objects.equals(damExpiryProperty, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damExpiryProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damShowexpired, damShowhidden, tagTitleSearch, guessTotal, damExpiryProperty);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

