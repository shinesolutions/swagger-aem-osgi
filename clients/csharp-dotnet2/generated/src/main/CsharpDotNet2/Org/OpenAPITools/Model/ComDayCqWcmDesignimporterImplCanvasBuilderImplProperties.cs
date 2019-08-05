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
  public class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {
    /// <summary>
    /// Gets or Sets Filepattern
    /// </summary>
    [DataMember(Name="filepattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filepattern")]
    public ConfigNodePropertyString Filepattern { get; set; }

    /// <summary>
    /// Gets or Sets BuildPageNodes
    /// </summary>
    [DataMember(Name="build.page.nodes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "build.page.nodes")]
    public ConfigNodePropertyBoolean BuildPageNodes { get; set; }

    /// <summary>
    /// Gets or Sets BuildClientLibs
    /// </summary>
    [DataMember(Name="build.client.libs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "build.client.libs")]
    public ConfigNodePropertyBoolean BuildClientLibs { get; set; }

    /// <summary>
    /// Gets or Sets BuildCanvasComponent
    /// </summary>
    [DataMember(Name="build.canvas.component", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "build.canvas.component")]
    public ConfigNodePropertyBoolean BuildCanvasComponent { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {\n");
      sb.Append("  Filepattern: ").Append(Filepattern).Append("\n");
      sb.Append("  BuildPageNodes: ").Append(BuildPageNodes).Append("\n");
      sb.Append("  BuildClientLibs: ").Append(BuildClientLibs).Append("\n");
      sb.Append("  BuildCanvasComponent: ").Append(BuildCanvasComponent).Append("\n");
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
