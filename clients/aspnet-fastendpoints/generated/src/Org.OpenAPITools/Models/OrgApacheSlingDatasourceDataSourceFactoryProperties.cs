namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingDatasourceDataSourceFactoryProperties 
{
    public ConfigNodePropertyString DatasourceName { get; set; }
    public ConfigNodePropertyString DatasourceSvcPropName { get; set; }
    public ConfigNodePropertyString DriverClassName { get; set; }
    public ConfigNodePropertyString Url { get; set; }
    public ConfigNodePropertyString Username { get; set; }
    public ConfigNodePropertyString Password { get; set; }
    public ConfigNodePropertyDropDown DefaultAutoCommit { get; set; }
    public ConfigNodePropertyDropDown DefaultReadOnly { get; set; }
    public ConfigNodePropertyDropDown DefaultTransactionIsolation { get; set; }
    public ConfigNodePropertyString DefaultCatalog { get; set; }
    public ConfigNodePropertyInteger MaxActive { get; set; }
    public ConfigNodePropertyInteger MaxIdle { get; set; }
    public ConfigNodePropertyInteger MinIdle { get; set; }
    public ConfigNodePropertyInteger InitialSize { get; set; }
    public ConfigNodePropertyInteger MaxWait { get; set; }
    public ConfigNodePropertyInteger MaxAge { get; set; }
    public ConfigNodePropertyBoolean TestOnBorrow { get; set; }
    public ConfigNodePropertyBoolean TestOnReturn { get; set; }
    public ConfigNodePropertyBoolean TestWhileIdle { get; set; }
    public ConfigNodePropertyString ValidationQuery { get; set; }
    public ConfigNodePropertyInteger ValidationQueryTimeout { get; set; }
    public ConfigNodePropertyInteger TimeBetweenEvictionRunsMillis { get; set; }
    public ConfigNodePropertyInteger MinEvictableIdleTimeMillis { get; set; }
    public ConfigNodePropertyString ConnectionProperties { get; set; }
    public ConfigNodePropertyString InitSQL { get; set; }
    public ConfigNodePropertyString JdbcInterceptors { get; set; }
    public ConfigNodePropertyInteger ValidationInterval { get; set; }
    public ConfigNodePropertyBoolean LogValidationErrors { get; set; }
    public ConfigNodePropertyArray DatasourceSvcProperties { get; set; }
}


