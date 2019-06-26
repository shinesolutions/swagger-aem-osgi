/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T13:44:27.963Z[GMT]")
public class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties {
  public static final String SERIALIZED_NAME_DELETE_ZIP_FILE = "delete.zip.file";
  @SerializedName(SERIALIZED_NAME_DELETE_ZIP_FILE)
  private ConfigNodePropertyBoolean deleteZipFile = null;

  public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties deleteZipFile(ConfigNodePropertyBoolean deleteZipFile) {
    this.deleteZipFile = deleteZipFile;
    return this;
  }

   /**
   * Get deleteZipFile
   * @return deleteZipFile
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

