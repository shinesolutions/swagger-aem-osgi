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
  public class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
    /// <summary>
    /// Gets or Sets DatasourceName
    /// </summary>
    [DataMember(Name="datasource.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datasource.name")]
    public ConfigNodePropertyString DatasourceName { get; set; }

    /// <summary>
    /// Gets or Sets DatasourceSvcPropName
    /// </summary>
    [DataMember(Name="datasource.svc.prop.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datasource.svc.prop.name")]
    public ConfigNodePropertyString DatasourceSvcPropName { get; set; }

    /// <summary>
    /// Gets or Sets DatasourceJndiName
    /// </summary>
    [DataMember(Name="datasource.jndi.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datasource.jndi.name")]
    public ConfigNodePropertyString DatasourceJndiName { get; set; }

    /// <summary>
    /// Gets or Sets JndiProperties
    /// </summary>
    [DataMember(Name="jndi.properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jndi.properties")]
    public ConfigNodePropertyArray JndiProperties { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {\n");
      sb.Append("  DatasourceName: ").Append(DatasourceName).Append("\n");
      sb.Append("  DatasourceSvcPropName: ").Append(DatasourceSvcPropName).Append("\n");
      sb.Append("  DatasourceJndiName: ").Append(DatasourceJndiName).Append("\n");
      sb.Append("  JndiProperties: ").Append(JndiProperties).Append("\n");
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
