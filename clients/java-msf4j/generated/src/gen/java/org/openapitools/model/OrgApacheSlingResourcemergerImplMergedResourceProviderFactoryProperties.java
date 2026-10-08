package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties   {
  @JsonProperty("merge.root")
  private ConfigNodePropertyString mergeRoot;

  @JsonProperty("merge.readOnly")
  private ConfigNodePropertyBoolean mergeReadOnly;

  public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties mergeRoot(ConfigNodePropertyString mergeRoot) {
    this.mergeRoot = mergeRoot;
    return this;
  }

   /**
   * Get mergeRoot
   * @return mergeRoot
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

