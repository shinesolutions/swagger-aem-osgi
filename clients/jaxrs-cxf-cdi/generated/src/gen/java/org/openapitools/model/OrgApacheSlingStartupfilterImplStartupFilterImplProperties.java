package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingStartupfilterImplStartupFilterImplProperties   {
  
  private ConfigNodePropertyBoolean activeByDefault = null;

  private ConfigNodePropertyString defaultMessage = null;


  /**
   **/
  public OrgApacheSlingStartupfilterImplStartupFilterImplProperties activeByDefault(ConfigNodePropertyBoolean activeByDefault) {
    this.activeByDefault = activeByDefault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("active.by.default")
  public ConfigNodePropertyBoolean getActiveByDefault() {
    return activeByDefault;
  }
  public void setActiveByDefault(ConfigNodePropertyBoolean activeByDefault) {
    this.activeByDefault = activeByDefault;
  }


  /**
   **/
  public OrgApacheSlingStartupfilterImplStartupFilterImplProperties defaultMessage(ConfigNodePropertyString defaultMessage) {
    this.defaultMessage = defaultMessage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default.message")
  public ConfigNodePropertyString getDefaultMessage() {
    return defaultMessage;
  }
  public void setDefaultMessage(ConfigNodePropertyString defaultMessage) {
    this.defaultMessage = defaultMessage;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties orgApacheSlingStartupfilterImplStartupFilterImplProperties = (OrgApacheSlingStartupfilterImplStartupFilterImplProperties) o;
    return Objects.equals(activeByDefault, orgApacheSlingStartupfilterImplStartupFilterImplProperties.activeByDefault) &&
        Objects.equals(defaultMessage, orgApacheSlingStartupfilterImplStartupFilterImplProperties.defaultMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeByDefault, defaultMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingStartupfilterImplStartupFilterImplProperties {\n");
    
    sb.append("    activeByDefault: ").append(toIndentedString(activeByDefault)).append("\n");
    sb.append("    defaultMessage: ").append(toIndentedString(defaultMessage)).append("\n");
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

