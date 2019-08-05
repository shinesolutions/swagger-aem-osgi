using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplAgentManagerImplProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplAgentManagerImplProperties:  IEquatable<ComDayCqReplicationImplAgentManagerImplProperties>
    { 
        /// <summary>
        /// JobTopics
        /// </summary>
        public ConfigNodePropertyString JobTopics { get; private set; }

        /// <summary>
        /// ServiceUserTarget
        /// </summary>
        public ConfigNodePropertyString ServiceUserTarget { get; private set; }

        /// <summary>
        /// AgentProviderTarget
        /// </summary>
        public ConfigNodePropertyString AgentProviderTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplAgentManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplAgentManagerImplProperties()
        {
        }

        private ComDayCqReplicationImplAgentManagerImplProperties(ConfigNodePropertyString JobTopics, ConfigNodePropertyString ServiceUserTarget, ConfigNodePropertyString AgentProviderTarget)
        {
            
            this.JobTopics = JobTopics;
            
            this.ServiceUserTarget = ServiceUserTarget;
            
            this.AgentProviderTarget = AgentProviderTarget;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplAgentManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplAgentManagerImplPropertiesBuilder</returns>
        public static ComDayCqReplicationImplAgentManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplAgentManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplAgentManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplAgentManagerImplPropertiesBuilder</returns>
        public ComDayCqReplicationImplAgentManagerImplPropertiesBuilder With()
        {
            return Builder()
                .JobTopics(JobTopics)
                .ServiceUserTarget(ServiceUserTarget)
                .AgentProviderTarget(AgentProviderTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationImplAgentManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplAgentManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplAgentManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplAgentManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplAgentManagerImplProperties left, ComDayCqReplicationImplAgentManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplAgentManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplAgentManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplAgentManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplAgentManagerImplProperties left, ComDayCqReplicationImplAgentManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplAgentManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplAgentManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _JobTopics;
            private ConfigNodePropertyString _ServiceUserTarget;
            private ConfigNodePropertyString _AgentProviderTarget;

            internal ComDayCqReplicationImplAgentManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplAgentManagerImplProperties.JobTopics property.
            /// </summary>
            /// <param name="value">JobTopics</param>
            public ComDayCqReplicationImplAgentManagerImplPropertiesBuilder JobTopics(ConfigNodePropertyString value)
            {
                _JobTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplAgentManagerImplProperties.ServiceUserTarget property.
            /// </summary>
            /// <param name="value">ServiceUserTarget</param>
            public ComDayCqReplicationImplAgentManagerImplPropertiesBuilder ServiceUserTarget(ConfigNodePropertyString value)
            {
                _ServiceUserTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplAgentManagerImplProperties.AgentProviderTarget property.
            /// </summary>
            /// <param name="value">AgentProviderTarget</param>
            public ComDayCqReplicationImplAgentManagerImplPropertiesBuilder AgentProviderTarget(ConfigNodePropertyString value)
            {
                _AgentProviderTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplAgentManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplAgentManagerImplProperties</returns>
            public ComDayCqReplicationImplAgentManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplAgentManagerImplProperties(
                    JobTopics: _JobTopics,
                    ServiceUserTarget: _ServiceUserTarget,
                    AgentProviderTarget: _AgentProviderTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}