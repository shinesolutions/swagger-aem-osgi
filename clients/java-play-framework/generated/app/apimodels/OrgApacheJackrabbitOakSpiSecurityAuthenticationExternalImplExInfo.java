package apimodels;

import apimodels.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo   {
  @JsonProperty("pid")
  
  private String pid;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("properties")
  @Valid

  private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties properties;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo properties(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo = (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo) o;
    return Objects.equals(pid, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo.pid) &&
        Objects.equals(title, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo.title) &&
        Objects.equals(description, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo.description) &&
        Objects.equals(properties, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

