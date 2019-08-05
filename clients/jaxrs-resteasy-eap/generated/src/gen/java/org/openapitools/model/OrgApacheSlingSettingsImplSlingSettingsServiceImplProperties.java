package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties   {
  

  private ConfigNodePropertyString slingName = null;

  private ConfigNodePropertyString slingDescription = null;

  /**
   **/
  
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
    return Objects.equals(slingName, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingName) &&
        Objects.equals(slingDescription, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingDescription);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

