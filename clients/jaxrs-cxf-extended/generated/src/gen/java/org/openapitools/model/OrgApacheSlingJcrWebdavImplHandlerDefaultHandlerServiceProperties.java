package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceRanking;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeCollections;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeNoncollections;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeContent;
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
  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
  * Get typeCollections
  * @return typeCollections
  */
  @JsonProperty("type.collections")
  public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }

  /**
   * Sets the <code>typeCollections</code> property.
   */
 public void setTypeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

  /**
   * Sets the <code>typeCollections</code> property.
   */
  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
    return this;
  }

 /**
  * Get typeNoncollections
  * @return typeNoncollections
  */
  @JsonProperty("type.noncollections")
  public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }

  /**
   * Sets the <code>typeNoncollections</code> property.
   */
 public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

  /**
   * Sets the <code>typeNoncollections</code> property.
   */
  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
    return this;
  }

 /**
  * Get typeContent
  * @return typeContent
  */
  @JsonProperty("type.content")
  public ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }

  /**
   * Sets the <code>typeContent</code> property.
   */
 public void setTypeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
  }

  /**
   * Sets the <code>typeContent</code> property.
   */
  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
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
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties = (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties) o;
    return Objects.equals(this.serviceRanking, orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.serviceRanking) &&
        Objects.equals(this.typeCollections, orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.typeCollections) &&
        Objects.equals(this.typeNoncollections, orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.typeNoncollections) &&
        Objects.equals(this.typeContent, orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.typeContent);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

