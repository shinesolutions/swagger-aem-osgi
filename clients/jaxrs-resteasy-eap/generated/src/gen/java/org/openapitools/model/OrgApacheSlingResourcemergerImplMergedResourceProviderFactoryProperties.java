package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties   {
  

  private ConfigNodePropertyString mergeRoot = null;

  private ConfigNodePropertyBoolean mergeReadOnly = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties = (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties) o;
    return Objects.equals(mergeRoot, orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.mergeRoot) &&
        Objects.equals(mergeReadOnly, orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.mergeReadOnly);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

