package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire;
 /**
   * Get omnisearchSuggestionRequiretextMin
   * @return omnisearchSuggestionRequiretextMin
  **/
  @JsonProperty("omnisearch.suggestion.requiretext.min")
  public ConfigNodePropertyInteger getOmnisearchSuggestionRequiretextMin() {
    return omnisearchSuggestionRequiretextMin;
  }

  public void setOmnisearchSuggestionRequiretextMin(ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin) {
    this.omnisearchSuggestionRequiretextMin = omnisearchSuggestionRequiretextMin;
  }

  public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties omnisearchSuggestionRequiretextMin(ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin) {
    this.omnisearchSuggestionRequiretextMin = omnisearchSuggestionRequiretextMin;
    return this;
  }

 /**
   * Get omnisearchSuggestionSpellcheckRequire
   * @return omnisearchSuggestionSpellcheckRequire
  **/
  @JsonProperty("omnisearch.suggestion.spellcheck.require")
  public ConfigNodePropertyBoolean getOmnisearchSuggestionSpellcheckRequire() {
    return omnisearchSuggestionSpellcheckRequire;
  }

  public void setOmnisearchSuggestionSpellcheckRequire(ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire) {
    this.omnisearchSuggestionSpellcheckRequire = omnisearchSuggestionSpellcheckRequire;
  }

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

