package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties   {
  
  private ConfigNodePropertyBoolean mailerEmailEmbed = null;
  private ConfigNodePropertyString mailerEmailCharset = null;
  private ConfigNodePropertyString mailerEmailRetrieverUserID = null;
  private ConfigNodePropertyString mailerEmailRetrieverUserPWD = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mailer.email.embed")
  public ConfigNodePropertyBoolean getMailerEmailEmbed() {
    return mailerEmailEmbed;
  }
  public void setMailerEmailEmbed(ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mailer.email.charset")
  public ConfigNodePropertyString getMailerEmailCharset() {
    return mailerEmailCharset;
  }
  public void setMailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mailer.email.retrieverUserID")
  public ConfigNodePropertyString getMailerEmailRetrieverUserID() {
    return mailerEmailRetrieverUserID;
  }
  public void setMailerEmailRetrieverUserID(ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mailer.email.retrieverUserPWD")
  public ConfigNodePropertyString getMailerEmailRetrieverUserPWD() {
    return mailerEmailRetrieverUserPWD;
  }
  public void setMailerEmailRetrieverUserPWD(ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
    this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

