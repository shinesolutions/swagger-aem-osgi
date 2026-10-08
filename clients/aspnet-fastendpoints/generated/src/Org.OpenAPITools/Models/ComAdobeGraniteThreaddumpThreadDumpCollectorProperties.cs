namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties 
{
    public ConfigNodePropertyInteger SchedulerPeriod { get; set; }
    public ConfigNodePropertyDropDown SchedulerRunOn { get; set; }
    public ConfigNodePropertyBoolean GraniteThreaddumpEnabled { get; set; }
    public ConfigNodePropertyInteger GraniteThreaddumpDumpsPerFile { get; set; }
    public ConfigNodePropertyBoolean GraniteThreaddumpEnableGzipCompression { get; set; }
    public ConfigNodePropertyBoolean GraniteThreaddumpEnableDirectoriesCompression { get; set; }
    public ConfigNodePropertyBoolean GraniteThreaddumpEnableJStack { get; set; }
    public ConfigNodePropertyInteger GraniteThreaddumpMaxBackupDays { get; set; }
    public ConfigNodePropertyString GraniteThreaddumpBackupCleanTrigger { get; set; }
}


