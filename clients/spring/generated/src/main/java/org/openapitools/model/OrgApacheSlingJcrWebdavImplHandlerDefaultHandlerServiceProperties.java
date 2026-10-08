package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties
 */

@JsonTypeName("orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger serviceRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString typeCollections;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString typeNoncollections;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString typeContent;

  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties serviceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
   */
  @Valid 
  @Schema(name = "service.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.ranking")
  public @Nullable ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeCollections(@Nullable ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
    return this;
  }

  /**
   * Get typeCollections
   * @return typeCollections
   */
  @Valid 
  @Schema(name = "type.collections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type.collections")
  public @Nullable ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }

  @JsonProperty("type.collections")
  public void setTypeCollections(@Nullable ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeNoncollections(@Nullable ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
    return this;
  }

  /**
   * Get typeNoncollections
   * @return typeNoncollections
   */
  @Valid 
  @Schema(name = "type.noncollections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type.noncollections")
  public @Nullable ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }

  @JsonProperty("type.noncollections")
  public void setTypeNoncollections(@Nullable ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

  public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties typeContent(@Nullable ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
    return this;
  }

  /**
   * Get typeContent
   * @return typeContent
   */
  @Valid 
  @Schema(name = "type.content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type.content")
  public @Nullable ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }

  @JsonProperty("type.content")
  public void setTypeContent(@Nullable ConfigNodePropertyString typeContent) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

