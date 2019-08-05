package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqContentsyncImplContentSyncManagerImplProperties   {
  @JsonProperty("contentsync.fallback.authorizable")
  private ConfigNodePropertyString contentsyncFallbackAuthorizable = null;

  @JsonProperty("contentsync.fallback.updateuser")
  private ConfigNodePropertyString contentsyncFallbackUpdateuser = null;

  /**
   **/
  public ComDayCqContentsyncImplContentSyncManagerImplProperties contentsyncFallbackAuthorizable(ConfigNodePropertyString contentsyncFallbackAuthorizable) {
    this.contentsyncFallbackAuthorizable = contentsyncFallbackAuthorizable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contentsync.fallback.authorizable")
  public ConfigNodePropertyString getContentsyncFallbackAuthorizable() {
    return contentsyncFallbackAuthorizable;
  }
  public void setContentsyncFallbackAuthorizable(ConfigNodePropertyString contentsyncFallbackAuthorizable) {
    this.contentsyncFallbackAuthorizable = contentsyncFallbackAuthorizable;
  }

  /**
   **/
  public ComDayCqContentsyncImplContentSyncManagerImplProperties contentsyncFallbackUpdateuser(ConfigNodePropertyString contentsyncFallbackUpdateuser) {
    this.contentsyncFallbackUpdateuser = contentsyncFallbackUpdateuser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contentsync.fallback.updateuser")
  public ConfigNodePropertyString getContentsyncFallbackUpdateuser() {
    return contentsyncFallbackUpdateuser;
  }
  public void setContentsyncFallbackUpdateuser(ConfigNodePropertyString contentsyncFallbackUpdateuser) {
    this.contentsyncFallbackUpdateuser = contentsyncFallbackUpdateuser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqContentsyncImplContentSyncManagerImplProperties comDayCqContentsyncImplContentSyncManagerImplProperties = (ComDayCqContentsyncImplContentSyncManagerImplProperties) o;
    return Objects.equals(contentsyncFallbackAuthorizable, comDayCqContentsyncImplContentSyncManagerImplProperties.contentsyncFallbackAuthorizable) &&
        Objects.equals(contentsyncFallbackUpdateuser, comDayCqContentsyncImplContentSyncManagerImplProperties.contentsyncFallbackUpdateuser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentsyncFallbackAuthorizable, contentsyncFallbackUpdateuser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqContentsyncImplContentSyncManagerImplProperties {\n");
    
    sb.append("    contentsyncFallbackAuthorizable: ").append(toIndentedString(contentsyncFallbackAuthorizable)).append("\n");
    sb.append("    contentsyncFallbackUpdateuser: ").append(toIndentedString(contentsyncFallbackUpdateuser)).append("\n");
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

