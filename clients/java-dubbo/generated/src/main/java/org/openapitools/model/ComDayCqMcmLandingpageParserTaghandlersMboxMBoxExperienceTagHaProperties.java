package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking;

  @JsonProperty("tagpattern")
  private ConfigNodePropertyString tagpattern;

  /**
   * 
   * @return serviceRanking
   */
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   * 
   * @return tagpattern
   */
  public ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }

  public void setTagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties = (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.tagpattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
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
