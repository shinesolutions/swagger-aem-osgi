namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingTracerInternalLogTracerProperties 
{
    public ConfigNodePropertyArray TracerSets { get; set; }
    public ConfigNodePropertyBoolean Enabled { get; set; }
    public ConfigNodePropertyBoolean ServletEnabled { get; set; }
    public ConfigNodePropertyInteger RecordingCacheSizeInMB { get; set; }
    public ConfigNodePropertyInteger RecordingCacheDurationInSecs { get; set; }
    public ConfigNodePropertyBoolean RecordingCompressionEnabled { get; set; }
    public ConfigNodePropertyBoolean GzipResponse { get; set; }
}


