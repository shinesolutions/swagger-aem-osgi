package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties   {
  @JsonProperty("sling.servlet.paths")
  private ConfigNodePropertyString slingServletPaths = null;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyString slingServletMethods = null;

  public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

   /**
   * Get slingServletPaths
   * @return slingServletPaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

   /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties comDayCqDamS7damCommonServletsS7damProductInfoServletProperties = (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties) o;
    return Objects.equals(this.slingServletPaths, comDayCqDamS7damCommonServletsS7damProductInfoServletProperties.slingServletPaths) &&
        Objects.equals(this.slingServletMethods, comDayCqDamS7damCommonServletsS7damProductInfoServletProperties.slingServletMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletPaths, slingServletMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties {\n");
    
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

