package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteCompatrouterImplRoutingConfigProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties   {
  @JsonProperty("id")
  private ConfigNodePropertyString id = null;

  @JsonProperty("compatPath")
  private ConfigNodePropertyString compatPath = null;

  @JsonProperty("newPath")
  private ConfigNodePropertyString newPath = null;

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties id(ConfigNodePropertyString id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getId() {
    return id;
  }

  public void setId(ConfigNodePropertyString id) {
    this.id = id;
  }

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties compatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
    return this;
  }

   /**
   * Get compatPath
   * @return compatPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCompatPath() {
    return compatPath;
  }

  public void setCompatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
  }

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties newPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
    return this;
  }

   /**
   * Get newPath
   * @return newPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getNewPath() {
    return newPath;
  }

  public void setNewPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties comAdobeGraniteCompatrouterImplRoutingConfigProperties = (ComAdobeGraniteCompatrouterImplRoutingConfigProperties) o;
    return Objects.equals(this.id, comAdobeGraniteCompatrouterImplRoutingConfigProperties.id) &&
        Objects.equals(this.compatPath, comAdobeGraniteCompatrouterImplRoutingConfigProperties.compatPath) &&
        Objects.equals(this.newPath, comAdobeGraniteCompatrouterImplRoutingConfigProperties.newPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, compatPath, newPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    compatPath: ").append(toIndentedString(compatPath)).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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

