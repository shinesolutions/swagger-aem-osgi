package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties   {
  @JsonProperty("merge.root")
  private ConfigNodePropertyString mergeRoot = null;

  @JsonProperty("merge.readOnly")
  private ConfigNodePropertyBoolean mergeReadOnly = null;

  public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties mergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
    return this;
  }

  /**
   * Get mergeRoot
   * @return mergeRoot
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getMergeRoot() {
    return mergeRoot;
  }

  public void setMergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
  }

  public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties mergeReadOnly(ConfigNodePropertyBoolean mergeReadOnly) {
    this.mergeReadOnly = mergeReadOnly;
    return this;
  }

  /**
   * Get mergeReadOnly
   * @return mergeReadOnly
  **/
  @ApiModelProperty(value = "")

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
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties = (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties) o;
    return Objects.equals(this.mergeRoot, orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.mergeRoot) &&
        Objects.equals(this.mergeReadOnly, orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.mergeReadOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergeRoot, mergeReadOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties {\n");
    
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

