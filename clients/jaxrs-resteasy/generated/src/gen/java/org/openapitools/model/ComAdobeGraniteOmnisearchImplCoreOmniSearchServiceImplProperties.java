package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties   {
  
  private ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin;
  private ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("omnisearch.suggestion.requiretext.min")
  @Valid
  public ConfigNodePropertyInteger getOmnisearchSuggestionRequiretextMin() {
    return omnisearchSuggestionRequiretextMin;
  }
  public void setOmnisearchSuggestionRequiretextMin(ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin) {
    this.omnisearchSuggestionRequiretextMin = omnisearchSuggestionRequiretextMin;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("omnisearch.suggestion.spellcheck.require")
  @Valid
  public ConfigNodePropertyBoolean getOmnisearchSuggestionSpellcheckRequire() {
    return omnisearchSuggestionSpellcheckRequire;
  }
  public void setOmnisearchSuggestionSpellcheckRequire(ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire) {
    this.omnisearchSuggestionSpellcheckRequire = omnisearchSuggestionSpellcheckRequire;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

