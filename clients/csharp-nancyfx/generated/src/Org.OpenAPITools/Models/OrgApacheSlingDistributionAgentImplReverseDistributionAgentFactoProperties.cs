using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties:  IEquatable<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties>
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
        /// PackageExporterEndpoints
        /// </summary>
        public ConfigNodePropertyArray PackageExporterEndpoints { get; private set; }

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
        /// Use OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties()
        {
        }

        private OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Title, ConfigNodePropertyString Details, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString ServiceName, ConfigNodePropertyDropDown LogLevel, ConfigNodePropertyBoolean QueueProcessingEnabled, ConfigNodePropertyArray PackageExporterEndpoints, ConfigNodePropertyInteger PullItems, ConfigNodePropertyInteger HttpConnTimeout, ConfigNodePropertyString RequestAuthorizationStrategyTarget, ConfigNodePropertyString TransportSecretProviderTarget, ConfigNodePropertyString PackageBuilderTarget, ConfigNodePropertyString TriggersTarget)
        {
            
            this.Name = Name;
            
            this.Title = Title;
            
            this.Details = Details;
            
            this.Enabled = Enabled;
            
            this.ServiceName = ServiceName;
            
            this.LogLevel = LogLevel;
            
            this.QueueProcessingEnabled = QueueProcessingEnabled;
            
            this.PackageExporterEndpoints = PackageExporterEndpoints;
            
            this.PullItems = PullItems;
            
            this.HttpConnTimeout = HttpConnTimeout;
            
            this.RequestAuthorizationStrategyTarget = RequestAuthorizationStrategyTarget;
            
            this.TransportSecretProviderTarget = TransportSecretProviderTarget;
            
            this.PackageBuilderTarget = PackageBuilderTarget;
            
            this.TriggersTarget = TriggersTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder</returns>
        public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Title(Title)
                .Details(Details)
                .Enabled(Enabled)
                .ServiceName(ServiceName)
                .LogLevel(LogLevel)
                .QueueProcessingEnabled(QueueProcessingEnabled)
                .PackageExporterEndpoints(PackageExporterEndpoints)
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

        public bool Equals(OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties left, OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties left, OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Title;
            private ConfigNodePropertyString _Details;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyDropDown _LogLevel;
            private ConfigNodePropertyBoolean _QueueProcessingEnabled;
            private ConfigNodePropertyArray _PackageExporterEndpoints;
            private ConfigNodePropertyInteger _PullItems;
            private ConfigNodePropertyInteger _HttpConnTimeout;
            private ConfigNodePropertyString _RequestAuthorizationStrategyTarget;
            private ConfigNodePropertyString _TransportSecretProviderTarget;
            private ConfigNodePropertyString _PackageBuilderTarget;
            private ConfigNodePropertyString _TriggersTarget;

            internal OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder Title(ConfigNodePropertyString value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.Details property.
            /// </summary>
            /// <param name="value">Details</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder Details(ConfigNodePropertyString value)
            {
                _Details = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.LogLevel property.
            /// </summary>
            /// <param name="value">LogLevel</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder LogLevel(ConfigNodePropertyDropDown value)
            {
                _LogLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.QueueProcessingEnabled property.
            /// </summary>
            /// <param name="value">QueueProcessingEnabled</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder QueueProcessingEnabled(ConfigNodePropertyBoolean value)
            {
                _QueueProcessingEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.PackageExporterEndpoints property.
            /// </summary>
            /// <param name="value">PackageExporterEndpoints</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder PackageExporterEndpoints(ConfigNodePropertyArray value)
            {
                _PackageExporterEndpoints = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.PullItems property.
            /// </summary>
            /// <param name="value">PullItems</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder PullItems(ConfigNodePropertyInteger value)
            {
                _PullItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.HttpConnTimeout property.
            /// </summary>
            /// <param name="value">HttpConnTimeout</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder HttpConnTimeout(ConfigNodePropertyInteger value)
            {
                _HttpConnTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.RequestAuthorizationStrategyTarget property.
            /// </summary>
            /// <param name="value">RequestAuthorizationStrategyTarget</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder RequestAuthorizationStrategyTarget(ConfigNodePropertyString value)
            {
                _RequestAuthorizationStrategyTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.TransportSecretProviderTarget property.
            /// </summary>
            /// <param name="value">TransportSecretProviderTarget</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder TransportSecretProviderTarget(ConfigNodePropertyString value)
            {
                _TransportSecretProviderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.PackageBuilderTarget property.
            /// </summary>
            /// <param name="value">PackageBuilderTarget</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder PackageBuilderTarget(ConfigNodePropertyString value)
            {
                _PackageBuilderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.TriggersTarget property.
            /// </summary>
            /// <param name="value">TriggersTarget</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesBuilder TriggersTarget(ConfigNodePropertyString value)
            {
                _TriggersTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties</returns>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties(
                    Name: _Name,
                    Title: _Title,
                    Details: _Details,
                    Enabled: _Enabled,
                    ServiceName: _ServiceName,
                    LogLevel: _LogLevel,
                    QueueProcessingEnabled: _QueueProcessingEnabled,
                    PackageExporterEndpoints: _PackageExporterEndpoints,
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