package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingResourcemergerPickerOverridingProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("merge.root")
  private ConfigNodePropertyString mergeRoot;

  @JsonProperty("merge.readOnly")
  private ConfigNodePropertyBoolean mergeReadOnly;

  /**
   * 
   * @return mergeRoot
   */
  public ConfigNodePropertyString getMergeRoot() {
    return mergeRoot;
  }

  public void setMergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
  }

  /**
   * 
   * @return mergeReadOnly
   */
  public ConfigNodePropertyBoolean getMergeReadOnly() {
    return mergeReadOnly;
  }

  public void setMergeReadOnly(ConfigNodePropertyBoolean mergeReadOnly) {
    this.mergeReadOnly = mergeReadOnly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingResourcemergerPickerOverridingProperties orgApacheSlingResourcemergerPickerOverridingProperties = (OrgApacheSlingResourcemergerPickerOverridingProperties) o;
    return Objects.equals(this.mergeRoot, orgApacheSlingResourcemergerPickerOverridingProperties.mergeRoot) &&
        Objects.equals(this.mergeReadOnly, orgApacheSlingResourcemergerPickerOverridingProperties.mergeReadOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergeRoot, mergeReadOnly);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
