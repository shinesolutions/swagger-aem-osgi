package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties   {
  
  private ConfigNodePropertyString processLabel = null;

  private ConfigNodePropertyBoolean extractPages = null;


  /**
   **/
  public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }
  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }


  /**
   **/
  public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties extractPages(ConfigNodePropertyBoolean extractPages) {
    this.extractPages = extractPages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("extract.pages")
  public ConfigNodePropertyBoolean getExtractPages() {
    return extractPages;
  }
  public void setExtractPages(ConfigNodePropertyBoolean extractPages) {
    this.extractPages = extractPages;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties comDayCqDamInddImplHandlerIndesignXMPHandlerProperties = (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties) o;
    return Objects.equals(processLabel, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties.processLabel) &&
        Objects.equals(extractPages, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties.extractPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, extractPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {\n");
    
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    extractPages: ").append(toIndentedString(extractPages)).append("\n");
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

