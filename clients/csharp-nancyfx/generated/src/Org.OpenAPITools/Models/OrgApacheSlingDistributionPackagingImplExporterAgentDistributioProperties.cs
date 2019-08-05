using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties:  IEquatable<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Queue
        /// </summary>
        public ConfigNodePropertyString Queue { get; private set; }

        /// <summary>
        /// DropInvalidItems
        /// </summary>
        public ConfigNodePropertyBoolean DropInvalidItems { get; private set; }

        /// <summary>
        /// AgentTarget
        /// </summary>
        public ConfigNodePropertyString AgentTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties()
        {
        }

        private OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Queue, ConfigNodePropertyBoolean DropInvalidItems, ConfigNodePropertyString AgentTarget)
        {
            
            this.Name = Name;
            
            this.Queue = Queue;
            
            this.DropInvalidItems = DropInvalidItems;
            
            this.AgentTarget = AgentTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Queue(Queue)
                .DropInvalidItems(DropInvalidItems)
                .AgentTarget(AgentTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties left, OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties left, OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Queue;
            private ConfigNodePropertyBoolean _DropInvalidItems;
            private ConfigNodePropertyString _AgentTarget;

            internal OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.Queue property.
            /// </summary>
            /// <param name="value">Queue</param>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder Queue(ConfigNodePropertyString value)
            {
                _Queue = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.DropInvalidItems property.
            /// </summary>
            /// <param name="value">DropInvalidItems</param>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder DropInvalidItems(ConfigNodePropertyBoolean value)
            {
                _DropInvalidItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.AgentTarget property.
            /// </summary>
            /// <param name="value">AgentTarget</param>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder AgentTarget(ConfigNodePropertyString value)
            {
                _AgentTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties</returns>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(
                    Name: _Name,
                    Queue: _Queue,
                    DropInvalidItems: _DropInvalidItems,
                    AgentTarget: _AgentTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}