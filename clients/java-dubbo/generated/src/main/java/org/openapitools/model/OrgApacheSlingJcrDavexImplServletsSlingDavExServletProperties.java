package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("alias")
  private ConfigNodePropertyString alias;

  @JsonProperty("dav.create-absolute-uri")
  private ConfigNodePropertyBoolean davCreateAbsoluteUri;

  @JsonProperty("dav.protectedhandlers")
  private ConfigNodePropertyString davProtectedhandlers;

  /**
   * 
   * @return alias
   */
  public ConfigNodePropertyString getAlias() {
    return alias;
  }

  public void setAlias(ConfigNodePropertyString alias) {
    this.alias = alias;
  }

  /**
   * 
   * @return davCreateAbsoluteUri
   */
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  /**
   * 
   * @return davProtectedhandlers
   */
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
    return Objects.equals(this.alias, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.alias) &&
        Objects.equals(this.davCreateAbsoluteUri, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davCreateAbsoluteUri) &&
        Objects.equals(this.davProtectedhandlers, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davProtectedhandlers);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
