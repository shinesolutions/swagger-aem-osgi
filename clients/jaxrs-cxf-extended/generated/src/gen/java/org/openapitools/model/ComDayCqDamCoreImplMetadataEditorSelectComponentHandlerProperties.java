package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray graniteData;
 /**
  * Get graniteData
  * @return graniteData
  */
  @JsonProperty("granite:data")
  public ConfigNodePropertyArray getGraniteData() {
    return graniteData;
  }

  /**
   * Sets the <code>graniteData</code> property.
   */
 public void setGraniteData(ConfigNodePropertyArray graniteData) {
    this.graniteData = graniteData;
  }

  /**
   * Sets the <code>graniteData</code> property.
   */
  public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties graniteData(ConfigNodePropertyArray graniteData) {
    this.graniteData = graniteData;
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
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties = (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties) o;
    return Objects.equals(this.graniteData, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.graniteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {\n");
    
    sb.append("    graniteData: ").append(toIndentedString(graniteData)).append("\n");
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

