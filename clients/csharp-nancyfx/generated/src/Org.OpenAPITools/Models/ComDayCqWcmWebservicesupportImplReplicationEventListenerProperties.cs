using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties
    /// </summary>
    public sealed class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties:  IEquatable<ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties>
    { 
        /// <summary>
        /// FlushAgents
        /// </summary>
        public ConfigNodePropertyArray FlushAgents { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties()
        {
        }

        private ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties(ConfigNodePropertyArray FlushAgents)
        {
            
            this.FlushAgents = FlushAgents;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder</returns>
        public static ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder</returns>
        public ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder With()
        {
            return Builder()
                .FlushAgents(FlushAgents);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties left, ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties left, ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.
        /// </summary>
        public sealed class ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyArray _FlushAgents;

            internal ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.FlushAgents property.
            /// </summary>
            /// <param name="value">FlushAgents</param>
            public ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder FlushAgents(ConfigNodePropertyArray value)
            {
                _FlushAgents = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties</returns>
            public ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties Build()
            {
                Validate();
                return new ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties(
                    FlushAgents: _FlushAgents
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}