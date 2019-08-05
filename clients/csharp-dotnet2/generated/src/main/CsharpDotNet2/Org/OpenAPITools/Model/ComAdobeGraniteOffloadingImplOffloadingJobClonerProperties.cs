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
  public class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
    /// <summary>
    /// Gets or Sets OffloadingJobclonerEnabled
    /// </summary>
    [DataMember(Name="offloading.jobcloner.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "offloading.jobcloner.enabled")]
    public ConfigNodePropertyBoolean OffloadingJobclonerEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {\n");
      sb.Append("  OffloadingJobclonerEnabled: ").Append(OffloadingJobclonerEnabled).Append("\n");
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
