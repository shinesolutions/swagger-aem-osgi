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
  public class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {
    /// <summary>
    /// Gets or Sets IllegalCharMapping
    /// </summary>
    [DataMember(Name="illegalCharMapping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "illegalCharMapping")]
    public ConfigNodePropertyString IllegalCharMapping { get; set; }

    /// <summary>
    /// Gets or Sets PageSubTreeActivationCheck
    /// </summary>
    [DataMember(Name="pageSubTreeActivationCheck", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pageSubTreeActivationCheck")]
    public ConfigNodePropertyBoolean PageSubTreeActivationCheck { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {\n");
      sb.Append("  IllegalCharMapping: ").Append(IllegalCharMapping).Append("\n");
      sb.Append("  PageSubTreeActivationCheck: ").Append(PageSubTreeActivationCheck).Append("\n");
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
