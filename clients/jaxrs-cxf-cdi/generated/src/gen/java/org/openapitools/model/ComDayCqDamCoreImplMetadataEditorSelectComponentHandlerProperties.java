package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties   {
  
  private ConfigNodePropertyArray graniteColonData = null;


  /**
   **/
  public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties graniteColonData(ConfigNodePropertyArray graniteColonData) {
    this.graniteColonData = graniteColonData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite:data")
  public ConfigNodePropertyArray getGraniteColonData() {
    return graniteColonData;
  }
  public void setGraniteColonData(ConfigNodePropertyArray graniteColonData) {
    this.graniteColonData = graniteColonData;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties = (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties) o;
    return Objects.equals(graniteColonData, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.graniteColonData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteColonData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {\n");
    
    sb.append("    graniteColonData: ").append(toIndentedString(graniteColonData)).append("\n");
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

