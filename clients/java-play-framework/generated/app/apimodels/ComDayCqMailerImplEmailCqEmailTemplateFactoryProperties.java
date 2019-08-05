package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties   {
  @JsonProperty("mailer.email.charset")
  private ConfigNodePropertyString mailerEmailCharset = null;

  public ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties mailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
    return this;
  }

   /**
   * Get mailerEmailCharset
   * @return mailerEmailCharset
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

