package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties properties = null;

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo pid(String pid) {
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
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo title(String title) {
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
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo description(String description) {
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
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo properties(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties getProperties() {
    return properties;
  }
  public void setProperties(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties properties) {
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
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo = (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo) o;
    return Objects.equals(pid, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.pid) &&
        Objects.equals(title, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.title) &&
        Objects.equals(description, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.description) &&
        Objects.equals(properties, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo {\n");
    
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
