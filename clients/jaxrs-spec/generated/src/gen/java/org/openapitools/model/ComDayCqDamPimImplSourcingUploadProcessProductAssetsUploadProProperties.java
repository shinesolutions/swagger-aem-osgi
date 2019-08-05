package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties   {
  
  private @Valid ConfigNodePropertyBoolean deleteZipFile = null;

  /**
   **/
  public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties deleteZipFile(ConfigNodePropertyBoolean deleteZipFile) {
    this.deleteZipFile = deleteZipFile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delete.zip.file")
  public ConfigNodePropertyBoolean getDeleteZipFile() {
    return deleteZipFile;
  }
  public void setDeleteZipFile(ConfigNodePropertyBoolean deleteZipFile) {
    this.deleteZipFile = deleteZipFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties = (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties) o;
    return Objects.equals(deleteZipFile, comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.deleteZipFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteZipFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties {\n");
    
    sb.append("    deleteZipFile: ").append(toIndentedString(deleteZipFile)).append("\n");
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

