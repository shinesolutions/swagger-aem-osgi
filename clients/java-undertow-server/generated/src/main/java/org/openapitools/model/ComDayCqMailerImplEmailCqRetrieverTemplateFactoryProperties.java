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
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties   {
  
  private ConfigNodePropertyBoolean mailerEmailEmbed;
  private ConfigNodePropertyString mailerEmailCharset;
  private ConfigNodePropertyString mailerEmailRetrieverUserID;
  private ConfigNodePropertyString mailerEmailRetrieverUserPWD;

  /**
   */
  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailEmbed(ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mailer.email.embed")
  public ConfigNodePropertyBoolean getMailerEmailEmbed() {
    return mailerEmailEmbed;
  }
  public void setMailerEmailEmbed(ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
  }

  /**
   */
  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mailer.email.charset")
  public ConfigNodePropertyString getMailerEmailCharset() {
    return mailerEmailCharset;
  }
  public void setMailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
  }

  /**
   */
  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailRetrieverUserID(ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mailer.email.retrieverUserID")
  public ConfigNodePropertyString getMailerEmailRetrieverUserID() {
    return mailerEmailRetrieverUserID;
  }
  public void setMailerEmailRetrieverUserID(ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
  }

  /**
   */
  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailRetrieverUserPWD(ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
    this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mailer.email.retrieverUserPWD")
  public ConfigNodePropertyString getMailerEmailRetrieverUserPWD() {
    return mailerEmailRetrieverUserPWD;
  }
  public void setMailerEmailRetrieverUserPWD(ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
    this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties = (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties) o;
    return Objects.equals(mailerEmailEmbed, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.mailerEmailEmbed) &&
        Objects.equals(mailerEmailCharset, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.mailerEmailCharset) &&
        Objects.equals(mailerEmailRetrieverUserID, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.mailerEmailRetrieverUserID) &&
        Objects.equals(mailerEmailRetrieverUserPWD, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.mailerEmailRetrieverUserPWD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailerEmailEmbed, mailerEmailCharset, mailerEmailRetrieverUserID, mailerEmailRetrieverUserPWD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {\n");
    
    sb.append("    mailerEmailEmbed: ").append(toIndentedString(mailerEmailEmbed)).append("\n");
    sb.append("    mailerEmailCharset: ").append(toIndentedString(mailerEmailCharset)).append("\n");
    sb.append("    mailerEmailRetrieverUserID: ").append(toIndentedString(mailerEmailRetrieverUserID)).append("\n");
    sb.append("    mailerEmailRetrieverUserPWD: ").append(toIndentedString(mailerEmailRetrieverUserPWD)).append("\n");
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

