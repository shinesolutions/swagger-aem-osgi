package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplServletCollectionServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletCollectionServletProperties   {
  @JsonProperty("cq.dam.batch.collection.properties")
  private ConfigNodePropertyArray cqDamBatchCollectionProperties = null;

  @JsonProperty("cq.dam.batch.collection.maxcollections")
  private ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections = null;

  public ComDayCqDamCoreImplServletCollectionServletProperties cqDamBatchCollectionProperties(ConfigNodePropertyArray cqDamBatchCollectionProperties) {
    this.cqDamBatchCollectionProperties = cqDamBatchCollectionProperties;
    return this;
  }

   /**
   * Get cqDamBatchCollectionProperties
   * @return cqDamBatchCollectionProperties
  **/
  @Valid
  public ConfigNodePropertyArray getCqDamBatchCollectionProperties() {
    return cqDamBatchCollectionProperties;
  }

  public void setCqDamBatchCollectionProperties(ConfigNodePropertyArray cqDamBatchCollectionProperties) {
    this.cqDamBatchCollectionProperties = cqDamBatchCollectionProperties;
  }

  public ComDayCqDamCoreImplServletCollectionServletProperties cqDamBatchCollectionMaxcollections(ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections) {
    this.cqDamBatchCollectionMaxcollections = cqDamBatchCollectionMaxcollections;
    return this;
  }

   /**
   * Get cqDamBatchCollectionMaxcollections
   * @return cqDamBatchCollectionMaxcollections
  **/
  @Valid
  public ConfigNodePropertyInteger getCqDamBatchCollectionMaxcollections() {
    return cqDamBatchCollectionMaxcollections;
  }

  public void setCqDamBatchCollectionMaxcollections(ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections) {
    this.cqDamBatchCollectionMaxcollections = cqDamBatchCollectionMaxcollections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCollectionServletProperties comDayCqDamCoreImplServletCollectionServletProperties = (ComDayCqDamCoreImplServletCollectionServletProperties) o;
    return Objects.equals(cqDamBatchCollectionProperties, comDayCqDamCoreImplServletCollectionServletProperties.cqDamBatchCollectionProperties) &&
        Objects.equals(cqDamBatchCollectionMaxcollections, comDayCqDamCoreImplServletCollectionServletProperties.cqDamBatchCollectionMaxcollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchCollectionProperties, cqDamBatchCollectionMaxcollections);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCollectionServletProperties {\n");
    
    sb.append("    cqDamBatchCollectionProperties: ").append(toIndentedString(cqDamBatchCollectionProperties)).append("\n");
    sb.append("    cqDamBatchCollectionMaxcollections: ").append(toIndentedString(cqDamBatchCollectionMaxcollections)).append("\n");
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

