package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties   {
  private ConfigNodePropertyBoolean enable;
  private ConfigNodePropertyInteger ttl1;
  private ConfigNodePropertyInteger ttl2;

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable")
  @Valid public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  @JsonProperty("enable")
  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  /**
   **/
  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties ttl1(ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ttl1")
  @Valid public ConfigNodePropertyInteger getTtl1() {
    return ttl1;
  }

  @JsonProperty("ttl1")
  public void setTtl1(ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
  }

  /**
   **/
  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties ttl2(ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ttl2")
  @Valid public ConfigNodePropertyInteger getTtl2() {
    return ttl2;
  }

  @JsonProperty("ttl2")
  public void setTtl2(ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties = (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties) o;
    return Objects.equals(this.enable, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.enable) &&
        Objects.equals(this.ttl1, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.ttl1) &&
        Objects.equals(this.ttl2, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.ttl2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, ttl1, ttl2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    ttl1: ").append(toIndentedString(ttl1)).append("\n");
    sb.append("    ttl2: ").append(toIndentedString(ttl2)).append("\n");
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
