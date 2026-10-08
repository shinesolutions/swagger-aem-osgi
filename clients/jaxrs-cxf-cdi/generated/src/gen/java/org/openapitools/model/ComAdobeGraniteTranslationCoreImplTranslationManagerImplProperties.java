package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties   {
  
  private ConfigNodePropertyString defaultConnectorName;

  private ConfigNodePropertyString defaultCategory;

  /**
   **/
  public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties defaultConnectorName(ConfigNodePropertyString defaultConnectorName) {
    this.defaultConnectorName = defaultConnectorName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultConnectorName")
  public ConfigNodePropertyString getDefaultConnectorName() {
    return defaultConnectorName;
  }
  public void setDefaultConnectorName(ConfigNodePropertyString defaultConnectorName) {
    this.defaultConnectorName = defaultConnectorName;
  }


  /**
   **/
  public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties defaultCategory(ConfigNodePropertyString defaultCategory) {
    this.defaultCategory = defaultCategory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultCategory")
  public ConfigNodePropertyString getDefaultCategory() {
    return defaultCategory;
  }
  public void setDefaultCategory(ConfigNodePropertyString defaultCategory) {
    this.defaultCategory = defaultCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties = (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties) o;
    return Objects.equals(this.defaultConnectorName, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.defaultConnectorName) &&
        Objects.equals(this.defaultCategory, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.defaultCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultConnectorName, defaultCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {\n");
    
    sb.append("    defaultConnectorName: ").append(toIndentedString(defaultConnectorName)).append("\n");
    sb.append("    defaultCategory: ").append(toIndentedString(defaultCategory)).append("\n");
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

