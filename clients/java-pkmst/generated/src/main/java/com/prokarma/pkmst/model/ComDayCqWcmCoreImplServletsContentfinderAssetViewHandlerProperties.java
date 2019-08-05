package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties   {
  @JsonProperty("dam.showexpired")
  private ConfigNodePropertyBoolean damShowexpired = null;

  @JsonProperty("dam.showhidden")
  private ConfigNodePropertyBoolean damShowhidden = null;

  @JsonProperty("tagTitleSearch")
  private ConfigNodePropertyBoolean tagTitleSearch = null;

  @JsonProperty("guessTotal")
  private ConfigNodePropertyString guessTotal = null;

  @JsonProperty("dam.expiryProperty")
  private ConfigNodePropertyString damExpiryProperty = null;

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damShowexpired(ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
    return this;
  }

   /**
   * Get damShowexpired
   * @return damShowexpired
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDamShowexpired() {
    return damShowexpired;
  }

  public void setDamShowexpired(ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damShowhidden(ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
    return this;
  }

   /**
   * Get damShowhidden
   * @return damShowhidden
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDamShowhidden() {
    return damShowhidden;
  }

  public void setDamShowhidden(ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties tagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }

   /**
   * Get tagTitleSearch
   * @return tagTitleSearch
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }

  public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties guessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

   /**
   * Get guessTotal
   * @return guessTotal
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }

  public void setGuessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damExpiryProperty(ConfigNodePropertyString damExpiryProperty) {
    this.damExpiryProperty = damExpiryProperty;
    return this;
  }

   /**
   * Get damExpiryProperty
   * @return damExpiryProperty
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.damShowexpired, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damShowexpired) &&
        Objects.equals(this.damShowhidden, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damShowhidden) &&
        Objects.equals(this.tagTitleSearch, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.tagTitleSearch) &&
        Objects.equals(this.guessTotal, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.guessTotal) &&
        Objects.equals(this.damExpiryProperty, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damExpiryProperty);
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

