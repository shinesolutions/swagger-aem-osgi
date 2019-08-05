package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties   {
  
  private ConfigNodePropertyArray references = null;

  /**
   **/
  public OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties references(ConfigNodePropertyArray references) {
    this.references = references;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("references")
  public ConfigNodePropertyArray getReferences() {
    return references;
  }
  public void setReferences(ConfigNodePropertyArray references) {
    this.references = references;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

