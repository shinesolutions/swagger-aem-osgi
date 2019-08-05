package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplServletCollectionsServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletCollectionsServletProperties   {
  @JsonProperty("cq.dam.batch.collections.properties")
  private ConfigNodePropertyArray cqDamBatchCollectionsProperties = null;

  @JsonProperty("cq.dam.batch.collections.limit")
  private ConfigNodePropertyInteger cqDamBatchCollectionsLimit = null;

  public ComDayCqDamCoreImplServletCollectionsServletProperties cqDamBatchCollectionsProperties(ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
    return this;
  }

   /**
   * Get cqDamBatchCollectionsProperties
   * @return cqDamBatchCollectionsProperties
  **/
  @Valid
  public ConfigNodePropertyArray getCqDamBatchCollectionsProperties() {
    return cqDamBatchCollectionsProperties;
  }

  public void setCqDamBatchCollectionsProperties(ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
  }

  public ComDayCqDamCoreImplServletCollectionsServletProperties cqDamBatchCollectionsLimit(ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
    this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
    return this;
  }

   /**
   * Get cqDamBatchCollectionsLimit
   * @return cqDamBatchCollectionsLimit
  **/
  @Valid
  public ConfigNodePropertyInteger getCqDamBatchCollectionsLimit() {
    return cqDamBatchCollectionsLimit;
  }

  public void setCqDamBatchCollectionsLimit(ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
    this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCollectionsServletProperties comDayCqDamCoreImplServletCollectionsServletProperties = (ComDayCqDamCoreImplServletCollectionsServletProperties) o;
    return Objects.equals(cqDamBatchCollectionsProperties, comDayCqDamCoreImplServletCollectionsServletProperties.cqDamBatchCollectionsProperties) &&
        Objects.equals(cqDamBatchCollectionsLimit, comDayCqDamCoreImplServletCollectionsServletProperties.cqDamBatchCollectionsLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchCollectionsProperties, cqDamBatchCollectionsLimit);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCollectionsServletProperties {\n");
    
    sb.append("    cqDamBatchCollectionsProperties: ").append(toIndentedString(cqDamBatchCollectionsProperties)).append("\n");
    sb.append("    cqDamBatchCollectionsLimit: ").append(toIndentedString(cqDamBatchCollectionsLimit)).append("\n");
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

