package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingSecurityImplContentDispositionFilterProperties   {
  

  private ConfigNodePropertyArray slingContentDispositionPaths = null;

  private ConfigNodePropertyArray slingContentDispositionExcludedPaths = null;

  private ConfigNodePropertyBoolean slingContentDispositionAllPaths = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.content.disposition.paths")
  public ConfigNodePropertyArray getSlingContentDispositionPaths() {
    return slingContentDispositionPaths;
  }
  public void setSlingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.content.disposition.excluded.paths")
  public ConfigNodePropertyArray getSlingContentDispositionExcludedPaths() {
    return slingContentDispositionExcludedPaths;
  }
  public void setSlingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.content.disposition.all.paths")
  public ConfigNodePropertyBoolean getSlingContentDispositionAllPaths() {
    return slingContentDispositionAllPaths;
  }
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
    return Objects.equals(slingContentDispositionPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionPaths) &&
        Objects.equals(slingContentDispositionExcludedPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionExcludedPaths) &&
        Objects.equals(slingContentDispositionAllPaths, orgApacheSlingSecurityImplContentDispositionFilterProperties.slingContentDispositionAllPaths);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

