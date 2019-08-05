using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties:  IEquatable<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties>
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
        /// PackageExporterTarget
        /// </summary>
        public ConfigNodePropertyString PackageExporterTarget { get; private set; }

        /// <summary>
        /// PackageImporterTarget
        /// </summary>
        public ConfigNodePropertyString PackageImporterTarget { get; private set; }

        /// <summary>
        /// RequestAuthorizationStrategyTarget
        /// </summary>
        public ConfigNodePropertyString RequestAuthorizationStrategyTarget { get; private set; }

        /// <summary>
        /// TriggersTarget
        /// </summary>
        public ConfigNodePropertyString TriggersTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties()
        {
        }

        private OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Title, ConfigNodePropertyString Details, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString ServiceName, ConfigNodePropertyDropDown LogLevel, ConfigNodePropertyBoolean QueueProcessingEnabled, ConfigNodePropertyString PackageExporterTarget, ConfigNodePropertyString PackageImporterTarget, ConfigNodePropertyString RequestAuthorizationStrategyTarget, ConfigNodePropertyString TriggersTarget)
        {
            
            this.Name = Name;
            
            this.Title = Title;
            
            this.Details = Details;
            
            this.Enabled = Enabled;
            
            this.ServiceName = ServiceName;
            
            this.LogLevel = LogLevel;
            
            this.QueueProcessingEnabled = QueueProcessingEnabled;
            
            this.PackageExporterTarget = PackageExporterTarget;
            
            this.PackageImporterTarget = PackageImporterTarget;
            
            this.RequestAuthorizationStrategyTarget = RequestAuthorizationStrategyTarget;
            
            this.TriggersTarget = TriggersTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder</returns>
        public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Title(Title)
                .Details(Details)
                .Enabled(Enabled)
                .ServiceName(ServiceName)
                .LogLevel(LogLevel)
                .QueueProcessingEnabled(QueueProcessingEnabled)
                .PackageExporterTarget(PackageExporterTarget)
                .PackageImporterTarget(PackageImporterTarget)
                .RequestAuthorizationStrategyTarget(RequestAuthorizationStrategyTarget)
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

        public bool Equals(OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties left, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties left, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Title;
            private ConfigNodePropertyString _Details;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyDropDown _LogLevel;
            private ConfigNodePropertyBoolean _QueueProcessingEnabled;
            private ConfigNodePropertyString _PackageExporterTarget;
            private ConfigNodePropertyString _PackageImporterTarget;
            private ConfigNodePropertyString _RequestAuthorizationStrategyTarget;
            private ConfigNodePropertyString _TriggersTarget;

            internal OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder Title(ConfigNodePropertyString value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.Details property.
            /// </summary>
            /// <param name="value">Details</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder Details(ConfigNodePropertyString value)
            {
                _Details = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.LogLevel property.
            /// </summary>
            /// <param name="value">LogLevel</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder LogLevel(ConfigNodePropertyDropDown value)
            {
                _LogLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.QueueProcessingEnabled property.
            /// </summary>
            /// <param name="value">QueueProcessingEnabled</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder QueueProcessingEnabled(ConfigNodePropertyBoolean value)
            {
                _QueueProcessingEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.PackageExporterTarget property.
            /// </summary>
            /// <param name="value">PackageExporterTarget</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder PackageExporterTarget(ConfigNodePropertyString value)
            {
                _PackageExporterTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.PackageImporterTarget property.
            /// </summary>
            /// <param name="value">PackageImporterTarget</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder PackageImporterTarget(ConfigNodePropertyString value)
            {
                _PackageImporterTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.RequestAuthorizationStrategyTarget property.
            /// </summary>
            /// <param name="value">RequestAuthorizationStrategyTarget</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder RequestAuthorizationStrategyTarget(ConfigNodePropertyString value)
            {
                _RequestAuthorizationStrategyTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.TriggersTarget property.
            /// </summary>
            /// <param name="value">TriggersTarget</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesBuilder TriggersTarget(ConfigNodePropertyString value)
            {
                _TriggersTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties</returns>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(
                    Name: _Name,
                    Title: _Title,
                    Details: _Details,
                    Enabled: _Enabled,
                    ServiceName: _ServiceName,
                    LogLevel: _LogLevel,
                    QueueProcessingEnabled: _QueueProcessingEnabled,
                    PackageExporterTarget: _PackageExporterTarget,
                    PackageImporterTarget: _PackageImporterTarget,
                    RequestAuthorizationStrategyTarget: _RequestAuthorizationStrategyTarget,
                    TriggersTarget: _TriggersTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}