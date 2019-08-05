package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

