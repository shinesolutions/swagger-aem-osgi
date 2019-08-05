package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties   {
  @JsonProperty("datasource.name")
  private ConfigNodePropertyString datasourceName = null;

  @JsonProperty("datasource.svc.prop.name")
  private ConfigNodePropertyString datasourceSvcPropName = null;

  @JsonProperty("datasource.jndi.name")
  private ConfigNodePropertyString datasourceJndiName = null;

  @JsonProperty("jndi.properties")
  private ConfigNodePropertyArray jndiProperties = null;

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

   /**
   * Get datasourceName
   * @return datasourceName
  **/
  @Valid
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }

  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
    return this;
  }

   /**
   * Get datasourceSvcPropName
   * @return datasourceSvcPropName
  **/
  @Valid
  public ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }

  public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties datasourceJndiName(ConfigNodePropertyString datasourceJndiName) {
    this.datasourceJndiName = datasourceJndiName;
    return this;
  }

   /**
   * Get datasourceJndiName
   * @return datasourceJndiName
  **/
  @Valid
  public ConfigNodePropertyString getDatasourceJndiName() {
    return datasourceJndiName;
  }

  public void setDatasourceJndiName(ConfigNodePropertyString datasourceJndiName) {
    this.datasourceJndiName = datasourceJndiName;
  }

  public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties jndiProperties(ConfigNodePropertyArray jndiProperties) {
    this.jndiProperties = jndiProperties;
    return this;
  }

   /**
   * Get jndiProperties
   * @return jndiProperties
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

