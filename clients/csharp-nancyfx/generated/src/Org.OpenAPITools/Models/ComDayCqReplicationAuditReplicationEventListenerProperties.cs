using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationAuditReplicationEventListenerProperties
    /// </summary>
    public sealed class ComDayCqReplicationAuditReplicationEventListenerProperties:  IEquatable<ComDayCqReplicationAuditReplicationEventListenerProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationAuditReplicationEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationAuditReplicationEventListenerProperties()
        {
        }

        private ComDayCqReplicationAuditReplicationEventListenerProperties(ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationAuditReplicationEventListenerProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder</returns>
        public static ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder</returns>
        public ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationAuditReplicationEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationAuditReplicationEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationAuditReplicationEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationAuditReplicationEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationAuditReplicationEventListenerProperties left, ComDayCqReplicationAuditReplicationEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationAuditReplicationEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationAuditReplicationEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationAuditReplicationEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationAuditReplicationEventListenerProperties left, ComDayCqReplicationAuditReplicationEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationAuditReplicationEventListenerProperties.
        /// </summary>
        public sealed class ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;

            internal ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationAuditReplicationEventListenerProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationAuditReplicationEventListenerProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationAuditReplicationEventListenerProperties</returns>
            public ComDayCqReplicationAuditReplicationEventListenerProperties Build()
            {
                Validate();
                return new ComDayCqReplicationAuditReplicationEventListenerProperties(
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}