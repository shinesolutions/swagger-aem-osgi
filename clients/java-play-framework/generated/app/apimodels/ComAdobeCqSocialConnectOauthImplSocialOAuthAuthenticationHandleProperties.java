package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties   {
  @JsonProperty("path")
  private ConfigNodePropertyArray path = null;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties path(ConfigNodePropertyArray path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Valid
  public ConfigNodePropertyArray getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties = (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties) o;
    return Objects.equals(path, comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.path) &&
        Objects.equals(serviceRanking, comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

