namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties 
{
    public ConfigNodePropertyString Name { get; set; }
    public ConfigNodePropertyInteger MinPoolSize { get; set; }
    public ConfigNodePropertyInteger MaxPoolSize { get; set; }
    public ConfigNodePropertyInteger QueueSize { get; set; }
    public ConfigNodePropertyInteger MaxThreadAge { get; set; }
    public ConfigNodePropertyInteger KeepAliveTime { get; set; }
    public ConfigNodePropertyDropDown BlockPolicy { get; set; }
    public ConfigNodePropertyBoolean ShutdownGraceful { get; set; }
    public ConfigNodePropertyBoolean Daemon { get; set; }
    public ConfigNodePropertyInteger ShutdownWaitTime { get; set; }
    public ConfigNodePropertyDropDown Priority { get; set; }
}


