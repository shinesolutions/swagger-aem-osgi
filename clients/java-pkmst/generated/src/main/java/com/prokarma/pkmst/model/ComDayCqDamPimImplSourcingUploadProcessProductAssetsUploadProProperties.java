package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties   {
  @JsonProperty("delete.zip.file")
  private ConfigNodePropertyBoolean deleteZipFile;

  public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties deleteZipFile(ConfigNodePropertyBoolean deleteZipFile) {
    this.deleteZipFile = deleteZipFile;
    return this;
  }

  /**
   * Get deleteZipFile
   * @return deleteZipFile
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDeleteZipFile() {
    return deleteZipFile;
  }

  public void setDeleteZipFile(ConfigNodePropertyBoolean deleteZipFile) {
    this.deleteZipFile = deleteZipFile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties = (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties) o;
    return Objects.equals(this.deleteZipFile, comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.deleteZipFile);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

