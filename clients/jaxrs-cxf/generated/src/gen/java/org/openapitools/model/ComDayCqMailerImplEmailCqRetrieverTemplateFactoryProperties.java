package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean mailerEmailEmbed;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString mailerEmailCharset;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString mailerEmailRetrieverUserID;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString mailerEmailRetrieverUserPWD;
 /**
   * Get mailerEmailEmbed
   * @return mailerEmailEmbed
  **/
  @JsonProperty("mailer.email.embed")
  public ConfigNodePropertyBoolean getMailerEmailEmbed() {
    return mailerEmailEmbed;
  }

  public void setMailerEmailEmbed(ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailEmbed(ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
    return this;
  }

 /**
   * Get mailerEmailCharset
   * @return mailerEmailCharset
  **/
  @JsonProperty("mailer.email.charset")
  public ConfigNodePropertyString getMailerEmailCharset() {
    return mailerEmailCharset;
  }

  public void setMailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
    return this;
  }

 /**
   * Get mailerEmailRetrieverUserID
   * @return mailerEmailRetrieverUserID
  **/
  @JsonProperty("mailer.email.retrieverUserID")
  public ConfigNodePropertyString getMailerEmailRetrieverUserID() {
    return mailerEmailRetrieverUserID;
  }

  public void setMailerEmailRetrieverUserID(ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailRetrieverUserID(ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
    return this;
  }

 /**
   * Get mailerEmailRetrieverUserPWD
   * @return mailerEmailRetrieverUserPWD
  **/
  @JsonProperty("mailer.email.retrieverUserPWD")
  public ConfigNodePropertyString getMailerEmailRetrieverUserPWD() {
    return mailerEmailRetrieverUserPWD;
  }

  public void setMailerEmailRetrieverUserPWD(ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
    this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailRetrieverUserPWD(ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
    this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
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
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties = (ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties) o;
    return Objects.equals(this.mailerEmailEmbed, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.mailerEmailEmbed) &&
        Objects.equals(this.mailerEmailCharset, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.mailerEmailCharset) &&
        Objects.equals(this.mailerEmailRetrieverUserID, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.mailerEmailRetrieverUserID) &&
        Objects.equals(this.mailerEmailRetrieverUserPWD, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.mailerEmailRetrieverUserPWD);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

