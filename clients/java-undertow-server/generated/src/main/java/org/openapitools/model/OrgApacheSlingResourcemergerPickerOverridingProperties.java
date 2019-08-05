package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class OrgApacheSlingResourcemergerPickerOverridingProperties   {
  
  private ConfigNodePropertyString mergeRoot = null;
  private ConfigNodePropertyBoolean mergeReadOnly = null;

  /**
   **/
  public OrgApacheSlingResourcemergerPickerOverridingProperties mergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("merge.root")
  public ConfigNodePropertyString getMergeRoot() {
    return mergeRoot;
  }
  public void setMergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
  }

  /**
   **/
  public OrgApacheSlingResourcemergerPickerOverridingProperties mergeReadOnly(ConfigNodePropertyBoolean mergeReadOnly) {
    this.mergeReadOnly = mergeReadOnly;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("merge.readOnly")
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

