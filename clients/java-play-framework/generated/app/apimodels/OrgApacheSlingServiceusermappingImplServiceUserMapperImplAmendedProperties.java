package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("user.mapping")
  private ConfigNodePropertyArray userMapping = null;

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties userMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
    return this;
  }

   /**
   * Get userMapping
   * @return userMapping
  **/
  @Valid
  public ConfigNodePropertyArray getUserMapping() {
    return userMapping;
  }

  public void setUserMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

