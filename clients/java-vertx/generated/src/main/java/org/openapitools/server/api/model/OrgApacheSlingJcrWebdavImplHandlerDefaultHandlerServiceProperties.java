package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyString typeCollections = null;
  private ConfigNodePropertyString typeNoncollections = null;
  private ConfigNodePropertyString typeContent = null;

  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties () {

  }

  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties (ConfigNodePropertyInteger serviceRanking, ConfigNodePropertyString typeCollections, ConfigNodePropertyString typeNoncollections, ConfigNodePropertyString typeContent) {
    this.serviceRanking = serviceRanking;
    this.typeCollections = typeCollections;
    this.typeNoncollections = typeNoncollections;
    this.typeContent = typeContent;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("type.collections")
  public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }
  public void setTypeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

    
  @JsonProperty("type.noncollections")
  public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }
  public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

    
  @JsonProperty("type.content")
  public ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }
  public void setTypeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties = (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties) o;
    return Objects.equals(serviceRanking, orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.serviceRanking) &&
        Objects.equals(typeCollections, orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.typeCollections) &&
        Objects.equals(typeNoncollections, orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.typeNoncollections) &&
        Objects.equals(typeContent, orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.typeContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, typeCollections, typeNoncollections, typeContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    typeCollections: ").append(toIndentedString(typeCollections)).append("\n");
    sb.append("    typeNoncollections: ").append(toIndentedString(typeNoncollections)).append("\n");
    sb.append("    typeContent: ").append(toIndentedString(typeContent)).append("\n");
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
