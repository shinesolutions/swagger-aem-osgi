package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingResourcemergerPickerOverridingProperties   {
  
  private ConfigNodePropertyString mergeRoot = null;
  private ConfigNodePropertyBoolean mergeReadOnly = null;

  public OrgApacheSlingResourcemergerPickerOverridingProperties () {

  }

  public OrgApacheSlingResourcemergerPickerOverridingProperties (ConfigNodePropertyString mergeRoot, ConfigNodePropertyBoolean mergeReadOnly) {
    this.mergeRoot = mergeRoot;
    this.mergeReadOnly = mergeReadOnly;
  }

    
  @JsonProperty("merge.root")
  public ConfigNodePropertyString getMergeRoot() {
    return mergeRoot;
  }
  public void setMergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
  }

    
  @JsonProperty("merge.readOnly")
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
    return Objects.equals(mergeRoot, orgApacheSlingResourcemergerPickerOverridingProperties.mergeRoot) &&
        Objects.equals(mergeReadOnly, orgApacheSlingResourcemergerPickerOverridingProperties.mergeReadOnly);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
