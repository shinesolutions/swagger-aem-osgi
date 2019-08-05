package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties   {
  
  private @Valid ConfigNodePropertyString mailerEmailCharset = null;

  /**
   **/
  public ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties mailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties comDayCqMailerImplEmailCqEmailTemplateFactoryProperties = (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties) o;
    return Objects.equals(mailerEmailCharset, comDayCqMailerImplEmailCqEmailTemplateFactoryProperties.mailerEmailCharset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailerEmailCharset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties {\n");
    
    sb.append("    mailerEmailCharset: ").append(toIndentedString(mailerEmailCharset)).append("\n");
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

