package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyString path;
    private ConfigNodePropertyString privilegeName;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.
     *
     * @param name name
     * @param serviceName serviceName
     * @param path path
     * @param privilegeName privilegeName
     */
    public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyString path, 
        ConfigNodePropertyString privilegeName
    ) {
        this.name = name;
        this.serviceName = serviceName;
        this.path = path;
        this.privilegeName = privilegeName;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get serviceName
     * @return serviceName
     */
    public ConfigNodePropertyString getServiceName() {
        return serviceName;
    }

    public void setServiceName(ConfigNodePropertyString serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyString getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyString path) {
        this.path = path;
    }

    /**
     * Get privilegeName
     * @return privilegeName
     */
    public ConfigNodePropertyString getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(ConfigNodePropertyString privilegeName) {
        this.privilegeName = privilegeName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    privilegeName: ").append(toIndentedString(privilegeName)).append("\n");
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

