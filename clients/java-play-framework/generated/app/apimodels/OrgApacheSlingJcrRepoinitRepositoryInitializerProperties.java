package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties   {
  @JsonProperty("references")
  private ConfigNodePropertyArray references = null;

  @JsonProperty("scripts")
  private ConfigNodePropertyArray scripts = null;

  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties references(ConfigNodePropertyArray references) {
    this.references = references;
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @Valid
  public ConfigNodePropertyArray getReferences() {
    return references;
  }

  public void setReferences(ConfigNodePropertyArray references) {
    this.references = references;
  }

  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties scripts(ConfigNodePropertyArray scripts) {
    this.scripts = scripts;
    return this;
  }

   /**
   * Get scripts
   * @return scripts
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

