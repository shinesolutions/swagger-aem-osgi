using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties:  IEquatable<OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties>
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
        /// AllowedRoots
        /// </summary>
        public ConfigNodePropertyArray AllowedRoots { get; private set; }

        /// <summary>
        /// QueueProcessingEnabled
        /// </summary>
        public ConfigNodePropertyBoolean QueueProcessingEnabled { get; private set; }

        /// <summary>
        /// PackageImporterEndpoints
        /// </summary>
        public ConfigNodePropertyArray PackageImporterEndpoints { get; private set; }

        /// <summary>
        /// PassiveQueues
        /// </summary>
        public ConfigNodePropertyArray PassiveQueues { get; private set; }

        /// <summary>
        /// PriorityQueues
        /// </summary>
        public ConfigNodePropertyArray PriorityQueues { get; private set; }

        /// <summary>
        /// RetryStrategy
        /// </summary>
        public ConfigNodePropertyDropDown RetryStrategy { get; private set; }

        /// <summary>
        /// RetryAttempts
        /// </summary>
        public ConfigNodePropertyInteger RetryAttempts { get; private set; }

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
        /// QueueProvider
        /// </summary>
        public ConfigNodePropertyDropDown QueueProvider { get; private set; }

        /// <summary>
        /// AsyncDelivery
        /// </summary>
        public ConfigNodePropertyBoolean AsyncDelivery { get; private set; }

        /// <summary>
        /// HttpConnTimeout
        /// </summary>
        public ConfigNodePropertyInteger HttpConnTimeout { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties()
        {
        }

        private OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Title, ConfigNodePropertyString Details, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString ServiceName, ConfigNodePropertyDropDown LogLevel, ConfigNodePropertyArray AllowedRoots, ConfigNodePropertyBoolean QueueProcessingEnabled, ConfigNodePropertyArray PackageImporterEndpoints, ConfigNodePropertyArray PassiveQueues, ConfigNodePropertyArray PriorityQueues, ConfigNodePropertyDropDown RetryStrategy, ConfigNodePropertyInteger RetryAttempts, ConfigNodePropertyString RequestAuthorizationStrategyTarget, ConfigNodePropertyString TransportSecretProviderTarget, ConfigNodePropertyString PackageBuilderTarget, ConfigNodePropertyString TriggersTarget, ConfigNodePropertyDropDown QueueProvider, ConfigNodePropertyBoolean AsyncDelivery, ConfigNodePropertyInteger HttpConnTimeout)
        {
            
            this.Name = Name;
            
            this.Title = Title;
            
            this.Details = Details;
            
            this.Enabled = Enabled;
            
            this.ServiceName = ServiceName;
            
            this.LogLevel = LogLevel;
            
            this.AllowedRoots = AllowedRoots;
            
            this.QueueProcessingEnabled = QueueProcessingEnabled;
            
            this.PackageImporterEndpoints = PackageImporterEndpoints;
            
            this.PassiveQueues = PassiveQueues;
            
            this.PriorityQueues = PriorityQueues;
            
            this.RetryStrategy = RetryStrategy;
            
            this.RetryAttempts = RetryAttempts;
            
            this.RequestAuthorizationStrategyTarget = RequestAuthorizationStrategyTarget;
            
            this.TransportSecretProviderTarget = TransportSecretProviderTarget;
            
            this.PackageBuilderTarget = PackageBuilderTarget;
            
            this.TriggersTarget = TriggersTarget;
            
            this.QueueProvider = QueueProvider;
            
            this.AsyncDelivery = AsyncDelivery;
            
            this.HttpConnTimeout = HttpConnTimeout;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder</returns>
        public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Title(Title)
                .Details(Details)
                .Enabled(Enabled)
                .ServiceName(ServiceName)
                .LogLevel(LogLevel)
                .AllowedRoots(AllowedRoots)
                .QueueProcessingEnabled(QueueProcessingEnabled)
                .PackageImporterEndpoints(PackageImporterEndpoints)
                .PassiveQueues(PassiveQueues)
                .PriorityQueues(PriorityQueues)
                .RetryStrategy(RetryStrategy)
                .RetryAttempts(RetryAttempts)
                .RequestAuthorizationStrategyTarget(RequestAuthorizationStrategyTarget)
                .TransportSecretProviderTarget(TransportSecretProviderTarget)
                .PackageBuilderTarget(PackageBuilderTarget)
                .TriggersTarget(TriggersTarget)
                .QueueProvider(QueueProvider)
                .AsyncDelivery(AsyncDelivery)
                .HttpConnTimeout(HttpConnTimeout);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties left, OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties left, OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Title;
            private ConfigNodePropertyString _Details;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyDropDown _LogLevel;
            private ConfigNodePropertyArray _AllowedRoots;
            private ConfigNodePropertyBoolean _QueueProcessingEnabled;
            private ConfigNodePropertyArray _PackageImporterEndpoints;
            private ConfigNodePropertyArray _PassiveQueues;
            private ConfigNodePropertyArray _PriorityQueues;
            private ConfigNodePropertyDropDown _RetryStrategy;
            private ConfigNodePropertyInteger _RetryAttempts;
            private ConfigNodePropertyString _RequestAuthorizationStrategyTarget;
            private ConfigNodePropertyString _TransportSecretProviderTarget;
            private ConfigNodePropertyString _PackageBuilderTarget;
            private ConfigNodePropertyString _TriggersTarget;
            private ConfigNodePropertyDropDown _QueueProvider;
            private ConfigNodePropertyBoolean _AsyncDelivery;
            private ConfigNodePropertyInteger _HttpConnTimeout;

            internal OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder Title(ConfigNodePropertyString value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.Details property.
            /// </summary>
            /// <param name="value">Details</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder Details(ConfigNodePropertyString value)
            {
                _Details = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.LogLevel property.
            /// </summary>
            /// <param name="value">LogLevel</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder LogLevel(ConfigNodePropertyDropDown value)
            {
                _LogLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.AllowedRoots property.
            /// </summary>
            /// <param name="value">AllowedRoots</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder AllowedRoots(ConfigNodePropertyArray value)
            {
                _AllowedRoots = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.QueueProcessingEnabled property.
            /// </summary>
            /// <param name="value">QueueProcessingEnabled</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder QueueProcessingEnabled(ConfigNodePropertyBoolean value)
            {
                _QueueProcessingEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.PackageImporterEndpoints property.
            /// </summary>
            /// <param name="value">PackageImporterEndpoints</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder PackageImporterEndpoints(ConfigNodePropertyArray value)
            {
                _PackageImporterEndpoints = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.PassiveQueues property.
            /// </summary>
            /// <param name="value">PassiveQueues</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder PassiveQueues(ConfigNodePropertyArray value)
            {
                _PassiveQueues = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.PriorityQueues property.
            /// </summary>
            /// <param name="value">PriorityQueues</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder PriorityQueues(ConfigNodePropertyArray value)
            {
                _PriorityQueues = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.RetryStrategy property.
            /// </summary>
            /// <param name="value">RetryStrategy</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder RetryStrategy(ConfigNodePropertyDropDown value)
            {
                _RetryStrategy = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.RetryAttempts property.
            /// </summary>
            /// <param name="value">RetryAttempts</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder RetryAttempts(ConfigNodePropertyInteger value)
            {
                _RetryAttempts = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.RequestAuthorizationStrategyTarget property.
            /// </summary>
            /// <param name="value">RequestAuthorizationStrategyTarget</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder RequestAuthorizationStrategyTarget(ConfigNodePropertyString value)
            {
                _RequestAuthorizationStrategyTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.TransportSecretProviderTarget property.
            /// </summary>
            /// <param name="value">TransportSecretProviderTarget</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder TransportSecretProviderTarget(ConfigNodePropertyString value)
            {
                _TransportSecretProviderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.PackageBuilderTarget property.
            /// </summary>
            /// <param name="value">PackageBuilderTarget</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder PackageBuilderTarget(ConfigNodePropertyString value)
            {
                _PackageBuilderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.TriggersTarget property.
            /// </summary>
            /// <param name="value">TriggersTarget</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder TriggersTarget(ConfigNodePropertyString value)
            {
                _TriggersTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.QueueProvider property.
            /// </summary>
            /// <param name="value">QueueProvider</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder QueueProvider(ConfigNodePropertyDropDown value)
            {
                _QueueProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.AsyncDelivery property.
            /// </summary>
            /// <param name="value">AsyncDelivery</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder AsyncDelivery(ConfigNodePropertyBoolean value)
            {
                _AsyncDelivery = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.HttpConnTimeout property.
            /// </summary>
            /// <param name="value">HttpConnTimeout</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesBuilder HttpConnTimeout(ConfigNodePropertyInteger value)
            {
                _HttpConnTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties</returns>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(
                    Name: _Name,
                    Title: _Title,
                    Details: _Details,
                    Enabled: _Enabled,
                    ServiceName: _ServiceName,
                    LogLevel: _LogLevel,
                    AllowedRoots: _AllowedRoots,
                    QueueProcessingEnabled: _QueueProcessingEnabled,
                    PackageImporterEndpoints: _PackageImporterEndpoints,
                    PassiveQueues: _PassiveQueues,
                    PriorityQueues: _PriorityQueues,
                    RetryStrategy: _RetryStrategy,
                    RetryAttempts: _RetryAttempts,
                    RequestAuthorizationStrategyTarget: _RequestAuthorizationStrategyTarget,
                    TransportSecretProviderTarget: _TransportSecretProviderTarget,
                    PackageBuilderTarget: _PackageBuilderTarget,
                    TriggersTarget: _TriggersTarget,
                    QueueProvider: _QueueProvider,
                    AsyncDelivery: _AsyncDelivery,
                    HttpConnTimeout: _HttpConnTimeout
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}