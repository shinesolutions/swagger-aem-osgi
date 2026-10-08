package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger serviceRanking;
 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
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
    OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties = (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties) o;
    return Objects.equals(this.serviceRanking, orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

