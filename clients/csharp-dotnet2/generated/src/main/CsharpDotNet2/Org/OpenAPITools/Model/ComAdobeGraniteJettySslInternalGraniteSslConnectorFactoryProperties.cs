using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {
    /// <summary>
    /// Gets or Sets ComAdobeGraniteJettySslPort
    /// </summary>
    [DataMember(Name="com.adobe.granite.jetty.ssl.port", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.port")]
    public ConfigNodePropertyInteger ComAdobeGraniteJettySslPort { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeGraniteJettySslKeystoreUser
    /// </summary>
    [DataMember(Name="com.adobe.granite.jetty.ssl.keystore.user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.keystore.user")]
    public ConfigNodePropertyString ComAdobeGraniteJettySslKeystoreUser { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeGraniteJettySslKeystorePassword
    /// </summary>
    [DataMember(Name="com.adobe.granite.jetty.ssl.keystore.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.keystore.password")]
    public ConfigNodePropertyString ComAdobeGraniteJettySslKeystorePassword { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeGraniteJettySslCiphersuitesExcluded
    /// </summary>
    [DataMember(Name="com.adobe.granite.jetty.ssl.ciphersuites.excluded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.ciphersuites.excluded")]
    public ConfigNodePropertyArray ComAdobeGraniteJettySslCiphersuitesExcluded { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeGraniteJettySslCiphersuitesIncluded
    /// </summary>
    [DataMember(Name="com.adobe.granite.jetty.ssl.ciphersuites.included", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.ciphersuites.included")]
    public ConfigNodePropertyArray ComAdobeGraniteJettySslCiphersuitesIncluded { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeGraniteJettySslClientCertificate
    /// </summary>
    [DataMember(Name="com.adobe.granite.jetty.ssl.client.certificate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.client.certificate")]
    public ConfigNodePropertyDropDown ComAdobeGraniteJettySslClientCertificate { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {\n");
      sb.Append("  ComAdobeGraniteJettySslPort: ").Append(ComAdobeGraniteJettySslPort).Append("\n");
      sb.Append("  ComAdobeGraniteJettySslKeystoreUser: ").Append(ComAdobeGraniteJettySslKeystoreUser).Append("\n");
      sb.Append("  ComAdobeGraniteJettySslKeystorePassword: ").Append(ComAdobeGraniteJettySslKeystorePassword).Append("\n");
      sb.Append("  ComAdobeGraniteJettySslCiphersuitesExcluded: ").Append(ComAdobeGraniteJettySslCiphersuitesExcluded).Append("\n");
      sb.Append("  ComAdobeGraniteJettySslCiphersuitesIncluded: ").Append(ComAdobeGraniteJettySslCiphersuitesIncluded).Append("\n");
      sb.Append("  ComAdobeGraniteJettySslClientCertificate: ").Append(ComAdobeGraniteJettySslClientCertificate).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
