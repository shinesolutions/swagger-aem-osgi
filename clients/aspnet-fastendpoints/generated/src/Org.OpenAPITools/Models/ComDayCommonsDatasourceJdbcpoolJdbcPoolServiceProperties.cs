namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties 
{
    public ConfigNodePropertyString JdbcDriverClass { get; set; }
    public ConfigNodePropertyString JdbcConnectionUri { get; set; }
    public ConfigNodePropertyString JdbcUsername { get; set; }
    public ConfigNodePropertyString JdbcPassword { get; set; }
    public ConfigNodePropertyString JdbcValidationQuery { get; set; }
    public ConfigNodePropertyBoolean DefaultReadonly { get; set; }
    public ConfigNodePropertyBoolean DefaultAutocommit { get; set; }
    public ConfigNodePropertyInteger PoolSize { get; set; }
    public ConfigNodePropertyInteger PoolMaxWaitMsec { get; set; }
    public ConfigNodePropertyString DatasourceName { get; set; }
    public ConfigNodePropertyArray DatasourceSvcProperties { get; set; }
}


