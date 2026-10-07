package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
 */

@JsonTypeName("orgApacheSlingDatasourceJNDIDataSourceFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString datasourceName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString datasourceSvcPropName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString datasourceJndiName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray jndiProperties;

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceName(@Nullable ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

  /**
   * Get datasourceName
   * @return datasourceName
   */
  @Valid 
  @Schema(name = "datasource.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasource.name")
  public @Nullable ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }

  @JsonProperty("datasource.name")
  public void setDatasourceName(@Nullable ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceSvcPropName(@Nullable ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
    return this;
  }

  /**
   * Get datasourceSvcPropName
   * @return datasourceSvcPropName
   */
  @Valid 
  @Schema(name = "datasource.svc.prop.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasource.svc.prop.name")
  public @Nullable ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }

  @JsonProperty("datasource.svc.prop.name")
  public void setDatasourceSvcPropName(@Nullable ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceJndiName(@Nullable ConfigNodePropertyString datasourceJndiName) {
    this.datasourceJndiName = datasourceJndiName;
    return this;
  }

  /**
   * Get datasourceJndiName
   * @return datasourceJndiName
   */
  @Valid 
  @Schema(name = "datasource.jndi.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasource.jndi.name")
  public @Nullable ConfigNodePropertyString getDatasourceJndiName() {
    return datasourceJndiName;
  }

  @JsonProperty("datasource.jndi.name")
  public void setDatasourceJndiName(@Nullable ConfigNodePropertyString datasourceJndiName) {
    this.datasourceJndiName = datasourceJndiName;
  }

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties jndiProperties(@Nullable ConfigNodePropertyArray jndiProperties) {
    this.jndiProperties = jndiProperties;
    return this;
  }

  /**
   * Get jndiProperties
   * @return jndiProperties
   */
  @Valid 
  @Schema(name = "jndi.properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jndi.properties")
  public @Nullable ConfigNodePropertyArray getJndiProperties() {
    return jndiProperties;
  }

  @JsonProperty("jndi.properties")
  public void setJndiProperties(@Nullable ConfigNodePropertyArray jndiProperties) {
    this.jndiProperties = jndiProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties orgApacheSlingDatasourceJNDIDataSourceFactoryProperties = (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties) o;
    return Objects.equals(this.datasourceName, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.datasourceName) &&
        Objects.equals(this.datasourceSvcPropName, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.datasourceSvcPropName) &&
        Objects.equals(this.datasourceJndiName, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.datasourceJndiName) &&
        Objects.equals(this.jndiProperties, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.jndiProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceName, datasourceSvcPropName, datasourceJndiName, jndiProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {\n");
    sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
    sb.append("    datasourceSvcPropName: ").append(toIndentedString(datasourceSvcPropName)).append("\n");
    sb.append("    datasourceJndiName: ").append(toIndentedString(datasourceJndiName)).append("\n");
    sb.append("    jndiProperties: ").append(toIndentedString(jndiProperties)).append("\n");
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

