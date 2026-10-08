package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties   {
  @JsonProperty("references")
  private ConfigNodePropertyArray references;

  @JsonProperty("scripts")
  private ConfigNodePropertyArray scripts;

  /**
   **/
  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties references(ConfigNodePropertyArray references) {
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

  /**
   **/
  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties scripts(ConfigNodePropertyArray scripts) {
    this.scripts = scripts;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

