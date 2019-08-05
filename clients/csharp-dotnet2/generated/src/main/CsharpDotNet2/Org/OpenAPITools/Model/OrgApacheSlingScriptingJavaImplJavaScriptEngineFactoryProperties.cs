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
  public class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {
    /// <summary>
    /// Gets or Sets JavaClassdebuginfo
    /// </summary>
    [DataMember(Name="java.classdebuginfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "java.classdebuginfo")]
    public ConfigNodePropertyBoolean JavaClassdebuginfo { get; set; }

    /// <summary>
    /// Gets or Sets JavaJavaEncoding
    /// </summary>
    [DataMember(Name="java.javaEncoding", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "java.javaEncoding")]
    public ConfigNodePropertyString JavaJavaEncoding { get; set; }

    /// <summary>
    /// Gets or Sets JavaCompilerSourceVM
    /// </summary>
    [DataMember(Name="java.compilerSourceVM", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "java.compilerSourceVM")]
    public ConfigNodePropertyString JavaCompilerSourceVM { get; set; }

    /// <summary>
    /// Gets or Sets JavaCompilerTargetVM
    /// </summary>
    [DataMember(Name="java.compilerTargetVM", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "java.compilerTargetVM")]
    public ConfigNodePropertyString JavaCompilerTargetVM { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {\n");
      sb.Append("  JavaClassdebuginfo: ").Append(JavaClassdebuginfo).Append("\n");
      sb.Append("  JavaJavaEncoding: ").Append(JavaJavaEncoding).Append("\n");
      sb.Append("  JavaCompilerSourceVM: ").Append(JavaCompilerSourceVM).Append("\n");
      sb.Append("  JavaCompilerTargetVM: ").Append(JavaCompilerTargetVM).Append("\n");
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
