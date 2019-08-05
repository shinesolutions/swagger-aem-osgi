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
  public class OrgApacheSlingModelsImplModelAdapterFactoryProperties {
    /// <summary>
    /// Gets or Sets OsgiHttpWhiteboardListener
    /// </summary>
    [DataMember(Name="osgi.http.whiteboard.listener", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "osgi.http.whiteboard.listener")]
    public ConfigNodePropertyString OsgiHttpWhiteboardListener { get; set; }

    /// <summary>
    /// Gets or Sets OsgiHttpWhiteboardContextSelect
    /// </summary>
    [DataMember(Name="osgi.http.whiteboard.context.select", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "osgi.http.whiteboard.context.select")]
    public ConfigNodePropertyString OsgiHttpWhiteboardContextSelect { get; set; }

    /// <summary>
    /// Gets or Sets MaxRecursionDepth
    /// </summary>
    [DataMember(Name="max.recursion.depth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max.recursion.depth")]
    public ConfigNodePropertyInteger MaxRecursionDepth { get; set; }

    /// <summary>
    /// Gets or Sets CleanupJobPeriod
    /// </summary>
    [DataMember(Name="cleanup.job.period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cleanup.job.period")]
    public ConfigNodePropertyInteger CleanupJobPeriod { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingModelsImplModelAdapterFactoryProperties {\n");
      sb.Append("  OsgiHttpWhiteboardListener: ").Append(OsgiHttpWhiteboardListener).Append("\n");
      sb.Append("  OsgiHttpWhiteboardContextSelect: ").Append(OsgiHttpWhiteboardContextSelect).Append("\n");
      sb.Append("  MaxRecursionDepth: ").Append(MaxRecursionDepth).Append("\n");
      sb.Append("  CleanupJobPeriod: ").Append(CleanupJobPeriod).Append("\n");
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
