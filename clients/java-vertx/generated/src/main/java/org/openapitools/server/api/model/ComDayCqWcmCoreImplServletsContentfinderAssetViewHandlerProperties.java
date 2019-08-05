package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties   {
  
  private ConfigNodePropertyBoolean damShowexpired = null;
  private ConfigNodePropertyBoolean damShowhidden = null;
  private ConfigNodePropertyBoolean tagTitleSearch = null;
  private ConfigNodePropertyString guessTotal = null;
  private ConfigNodePropertyString damExpiryProperty = null;

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties () {

  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties (ConfigNodePropertyBoolean damShowexpired, ConfigNodePropertyBoolean damShowhidden, ConfigNodePropertyBoolean tagTitleSearch, ConfigNodePropertyString guessTotal, ConfigNodePropertyString damExpiryProperty) {
    this.damShowexpired = damShowexpired;
    this.damShowhidden = damShowhidden;
    this.tagTitleSearch = tagTitleSearch;
    this.guessTotal = guessTotal;
    this.damExpiryProperty = damExpiryProperty;
  }

    
  @JsonProperty("dam.showexpired")
  public ConfigNodePropertyBoolean getDamShowexpired() {
    return damShowexpired;
  }
  public void setDamShowexpired(ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
  }

    
  @JsonProperty("dam.showhidden")
  public ConfigNodePropertyBoolean getDamShowhidden() {
    return damShowhidden;
  }
  public void setDamShowhidden(ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
  }

    
  @JsonProperty("tagTitleSearch")
  public ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }
  public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }

    
  @JsonProperty("guessTotal")
  public ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }
  public void setGuessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

    
  @JsonProperty("dam.expiryProperty")
  public ConfigNodePropertyString getDamExpiryProperty() {
    return damExpiryProperty;
  }
  public void setDamExpiryProperty(ConfigNodePropertyString damExpiryProperty) {
    this.damExpiryProperty = damExpiryProperty;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
