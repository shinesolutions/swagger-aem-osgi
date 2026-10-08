/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties   {
  
  private ConfigNodePropertyInteger numberOfDays;
  private ConfigNodePropertyInteger ageOfFile;

  /**
   */
  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties numberOfDays(ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfDays")
  public ConfigNodePropertyInteger getNumberOfDays() {
    return numberOfDays;
  }
  public void setNumberOfDays(ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  /**
   */
  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties ageOfFile(ConfigNodePropertyInteger ageOfFile) {
    this.ageOfFile = ageOfFile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ageOfFile")
  public ConfigNodePropertyInteger getAgeOfFile() {
    return ageOfFile;
  }
  public void setAgeOfFile(ConfigNodePropertyInteger ageOfFile) {
    this.ageOfFile = ageOfFile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties = (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties) o;
    return Objects.equals(numberOfDays, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.numberOfDays) &&
        Objects.equals(ageOfFile, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.ageOfFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfDays, ageOfFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {\n");
    
    sb.append("    numberOfDays: ").append(toIndentedString(numberOfDays)).append("\n");
    sb.append("    ageOfFile: ").append(toIndentedString(ageOfFile)).append("\n");
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

