package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray watchwordsPositive;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray watchwordsNegative;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString watchwordsPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString sentimentPath;
 /**
  * Get watchwordsPositive
  * @return watchwordsPositive
  */
  @JsonProperty("watchwords.positive")
  public ConfigNodePropertyArray getWatchwordsPositive() {
    return watchwordsPositive;
  }

  /**
   * Sets the <code>watchwordsPositive</code> property.
   */
 public void setWatchwordsPositive(ConfigNodePropertyArray watchwordsPositive) {
    this.watchwordsPositive = watchwordsPositive;
  }

  /**
   * Sets the <code>watchwordsPositive</code> property.
   */
  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsPositive(ConfigNodePropertyArray watchwordsPositive) {
    this.watchwordsPositive = watchwordsPositive;
    return this;
  }

 /**
  * Get watchwordsNegative
  * @return watchwordsNegative
  */
  @JsonProperty("watchwords.negative")
  public ConfigNodePropertyArray getWatchwordsNegative() {
    return watchwordsNegative;
  }

  /**
   * Sets the <code>watchwordsNegative</code> property.
   */
 public void setWatchwordsNegative(ConfigNodePropertyArray watchwordsNegative) {
    this.watchwordsNegative = watchwordsNegative;
  }

  /**
   * Sets the <code>watchwordsNegative</code> property.
   */
  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsNegative(ConfigNodePropertyArray watchwordsNegative) {
    this.watchwordsNegative = watchwordsNegative;
    return this;
  }

 /**
  * Get watchwordsPath
  * @return watchwordsPath
  */
  @JsonProperty("watchwords.path")
  public ConfigNodePropertyString getWatchwordsPath() {
    return watchwordsPath;
  }

  /**
   * Sets the <code>watchwordsPath</code> property.
   */
 public void setWatchwordsPath(ConfigNodePropertyString watchwordsPath) {
    this.watchwordsPath = watchwordsPath;
  }

  /**
   * Sets the <code>watchwordsPath</code> property.
   */
  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties watchwordsPath(ConfigNodePropertyString watchwordsPath) {
    this.watchwordsPath = watchwordsPath;
    return this;
  }

 /**
  * Get sentimentPath
  * @return sentimentPath
  */
  @JsonProperty("sentiment.path")
  public ConfigNodePropertyString getSentimentPath() {
    return sentimentPath;
  }

  /**
   * Sets the <code>sentimentPath</code> property.
   */
 public void setSentimentPath(ConfigNodePropertyString sentimentPath) {
    this.sentimentPath = sentimentPath;
  }

  /**
   * Sets the <code>sentimentPath</code> property.
   */
  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties sentimentPath(ConfigNodePropertyString sentimentPath) {
    this.sentimentPath = sentimentPath;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

