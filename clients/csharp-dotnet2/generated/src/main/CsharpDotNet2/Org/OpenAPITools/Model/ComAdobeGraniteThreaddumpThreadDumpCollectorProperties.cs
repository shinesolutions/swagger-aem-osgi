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
  public class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {
    /// <summary>
    /// Gets or Sets SchedulerPeriod
    /// </summary>
    [DataMember(Name="scheduler.period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.period")]
    public ConfigNodePropertyInteger SchedulerPeriod { get; set; }

    /// <summary>
    /// Gets or Sets SchedulerRunOn
    /// </summary>
    [DataMember(Name="scheduler.runOn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.runOn")]
    public ConfigNodePropertyDropDown SchedulerRunOn { get; set; }

    /// <summary>
    /// Gets or Sets GraniteThreaddumpEnabled
    /// </summary>
    [DataMember(Name="granite.threaddump.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.threaddump.enabled")]
    public ConfigNodePropertyBoolean GraniteThreaddumpEnabled { get; set; }

    /// <summary>
    /// Gets or Sets GraniteThreaddumpDumpsPerFile
    /// </summary>
    [DataMember(Name="granite.threaddump.dumpsPerFile", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.threaddump.dumpsPerFile")]
    public ConfigNodePropertyInteger GraniteThreaddumpDumpsPerFile { get; set; }

    /// <summary>
    /// Gets or Sets GraniteThreaddumpEnableGzipCompression
    /// </summary>
    [DataMember(Name="granite.threaddump.enableGzipCompression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.threaddump.enableGzipCompression")]
    public ConfigNodePropertyBoolean GraniteThreaddumpEnableGzipCompression { get; set; }

    /// <summary>
    /// Gets or Sets GraniteThreaddumpEnableDirectoriesCompression
    /// </summary>
    [DataMember(Name="granite.threaddump.enableDirectoriesCompression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.threaddump.enableDirectoriesCompression")]
    public ConfigNodePropertyBoolean GraniteThreaddumpEnableDirectoriesCompression { get; set; }

    /// <summary>
    /// Gets or Sets GraniteThreaddumpEnableJStack
    /// </summary>
    [DataMember(Name="granite.threaddump.enableJStack", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.threaddump.enableJStack")]
    public ConfigNodePropertyBoolean GraniteThreaddumpEnableJStack { get; set; }

    /// <summary>
    /// Gets or Sets GraniteThreaddumpMaxBackupDays
    /// </summary>
    [DataMember(Name="granite.threaddump.maxBackupDays", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.threaddump.maxBackupDays")]
    public ConfigNodePropertyInteger GraniteThreaddumpMaxBackupDays { get; set; }

    /// <summary>
    /// Gets or Sets GraniteThreaddumpBackupCleanTrigger
    /// </summary>
    [DataMember(Name="granite.threaddump.backupCleanTrigger", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.threaddump.backupCleanTrigger")]
    public ConfigNodePropertyString GraniteThreaddumpBackupCleanTrigger { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {\n");
      sb.Append("  SchedulerPeriod: ").Append(SchedulerPeriod).Append("\n");
      sb.Append("  SchedulerRunOn: ").Append(SchedulerRunOn).Append("\n");
      sb.Append("  GraniteThreaddumpEnabled: ").Append(GraniteThreaddumpEnabled).Append("\n");
      sb.Append("  GraniteThreaddumpDumpsPerFile: ").Append(GraniteThreaddumpDumpsPerFile).Append("\n");
      sb.Append("  GraniteThreaddumpEnableGzipCompression: ").Append(GraniteThreaddumpEnableGzipCompression).Append("\n");
      sb.Append("  GraniteThreaddumpEnableDirectoriesCompression: ").Append(GraniteThreaddumpEnableDirectoriesCompression).Append("\n");
      sb.Append("  GraniteThreaddumpEnableJStack: ").Append(GraniteThreaddumpEnableJStack).Append("\n");
      sb.Append("  GraniteThreaddumpMaxBackupDays: ").Append(GraniteThreaddumpMaxBackupDays).Append("\n");
      sb.Append("  GraniteThreaddumpBackupCleanTrigger: ").Append(GraniteThreaddumpBackupCleanTrigger).Append("\n");
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
