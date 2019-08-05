package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqWcmCoreImplLanguageManagerImplProperties   {
  
  private ConfigNodePropertyString langmgrListPath = null;
  private ConfigNodePropertyArray langmgrCountryDefault = null;

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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

