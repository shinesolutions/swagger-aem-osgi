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
  public class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
    /// <summary>
    /// Gets or Sets ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath")]
    public ConfigNodePropertyArray ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency")]
    public ConfigNodePropertyString ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {\n");
      sb.Append("  ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath: ").Append(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath).Append("\n");
      sb.Append("  ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency: ").Append(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency).Append("\n");
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
