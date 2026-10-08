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



@JsonTypeName("orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties   {
  private ConfigNodePropertyBoolean enabled;
  private ConfigNodePropertyInteger serviceRanking;

  public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties() {
  }

  /**
   **/
  public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  @Valid public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  @Valid public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties = (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties) o;
    return Objects.equals(this.enabled, orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.enabled) &&
        Objects.equals(this.serviceRanking, orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, serviceRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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
