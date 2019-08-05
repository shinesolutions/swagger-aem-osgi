package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties   {
  

  private ConfigNodePropertyArray watchwordsPositive = null;

  private ConfigNodePropertyArray watchwordsNegative = null;

  private ConfigNodePropertyString watchwordsPath = null;

  private ConfigNodePropertyString sentimentPath = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("watchwords.positive")
  public ConfigNodePropertyArray getWatchwordsPositive() {
    return watchwordsPositive;
  }
  public void setWatchwordsPositive(ConfigNodePropertyArray watchwordsPositive) {
    this.watchwordsPositive = watchwordsPositive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("watchwords.negative")
  public ConfigNodePropertyArray getWatchwordsNegative() {
    return watchwordsNegative;
  }
  public void setWatchwordsNegative(ConfigNodePropertyArray watchwordsNegative) {
    this.watchwordsNegative = watchwordsNegative;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("watchwords.path")
  public ConfigNodePropertyString getWatchwordsPath() {
    return watchwordsPath;
  }
  public void setWatchwordsPath(ConfigNodePropertyString watchwordsPath) {
    this.watchwordsPath = watchwordsPath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sentiment.path")
  public ConfigNodePropertyString getSentimentPath() {
    return sentimentPath;
  }
  public void setSentimentPath(ConfigNodePropertyString sentimentPath) {
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
    return Objects.equals(watchwordsPositive, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.watchwordsPositive) &&
        Objects.equals(watchwordsNegative, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.watchwordsNegative) &&
        Objects.equals(watchwordsPath, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.watchwordsPath) &&
        Objects.equals(sentimentPath, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.sentimentPath);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

