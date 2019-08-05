package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties   {
  @JsonProperty("watchwords.positive")
  private ConfigNodePropertyArray watchwordsPositive = null;

  @JsonProperty("watchwords.negative")
  private ConfigNodePropertyArray watchwordsNegative = null;

  @JsonProperty("watchwords.path")
  private ConfigNodePropertyString watchwordsPath = null;

  @JsonProperty("sentiment.path")
  private ConfigNodePropertyString sentimentPath = null;

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsPositive(ConfigNodePropertyArray watchwordsPositive) {
    this.watchwordsPositive = watchwordsPositive;
    return this;
  }

  /**
   * Get watchwordsPositive
   * @return watchwordsPositive
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getWatchwordsPositive() {
    return watchwordsPositive;
  }

  public void setWatchwordsPositive(ConfigNodePropertyArray watchwordsPositive) {
    this.watchwordsPositive = watchwordsPositive;
  }

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsNegative(ConfigNodePropertyArray watchwordsNegative) {
    this.watchwordsNegative = watchwordsNegative;
    return this;
  }

  /**
   * Get watchwordsNegative
   * @return watchwordsNegative
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getWatchwordsNegative() {
    return watchwordsNegative;
  }

  public void setWatchwordsNegative(ConfigNodePropertyArray watchwordsNegative) {
    this.watchwordsNegative = watchwordsNegative;
  }

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsPath(ConfigNodePropertyString watchwordsPath) {
    this.watchwordsPath = watchwordsPath;
    return this;
  }

  /**
   * Get watchwordsPath
   * @return watchwordsPath
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getWatchwordsPath() {
    return watchwordsPath;
  }

  public void setWatchwordsPath(ConfigNodePropertyString watchwordsPath) {
    this.watchwordsPath = watchwordsPath;
  }

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties sentimentPath(ConfigNodePropertyString sentimentPath) {
    this.sentimentPath = sentimentPath;
    return this;
  }

  /**
   * Get sentimentPath
   * @return sentimentPath
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSentimentPath() {
    return sentimentPath;
  }

  public void setSentimentPath(ConfigNodePropertyString sentimentPath) {
    this.sentimentPath = sentimentPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

