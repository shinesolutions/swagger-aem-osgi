package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties   {
  
  private ConfigNodePropertyString datasourceName = null;
  private ConfigNodePropertyString datasourceSvcPropName = null;
  private ConfigNodePropertyString datasourceJndiName = null;
  private ConfigNodePropertyArray jndiProperties = null;

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties () {

  }

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties (ConfigNodePropertyString datasourceName, ConfigNodePropertyString datasourceSvcPropName, ConfigNodePropertyString datasourceJndiName, ConfigNodePropertyArray jndiProperties) {
    this.datasourceName = datasourceName;
    this.datasourceSvcPropName = datasourceSvcPropName;
    this.datasourceJndiName = datasourceJndiName;
    this.jndiProperties = jndiProperties;
  }

    
  @JsonProperty("datasource.name")
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }
  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

    
  @JsonProperty("datasource.svc.prop.name")
  public ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }
  public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

    
  @JsonProperty("datasource.jndi.name")
  public ConfigNodePropertyString getDatasourceJndiName() {
    return datasourceJndiName;
  }
  public void setDatasourceJndiName(ConfigNodePropertyString datasourceJndiName) {
    this.datasourceJndiName = datasourceJndiName;
  }

    
  @JsonProperty("jndi.properties")
  public ConfigNodePropertyArray getJndiProperties() {
    return jndiProperties;
  }
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
    return Objects.equals(datasourceName, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.datasourceName) &&
        Objects.equals(datasourceSvcPropName, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.datasourceSvcPropName) &&
        Objects.equals(datasourceJndiName, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.datasourceJndiName) &&
        Objects.equals(jndiProperties, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.jndiProperties);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
