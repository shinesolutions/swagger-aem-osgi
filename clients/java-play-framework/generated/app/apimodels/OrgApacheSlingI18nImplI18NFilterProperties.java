package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingI18nImplI18NFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingI18nImplI18NFilterProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("sling.filter.scope")
  private ConfigNodePropertyArray slingFilterScope = null;

  public OrgApacheSlingI18nImplI18NFilterProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public OrgApacheSlingI18nImplI18NFilterProperties slingFilterScope(ConfigNodePropertyArray slingFilterScope) {
    this.slingFilterScope = slingFilterScope;
    return this;
  }

   /**
   * Get slingFilterScope
   * @return slingFilterScope
  **/
  @Valid
  public ConfigNodePropertyArray getSlingFilterScope() {
    return slingFilterScope;
  }

  public void setSlingFilterScope(ConfigNodePropertyArray slingFilterScope) {
    this.slingFilterScope = slingFilterScope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingI18nImplI18NFilterProperties orgApacheSlingI18nImplI18NFilterProperties = (OrgApacheSlingI18nImplI18NFilterProperties) o;
    return Objects.equals(serviceRanking, orgApacheSlingI18nImplI18NFilterProperties.serviceRanking) &&
        Objects.equals(slingFilterScope, orgApacheSlingI18nImplI18NFilterProperties.slingFilterScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, slingFilterScope);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingI18nImplI18NFilterProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    slingFilterScope: ").append(toIndentedString(slingFilterScope)).append("\n");
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

