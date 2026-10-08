package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceRanking;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray userMapping;
 /**
  * Get serviceRanking
  * @return serviceRanking
  */
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  /**
   * Sets the <code>serviceRanking</code> property.
   */
 public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   * Sets the <code>serviceRanking</code> property.
   */
  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
  * Get userMapping
  * @return userMapping
  */
  @JsonProperty("user.mapping")
  public ConfigNodePropertyArray getUserMapping() {
    return userMapping;
  }

  /**
   * Sets the <code>userMapping</code> property.
   */
 public void setUserMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
  }

  /**
   * Sets the <code>userMapping</code> property.
   */
  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties userMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
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
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties = (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties) o;
    return Objects.equals(this.serviceRanking, orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.serviceRanking) &&
        Objects.equals(this.userMapping, orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.userMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, userMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    userMapping: ").append(toIndentedString(userMapping)).append("\n");
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

