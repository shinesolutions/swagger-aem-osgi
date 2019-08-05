package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties   {
  @JsonProperty("mailer.email.embed")
  private ConfigNodePropertyBoolean mailerEmailEmbed = null;

  @JsonProperty("mailer.email.charset")
  private ConfigNodePropertyString mailerEmailCharset = null;

  @JsonProperty("mailer.email.retrieverUserID")
  private ConfigNodePropertyString mailerEmailRetrieverUserID = null;

  @JsonProperty("mailer.email.retrieverUserPWD")
  private ConfigNodePropertyString mailerEmailRetrieverUserPWD = null;

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailEmbed(ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
    return this;
  }

   /**
   * Get mailerEmailEmbed
   * @return mailerEmailEmbed
  **/
  @Valid
  public ConfigNodePropertyBoolean getMailerEmailEmbed() {
    return mailerEmailEmbed;
  }

  public void setMailerEmailEmbed(ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
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

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailRetrieverUserID(ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
    return this;
  }

   /**
   * Get mailerEmailRetrieverUserID
   * @return mailerEmailRetrieverUserID
  **/
  @Valid
  public ConfigNodePropertyString getMailerEmailRetrieverUserID() {
    return mailerEmailRetrieverUserID;
  }

  public void setMailerEmailRetrieverUserID(ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailRetrieverUserPWD(ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
    this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
    return this;
  }

   /**
   * Get mailerEmailRetrieverUserPWD
   * @return mailerEmailRetrieverUserPWD
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

