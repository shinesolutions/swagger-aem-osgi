package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamScene7ImplScene7UploadServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamScene7ImplScene7UploadServiceImplProperties   {
  @JsonProperty("cq.dam.scene7.uploadservice.activejobtimeout.label")
  private ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel = null;

  @JsonProperty("cq.dam.scene7.uploadservice.connectionmaxperroute.label")
  private ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel = null;

  public ComDayCqDamScene7ImplScene7UploadServiceImplProperties cqDamScene7UploadserviceActivejobtimeoutLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel) {
    this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
    return this;
  }

  /**
   * Get cqDamScene7UploadserviceActivejobtimeoutLabel
   * @return cqDamScene7UploadserviceActivejobtimeoutLabel
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCqDamScene7UploadserviceConnectionmaxperrouteLabel() {
    return cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }

  public void setCqDamScene7UploadserviceConnectionmaxperrouteLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel) {
    this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties comDayCqDamScene7ImplScene7UploadServiceImplProperties = (ComDayCqDamScene7ImplScene7UploadServiceImplProperties) o;
    return Objects.equals(this.cqDamScene7UploadserviceActivejobtimeoutLabel, comDayCqDamScene7ImplScene7UploadServiceImplProperties.cqDamScene7UploadserviceActivejobtimeoutLabel) &&
        Objects.equals(this.cqDamScene7UploadserviceConnectionmaxperrouteLabel, comDayCqDamScene7ImplScene7UploadServiceImplProperties.cqDamScene7UploadserviceConnectionmaxperrouteLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7UploadserviceActivejobtimeoutLabel, cqDamScene7UploadserviceConnectionmaxperrouteLabel);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

