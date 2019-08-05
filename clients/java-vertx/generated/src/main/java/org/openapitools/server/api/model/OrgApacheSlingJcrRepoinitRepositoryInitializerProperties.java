package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties   {
  
  private ConfigNodePropertyArray references = null;
  private ConfigNodePropertyArray scripts = null;

  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties () {

  }

  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties (ConfigNodePropertyArray references, ConfigNodePropertyArray scripts) {
    this.references = references;
    this.scripts = scripts;
  }

    
  @JsonProperty("references")
  public ConfigNodePropertyArray getReferences() {
    return references;
  }
  public void setReferences(ConfigNodePropertyArray references) {
    this.references = references;
  }

    
  @JsonProperty("scripts")
  public ConfigNodePropertyArray getScripts() {
    return scripts;
  }
  public void setScripts(ConfigNodePropertyArray scripts) {
    this.scripts = scripts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrRepoinitRepositoryInitializerProperties orgApacheSlingJcrRepoinitRepositoryInitializerProperties = (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties) o;
    return Objects.equals(references, orgApacheSlingJcrRepoinitRepositoryInitializerProperties.references) &&
        Objects.equals(scripts, orgApacheSlingJcrRepoinitRepositoryInitializerProperties.scripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references, scripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {\n");
    
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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
