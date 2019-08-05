package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties   {
  @JsonProperty("pseudo.patterns")
  private ConfigNodePropertyArray pseudoPatterns = null;

  public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties pseudoPatterns(ConfigNodePropertyArray pseudoPatterns) {
    this.pseudoPatterns = pseudoPatterns;
    return this;
  }

   /**
   * Get pseudoPatterns
   * @return pseudoPatterns
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPseudoPatterns() {
    return pseudoPatterns;
  }

  public void setPseudoPatterns(ConfigNodePropertyArray pseudoPatterns) {
    this.pseudoPatterns = pseudoPatterns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

