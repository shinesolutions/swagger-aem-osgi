package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties
 */

@JsonTypeName("comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray watchwordsPositive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray watchwordsNegative;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString watchwordsPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString sentimentPath;

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsPositive(@Nullable ConfigNodePropertyArray watchwordsPositive) {
    this.watchwordsPositive = watchwordsPositive;
    return this;
  }

  /**
   * Get watchwordsPositive
   * @return watchwordsPositive
   */
  @Valid 
  @Schema(name = "watchwords.positive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("watchwords.positive")
  public @Nullable ConfigNodePropertyArray getWatchwordsPositive() {
    return watchwordsPositive;
  }

  @JsonProperty("watchwords.positive")
  public void setWatchwordsPositive(@Nullable ConfigNodePropertyArray watchwordsPositive) {
    this.watchwordsPositive = watchwordsPositive;
  }

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsNegative(@Nullable ConfigNodePropertyArray watchwordsNegative) {
    this.watchwordsNegative = watchwordsNegative;
    return this;
  }

  /**
   * Get watchwordsNegative
   * @return watchwordsNegative
   */
  @Valid 
  @Schema(name = "watchwords.negative", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("watchwords.negative")
  public @Nullable ConfigNodePropertyArray getWatchwordsNegative() {
    return watchwordsNegative;
  }

  @JsonProperty("watchwords.negative")
  public void setWatchwordsNegative(@Nullable ConfigNodePropertyArray watchwordsNegative) {
    this.watchwordsNegative = watchwordsNegative;
  }

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsPath(@Nullable ConfigNodePropertyString watchwordsPath) {
    this.watchwordsPath = watchwordsPath;
    return this;
  }

  /**
   * Get watchwordsPath
   * @return watchwordsPath
   */
  @Valid 
  @Schema(name = "watchwords.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("watchwords.path")
  public @Nullable ConfigNodePropertyString getWatchwordsPath() {
    return watchwordsPath;
  }

  @JsonProperty("watchwords.path")
  public void setWatchwordsPath(@Nullable ConfigNodePropertyString watchwordsPath) {
    this.watchwordsPath = watchwordsPath;
  }

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties sentimentPath(@Nullable ConfigNodePropertyString sentimentPath) {
    this.sentimentPath = sentimentPath;
    return this;
  }

  /**
   * Get sentimentPath
   * @return sentimentPath
   */
  @Valid 
  @Schema(name = "sentiment.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sentiment.path")
  public @Nullable ConfigNodePropertyString getSentimentPath() {
    return sentimentPath;
  }

  @JsonProperty("sentiment.path")
  public void setSentimentPath(@Nullable ConfigNodePropertyString sentimentPath) {
    this.sentimentPath = sentimentPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties = (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties) o;
    return Objects.equals(this.watchwordsPositive, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.watchwordsPositive) &&
        Objects.equals(this.watchwordsNegative, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.watchwordsNegative) &&
        Objects.equals(this.watchwordsPath, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.watchwordsPath) &&
        Objects.equals(this.sentimentPath, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.sentimentPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchwordsPositive, watchwordsNegative, watchwordsPath, sentimentPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {\n");
    sb.append("    watchwordsPositive: ").append(toIndentedString(watchwordsPositive)).append("\n");
    sb.append("    watchwordsNegative: ").append(toIndentedString(watchwordsNegative)).append("\n");
    sb.append("    watchwordsPath: ").append(toIndentedString(watchwordsPath)).append("\n");
    sb.append("    sentimentPath: ").append(toIndentedString(sentimentPath)).append("\n");
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

