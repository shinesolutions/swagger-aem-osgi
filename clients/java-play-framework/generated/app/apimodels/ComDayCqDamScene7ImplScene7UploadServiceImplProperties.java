package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamScene7ImplScene7UploadServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamScene7ImplScene7UploadServiceImplProperties   {
  @JsonProperty("cq.dam.scene7.uploadservice.activejobtimeout.label")
  @Valid

  private ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel;

  @JsonProperty("cq.dam.scene7.uploadservice.connectionmaxperroute.label")
  @Valid

  private ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel;

  public ComDayCqDamScene7ImplScene7UploadServiceImplProperties cqDamScene7UploadserviceActivejobtimeoutLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel) {
    this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
    return this;
  }

   /**
   * Get cqDamScene7UploadserviceActivejobtimeoutLabel
   * @return cqDamScene7UploadserviceActivejobtimeoutLabel
  **/
  public ConfigNodePropertyInteger getCqDamScene7UploadserviceActivejobtimeoutLabel() {
    return cqDamScene7UploadserviceActivejobtimeoutLabel;
  }

  public void setCqDamScene7UploadserviceActivejobtimeoutLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel) {
    this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
  }

  public ComDayCqDamScene7ImplScene7UploadServiceImplProperties cqDamScene7UploadserviceConnectionmaxperrouteLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel) {
    this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
    return this;
  }

   /**
   * Get cqDamScene7UploadserviceConnectionmaxperrouteLabel
   * @return cqDamScene7UploadserviceConnectionmaxperrouteLabel
  **/
  public ConfigNodePropertyInteger getCqDamScene7UploadserviceConnectionmaxperrouteLabel() {
    return cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }

  public void setCqDamScene7UploadserviceConnectionmaxperrouteLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel) {
    this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties comDayCqDamScene7ImplScene7UploadServiceImplProperties = (ComDayCqDamScene7ImplScene7UploadServiceImplProperties) o;
    return Objects.equals(cqDamScene7UploadserviceActivejobtimeoutLabel, comDayCqDamScene7ImplScene7UploadServiceImplProperties.cqDamScene7UploadserviceActivejobtimeoutLabel) &&
        Objects.equals(cqDamScene7UploadserviceConnectionmaxperrouteLabel, comDayCqDamScene7ImplScene7UploadServiceImplProperties.cqDamScene7UploadserviceConnectionmaxperrouteLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7UploadserviceActivejobtimeoutLabel, cqDamScene7UploadserviceConnectionmaxperrouteLabel);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7UploadServiceImplProperties {\n");
    
    sb.append("    cqDamScene7UploadserviceActivejobtimeoutLabel: ").append(toIndentedString(cqDamScene7UploadserviceActivejobtimeoutLabel)).append("\n");
    sb.append("    cqDamScene7UploadserviceConnectionmaxperrouteLabel: ").append(toIndentedString(cqDamScene7UploadserviceConnectionmaxperrouteLabel)).append("\n");
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

