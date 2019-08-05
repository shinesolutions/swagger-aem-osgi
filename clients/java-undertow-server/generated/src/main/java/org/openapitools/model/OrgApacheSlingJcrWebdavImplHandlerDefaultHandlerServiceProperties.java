package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyString typeCollections = null;
  private ConfigNodePropertyString typeNoncollections = null;
  private ConfigNodePropertyString typeContent = null;

  /**
   **/
  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type.collections")
  public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }
  public void setTypeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type.noncollections")
  public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }
  public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type.content")
  public ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }
  public void setTypeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

