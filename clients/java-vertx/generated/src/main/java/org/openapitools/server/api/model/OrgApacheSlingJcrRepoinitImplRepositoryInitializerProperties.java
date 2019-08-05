package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties   {
  
  private ConfigNodePropertyArray references = null;

  public OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties () {

  }

  public OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties (ConfigNodePropertyArray references) {
    this.references = references;
  }

    
  @JsonProperty("references")
  public ConfigNodePropertyArray getReferences() {
    return references;
  }
  public void setReferences(ConfigNodePropertyArray references) {
    this.references = references;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties = (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties) o;
    return Objects.equals(references, orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties {\n");
    
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
