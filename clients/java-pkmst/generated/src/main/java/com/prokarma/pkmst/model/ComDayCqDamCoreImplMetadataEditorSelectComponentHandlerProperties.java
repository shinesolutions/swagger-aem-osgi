package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties   {
  @JsonProperty("granite:data")
  private ConfigNodePropertyArray graniteColonData = null;

  public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties graniteColonData(ConfigNodePropertyArray graniteColonData) {
    this.graniteColonData = graniteColonData;
    return this;
  }

   /**
   * Get graniteColonData
   * @return graniteColonData
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.graniteColonData, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.graniteColonData);
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

