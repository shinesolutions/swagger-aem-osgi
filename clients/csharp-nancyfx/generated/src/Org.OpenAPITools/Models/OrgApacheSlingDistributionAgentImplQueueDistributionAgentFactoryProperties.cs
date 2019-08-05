using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties:  IEquatable<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties>
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
        /// RequestAuthorizationStrategyTarget
        /// </summary>
        public ConfigNodePropertyString RequestAuthorizationStrategyTarget { get; private set; }

        /// <summary>
        /// QueueProviderFactoryTarget
        /// </summary>
        public ConfigNodePropertyString QueueProviderFactoryTarget { get; private set; }

        /// <summary>
        /// PackageBuilderTarget
        /// </summary>
        public ConfigNodePropertyString PackageBuilderTarget { get; private set; }

        /// <summary>
        /// TriggersTarget
        /// </summary>
        public ConfigNodePropertyString TriggersTarget { get; private set; }

        /// <summary>
        /// PriorityQueues
        /// </summary>
        public ConfigNodePropertyArray PriorityQueues { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties()
        {
        }

        private OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Title, ConfigNodePropertyString Details, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString ServiceName, ConfigNodePropertyDropDown LogLevel, ConfigNodePropertyArray AllowedRoots, ConfigNodePropertyString RequestAuthorizationStrategyTarget, ConfigNodePropertyString QueueProviderFactoryTarget, ConfigNodePropertyString PackageBuilderTarget, ConfigNodePropertyString TriggersTarget, ConfigNodePropertyArray PriorityQueues)
        {
            
            this.Name = Name;
            
            this.Title = Title;
            
            this.Details = Details;
            
            this.Enabled = Enabled;
            
            this.ServiceName = ServiceName;
            
            this.LogLevel = LogLevel;
            
            this.AllowedRoots = AllowedRoots;
            
            this.RequestAuthorizationStrategyTarget = RequestAuthorizationStrategyTarget;
            
            this.QueueProviderFactoryTarget = QueueProviderFactoryTarget;
            
            this.PackageBuilderTarget = PackageBuilderTarget;
            
            this.TriggersTarget = TriggersTarget;
            
            this.PriorityQueues = PriorityQueues;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder</returns>
        public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Title(Title)
                .Details(Details)
                .Enabled(Enabled)
                .ServiceName(ServiceName)
                .LogLevel(LogLevel)
                .AllowedRoots(AllowedRoots)
                .RequestAuthorizationStrategyTarget(RequestAuthorizationStrategyTarget)
                .QueueProviderFactoryTarget(QueueProviderFactoryTarget)
                .PackageBuilderTarget(PackageBuilderTarget)
                .TriggersTarget(TriggersTarget)
                .PriorityQueues(PriorityQueues);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties left, OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties left, OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Title;
            private ConfigNodePropertyString _Details;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyDropDown _LogLevel;
            private ConfigNodePropertyArray _AllowedRoots;
            private ConfigNodePropertyString _RequestAuthorizationStrategyTarget;
            private ConfigNodePropertyString _QueueProviderFactoryTarget;
            private ConfigNodePropertyString _PackageBuilderTarget;
            private ConfigNodePropertyString _TriggersTarget;
            private ConfigNodePropertyArray _PriorityQueues;

            internal OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder Title(ConfigNodePropertyString value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.Details property.
            /// </summary>
            /// <param name="value">Details</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder Details(ConfigNodePropertyString value)
            {
                _Details = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.LogLevel property.
            /// </summary>
            /// <param name="value">LogLevel</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder LogLevel(ConfigNodePropertyDropDown value)
            {
                _LogLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.AllowedRoots property.
            /// </summary>
            /// <param name="value">AllowedRoots</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder AllowedRoots(ConfigNodePropertyArray value)
            {
                _AllowedRoots = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.RequestAuthorizationStrategyTarget property.
            /// </summary>
            /// <param name="value">RequestAuthorizationStrategyTarget</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder RequestAuthorizationStrategyTarget(ConfigNodePropertyString value)
            {
                _RequestAuthorizationStrategyTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.QueueProviderFactoryTarget property.
            /// </summary>
            /// <param name="value">QueueProviderFactoryTarget</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder QueueProviderFactoryTarget(ConfigNodePropertyString value)
            {
                _QueueProviderFactoryTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.PackageBuilderTarget property.
            /// </summary>
            /// <param name="value">PackageBuilderTarget</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder PackageBuilderTarget(ConfigNodePropertyString value)
            {
                _PackageBuilderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.TriggersTarget property.
            /// </summary>
            /// <param name="value">TriggersTarget</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder TriggersTarget(ConfigNodePropertyString value)
            {
                _TriggersTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.PriorityQueues property.
            /// </summary>
            /// <param name="value">PriorityQueues</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder PriorityQueues(ConfigNodePropertyArray value)
            {
                _PriorityQueues = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties</returns>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(
                    Name: _Name,
                    Title: _Title,
                    Details: _Details,
                    Enabled: _Enabled,
                    ServiceName: _ServiceName,
                    LogLevel: _LogLevel,
                    AllowedRoots: _AllowedRoots,
                    RequestAuthorizationStrategyTarget: _RequestAuthorizationStrategyTarget,
                    QueueProviderFactoryTarget: _QueueProviderFactoryTarget,
                    PackageBuilderTarget: _PackageBuilderTarget,
                    TriggersTarget: _TriggersTarget,
                    PriorityQueues: _PriorityQueues
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}