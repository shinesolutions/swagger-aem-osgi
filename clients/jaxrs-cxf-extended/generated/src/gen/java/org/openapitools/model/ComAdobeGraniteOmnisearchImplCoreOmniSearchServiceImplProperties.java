package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire;
 /**
  * Get omnisearchSuggestionRequiretextMin
  * @return omnisearchSuggestionRequiretextMin
  */
  @JsonProperty("omnisearch.suggestion.requiretext.min")
  public ConfigNodePropertyInteger getOmnisearchSuggestionRequiretextMin() {
    return omnisearchSuggestionRequiretextMin;
  }

  /**
   * Sets the <code>omnisearchSuggestionRequiretextMin</code> property.
   */
 public void setOmnisearchSuggestionRequiretextMin(ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin) {
    this.omnisearchSuggestionRequiretextMin = omnisearchSuggestionRequiretextMin;
  }

  /**
   * Sets the <code>omnisearchSuggestionRequiretextMin</code> property.
   */
  public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties omnisearchSuggestionRequiretextMin(ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin) {
    this.omnisearchSuggestionRequiretextMin = omnisearchSuggestionRequiretextMin;
    return this;
  }

 /**
  * Get omnisearchSuggestionSpellcheckRequire
  * @return omnisearchSuggestionSpellcheckRequire
  */
  @JsonProperty("omnisearch.suggestion.spellcheck.require")
  public ConfigNodePropertyBoolean getOmnisearchSuggestionSpellcheckRequire() {
    return omnisearchSuggestionSpellcheckRequire;
  }

  /**
   * Sets the <code>omnisearchSuggestionSpellcheckRequire</code> property.
   */
 public void setOmnisearchSuggestionSpellcheckRequire(ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire) {
    this.omnisearchSuggestionSpellcheckRequire = omnisearchSuggestionSpellcheckRequire;
  }

  /**
   * Sets the <code>omnisearchSuggestionSpellcheckRequire</code> property.
   */
  public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties omnisearchSuggestionSpellcheckRequire(ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire) {
    this.omnisearchSuggestionSpellcheckRequire = omnisearchSuggestionSpellcheckRequire;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties = (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties) o;
    return Objects.equals(this.omnisearchSuggestionRequiretextMin, comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.omnisearchSuggestionRequiretextMin) &&
        Objects.equals(this.omnisearchSuggestionSpellcheckRequire, comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.omnisearchSuggestionSpellcheckRequire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(omnisearchSuggestionRequiretextMin, omnisearchSuggestionSpellcheckRequire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties {\n");
    
    sb.append("    omnisearchSuggestionRequiretextMin: ").append(toIndentedString(omnisearchSuggestionRequiretextMin)).append("\n");
    sb.append("    omnisearchSuggestionSpellcheckRequire: ").append(toIndentedString(omnisearchSuggestionSpellcheckRequire)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

