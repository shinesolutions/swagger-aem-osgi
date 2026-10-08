package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmCoreImplLanguageManagerImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("langmgr.list.path")
  private ConfigNodePropertyString langmgrListPath;

  @JsonProperty("langmgr.country.default")
  private ConfigNodePropertyArray langmgrCountryDefault;

  /**
   * 
   * @return langmgrListPath
   */
  public ConfigNodePropertyString getLangmgrListPath() {
    return langmgrListPath;
  }

  public void setLangmgrListPath(ConfigNodePropertyString langmgrListPath) {
    this.langmgrListPath = langmgrListPath;
  }

  /**
   * 
   * @return langmgrCountryDefault
   */
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
    return Objects.equals(this.langmgrListPath, comDayCqWcmCoreImplLanguageManagerImplProperties.langmgrListPath) &&
        Objects.equals(this.langmgrCountryDefault, comDayCqWcmCoreImplLanguageManagerImplProperties.langmgrCountryDefault);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
