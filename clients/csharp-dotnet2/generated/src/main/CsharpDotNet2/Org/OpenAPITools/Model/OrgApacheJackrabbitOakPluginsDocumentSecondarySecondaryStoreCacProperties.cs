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
  public class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties {
    /// <summary>
    /// Gets or Sets IncludedPaths
    /// </summary>
    [DataMember(Name="includedPaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "includedPaths")]
    public ConfigNodePropertyArray IncludedPaths { get; set; }

    /// <summary>
    /// Gets or Sets EnableAsyncObserver
    /// </summary>
    [DataMember(Name="enableAsyncObserver", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableAsyncObserver")]
    public ConfigNodePropertyBoolean EnableAsyncObserver { get; set; }

    /// <summary>
    /// Gets or Sets ObserverQueueSize
    /// </summary>
    [DataMember(Name="observerQueueSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "observerQueueSize")]
    public ConfigNodePropertyInteger ObserverQueueSize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties {\n");
      sb.Append("  IncludedPaths: ").Append(IncludedPaths).Append("\n");
      sb.Append("  EnableAsyncObserver: ").Append(EnableAsyncObserver).Append("\n");
      sb.Append("  ObserverQueueSize: ").Append(ObserverQueueSize).Append("\n");
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
