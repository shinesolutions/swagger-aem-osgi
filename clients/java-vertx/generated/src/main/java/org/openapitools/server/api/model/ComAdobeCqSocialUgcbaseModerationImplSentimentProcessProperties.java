package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties   {
  
  private ConfigNodePropertyArray watchwordsPositive = null;
  private ConfigNodePropertyArray watchwordsNegative = null;
  private ConfigNodePropertyString watchwordsPath = null;
  private ConfigNodePropertyString sentimentPath = null;

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties () {

  }

  public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties (ConfigNodePropertyArray watchwordsPositive, ConfigNodePropertyArray watchwordsNegative, ConfigNodePropertyString watchwordsPath, ConfigNodePropertyString sentimentPath) {
    this.watchwordsPositive = watchwordsPositive;
    this.watchwordsNegative = watchwordsNegative;
    this.watchwordsPath = watchwordsPath;
    this.sentimentPath = sentimentPath;
  }

    
  @JsonProperty("watchwords.positive")
  public ConfigNodePropertyArray getWatchwordsPositive() {
    return watchwordsPositive;
  }
  public void setWatchwordsPositive(ConfigNodePropertyArray watchwordsPositive) {
    this.watchwordsPositive = watchwordsPositive;
  }

    
  @JsonProperty("watchwords.negative")
  public ConfigNodePropertyArray getWatchwordsNegative() {
    return watchwordsNegative;
  }
  public void setWatchwordsNegative(ConfigNodePropertyArray watchwordsNegative) {
    this.watchwordsNegative = watchwordsNegative;
  }

    
  @JsonProperty("watchwords.path")
  public ConfigNodePropertyString getWatchwordsPath() {
    return watchwordsPath;
  }
  public void setWatchwordsPath(ConfigNodePropertyString watchwordsPath) {
    this.watchwordsPath = watchwordsPath;
  }

    
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
