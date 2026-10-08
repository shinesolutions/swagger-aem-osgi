package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString mailerEmailCharset;
 /**
  * Get mailerEmailCharset
  * @return mailerEmailCharset
  */
  @JsonProperty("mailer.email.charset")
  public ConfigNodePropertyString getMailerEmailCharset() {
    return mailerEmailCharset;
  }

  /**
   * Sets the <code>mailerEmailCharset</code> property.
   */
 public void setMailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
  }

  /**
   * Sets the <code>mailerEmailCharset</code> property.
   */
  public ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties mailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
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
    ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties comDayCqMailerImplEmailCqEmailTemplateFactoryProperties = (ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties) o;
    return Objects.equals(this.mailerEmailCharset, comDayCqMailerImplEmailCqEmailTemplateFactoryProperties.mailerEmailCharset);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

