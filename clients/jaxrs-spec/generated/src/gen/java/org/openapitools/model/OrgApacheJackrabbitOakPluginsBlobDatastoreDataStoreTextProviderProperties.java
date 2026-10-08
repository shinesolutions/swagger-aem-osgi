package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties   {
  private ConfigNodePropertyString dir;

  public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties() {
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties dir(ConfigNodePropertyString dir) {
    this.dir = dir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dir")
  @Valid public ConfigNodePropertyString getDir() {
    return dir;
  }

  @JsonProperty("dir")
  public void setDir(ConfigNodePropertyString dir) {
    this.dir = dir;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties = (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties) o;
    return Objects.equals(this.dir, orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.dir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {\n");
    
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
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
