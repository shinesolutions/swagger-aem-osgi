package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray pseudoPatterns;
 /**
  * Get pseudoPatterns
  * @return pseudoPatterns
  */
  @JsonProperty("pseudo.patterns")
  public ConfigNodePropertyArray getPseudoPatterns() {
    return pseudoPatterns;
  }

  /**
   * Sets the <code>pseudoPatterns</code> property.
   */
 public void setPseudoPatterns(ConfigNodePropertyArray pseudoPatterns) {
    this.pseudoPatterns = pseudoPatterns;
  }

  /**
   * Sets the <code>pseudoPatterns</code> property.
   */
  public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties pseudoPatterns(ConfigNodePropertyArray pseudoPatterns) {
    this.pseudoPatterns = pseudoPatterns;
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
    ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties comAdobeGraniteI18nImplBundlePseudoTranslationsProperties = (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties) o;
    return Objects.equals(this.pseudoPatterns, comAdobeGraniteI18nImplBundlePseudoTranslationsProperties.pseudoPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pseudoPatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {\n");
    
    sb.append("    pseudoPatterns: ").append(toIndentedString(pseudoPatterns)).append("\n");
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

