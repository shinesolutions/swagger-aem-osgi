package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties   {
  @JsonProperty("liverelationshipmgr.relationsconfig.default")
  private ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault = null;

  public ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties liverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault) {
    this.liverelationshipmgrRelationsconfigDefault = liverelationshipmgrRelationsconfigDefault;
    return this;
  }

   /**
   * Get liverelationshipmgrRelationsconfigDefault
   * @return liverelationshipmgrRelationsconfigDefault
  **/
  @Valid
  public ConfigNodePropertyString getLiverelationshipmgrRelationsconfigDefault() {
    return liverelationshipmgrRelationsconfigDefault;
  }

  public void setLiverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault) {
    this.liverelationshipmgrRelationsconfigDefault = liverelationshipmgrRelationsconfigDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties comDayCqWcmMsmImplLiveRelationshipManagerImplProperties = (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties) o;
    return Objects.equals(liverelationshipmgrRelationsconfigDefault, comDayCqWcmMsmImplLiveRelationshipManagerImplProperties.liverelationshipmgrRelationsconfigDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liverelationshipmgrRelationsconfigDefault);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties {\n");
    
    sb.append("    liverelationshipmgrRelationsconfigDefault: ").append(toIndentedString(liverelationshipmgrRelationsconfigDefault)).append("\n");
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

