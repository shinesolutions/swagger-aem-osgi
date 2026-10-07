package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties   {

    private ConfigNodePropertyString datasourceName;
    private ConfigNodePropertyString datasourceSvcPropName;
    private ConfigNodePropertyString datasourceJndiName;
    private ConfigNodePropertyArray jndiProperties;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.
     *
     * @param datasourceName datasourceName
     * @param datasourceSvcPropName datasourceSvcPropName
     * @param datasourceJndiName datasourceJndiName
     * @param jndiProperties jndiProperties
     */
    public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(
        ConfigNodePropertyString datasourceName, 
        ConfigNodePropertyString datasourceSvcPropName, 
        ConfigNodePropertyString datasourceJndiName, 
        ConfigNodePropertyArray jndiProperties
    ) {
        this.datasourceName = datasourceName;
        this.datasourceSvcPropName = datasourceSvcPropName;
        this.datasourceJndiName = datasourceJndiName;
        this.jndiProperties = jndiProperties;
    }



    /**
     * Get datasourceName
     * @return datasourceName
     */
    public ConfigNodePropertyString getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(ConfigNodePropertyString datasourceName) {
        this.datasourceName = datasourceName;
    }

    /**
     * Get datasourceSvcPropName
     * @return datasourceSvcPropName
     */
    public ConfigNodePropertyString getDatasourceSvcPropName() {
        return datasourceSvcPropName;
    }

    public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
        this.datasourceSvcPropName = datasourceSvcPropName;
    }

    /**
     * Get datasourceJndiName
     * @return datasourceJndiName
     */
    public ConfigNodePropertyString getDatasourceJndiName() {
        return datasourceJndiName;
    }

    public void setDatasourceJndiName(ConfigNodePropertyString datasourceJndiName) {
        this.datasourceJndiName = datasourceJndiName;
    }

    /**
     * Get jndiProperties
     * @return jndiProperties
     */
    public ConfigNodePropertyArray getJndiProperties() {
        return jndiProperties;
    }

    public void setJndiProperties(ConfigNodePropertyArray jndiProperties) {
        this.jndiProperties = jndiProperties;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

