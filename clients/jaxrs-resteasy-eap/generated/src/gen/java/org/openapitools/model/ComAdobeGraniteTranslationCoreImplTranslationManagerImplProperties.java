package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties   {
  

  private ConfigNodePropertyString defaultConnectorName = null;

  private ConfigNodePropertyString defaultCategory = null;

  /**
   **/
  
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
    return Objects.equals(defaultConnectorName, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.defaultConnectorName) &&
        Objects.equals(defaultCategory, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.defaultCategory);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

