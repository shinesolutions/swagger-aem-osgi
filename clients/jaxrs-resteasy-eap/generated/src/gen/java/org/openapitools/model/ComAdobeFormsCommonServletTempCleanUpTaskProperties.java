package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeFormsCommonServletTempCleanUpTaskProperties   {
  

  private ConfigNodePropertyString schedulerExpression = null;

  private ConfigNodePropertyString durationForTemporaryStorage = null;

  private ConfigNodePropertyString durationForAnonymousStorage = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Duration for Temporary Storage")
  public ConfigNodePropertyString getDurationForTemporaryStorage() {
    return durationForTemporaryStorage;
  }
  public void setDurationForTemporaryStorage(ConfigNodePropertyString durationForTemporaryStorage) {
    this.durationForTemporaryStorage = durationForTemporaryStorage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Duration for Anonymous Storage")
  public ConfigNodePropertyString getDurationForAnonymousStorage() {
    return durationForAnonymousStorage;
  }
  public void setDurationForAnonymousStorage(ConfigNodePropertyString durationForAnonymousStorage) {
    this.durationForAnonymousStorage = durationForAnonymousStorage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeFormsCommonServletTempCleanUpTaskProperties comAdobeFormsCommonServletTempCleanUpTaskProperties = (ComAdobeFormsCommonServletTempCleanUpTaskProperties) o;
    return Objects.equals(schedulerExpression, comAdobeFormsCommonServletTempCleanUpTaskProperties.schedulerExpression) &&
        Objects.equals(durationForTemporaryStorage, comAdobeFormsCommonServletTempCleanUpTaskProperties.durationForTemporaryStorage) &&
        Objects.equals(durationForAnonymousStorage, comAdobeFormsCommonServletTempCleanUpTaskProperties.durationForAnonymousStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, durationForTemporaryStorage, durationForAnonymousStorage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeFormsCommonServletTempCleanUpTaskProperties {\n");
    
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    durationForTemporaryStorage: ").append(toIndentedString(durationForTemporaryStorage)).append("\n");
    sb.append("    durationForAnonymousStorage: ").append(toIndentedString(durationForAnonymousStorage)).append("\n");
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

