package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties   {
  
  private ConfigNodePropertyDropDown tempStorageConfig = null;


  /**
   **/
  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties tempStorageConfig(ConfigNodePropertyDropDown tempStorageConfig) {
    this.tempStorageConfig = tempStorageConfig;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tempStorageConfig")
  public ConfigNodePropertyDropDown getTempStorageConfig() {
    return tempStorageConfig;
  }
  public void setTempStorageConfig(ConfigNodePropertyDropDown tempStorageConfig) {
    this.tempStorageConfig = tempStorageConfig;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties = (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties) o;
    return Objects.equals(tempStorageConfig, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.tempStorageConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempStorageConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties {\n");
    
    sb.append("    tempStorageConfig: ").append(toIndentedString(tempStorageConfig)).append("\n");
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

