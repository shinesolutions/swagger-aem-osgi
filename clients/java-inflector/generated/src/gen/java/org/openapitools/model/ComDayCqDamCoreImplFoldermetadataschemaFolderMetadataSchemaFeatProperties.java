package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties   {
  @JsonProperty("isEnabled")
  private ConfigNodePropertyBoolean isEnabled;

  /**
   **/
  public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties isEnabled(ConfigNodePropertyBoolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("isEnabled")
  public ConfigNodePropertyBoolean getIsEnabled() {
    return isEnabled;
  }
  public void setIsEnabled(ConfigNodePropertyBoolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties = (ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties) o;
    return Objects.equals(isEnabled, comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

