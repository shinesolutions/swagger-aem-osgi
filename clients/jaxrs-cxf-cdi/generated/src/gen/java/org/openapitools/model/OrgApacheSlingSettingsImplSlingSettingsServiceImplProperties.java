package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties   {
  
  private ConfigNodePropertyString slingName;

  private ConfigNodePropertyString slingDescription;

  /**
   **/
  public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties slingName(ConfigNodePropertyString slingName) {
    this.slingName = slingName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.name")
  public ConfigNodePropertyString getSlingName() {
    return slingName;
  }
  public void setSlingName(ConfigNodePropertyString slingName) {
    this.slingName = slingName;
  }


  /**
   **/
  public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties slingDescription(ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.description")
  public ConfigNodePropertyString getSlingDescription() {
    return slingDescription;
  }
  public void setSlingDescription(ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties orgApacheSlingSettingsImplSlingSettingsServiceImplProperties = (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties) o;
    return Objects.equals(this.slingName, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingName) &&
        Objects.equals(this.slingDescription, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingName, slingDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {\n");
    
    sb.append("    slingName: ").append(toIndentedString(slingName)).append("\n");
    sb.append("    slingDescription: ").append(toIndentedString(slingDescription)).append("\n");
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

