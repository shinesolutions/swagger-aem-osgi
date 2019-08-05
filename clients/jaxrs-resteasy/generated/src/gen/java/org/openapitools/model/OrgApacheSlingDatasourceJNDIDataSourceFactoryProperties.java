package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties   {
  
  private ConfigNodePropertyString datasourceName = null;
  private ConfigNodePropertyString datasourceSvcPropName = null;
  private ConfigNodePropertyString datasourceJndiName = null;
  private ConfigNodePropertyArray jndiProperties = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.name")
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }
  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.svc.prop.name")
  public ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }
  public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.jndi.name")
  public ConfigNodePropertyString getDatasourceJndiName() {
    return datasourceJndiName;
  }
  public void setDatasourceJndiName(ConfigNodePropertyString datasourceJndiName) {
    this.datasourceJndiName = datasourceJndiName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jndi.properties")
  public ConfigNodePropertyArray getJndiProperties() {
    return jndiProperties;
  }
  public void setJndiProperties(ConfigNodePropertyArray jndiProperties) {
    this.jndiProperties = jndiProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

