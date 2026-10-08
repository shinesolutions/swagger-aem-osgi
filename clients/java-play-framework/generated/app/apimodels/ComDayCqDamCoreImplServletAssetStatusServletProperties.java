package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamCoreImplServletAssetStatusServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletAssetStatusServletProperties   {
  @JsonProperty("cq.dam.batch.status.maxassets")
  @Valid

  private ConfigNodePropertyInteger cqDamBatchStatusMaxassets;

  public ComDayCqDamCoreImplServletAssetStatusServletProperties cqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
    return this;
  }

   /**
   * Get cqDamBatchStatusMaxassets
   * @return cqDamBatchStatusMaxassets
  **/
  public ConfigNodePropertyInteger getCqDamBatchStatusMaxassets() {
    return cqDamBatchStatusMaxassets;
  }

  public void setCqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

