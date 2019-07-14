/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqCommonsImplExternalizerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComDayCqCommonsImplExternalizerImplProperties {
  public static final String SERIALIZED_NAME_EXTERNALIZER_DOMAINS = "externalizer.domains";
  @SerializedName(SERIALIZED_NAME_EXTERNALIZER_DOMAINS)
  private ConfigNodePropertyArray externalizerDomains = null;

  public static final String SERIALIZED_NAME_EXTERNALIZER_HOST = "externalizer.host";
  @SerializedName(SERIALIZED_NAME_EXTERNALIZER_HOST)
  private ConfigNodePropertyString externalizerHost = null;

  public static final String SERIALIZED_NAME_EXTERNALIZER_CONTEXTPATH = "externalizer.contextpath";
  @SerializedName(SERIALIZED_NAME_EXTERNALIZER_CONTEXTPATH)
  private ConfigNodePropertyString externalizerContextpath = null;

  public static final String SERIALIZED_NAME_EXTERNALIZER_ENCODEDPATH = "externalizer.encodedpath";
  @SerializedName(SERIALIZED_NAME_EXTERNALIZER_ENCODEDPATH)
  private ConfigNodePropertyBoolean externalizerEncodedpath = null;

  public ComDayCqCommonsImplExternalizerImplProperties externalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
    return this;
  }

   /**
   * Get externalizerDomains
   * @return externalizerDomains
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getExternalizerDomains() {
    return externalizerDomains;
  }

  public void setExternalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
    return this;
  }

   /**
   * Get externalizerHost
   * @return externalizerHost
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getExternalizerHost() {
    return externalizerHost;
  }

  public void setExternalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
    return this;
  }

   /**
   * Get externalizerContextpath
   * @return externalizerContextpath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getExternalizerContextpath() {
    return externalizerContextpath;
  }

  public void setExternalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
    return this;
  }

   /**
   * Get externalizerEncodedpath
   * @return externalizerEncodedpath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getExternalizerEncodedpath() {
    return externalizerEncodedpath;
  }

  public void setExternalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqCommonsImplExternalizerImplProperties comDayCqCommonsImplExternalizerImplProperties = (ComDayCqCommonsImplExternalizerImplProperties) o;
    return Objects.equals(this.externalizerDomains, comDayCqCommonsImplExternalizerImplProperties.externalizerDomains) &&
        Objects.equals(this.externalizerHost, comDayCqCommonsImplExternalizerImplProperties.externalizerHost) &&
        Objects.equals(this.externalizerContextpath, comDayCqCommonsImplExternalizerImplProperties.externalizerContextpath) &&
        Objects.equals(this.externalizerEncodedpath, comDayCqCommonsImplExternalizerImplProperties.externalizerEncodedpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalizerDomains, externalizerHost, externalizerContextpath, externalizerEncodedpath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCommonsImplExternalizerImplProperties {\n");
    sb.append("    externalizerDomains: ").append(toIndentedString(externalizerDomains)).append("\n");
    sb.append("    externalizerHost: ").append(toIndentedString(externalizerHost)).append("\n");
    sb.append("    externalizerContextpath: ").append(toIndentedString(externalizerContextpath)).append("\n");
    sb.append("    externalizerEncodedpath: ").append(toIndentedString(externalizerEncodedpath)).append("\n");
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

