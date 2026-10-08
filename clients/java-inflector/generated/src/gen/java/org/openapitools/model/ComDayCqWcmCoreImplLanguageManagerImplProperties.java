package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplLanguageManagerImplProperties   {
  @JsonProperty("langmgr.list.path")
  private ConfigNodePropertyString langmgrListPath;

  @JsonProperty("langmgr.country.default")
  private ConfigNodePropertyArray langmgrCountryDefault;

  /**
   **/
  public ComDayCqWcmCoreImplLanguageManagerImplProperties langmgrListPath(ConfigNodePropertyString langmgrListPath) {
    this.langmgrListPath = langmgrListPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("langmgr.list.path")
  public ConfigNodePropertyString getLangmgrListPath() {
    return langmgrListPath;
  }
  public void setLangmgrListPath(ConfigNodePropertyString langmgrListPath) {
    this.langmgrListPath = langmgrListPath;
  }

  /**
   **/
  public ComDayCqWcmCoreImplLanguageManagerImplProperties langmgrCountryDefault(ConfigNodePropertyArray langmgrCountryDefault) {
    this.langmgrCountryDefault = langmgrCountryDefault;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

