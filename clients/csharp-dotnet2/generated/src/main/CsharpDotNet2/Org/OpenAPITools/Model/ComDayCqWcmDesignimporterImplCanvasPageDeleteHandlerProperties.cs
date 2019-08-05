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
  public class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties {
    /// <summary>
    /// Gets or Sets MinThreadPoolSize
    /// </summary>
    [DataMember(Name="minThreadPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minThreadPoolSize")]
    public ConfigNodePropertyInteger MinThreadPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets MaxThreadPoolSize
    /// </summary>
    [DataMember(Name="maxThreadPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxThreadPoolSize")]
    public ConfigNodePropertyInteger MaxThreadPoolSize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties {\n");
      sb.Append("  MinThreadPoolSize: ").Append(MinThreadPoolSize).Append("\n");
      sb.Append("  MaxThreadPoolSize: ").Append(MaxThreadPoolSize).Append("\n");
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
