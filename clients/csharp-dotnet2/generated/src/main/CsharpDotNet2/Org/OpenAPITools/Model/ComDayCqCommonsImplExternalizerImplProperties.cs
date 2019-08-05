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
  public class ComDayCqCommonsImplExternalizerImplProperties {
    /// <summary>
    /// Gets or Sets ExternalizerDomains
    /// </summary>
    [DataMember(Name="externalizer.domains", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalizer.domains")]
    public ConfigNodePropertyArray ExternalizerDomains { get; set; }

    /// <summary>
    /// Gets or Sets ExternalizerHost
    /// </summary>
    [DataMember(Name="externalizer.host", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalizer.host")]
    public ConfigNodePropertyString ExternalizerHost { get; set; }

    /// <summary>
    /// Gets or Sets ExternalizerContextpath
    /// </summary>
    [DataMember(Name="externalizer.contextpath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalizer.contextpath")]
    public ConfigNodePropertyString ExternalizerContextpath { get; set; }

    /// <summary>
    /// Gets or Sets ExternalizerEncodedpath
    /// </summary>
    [DataMember(Name="externalizer.encodedpath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalizer.encodedpath")]
    public ConfigNodePropertyBoolean ExternalizerEncodedpath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqCommonsImplExternalizerImplProperties {\n");
      sb.Append("  ExternalizerDomains: ").Append(ExternalizerDomains).Append("\n");
      sb.Append("  ExternalizerHost: ").Append(ExternalizerHost).Append("\n");
      sb.Append("  ExternalizerContextpath: ").Append(ExternalizerContextpath).Append("\n");
      sb.Append("  ExternalizerEncodedpath: ").Append(ExternalizerEncodedpath).Append("\n");
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
