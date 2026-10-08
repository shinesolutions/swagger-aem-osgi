package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingDatasourceJNDIDataSourceFactoryProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties   {
  private ConfigNodePropertyString datasourceName;
  private ConfigNodePropertyString datasourceSvcPropName;
  private ConfigNodePropertyString datasourceJndiName;
  private ConfigNodePropertyArray jndiProperties;

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties() {
  }

  /**
   **/
  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.name")
  @Valid public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }

  @JsonProperty("datasource.name")
  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  /**
   **/
  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.svc.prop.name")
  @Valid public ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }

  @JsonProperty("datasource.svc.prop.name")
  public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  /**
   **/
  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceJndiName(ConfigNodePropertyString datasourceJndiName) {
    this.datasourceJndiName = datasourceJndiName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.jndi.name")
  @Valid public ConfigNodePropertyString getDatasourceJndiName() {
    return datasourceJndiName;
  }

  @JsonProperty("datasource.jndi.name")
  public void setDatasourceJndiName(ConfigNodePropertyString datasourceJndiName) {
    this.datasourceJndiName = datasourceJndiName;
  }

  /**
   **/
  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties jndiProperties(ConfigNodePropertyArray jndiProperties) {
    this.jndiProperties = jndiProperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jndi.properties")
  @Valid public ConfigNodePropertyArray getJndiProperties() {
    return jndiProperties;
  }

  @JsonProperty("jndi.properties")
  public void setJndiProperties(ConfigNodePropertyArray jndiProperties) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
