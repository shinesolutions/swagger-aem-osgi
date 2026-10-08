package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dam.showexpired")
  private ConfigNodePropertyBoolean damShowexpired;

  @JsonProperty("dam.showhidden")
  private ConfigNodePropertyBoolean damShowhidden;

  @JsonProperty("tagTitleSearch")
  private ConfigNodePropertyBoolean tagTitleSearch;

  @JsonProperty("guessTotal")
  private ConfigNodePropertyString guessTotal;

  @JsonProperty("dam.expiryProperty")
  private ConfigNodePropertyString damExpiryProperty;

  /**
   * 
   * @return damShowexpired
   */
  public ConfigNodePropertyBoolean getDamShowexpired() {
    return damShowexpired;
  }

  public void setDamShowexpired(ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
  }

  /**
   * 
   * @return damShowhidden
   */
  public ConfigNodePropertyBoolean getDamShowhidden() {
    return damShowhidden;
  }

  public void setDamShowhidden(ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
  }

  /**
   * 
   * @return tagTitleSearch
   */
  public ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }

  public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }

  /**
   * 
   * @return guessTotal
   */
  public ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }

  public void setGuessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  /**
   * 
   * @return damExpiryProperty
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
