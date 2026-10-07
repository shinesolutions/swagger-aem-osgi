namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComDayCqWcmCoreImplVersionManagerImplProperties 
{
    public ConfigNodePropertyBoolean VersionmanagerCreateVersionOnActivation { get; set; }
    public ConfigNodePropertyBoolean VersionmanagerPurgingEnabled { get; set; }
    public ConfigNodePropertyArray VersionmanagerPurgePaths { get; set; }
    public ConfigNodePropertyArray VersionmanagerIvPaths { get; set; }
    public ConfigNodePropertyInteger VersionmanagerMaxAgeDays { get; set; }
    public ConfigNodePropertyInteger VersionmanagerMaxNumberVersions { get; set; }
    public ConfigNodePropertyInteger VersionmanagerMinNumberVersions { get; set; }
}


