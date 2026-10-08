package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
 */

@JsonTypeName("comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean mailerEmailEmbed;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString mailerEmailCharset;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString mailerEmailRetrieverUserID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString mailerEmailRetrieverUserPWD;

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailEmbed(@Nullable ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
    return this;
  }

  /**
   * Get mailerEmailEmbed
   * @return mailerEmailEmbed
   */
  @Valid 
  @Schema(name = "mailer.email.embed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mailer.email.embed")
  public @Nullable ConfigNodePropertyBoolean getMailerEmailEmbed() {
    return mailerEmailEmbed;
  }

  @JsonProperty("mailer.email.embed")
  public void setMailerEmailEmbed(@Nullable ConfigNodePropertyBoolean mailerEmailEmbed) {
    this.mailerEmailEmbed = mailerEmailEmbed;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailCharset(@Nullable ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
    return this;
  }

  /**
   * Get mailerEmailCharset
   * @return mailerEmailCharset
   */
  @Valid 
  @Schema(name = "mailer.email.charset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mailer.email.charset")
  public @Nullable ConfigNodePropertyString getMailerEmailCharset() {
    return mailerEmailCharset;
  }

  @JsonProperty("mailer.email.charset")
  public void setMailerEmailCharset(@Nullable ConfigNodePropertyString mailerEmailCharset) {
    this.mailerEmailCharset = mailerEmailCharset;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailRetrieverUserID(@Nullable ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
    return this;
  }

  /**
   * Get mailerEmailRetrieverUserID
   * @return mailerEmailRetrieverUserID
   */
  @Valid 
  @Schema(name = "mailer.email.retrieverUserID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mailer.email.retrieverUserID")
  public @Nullable ConfigNodePropertyString getMailerEmailRetrieverUserID() {
    return mailerEmailRetrieverUserID;
  }

  @JsonProperty("mailer.email.retrieverUserID")
  public void setMailerEmailRetrieverUserID(@Nullable ConfigNodePropertyString mailerEmailRetrieverUserID) {
    this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
  }

  public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties mailerEmailRetrieverUserPWD(@Nullable ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
    this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
    return this;
  }

  /**
   * Get mailerEmailRetrieverUserPWD
   * @return mailerEmailRetrieverUserPWD
   */
  @Valid 
  @Schema(name = "mailer.email.retrieverUserPWD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mailer.email.retrieverUserPWD")
  public @Nullable ConfigNodePropertyString getMailerEmailRetrieverUserPWD() {
    return mailerEmailRetrieverUserPWD;
  }

  @JsonProperty("mailer.email.retrieverUserPWD")
  public void setMailerEmailRetrieverUserPWD(@Nullable ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

