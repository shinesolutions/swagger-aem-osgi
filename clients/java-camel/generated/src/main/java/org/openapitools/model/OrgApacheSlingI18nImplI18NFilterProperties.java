package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingI18nImplI18NFilterProperties
 */

@JsonTypeName("orgApacheSlingI18nImplI18NFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingI18nImplI18NFilterProperties {

  private ConfigNodePropertyInteger serviceRanking;

  private ConfigNodePropertyArray slingFilterScope;

  public OrgApacheSlingI18nImplI18NFilterProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public OrgApacheSlingI18nImplI18NFilterProperties slingFilterScope(ConfigNodePropertyArray slingFilterScope) {
    this.slingFilterScope = slingFilterScope;
    return this;
  }

  /**
   * Get slingFilterScope
   * @return slingFilterScope
   */
  @Valid 
  @Schema(name = "sling.filter.scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.filter.scope")
  public ConfigNodePropertyArray getSlingFilterScope() {
    return slingFilterScope;
  }

  public void setSlingFilterScope(ConfigNodePropertyArray slingFilterScope) {
    this.slingFilterScope = slingFilterScope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingI18nImplI18NFilterProperties orgApacheSlingI18nImplI18NFilterProperties = (OrgApacheSlingI18nImplI18NFilterProperties) o;
    return Objects.equals(this.serviceRanking, orgApacheSlingI18nImplI18NFilterProperties.serviceRanking) &&
        Objects.equals(this.slingFilterScope, orgApacheSlingI18nImplI18NFilterProperties.slingFilterScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, slingFilterScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingI18nImplI18NFilterProperties {\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    slingFilterScope: ").append(toIndentedString(slingFilterScope)).append("\n");
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

