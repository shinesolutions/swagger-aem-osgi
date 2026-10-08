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



@JsonTypeName("comAdobeGraniteCompatrouterImplRoutingConfigProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties   {
  private ConfigNodePropertyString id;
  private ConfigNodePropertyString compatPath;
  private ConfigNodePropertyString newPath;

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties() {
  }

  /**
   **/
  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties id(ConfigNodePropertyString id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  @Valid public ConfigNodePropertyString getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(ConfigNodePropertyString id) {
    this.id = id;
  }

  /**
   **/
  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties compatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compatPath")
  @Valid public ConfigNodePropertyString getCompatPath() {
    return compatPath;
  }

  @JsonProperty("compatPath")
  public void setCompatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
  }

  /**
   **/
  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties newPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("newPath")
  @Valid public ConfigNodePropertyString getNewPath() {
    return newPath;
  }

  @JsonProperty("newPath")
  public void setNewPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
