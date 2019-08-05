package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeAemTransactionCoreImplTransactionRecorderProperties   {
  
  private ConfigNodePropertyBoolean isTransactionRecordingEnabled = null;


  /**
   **/
  public ComAdobeAemTransactionCoreImplTransactionRecorderProperties isTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("isTransactionRecordingEnabled")
  public ConfigNodePropertyBoolean getIsTransactionRecordingEnabled() {
    return isTransactionRecordingEnabled;
  }
  public void setIsTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemTransactionCoreImplTransactionRecorderProperties comAdobeAemTransactionCoreImplTransactionRecorderProperties = (ComAdobeAemTransactionCoreImplTransactionRecorderProperties) o;
    return Objects.equals(isTransactionRecordingEnabled, comAdobeAemTransactionCoreImplTransactionRecorderProperties.isTransactionRecordingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTransactionRecordingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemTransactionCoreImplTransactionRecorderProperties {\n");
    
    sb.append("    isTransactionRecordingEnabled: ").append(toIndentedString(isTransactionRecordingEnabled)).append("\n");
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

