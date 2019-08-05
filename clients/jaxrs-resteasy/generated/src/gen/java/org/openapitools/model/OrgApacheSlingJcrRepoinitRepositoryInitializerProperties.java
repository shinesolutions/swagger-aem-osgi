package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties   {
  
  private ConfigNodePropertyArray references = null;
  private ConfigNodePropertyArray scripts = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("references")
  public ConfigNodePropertyArray getReferences() {
    return references;
  }
  public void setReferences(ConfigNodePropertyArray references) {
    this.references = references;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scripts")
  public ConfigNodePropertyArray getScripts() {
    return scripts;
  }
  public void setScripts(ConfigNodePropertyArray scripts) {
    this.scripts = scripts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

