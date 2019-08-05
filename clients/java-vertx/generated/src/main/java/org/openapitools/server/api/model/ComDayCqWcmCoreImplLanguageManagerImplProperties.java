package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplLanguageManagerImplProperties   {
  
  private ConfigNodePropertyString langmgrListPath = null;
  private ConfigNodePropertyArray langmgrCountryDefault = null;

  public ComDayCqWcmCoreImplLanguageManagerImplProperties () {

  }

  public ComDayCqWcmCoreImplLanguageManagerImplProperties (ConfigNodePropertyString langmgrListPath, ConfigNodePropertyArray langmgrCountryDefault) {
    this.langmgrListPath = langmgrListPath;
    this.langmgrCountryDefault = langmgrCountryDefault;
  }

    
  @JsonProperty("langmgr.list.path")
  public ConfigNodePropertyString getLangmgrListPath() {
    return langmgrListPath;
  }
  public void setLangmgrListPath(ConfigNodePropertyString langmgrListPath) {
    this.langmgrListPath = langmgrListPath;
  }

    
  @JsonProperty("langmgr.country.default")
  public ConfigNodePropertyArray getLangmgrCountryDefault() {
    return langmgrCountryDefault;
  }
  public void setLangmgrCountryDefault(ConfigNodePropertyArray langmgrCountryDefault) {
    this.langmgrCountryDefault = langmgrCountryDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplLanguageManagerImplProperties comDayCqWcmCoreImplLanguageManagerImplProperties = (ComDayCqWcmCoreImplLanguageManagerImplProperties) o;
    return Objects.equals(langmgrListPath, comDayCqWcmCoreImplLanguageManagerImplProperties.langmgrListPath) &&
        Objects.equals(langmgrCountryDefault, comDayCqWcmCoreImplLanguageManagerImplProperties.langmgrCountryDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(langmgrListPath, langmgrCountryDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplLanguageManagerImplProperties {\n");
    
    sb.append("    langmgrListPath: ").append(toIndentedString(langmgrListPath)).append("\n");
    sb.append("    langmgrCountryDefault: ").append(toIndentedString(langmgrCountryDefault)).append("\n");
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
