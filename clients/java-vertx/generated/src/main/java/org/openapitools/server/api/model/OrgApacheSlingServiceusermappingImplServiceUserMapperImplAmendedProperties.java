package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyArray userMapping = null;

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties () {

  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties (ConfigNodePropertyInteger serviceRanking, ConfigNodePropertyArray userMapping) {
    this.serviceRanking = serviceRanking;
    this.userMapping = userMapping;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("user.mapping")
  public ConfigNodePropertyArray getUserMapping() {
    return userMapping;
  }
  public void setUserMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
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
    return Objects.equals(serviceRanking, orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.serviceRanking) &&
        Objects.equals(userMapping, orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.userMapping);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
