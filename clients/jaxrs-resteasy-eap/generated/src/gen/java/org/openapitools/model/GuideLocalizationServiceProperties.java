package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class GuideLocalizationServiceProperties   {
  

  private ConfigNodePropertyArray supportedLocales = null;

  private ConfigNodePropertyArray localizableProperties = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supportedLocales")
  public ConfigNodePropertyArray getSupportedLocales() {
    return supportedLocales;
  }
  public void setSupportedLocales(ConfigNodePropertyArray supportedLocales) {
    this.supportedLocales = supportedLocales;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Localizable Properties")
  public ConfigNodePropertyArray getLocalizableProperties() {
    return localizableProperties;
  }
  public void setLocalizableProperties(ConfigNodePropertyArray localizableProperties) {
    this.localizableProperties = localizableProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideLocalizationServiceProperties guideLocalizationServiceProperties = (GuideLocalizationServiceProperties) o;
    return Objects.equals(supportedLocales, guideLocalizationServiceProperties.supportedLocales) &&
        Objects.equals(localizableProperties, guideLocalizationServiceProperties.localizableProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedLocales, localizableProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideLocalizationServiceProperties {\n");
    
    sb.append("    supportedLocales: ").append(toIndentedString(supportedLocales)).append("\n");
    sb.append("    localizableProperties: ").append(toIndentedString(localizableProperties)).append("\n");
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

