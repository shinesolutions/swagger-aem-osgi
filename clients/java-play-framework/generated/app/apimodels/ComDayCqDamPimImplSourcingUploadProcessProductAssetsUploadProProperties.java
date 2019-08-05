package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties   {
  @JsonProperty("delete.zip.file")
  private ConfigNodePropertyBoolean deleteZipFile = null;

  public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties deleteZipFile(ConfigNodePropertyBoolean deleteZipFile) {
    this.deleteZipFile = deleteZipFile;
    return this;
  }

   /**
   * Get deleteZipFile
   * @return deleteZipFile
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

