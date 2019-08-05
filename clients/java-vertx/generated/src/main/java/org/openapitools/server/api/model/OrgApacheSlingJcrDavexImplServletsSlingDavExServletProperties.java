package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties   {
  
  private ConfigNodePropertyString alias = null;
  private ConfigNodePropertyBoolean davCreateAbsoluteUri = null;
  private ConfigNodePropertyString davProtectedhandlers = null;

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties () {

  }

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties (ConfigNodePropertyString alias, ConfigNodePropertyBoolean davCreateAbsoluteUri, ConfigNodePropertyString davProtectedhandlers) {
    this.alias = alias;
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    this.davProtectedhandlers = davProtectedhandlers;
  }

    
  @JsonProperty("alias")
  public ConfigNodePropertyString getAlias() {
    return alias;
  }
  public void setAlias(ConfigNodePropertyString alias) {
    this.alias = alias;
  }

    
  @JsonProperty("dav.create-absolute-uri")
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }
  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

    
  @JsonProperty("dav.protectedhandlers")
  public ConfigNodePropertyString getDavProtectedhandlers() {
    return davProtectedhandlers;
  }
  public void setDavProtectedhandlers(ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties = (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties) o;
    return Objects.equals(alias, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.alias) &&
        Objects.equals(davCreateAbsoluteUri, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davCreateAbsoluteUri) &&
        Objects.equals(davProtectedhandlers, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davProtectedhandlers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, davCreateAbsoluteUri, davProtectedhandlers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    davCreateAbsoluteUri: ").append(toIndentedString(davCreateAbsoluteUri)).append("\n");
    sb.append("    davProtectedhandlers: ").append(toIndentedString(davProtectedhandlers)).append("\n");
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
