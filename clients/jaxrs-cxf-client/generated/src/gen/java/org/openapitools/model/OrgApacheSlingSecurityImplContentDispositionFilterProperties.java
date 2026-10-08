package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingSecurityImplContentDispositionFilterProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray slingContentDispositionPaths;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray slingContentDispositionExcludedPaths;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean slingContentDispositionAllPaths;
 /**
   * Get slingContentDispositionPaths
   * @return slingContentDispositionPaths
  **/
  @JsonProperty("sling.content.disposition.paths")
  public ConfigNodePropertyArray getSlingContentDispositionPaths() {
    return slingContentDispositionPaths;
  }

  public void setSlingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
  }

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
    return this;
  }

 /**
   * Get slingContentDispositionExcludedPaths
   * @return slingContentDispositionExcludedPaths
  **/
  @JsonProperty("sling.content.disposition.excluded.paths")
  public ConfigNodePropertyArray getSlingContentDispositionExcludedPaths() {
    return slingContentDispositionExcludedPaths;
  }

  public void setSlingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
  }

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
    return this;
  }

 /**
   * Get slingContentDispositionAllPaths
   * @return slingContentDispositionAllPaths
  **/
  @JsonProperty("sling.content.disposition.all.paths")
  public ConfigNodePropertyBoolean getSlingContentDispositionAllPaths() {
    return slingContentDispositionAllPaths;
  }

  public void setSlingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
    this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
  }

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
    this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

