package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingSecurityImplContentDispositionFilterProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingSecurityImplContentDispositionFilterProperties   {
  private ConfigNodePropertyArray slingContentDispositionPaths;
  private ConfigNodePropertyArray slingContentDispositionExcludedPaths;
  private ConfigNodePropertyBoolean slingContentDispositionAllPaths;

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties() {
  }

  /**
   **/
  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.content.disposition.paths")
  @Valid public ConfigNodePropertyArray getSlingContentDispositionPaths() {
    return slingContentDispositionPaths;
  }

  @JsonProperty("sling.content.disposition.paths")
  public void setSlingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
  }

  /**
   **/
  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.content.disposition.excluded.paths")
  @Valid public ConfigNodePropertyArray getSlingContentDispositionExcludedPaths() {
    return slingContentDispositionExcludedPaths;
  }

  @JsonProperty("sling.content.disposition.excluded.paths")
  public void setSlingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
  }

  /**
   **/
  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
    this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.content.disposition.all.paths")
  @Valid public ConfigNodePropertyBoolean getSlingContentDispositionAllPaths() {
    return slingContentDispositionAllPaths;
  }

  @JsonProperty("sling.content.disposition.all.paths")
  public void setSlingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
    this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSecurityImplContentDispositionFilterProperties orgApacheSlingSecurityImplContentDispositionFilterProperties = (OrgApacheSlingSecurityImplContentDispositionFilterProperties) o;
    return Objects.equals(this.slingContentDispositionPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionPaths) &&
        Objects.equals(this.slingContentDispositionExcludedPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionExcludedPaths) &&
        Objects.equals(this.slingContentDispositionAllPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionAllPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingContentDispositionPaths, slingContentDispositionExcludedPaths, slingContentDispositionAllPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSecurityImplContentDispositionFilterProperties {\n");
    
    sb.append("    slingContentDispositionPaths: ").append(toIndentedString(slingContentDispositionPaths)).append("\n");
    sb.append("    slingContentDispositionExcludedPaths: ").append(toIndentedString(slingContentDispositionExcludedPaths)).append("\n");
    sb.append("    slingContentDispositionAllPaths: ").append(toIndentedString(slingContentDispositionAllPaths)).append("\n");
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
