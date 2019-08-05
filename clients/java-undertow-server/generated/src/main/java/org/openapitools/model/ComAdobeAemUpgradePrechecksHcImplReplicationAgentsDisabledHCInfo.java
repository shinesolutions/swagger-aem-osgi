package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties properties = null;

  /**
   **/
  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   **/
  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo properties(ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo = (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo) o;
    return Objects.equals(pid, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.pid) &&
        Objects.equals(title, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.title) &&
        Objects.equals(description, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.description) &&
        Objects.equals(properties, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

