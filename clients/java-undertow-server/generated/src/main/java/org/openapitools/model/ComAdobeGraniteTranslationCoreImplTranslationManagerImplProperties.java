/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties   {
  
  private ConfigNodePropertyString defaultConnectorName;
  private ConfigNodePropertyString defaultCategory;

  /**
   */
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
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

