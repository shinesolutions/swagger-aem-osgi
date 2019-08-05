package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties   {
  
  private ConfigNodePropertyArray pseudoPatterns = null;

  public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties () {

  }

  public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties (ConfigNodePropertyArray pseudoPatterns) {
    this.pseudoPatterns = pseudoPatterns;
  }

    
  @JsonProperty("pseudo.patterns")
  public ConfigNodePropertyArray getPseudoPatterns() {
    return pseudoPatterns;
  }
  public void setPseudoPatterns(ConfigNodePropertyArray pseudoPatterns) {
    this.pseudoPatterns = pseudoPatterns;
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
    return Objects.equals(pseudoPatterns, comAdobeGraniteI18nImplBundlePseudoTranslationsProperties.pseudoPatterns);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
