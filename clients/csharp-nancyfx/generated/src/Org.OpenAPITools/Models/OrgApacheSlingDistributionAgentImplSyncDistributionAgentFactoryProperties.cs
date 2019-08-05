using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties:  IEquatable<OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public ConfigNodePropertyString Title { get; private set; }

        /// <summary>
        /// Details
        /// </summary>
        public ConfigNodePropertyString Details { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }

        /// <summary>
        /// LogLevel
        /// </summary>
        public ConfigNodePropertyDropDown LogLevel { get; private set; }

        /// <summary>
        /// QueueProcessingEnabled
        /// </summary>
        public ConfigNodePropertyBoolean QueueProcessingEnabled { get; private set; }

        /// <summary>
        /// PassiveQueues
        /// </summary>
        public ConfigNodePropertyArray PassiveQueues { get; private set; }

        /// <summary>
        /// PackageExporterEndpoints
        /// </summary>
        public ConfigNodePropertyArray PackageExporterEndpoints { get; private set; }

        /// <summary>
        /// PackageImporterEndpoints
        /// </summary>
        public ConfigNodePropertyArray PackageImporterEndpoints { get; private set; }

        /// <summary>
        /// RetryStrategy
        /// </summary>
        public ConfigNodePropertyDropDown RetryStrategy { get; private set; }

        /// <summary>
        /// RetryAttempts
        /// </summary>
        public ConfigNodePropertyInteger RetryAttempts { get; private set; }

        /// <summary>
        /// PullItems
        /// </summary>
        public ConfigNodePropertyInteger PullItems { get; private set; }

        /// <summary>
        /// HttpConnTimeout
        /// </summary>
        public ConfigNodePropertyInteger HttpConnTimeout { get; private set; }

        /// <summary>
        /// RequestAuthorizationStrategyTarget
        /// </summary>
        public ConfigNodePropertyString RequestAuthorizationStrategyTarget { get; private set; }

        /// <summary>
        /// TransportSecretProviderTarget
        /// </summary>
        public ConfigNodePropertyString TransportSecretProviderTarget { get; private set; }

        /// <summary>
        /// PackageBuilderTarget
        /// </summary>
        public ConfigNodePropertyString PackageBuilderTarget { get; private set; }

        /// <summary>
        /// TriggersTarget
        /// </summary>
        public ConfigNodePropertyString TriggersTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties()
        {
        }

        private OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Title, ConfigNodePropertyString Details, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString ServiceName, ConfigNodePropertyDropDown LogLevel, ConfigNodePropertyBoolean QueueProcessingEnabled, ConfigNodePropertyArray PassiveQueues, ConfigNodePropertyArray PackageExporterEndpoints, ConfigNodePropertyArray PackageImporterEndpoints, ConfigNodePropertyDropDown RetryStrategy, ConfigNodePropertyInteger RetryAttempts, ConfigNodePropertyInteger PullItems, ConfigNodePropertyInteger HttpConnTimeout, ConfigNodePropertyString RequestAuthorizationStrategyTarget, ConfigNodePropertyString TransportSecretProviderTarget, ConfigNodePropertyString PackageBuilderTarget, ConfigNodePropertyString TriggersTarget)
        {
            
            this.Name = Name;
            
            this.Title = Title;
            
            this.Details = Details;
            
            this.Enabled = Enabled;
            
            this.ServiceName = ServiceName;
            
            this.LogLevel = LogLevel;
            
            this.QueueProcessingEnabled = QueueProcessingEnabled;
            
            this.PassiveQueues = PassiveQueues;
            
            this.PackageExporterEndpoints = PackageExporterEndpoints;
            
            this.PackageImporterEndpoints = PackageImporterEndpoints;
            
            this.RetryStrategy = RetryStrategy;
            
            this.RetryAttempts = RetryAttempts;
            
            this.PullItems = PullItems;
            
            this.HttpConnTimeout = HttpConnTimeout;
            
            this.RequestAuthorizationStrategyTarget = RequestAuthorizationStrategyTarget;
            
            this.TransportSecretProviderTarget = TransportSecretProviderTarget;
            
            this.PackageBuilderTarget = PackageBuilderTarget;
            
            this.TriggersTarget = TriggersTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder</returns>
        public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Title(Title)
                .Details(Details)
                .Enabled(Enabled)
                .ServiceName(ServiceName)
                .LogLevel(LogLevel)
                .QueueProcessingEnabled(QueueProcessingEnabled)
                .PassiveQueues(PassiveQueues)
                .PackageExporterEndpoints(PackageExporterEndpoints)
                .PackageImporterEndpoints(PackageImporterEndpoints)
                .RetryStrategy(RetryStrategy)
                .RetryAttempts(RetryAttempts)
                .PullItems(PullItems)
                .HttpConnTimeout(HttpConnTimeout)
                .RequestAuthorizationStrategyTarget(RequestAuthorizationStrategyTarget)
                .TransportSecretProviderTarget(TransportSecretProviderTarget)
                .PackageBuilderTarget(PackageBuilderTarget)
                .TriggersTarget(TriggersTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties left, OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties left, OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Title;
            private ConfigNodePropertyString _Details;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyDropDown _LogLevel;
            private ConfigNodePropertyBoolean _QueueProcessingEnabled;
            private ConfigNodePropertyArray _PassiveQueues;
            private ConfigNodePropertyArray _PackageExporterEndpoints;
            private ConfigNodePropertyArray _PackageImporterEndpoints;
            private ConfigNodePropertyDropDown _RetryStrategy;
            private ConfigNodePropertyInteger _RetryAttempts;
            private ConfigNodePropertyInteger _PullItems;
            private ConfigNodePropertyInteger _HttpConnTimeout;
            private ConfigNodePropertyString _RequestAuthorizationStrategyTarget;
            private ConfigNodePropertyString _TransportSecretProviderTarget;
            private ConfigNodePropertyString _PackageBuilderTarget;
            private ConfigNodePropertyString _TriggersTarget;

            internal OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder Title(ConfigNodePropertyString value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.Details property.
            /// </summary>
            /// <param name="value">Details</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder Details(ConfigNodePropertyString value)
            {
                _Details = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.LogLevel property.
            /// </summary>
            /// <param name="value">LogLevel</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder LogLevel(ConfigNodePropertyDropDown value)
            {
                _LogLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.QueueProcessingEnabled property.
            /// </summary>
            /// <param name="value">QueueProcessingEnabled</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder QueueProcessingEnabled(ConfigNodePropertyBoolean value)
            {
                _QueueProcessingEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.PassiveQueues property.
            /// </summary>
            /// <param name="value">PassiveQueues</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder PassiveQueues(ConfigNodePropertyArray value)
            {
                _PassiveQueues = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.PackageExporterEndpoints property.
            /// </summary>
            /// <param name="value">PackageExporterEndpoints</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder PackageExporterEndpoints(ConfigNodePropertyArray value)
            {
                _PackageExporterEndpoints = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.PackageImporterEndpoints property.
            /// </summary>
            /// <param name="value">PackageImporterEndpoints</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder PackageImporterEndpoints(ConfigNodePropertyArray value)
            {
                _PackageImporterEndpoints = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.RetryStrategy property.
            /// </summary>
            /// <param name="value">RetryStrategy</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder RetryStrategy(ConfigNodePropertyDropDown value)
            {
                _RetryStrategy = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.RetryAttempts property.
            /// </summary>
            /// <param name="value">RetryAttempts</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder RetryAttempts(ConfigNodePropertyInteger value)
            {
                _RetryAttempts = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.PullItems property.
            /// </summary>
            /// <param name="value">PullItems</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder PullItems(ConfigNodePropertyInteger value)
            {
                _PullItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.HttpConnTimeout property.
            /// </summary>
            /// <param name="value">HttpConnTimeout</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder HttpConnTimeout(ConfigNodePropertyInteger value)
            {
                _HttpConnTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.RequestAuthorizationStrategyTarget property.
            /// </summary>
            /// <param name="value">RequestAuthorizationStrategyTarget</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder RequestAuthorizationStrategyTarget(ConfigNodePropertyString value)
            {
                _RequestAuthorizationStrategyTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.TransportSecretProviderTarget property.
            /// </summary>
            /// <param name="value">TransportSecretProviderTarget</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder TransportSecretProviderTarget(ConfigNodePropertyString value)
            {
                _TransportSecretProviderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.PackageBuilderTarget property.
            /// </summary>
            /// <param name="value">PackageBuilderTarget</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder PackageBuilderTarget(ConfigNodePropertyString value)
            {
                _PackageBuilderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.TriggersTarget property.
            /// </summary>
            /// <param name="value">TriggersTarget</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesBuilder TriggersTarget(ConfigNodePropertyString value)
            {
                _TriggersTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties</returns>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties(
                    Name: _Name,
                    Title: _Title,
                    Details: _Details,
                    Enabled: _Enabled,
                    ServiceName: _ServiceName,
                    LogLevel: _LogLevel,
                    QueueProcessingEnabled: _QueueProcessingEnabled,
                    PassiveQueues: _PassiveQueues,
                    PackageExporterEndpoints: _PackageExporterEndpoints,
                    PackageImporterEndpoints: _PackageImporterEndpoints,
                    RetryStrategy: _RetryStrategy,
                    RetryAttempts: _RetryAttempts,
                    PullItems: _PullItems,
                    HttpConnTimeout: _HttpConnTimeout,
                    RequestAuthorizationStrategyTarget: _RequestAuthorizationStrategyTarget,
                    TransportSecretProviderTarget: _TransportSecretProviderTarget,
                    PackageBuilderTarget: _PackageBuilderTarget,
                    TriggersTarget: _TriggersTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}