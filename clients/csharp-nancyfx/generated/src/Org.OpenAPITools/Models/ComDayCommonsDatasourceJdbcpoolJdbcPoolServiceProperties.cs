using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
    /// </summary>
    public sealed class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties:  IEquatable<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties>
    { 
        /// <summary>
        /// JdbcDriverClass
        /// </summary>
        public ConfigNodePropertyString JdbcDriverClass { get; private set; }

        /// <summary>
        /// JdbcConnectionUri
        /// </summary>
        public ConfigNodePropertyString JdbcConnectionUri { get; private set; }

        /// <summary>
        /// JdbcUsername
        /// </summary>
        public ConfigNodePropertyString JdbcUsername { get; private set; }

        /// <summary>
        /// JdbcPassword
        /// </summary>
        public ConfigNodePropertyString JdbcPassword { get; private set; }

        /// <summary>
        /// JdbcValidationQuery
        /// </summary>
        public ConfigNodePropertyString JdbcValidationQuery { get; private set; }

        /// <summary>
        /// DefaultReadonly
        /// </summary>
        public ConfigNodePropertyBoolean DefaultReadonly { get; private set; }

        /// <summary>
        /// DefaultAutocommit
        /// </summary>
        public ConfigNodePropertyBoolean DefaultAutocommit { get; private set; }

        /// <summary>
        /// PoolSize
        /// </summary>
        public ConfigNodePropertyInteger PoolSize { get; private set; }

        /// <summary>
        /// PoolMaxWaitMsec
        /// </summary>
        public ConfigNodePropertyInteger PoolMaxWaitMsec { get; private set; }

        /// <summary>
        /// DatasourceName
        /// </summary>
        public ConfigNodePropertyString DatasourceName { get; private set; }

        /// <summary>
        /// DatasourceSvcProperties
        /// </summary>
        public ConfigNodePropertyArray DatasourceSvcProperties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties()
        {
        }

        private ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(ConfigNodePropertyString JdbcDriverClass, ConfigNodePropertyString JdbcConnectionUri, ConfigNodePropertyString JdbcUsername, ConfigNodePropertyString JdbcPassword, ConfigNodePropertyString JdbcValidationQuery, ConfigNodePropertyBoolean DefaultReadonly, ConfigNodePropertyBoolean DefaultAutocommit, ConfigNodePropertyInteger PoolSize, ConfigNodePropertyInteger PoolMaxWaitMsec, ConfigNodePropertyString DatasourceName, ConfigNodePropertyArray DatasourceSvcProperties)
        {
            
            this.JdbcDriverClass = JdbcDriverClass;
            
            this.JdbcConnectionUri = JdbcConnectionUri;
            
            this.JdbcUsername = JdbcUsername;
            
            this.JdbcPassword = JdbcPassword;
            
            this.JdbcValidationQuery = JdbcValidationQuery;
            
            this.DefaultReadonly = DefaultReadonly;
            
            this.DefaultAutocommit = DefaultAutocommit;
            
            this.PoolSize = PoolSize;
            
            this.PoolMaxWaitMsec = PoolMaxWaitMsec;
            
            this.DatasourceName = DatasourceName;
            
            this.DatasourceSvcProperties = DatasourceSvcProperties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.
        /// </summary>
        /// <returns>ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder</returns>
        public static ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder Builder()
        {
            return new ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder</returns>
        public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder With()
        {
            return Builder()
                .JdbcDriverClass(JdbcDriverClass)
                .JdbcConnectionUri(JdbcConnectionUri)
                .JdbcUsername(JdbcUsername)
                .JdbcPassword(JdbcPassword)
                .JdbcValidationQuery(JdbcValidationQuery)
                .DefaultReadonly(DefaultReadonly)
                .DefaultAutocommit(DefaultAutocommit)
                .PoolSize(PoolSize)
                .PoolMaxWaitMsec(PoolMaxWaitMsec)
                .DatasourceName(DatasourceName)
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

        public bool Equals(ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties</param>
        /// <param name="right">Compared (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties left, ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties</param>
        /// <param name="right">Compared (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties left, ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.
        /// </summary>
        public sealed class ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder
        {
            private ConfigNodePropertyString _JdbcDriverClass;
            private ConfigNodePropertyString _JdbcConnectionUri;
            private ConfigNodePropertyString _JdbcUsername;
            private ConfigNodePropertyString _JdbcPassword;
            private ConfigNodePropertyString _JdbcValidationQuery;
            private ConfigNodePropertyBoolean _DefaultReadonly;
            private ConfigNodePropertyBoolean _DefaultAutocommit;
            private ConfigNodePropertyInteger _PoolSize;
            private ConfigNodePropertyInteger _PoolMaxWaitMsec;
            private ConfigNodePropertyString _DatasourceName;
            private ConfigNodePropertyArray _DatasourceSvcProperties;

            internal ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.JdbcDriverClass property.
            /// </summary>
            /// <param name="value">JdbcDriverClass</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder JdbcDriverClass(ConfigNodePropertyString value)
            {
                _JdbcDriverClass = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.JdbcConnectionUri property.
            /// </summary>
            /// <param name="value">JdbcConnectionUri</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder JdbcConnectionUri(ConfigNodePropertyString value)
            {
                _JdbcConnectionUri = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.JdbcUsername property.
            /// </summary>
            /// <param name="value">JdbcUsername</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder JdbcUsername(ConfigNodePropertyString value)
            {
                _JdbcUsername = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.JdbcPassword property.
            /// </summary>
            /// <param name="value">JdbcPassword</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder JdbcPassword(ConfigNodePropertyString value)
            {
                _JdbcPassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.JdbcValidationQuery property.
            /// </summary>
            /// <param name="value">JdbcValidationQuery</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder JdbcValidationQuery(ConfigNodePropertyString value)
            {
                _JdbcValidationQuery = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.DefaultReadonly property.
            /// </summary>
            /// <param name="value">DefaultReadonly</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder DefaultReadonly(ConfigNodePropertyBoolean value)
            {
                _DefaultReadonly = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.DefaultAutocommit property.
            /// </summary>
            /// <param name="value">DefaultAutocommit</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder DefaultAutocommit(ConfigNodePropertyBoolean value)
            {
                _DefaultAutocommit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.PoolSize property.
            /// </summary>
            /// <param name="value">PoolSize</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder PoolSize(ConfigNodePropertyInteger value)
            {
                _PoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.PoolMaxWaitMsec property.
            /// </summary>
            /// <param name="value">PoolMaxWaitMsec</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder PoolMaxWaitMsec(ConfigNodePropertyInteger value)
            {
                _PoolMaxWaitMsec = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.DatasourceName property.
            /// </summary>
            /// <param name="value">DatasourceName</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder DatasourceName(ConfigNodePropertyString value)
            {
                _DatasourceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.DatasourceSvcProperties property.
            /// </summary>
            /// <param name="value">DatasourceSvcProperties</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesBuilder DatasourceSvcProperties(ConfigNodePropertyArray value)
            {
                _DatasourceSvcProperties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.
            /// </summary>
            /// <returns>ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties</returns>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties Build()
            {
                Validate();
                return new ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(
                    JdbcDriverClass: _JdbcDriverClass,
                    JdbcConnectionUri: _JdbcConnectionUri,
                    JdbcUsername: _JdbcUsername,
                    JdbcPassword: _JdbcPassword,
                    JdbcValidationQuery: _JdbcValidationQuery,
                    DefaultReadonly: _DefaultReadonly,
                    DefaultAutocommit: _DefaultAutocommit,
                    PoolSize: _PoolSize,
                    PoolMaxWaitMsec: _PoolMaxWaitMsec,
                    DatasourceName: _DatasourceName,
                    DatasourceSvcProperties: _DatasourceSvcProperties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}