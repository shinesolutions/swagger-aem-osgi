package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray references = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray scripts = null;
 /**
   * Get references
   * @return references
  **/
  @JsonProperty("references")
  public ConfigNodePropertyArray getReferences() {
    return references;
  }

  public void setReferences(ConfigNodePropertyArray references) {
    this.references = references;
  }

  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties references(ConfigNodePropertyArray references) {
    this.references = references;
    return this;
  }

 /**
   * Get scripts
   * @return scripts
  **/
  @JsonProperty("scripts")
  public ConfigNodePropertyArray getScripts() {
    return scripts;
  }

  public void setScripts(ConfigNodePropertyArray scripts) {
    this.scripts = scripts;
  }

  public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties scripts(ConfigNodePropertyArray scripts) {
    this.scripts = scripts;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

