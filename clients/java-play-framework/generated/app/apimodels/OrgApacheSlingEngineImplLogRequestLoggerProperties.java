package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingEngineImplLogRequestLoggerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingEngineImplLogRequestLoggerProperties   {
  @JsonProperty("request.log.output")
  private ConfigNodePropertyString requestLogOutput = null;

  @JsonProperty("request.log.outputtype")
  private ConfigNodePropertyDropDown requestLogOutputtype = null;

  @JsonProperty("request.log.enabled")
  private ConfigNodePropertyBoolean requestLogEnabled = null;

  @JsonProperty("access.log.output")
  private ConfigNodePropertyString accessLogOutput = null;

  @JsonProperty("access.log.outputtype")
  private ConfigNodePropertyDropDown accessLogOutputtype = null;

  @JsonProperty("access.log.enabled")
  private ConfigNodePropertyBoolean accessLogEnabled = null;

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
    return this;
  }

   /**
   * Get requestLogOutput
   * @return requestLogOutput
  **/
  @Valid
  public ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }

  public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
    return this;
  }

   /**
   * Get requestLogOutputtype
   * @return requestLogOutputtype
  **/
  @Valid
  public ConfigNodePropertyDropDown getRequestLogOutputtype() {
    return requestLogOutputtype;
  }

  public void setRequestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
    this.requestLogOutputtype = requestLogOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties requestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
    return this;
  }

   /**
   * Get requestLogEnabled
   * @return requestLogEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getRequestLogEnabled() {
    return requestLogEnabled;
  }

  public void setRequestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
    this.requestLogEnabled = requestLogEnabled;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
    return this;
  }

   /**
   * Get accessLogOutput
   * @return accessLogOutput
  **/
  @Valid
  public ConfigNodePropertyString getAccessLogOutput() {
    return accessLogOutput;
  }

  public void setAccessLogOutput(ConfigNodePropertyString accessLogOutput) {
    this.accessLogOutput = accessLogOutput;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
    return this;
  }

   /**
   * Get accessLogOutputtype
   * @return accessLogOutputtype
  **/
  @Valid
  public ConfigNodePropertyDropDown getAccessLogOutputtype() {
    return accessLogOutputtype;
  }

  public void setAccessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
    this.accessLogOutputtype = accessLogOutputtype;
  }

  public OrgApacheSlingEngineImplLogRequestLoggerProperties accessLogEnabled(ConfigNodePropertyBoolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
    return this;
  }

   /**
   * Get accessLogEnabled
   * @return accessLogEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getAccessLogEnabled() {
    return accessLogEnabled;
  }

  public void setAccessLogEnabled(ConfigNodePropertyBoolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplLogRequestLoggerProperties orgApacheSlingEngineImplLogRequestLoggerProperties = (OrgApacheSlingEngineImplLogRequestLoggerProperties) o;
    return Objects.equals(requestLogOutput, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogOutput) &&
        Objects.equals(requestLogOutputtype, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogOutputtype) &&
        Objects.equals(requestLogEnabled, orgApacheSlingEngineImplLogRequestLoggerProperties.requestLogEnabled) &&
        Objects.equals(accessLogOutput, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogOutput) &&
        Objects.equals(accessLogOutputtype, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogOutputtype) &&
        Objects.equals(accessLogEnabled, orgApacheSlingEngineImplLogRequestLoggerProperties.accessLogEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestLogOutput, requestLogOutputtype, requestLogEnabled, accessLogOutput, accessLogOutputtype, accessLogEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEngineImplLogRequestLoggerProperties {\n");
    
    sb.append("    requestLogOutput: ").append(toIndentedString(requestLogOutput)).append("\n");
    sb.append("    requestLogOutputtype: ").append(toIndentedString(requestLogOutputtype)).append("\n");
    sb.append("    requestLogEnabled: ").append(toIndentedString(requestLogEnabled)).append("\n");
    sb.append("    accessLogOutput: ").append(toIndentedString(accessLogOutput)).append("\n");
    sb.append("    accessLogOutputtype: ").append(toIndentedString(accessLogOutputtype)).append("\n");
    sb.append("    accessLogEnabled: ").append(toIndentedString(accessLogEnabled)).append("\n");
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

