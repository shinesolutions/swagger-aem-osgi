/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo {
  
  @SerializedName("pid")
  private String pid = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("properties")
  private ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties properties = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties properties) {
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
    ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo = (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo) o;
    return (this.pid == null ? comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.pid == null : this.pid.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.pid)) &&
        (this.title == null ? comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.title == null : this.title.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.title)) &&
        (this.description == null ? comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.description == null : this.description.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.description)) &&
        (this.properties == null ? comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.properties == null : this.properties.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.properties));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pid == null ? 0: this.pid.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.properties == null ? 0: this.properties.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo {\n");
    
    sb.append("  pid: ").append(pid).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}