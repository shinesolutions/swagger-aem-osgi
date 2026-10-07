package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("mailer.email.charset")
  private ConfigNodePropertyString mailerEmailCharset;

  /**
   * 
   * @return mailerEmailCharset
   */
  public ConfigNodePropertyString getMailerEmailCharset() {
    return mailerEmailCharset;
  }

  public void setMailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
