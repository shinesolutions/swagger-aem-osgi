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
  public class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {
    /// <summary>
    /// Gets or Sets SlingAuthRequirements
    /// </summary>
    [DataMember(Name="sling.auth.requirements", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.auth.requirements")]
    public ConfigNodePropertyString SlingAuthRequirements { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {\n");
      sb.Append("  SlingAuthRequirements: ").Append(SlingAuthRequirements).Append("\n");
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
