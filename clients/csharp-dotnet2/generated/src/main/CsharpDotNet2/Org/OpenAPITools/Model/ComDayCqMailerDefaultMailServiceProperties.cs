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
  public class ComDayCqMailerDefaultMailServiceProperties {
    /// <summary>
    /// Gets or Sets SmtpHost
    /// </summary>
    [DataMember(Name="smtp.host", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "smtp.host")]
    public ConfigNodePropertyString SmtpHost { get; set; }

    /// <summary>
    /// Gets or Sets SmtpPort
    /// </summary>
    [DataMember(Name="smtp.port", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "smtp.port")]
    public ConfigNodePropertyInteger SmtpPort { get; set; }

    /// <summary>
    /// Gets or Sets SmtpUser
    /// </summary>
    [DataMember(Name="smtp.user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "smtp.user")]
    public ConfigNodePropertyString SmtpUser { get; set; }

    /// <summary>
    /// Gets or Sets SmtpPassword
    /// </summary>
    [DataMember(Name="smtp.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "smtp.password")]
    public ConfigNodePropertyString SmtpPassword { get; set; }

    /// <summary>
    /// Gets or Sets FromAddress
    /// </summary>
    [DataMember(Name="from.address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "from.address")]
    public ConfigNodePropertyString FromAddress { get; set; }

    /// <summary>
    /// Gets or Sets SmtpSsl
    /// </summary>
    [DataMember(Name="smtp.ssl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "smtp.ssl")]
    public ConfigNodePropertyBoolean SmtpSsl { get; set; }

    /// <summary>
    /// Gets or Sets SmtpStarttls
    /// </summary>
    [DataMember(Name="smtp.starttls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "smtp.starttls")]
    public ConfigNodePropertyBoolean SmtpStarttls { get; set; }

    /// <summary>
    /// Gets or Sets DebugEmail
    /// </summary>
    [DataMember(Name="debug.email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "debug.email")]
    public ConfigNodePropertyBoolean DebugEmail { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqMailerDefaultMailServiceProperties {\n");
      sb.Append("  SmtpHost: ").Append(SmtpHost).Append("\n");
      sb.Append("  SmtpPort: ").Append(SmtpPort).Append("\n");
      sb.Append("  SmtpUser: ").Append(SmtpUser).Append("\n");
      sb.Append("  SmtpPassword: ").Append(SmtpPassword).Append("\n");
      sb.Append("  FromAddress: ").Append(FromAddress).Append("\n");
      sb.Append("  SmtpSsl: ").Append(SmtpSsl).Append("\n");
      sb.Append("  SmtpStarttls: ").Append(SmtpStarttls).Append("\n");
      sb.Append("  DebugEmail: ").Append(DebugEmail).Append("\n");
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
