using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplReplicatorImplProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplReplicatorImplProperties:  IEquatable<ComDayCqReplicationImplReplicatorImplProperties>
    { 
        /// <summary>
        /// DistributeEvents
        /// </summary>
        public ConfigNodePropertyBoolean DistributeEvents { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplReplicatorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplReplicatorImplProperties()
        {
        }

        private ComDayCqReplicationImplReplicatorImplProperties(ConfigNodePropertyBoolean DistributeEvents)
        {
            
            this.DistributeEvents = DistributeEvents;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplReplicatorImplProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicatorImplPropertiesBuilder</returns>
        public static ComDayCqReplicationImplReplicatorImplPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplReplicatorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplReplicatorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicatorImplPropertiesBuilder</returns>
        public ComDayCqReplicationImplReplicatorImplPropertiesBuilder With()
        {
            return Builder()
                .DistributeEvents(DistributeEvents);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationImplReplicatorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplReplicatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicatorImplProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicatorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplReplicatorImplProperties left, ComDayCqReplicationImplReplicatorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplReplicatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicatorImplProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicatorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplReplicatorImplProperties left, ComDayCqReplicationImplReplicatorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplReplicatorImplProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplReplicatorImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _DistributeEvents;

            internal ComDayCqReplicationImplReplicatorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicatorImplProperties.DistributeEvents property.
            /// </summary>
            /// <param name="value">DistributeEvents</param>
            public ComDayCqReplicationImplReplicatorImplPropertiesBuilder DistributeEvents(ConfigNodePropertyBoolean value)
            {
                _DistributeEvents = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplReplicatorImplProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplReplicatorImplProperties</returns>
            public ComDayCqReplicationImplReplicatorImplProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplReplicatorImplProperties(
                    DistributeEvents: _DistributeEvents
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}