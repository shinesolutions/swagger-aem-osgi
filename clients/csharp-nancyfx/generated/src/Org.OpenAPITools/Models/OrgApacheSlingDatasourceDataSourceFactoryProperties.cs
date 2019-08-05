using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDatasourceDataSourceFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingDatasourceDataSourceFactoryProperties:  IEquatable<OrgApacheSlingDatasourceDataSourceFactoryProperties>
    { 
        /// <summary>
        /// DatasourceName
        /// </summary>
        public ConfigNodePropertyString DatasourceName { get; private set; }

        /// <summary>
        /// DatasourceSvcPropName
        /// </summary>
        public ConfigNodePropertyString DatasourceSvcPropName { get; private set; }

        /// <summary>
        /// DriverClassName
        /// </summary>
        public ConfigNodePropertyString DriverClassName { get; private set; }

        /// <summary>
        /// Url
        /// </summary>
        public ConfigNodePropertyString Url { get; private set; }

        /// <summary>
        /// Username
        /// </summary>
        public ConfigNodePropertyString Username { get; private set; }

        /// <summary>
        /// Password
        /// </summary>
        public ConfigNodePropertyString Password { get; private set; }

        /// <summary>
        /// DefaultAutoCommit
        /// </summary>
        public ConfigNodePropertyDropDown DefaultAutoCommit { get; private set; }

        /// <summary>
        /// DefaultReadOnly
        /// </summary>
        public ConfigNodePropertyDropDown DefaultReadOnly { get; private set; }

        /// <summary>
        /// DefaultTransactionIsolation
        /// </summary>
        public ConfigNodePropertyDropDown DefaultTransactionIsolation { get; private set; }

        /// <summary>
        /// DefaultCatalog
        /// </summary>
        public ConfigNodePropertyString DefaultCatalog { get; private set; }

        /// <summary>
        /// MaxActive
        /// </summary>
        public ConfigNodePropertyInteger MaxActive { get; private set; }

        /// <summary>
        /// MaxIdle
        /// </summary>
        public ConfigNodePropertyInteger MaxIdle { get; private set; }

        /// <summary>
        /// MinIdle
        /// </summary>
        public ConfigNodePropertyInteger MinIdle { get; private set; }

        /// <summary>
        /// InitialSize
        /// </summary>
        public ConfigNodePropertyInteger InitialSize { get; private set; }

        /// <summary>
        /// MaxWait
        /// </summary>
        public ConfigNodePropertyInteger MaxWait { get; private set; }

        /// <summary>
        /// MaxAge
        /// </summary>
        public ConfigNodePropertyInteger MaxAge { get; private set; }

        /// <summary>
        /// TestOnBorrow
        /// </summary>
        public ConfigNodePropertyBoolean TestOnBorrow { get; private set; }

        /// <summary>
        /// TestOnReturn
        /// </summary>
        public ConfigNodePropertyBoolean TestOnReturn { get; private set; }

        /// <summary>
        /// TestWhileIdle
        /// </summary>
        public ConfigNodePropertyBoolean TestWhileIdle { get; private set; }

        /// <summary>
        /// ValidationQuery
        /// </summary>
        public ConfigNodePropertyString ValidationQuery { get; private set; }

        /// <summary>
        /// ValidationQueryTimeout
        /// </summary>
        public ConfigNodePropertyInteger ValidationQueryTimeout { get; private set; }

        /// <summary>
        /// TimeBetweenEvictionRunsMillis
        /// </summary>
        public ConfigNodePropertyInteger TimeBetweenEvictionRunsMillis { get; private set; }

        /// <summary>
        /// MinEvictableIdleTimeMillis
        /// </summary>
        public ConfigNodePropertyInteger MinEvictableIdleTimeMillis { get; private set; }

        /// <summary>
        /// ConnectionProperties
        /// </summary>
        public ConfigNodePropertyString ConnectionProperties { get; private set; }

        /// <summary>
        /// InitSQL
        /// </summary>
        public ConfigNodePropertyString InitSQL { get; private set; }

        /// <summary>
        /// JdbcInterceptors
        /// </summary>
        public ConfigNodePropertyString JdbcInterceptors { get; private set; }

        /// <summary>
        /// ValidationInterval
        /// </summary>
        public ConfigNodePropertyInteger ValidationInterval { get; private set; }

        /// <summary>
        /// LogValidationErrors
        /// </summary>
        public ConfigNodePropertyBoolean LogValidationErrors { get; private set; }

        /// <summary>
        /// DatasourceSvcProperties
        /// </summary>
        public ConfigNodePropertyArray DatasourceSvcProperties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDatasourceDataSourceFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDatasourceDataSourceFactoryProperties()
        {
        }

        private OrgApacheSlingDatasourceDataSourceFactoryProperties(ConfigNodePropertyString DatasourceName, ConfigNodePropertyString DatasourceSvcPropName, ConfigNodePropertyString DriverClassName, ConfigNodePropertyString Url, ConfigNodePropertyString Username, ConfigNodePropertyString Password, ConfigNodePropertyDropDown DefaultAutoCommit, ConfigNodePropertyDropDown DefaultReadOnly, ConfigNodePropertyDropDown DefaultTransactionIsolation, ConfigNodePropertyString DefaultCatalog, ConfigNodePropertyInteger MaxActive, ConfigNodePropertyInteger MaxIdle, ConfigNodePropertyInteger MinIdle, ConfigNodePropertyInteger InitialSize, ConfigNodePropertyInteger MaxWait, ConfigNodePropertyInteger MaxAge, ConfigNodePropertyBoolean TestOnBorrow, ConfigNodePropertyBoolean TestOnReturn, ConfigNodePropertyBoolean TestWhileIdle, ConfigNodePropertyString ValidationQuery, ConfigNodePropertyInteger ValidationQueryTimeout, ConfigNodePropertyInteger TimeBetweenEvictionRunsMillis, ConfigNodePropertyInteger MinEvictableIdleTimeMillis, ConfigNodePropertyString ConnectionProperties, ConfigNodePropertyString InitSQL, ConfigNodePropertyString JdbcInterceptors, ConfigNodePropertyInteger ValidationInterval, ConfigNodePropertyBoolean LogValidationErrors, ConfigNodePropertyArray DatasourceSvcProperties)
        {
            
            this.DatasourceName = DatasourceName;
            
            this.DatasourceSvcPropName = DatasourceSvcPropName;
            
            this.DriverClassName = DriverClassName;
            
            this.Url = Url;
            
            this.Username = Username;
            
            this.Password = Password;
            
            this.DefaultAutoCommit = DefaultAutoCommit;
            
            this.DefaultReadOnly = DefaultReadOnly;
            
            this.DefaultTransactionIsolation = DefaultTransactionIsolation;
            
            this.DefaultCatalog = DefaultCatalog;
            
            this.MaxActive = MaxActive;
            
            this.MaxIdle = MaxIdle;
            
            this.MinIdle = MinIdle;
            
            this.InitialSize = InitialSize;
            
            this.MaxWait = MaxWait;
            
            this.MaxAge = MaxAge;
            
            this.TestOnBorrow = TestOnBorrow;
            
            this.TestOnReturn = TestOnReturn;
            
            this.TestWhileIdle = TestWhileIdle;
            
            this.ValidationQuery = ValidationQuery;
            
            this.ValidationQueryTimeout = ValidationQueryTimeout;
            
            this.TimeBetweenEvictionRunsMillis = TimeBetweenEvictionRunsMillis;
            
            this.MinEvictableIdleTimeMillis = MinEvictableIdleTimeMillis;
            
            this.ConnectionProperties = ConnectionProperties;
            
            this.InitSQL = InitSQL;
            
            this.JdbcInterceptors = JdbcInterceptors;
            
            this.ValidationInterval = ValidationInterval;
            
            this.LogValidationErrors = LogValidationErrors;
            
            this.DatasourceSvcProperties = DatasourceSvcProperties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDatasourceDataSourceFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder</returns>
        public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder With()
        {
            return Builder()
                .DatasourceName(DatasourceName)
                .DatasourceSvcPropName(DatasourceSvcPropName)
                .DriverClassName(DriverClassName)
                .Url(Url)
                .Username(Username)
                .Password(Password)
                .DefaultAutoCommit(DefaultAutoCommit)
                .DefaultReadOnly(DefaultReadOnly)
                .DefaultTransactionIsolation(DefaultTransactionIsolation)
                .DefaultCatalog(DefaultCatalog)
                .MaxActive(MaxActive)
                .MaxIdle(MaxIdle)
                .MinIdle(MinIdle)
                .InitialSize(InitialSize)
                .MaxWait(MaxWait)
                .MaxAge(MaxAge)
                .TestOnBorrow(TestOnBorrow)
                .TestOnReturn(TestOnReturn)
                .TestWhileIdle(TestWhileIdle)
                .ValidationQuery(ValidationQuery)
                .ValidationQueryTimeout(ValidationQueryTimeout)
                .TimeBetweenEvictionRunsMillis(TimeBetweenEvictionRunsMillis)
                .MinEvictableIdleTimeMillis(MinEvictableIdleTimeMillis)
                .ConnectionProperties(ConnectionProperties)
                .InitSQL(InitSQL)
                .JdbcInterceptors(JdbcInterceptors)
                .ValidationInterval(ValidationInterval)
                .LogValidationErrors(LogValidationErrors)
                .DatasourceSvcProperties(DatasourceSvcProperties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDatasourceDataSourceFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDatasourceDataSourceFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDatasourceDataSourceFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDatasourceDataSourceFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDatasourceDataSourceFactoryProperties left, OrgApacheSlingDatasourceDataSourceFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDatasourceDataSourceFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDatasourceDataSourceFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDatasourceDataSourceFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDatasourceDataSourceFactoryProperties left, OrgApacheSlingDatasourceDataSourceFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDatasourceDataSourceFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _DatasourceName;
            private ConfigNodePropertyString _DatasourceSvcPropName;
            private ConfigNodePropertyString _DriverClassName;
            private ConfigNodePropertyString _Url;
            private ConfigNodePropertyString _Username;
            private ConfigNodePropertyString _Password;
            private ConfigNodePropertyDropDown _DefaultAutoCommit;
            private ConfigNodePropertyDropDown _DefaultReadOnly;
            private ConfigNodePropertyDropDown _DefaultTransactionIsolation;
            private ConfigNodePropertyString _DefaultCatalog;
            private ConfigNodePropertyInteger _MaxActive;
            private ConfigNodePropertyInteger _MaxIdle;
            private ConfigNodePropertyInteger _MinIdle;
            private ConfigNodePropertyInteger _InitialSize;
            private ConfigNodePropertyInteger _MaxWait;
            private ConfigNodePropertyInteger _MaxAge;
            private ConfigNodePropertyBoolean _TestOnBorrow;
            private ConfigNodePropertyBoolean _TestOnReturn;
            private ConfigNodePropertyBoolean _TestWhileIdle;
            private ConfigNodePropertyString _ValidationQuery;
            private ConfigNodePropertyInteger _ValidationQueryTimeout;
            private ConfigNodePropertyInteger _TimeBetweenEvictionRunsMillis;
            private ConfigNodePropertyInteger _MinEvictableIdleTimeMillis;
            private ConfigNodePropertyString _ConnectionProperties;
            private ConfigNodePropertyString _InitSQL;
            private ConfigNodePropertyString _JdbcInterceptors;
            private ConfigNodePropertyInteger _ValidationInterval;
            private ConfigNodePropertyBoolean _LogValidationErrors;
            private ConfigNodePropertyArray _DatasourceSvcProperties;

            internal OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.DatasourceName property.
            /// </summary>
            /// <param name="value">DatasourceName</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder DatasourceName(ConfigNodePropertyString value)
            {
                _DatasourceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.DatasourceSvcPropName property.
            /// </summary>
            /// <param name="value">DatasourceSvcPropName</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder DatasourceSvcPropName(ConfigNodePropertyString value)
            {
                _DatasourceSvcPropName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.DriverClassName property.
            /// </summary>
            /// <param name="value">DriverClassName</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder DriverClassName(ConfigNodePropertyString value)
            {
                _DriverClassName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.Url property.
            /// </summary>
            /// <param name="value">Url</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder Url(ConfigNodePropertyString value)
            {
                _Url = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.Username property.
            /// </summary>
            /// <param name="value">Username</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder Username(ConfigNodePropertyString value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.Password property.
            /// </summary>
            /// <param name="value">Password</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder Password(ConfigNodePropertyString value)
            {
                _Password = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.DefaultAutoCommit property.
            /// </summary>
            /// <param name="value">DefaultAutoCommit</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder DefaultAutoCommit(ConfigNodePropertyDropDown value)
            {
                _DefaultAutoCommit = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.DefaultReadOnly property.
            /// </summary>
            /// <param name="value">DefaultReadOnly</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder DefaultReadOnly(ConfigNodePropertyDropDown value)
            {
                _DefaultReadOnly = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.DefaultTransactionIsolation property.
            /// </summary>
            /// <param name="value">DefaultTransactionIsolation</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder DefaultTransactionIsolation(ConfigNodePropertyDropDown value)
            {
                _DefaultTransactionIsolation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.DefaultCatalog property.
            /// </summary>
            /// <param name="value">DefaultCatalog</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder DefaultCatalog(ConfigNodePropertyString value)
            {
                _DefaultCatalog = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.MaxActive property.
            /// </summary>
            /// <param name="value">MaxActive</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder MaxActive(ConfigNodePropertyInteger value)
            {
                _MaxActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.MaxIdle property.
            /// </summary>
            /// <param name="value">MaxIdle</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder MaxIdle(ConfigNodePropertyInteger value)
            {
                _MaxIdle = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.MinIdle property.
            /// </summary>
            /// <param name="value">MinIdle</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder MinIdle(ConfigNodePropertyInteger value)
            {
                _MinIdle = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.InitialSize property.
            /// </summary>
            /// <param name="value">InitialSize</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder InitialSize(ConfigNodePropertyInteger value)
            {
                _InitialSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.MaxWait property.
            /// </summary>
            /// <param name="value">MaxWait</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder MaxWait(ConfigNodePropertyInteger value)
            {
                _MaxWait = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.MaxAge property.
            /// </summary>
            /// <param name="value">MaxAge</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder MaxAge(ConfigNodePropertyInteger value)
            {
                _MaxAge = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.TestOnBorrow property.
            /// </summary>
            /// <param name="value">TestOnBorrow</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder TestOnBorrow(ConfigNodePropertyBoolean value)
            {
                _TestOnBorrow = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.TestOnReturn property.
            /// </summary>
            /// <param name="value">TestOnReturn</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder TestOnReturn(ConfigNodePropertyBoolean value)
            {
                _TestOnReturn = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.TestWhileIdle property.
            /// </summary>
            /// <param name="value">TestWhileIdle</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder TestWhileIdle(ConfigNodePropertyBoolean value)
            {
                _TestWhileIdle = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.ValidationQuery property.
            /// </summary>
            /// <param name="value">ValidationQuery</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder ValidationQuery(ConfigNodePropertyString value)
            {
                _ValidationQuery = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.ValidationQueryTimeout property.
            /// </summary>
            /// <param name="value">ValidationQueryTimeout</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder ValidationQueryTimeout(ConfigNodePropertyInteger value)
            {
                _ValidationQueryTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.TimeBetweenEvictionRunsMillis property.
            /// </summary>
            /// <param name="value">TimeBetweenEvictionRunsMillis</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder TimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger value)
            {
                _TimeBetweenEvictionRunsMillis = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.MinEvictableIdleTimeMillis property.
            /// </summary>
            /// <param name="value">MinEvictableIdleTimeMillis</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder MinEvictableIdleTimeMillis(ConfigNodePropertyInteger value)
            {
                _MinEvictableIdleTimeMillis = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.ConnectionProperties property.
            /// </summary>
            /// <param name="value">ConnectionProperties</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder ConnectionProperties(ConfigNodePropertyString value)
            {
                _ConnectionProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.InitSQL property.
            /// </summary>
            /// <param name="value">InitSQL</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder InitSQL(ConfigNodePropertyString value)
            {
                _InitSQL = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.JdbcInterceptors property.
            /// </summary>
            /// <param name="value">JdbcInterceptors</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder JdbcInterceptors(ConfigNodePropertyString value)
            {
                _JdbcInterceptors = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.ValidationInterval property.
            /// </summary>
            /// <param name="value">ValidationInterval</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder ValidationInterval(ConfigNodePropertyInteger value)
            {
                _ValidationInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.LogValidationErrors property.
            /// </summary>
            /// <param name="value">LogValidationErrors</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder LogValidationErrors(ConfigNodePropertyBoolean value)
            {
                _LogValidationErrors = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryProperties.DatasourceSvcProperties property.
            /// </summary>
            /// <param name="value">DatasourceSvcProperties</param>
            public OrgApacheSlingDatasourceDataSourceFactoryPropertiesBuilder DatasourceSvcProperties(ConfigNodePropertyArray value)
            {
                _DatasourceSvcProperties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDatasourceDataSourceFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDatasourceDataSourceFactoryProperties</returns>
            public OrgApacheSlingDatasourceDataSourceFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingDatasourceDataSourceFactoryProperties(
                    DatasourceName: _DatasourceName,
                    DatasourceSvcPropName: _DatasourceSvcPropName,
                    DriverClassName: _DriverClassName,
                    Url: _Url,
                    Username: _Username,
                    Password: _Password,
                    DefaultAutoCommit: _DefaultAutoCommit,
                    DefaultReadOnly: _DefaultReadOnly,
                    DefaultTransactionIsolation: _DefaultTransactionIsolation,
                    DefaultCatalog: _DefaultCatalog,
                    MaxActive: _MaxActive,
                    MaxIdle: _MaxIdle,
                    MinIdle: _MinIdle,
                    InitialSize: _InitialSize,
                    MaxWait: _MaxWait,
                    MaxAge: _MaxAge,
                    TestOnBorrow: _TestOnBorrow,
                    TestOnReturn: _TestOnReturn,
                    TestWhileIdle: _TestWhileIdle,
                    ValidationQuery: _ValidationQuery,
                    ValidationQueryTimeout: _ValidationQueryTimeout,
                    TimeBetweenEvictionRunsMillis: _TimeBetweenEvictionRunsMillis,
                    MinEvictableIdleTimeMillis: _MinEvictableIdleTimeMillis,
                    ConnectionProperties: _ConnectionProperties,
                    InitSQL: _InitSQL,
                    JdbcInterceptors: _JdbcInterceptors,
                    ValidationInterval: _ValidationInterval,
                    LogValidationErrors: _LogValidationErrors,
                    DatasourceSvcProperties: _DatasourceSvcProperties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}