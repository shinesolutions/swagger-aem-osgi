package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplServletAssetStatusServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletAssetStatusServletProperties   {
  @JsonProperty("cq.dam.batch.status.maxassets")
  private ConfigNodePropertyInteger cqDamBatchStatusMaxassets = null;

  public ComDayCqDamCoreImplServletAssetStatusServletProperties cqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
    return this;
  }

   /**
   * Get cqDamBatchStatusMaxassets
   * @return cqDamBatchStatusMaxassets
  **/
  @Valid
  public ConfigNodePropertyInteger getCqDamBatchStatusMaxassets() {
    return cqDamBatchStatusMaxassets;
  }

  public void setCqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletAssetStatusServletProperties comDayCqDamCoreImplServletAssetStatusServletProperties = (ComDayCqDamCoreImplServletAssetStatusServletProperties) o;
    return Objects.equals(cqDamBatchStatusMaxassets, comDayCqDamCoreImplServletAssetStatusServletProperties.cqDamBatchStatusMaxassets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchStatusMaxassets);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletAssetStatusServletProperties {\n");
    
    sb.append("    cqDamBatchStatusMaxassets: ").append(toIndentedString(cqDamBatchStatusMaxassets)).append("\n");
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

