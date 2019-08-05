package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingResourcemergerPickerOverridingProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingResourcemergerPickerOverridingProperties   {
  @JsonProperty("merge.root")
  private ConfigNodePropertyString mergeRoot = null;

  @JsonProperty("merge.readOnly")
  private ConfigNodePropertyBoolean mergeReadOnly = null;

  public OrgApacheSlingResourcemergerPickerOverridingProperties mergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
    return this;
  }

   /**
   * Get mergeRoot
   * @return mergeRoot
  **/
  @Valid
  public ConfigNodePropertyString getMergeRoot() {
    return mergeRoot;
  }

  public void setMergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
  }

  public OrgApacheSlingResourcemergerPickerOverridingProperties mergeReadOnly(ConfigNodePropertyBoolean mergeReadOnly) {
    this.mergeReadOnly = mergeReadOnly;
    return this;
  }

   /**
   * Get mergeReadOnly
   * @return mergeReadOnly
  **/
  @Valid
  public ConfigNodePropertyBoolean getMergeReadOnly() {
    return mergeReadOnly;
  }

  public void setMergeReadOnly(ConfigNodePropertyBoolean mergeReadOnly) {
    this.mergeReadOnly = mergeReadOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingResourcemergerPickerOverridingProperties orgApacheSlingResourcemergerPickerOverridingProperties = (OrgApacheSlingResourcemergerPickerOverridingProperties) o;
    return Objects.equals(mergeRoot, orgApacheSlingResourcemergerPickerOverridingProperties.mergeRoot) &&
        Objects.equals(mergeReadOnly, orgApacheSlingResourcemergerPickerOverridingProperties.mergeReadOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergeRoot, mergeReadOnly);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingResourcemergerPickerOverridingProperties {\n");
    
    sb.append("    mergeRoot: ").append(toIndentedString(mergeRoot)).append("\n");
    sb.append("    mergeReadOnly: ").append(toIndentedString(mergeReadOnly)).append("\n");
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

