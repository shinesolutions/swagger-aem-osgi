package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingStartupfilterImplStartupFilterImplProperties   {
  
  private ConfigNodePropertyBoolean activeByDefault;
  private ConfigNodePropertyString defaultMessage;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("default.message")
  public ConfigNodePropertyString getDefaultMessage() {
    return defaultMessage;
  }
  public void setDefaultMessage(ConfigNodePropertyString defaultMessage) {
    this.defaultMessage = defaultMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties orgApacheSlingStartupfilterImplStartupFilterImplProperties = (OrgApacheSlingStartupfilterImplStartupFilterImplProperties) o;
    return Objects.equals(this.activeByDefault, orgApacheSlingStartupfilterImplStartupFilterImplProperties.activeByDefault) &&
        Objects.equals(this.defaultMessage, orgApacheSlingStartupfilterImplStartupFilterImplProperties.defaultMessage);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

