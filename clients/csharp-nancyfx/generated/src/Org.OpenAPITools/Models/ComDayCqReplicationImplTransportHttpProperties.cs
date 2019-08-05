using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplTransportHttpProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplTransportHttpProperties:  IEquatable<ComDayCqReplicationImplTransportHttpProperties>
    { 
        /// <summary>
        /// DisabledCipherSuites
        /// </summary>
        public ConfigNodePropertyArray DisabledCipherSuites { get; private set; }

        /// <summary>
        /// EnabledCipherSuites
        /// </summary>
        public ConfigNodePropertyArray EnabledCipherSuites { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplTransportHttpProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplTransportHttpProperties()
        {
        }

        private ComDayCqReplicationImplTransportHttpProperties(ConfigNodePropertyArray DisabledCipherSuites, ConfigNodePropertyArray EnabledCipherSuites)
        {
            
            this.DisabledCipherSuites = DisabledCipherSuites;
            
            this.EnabledCipherSuites = EnabledCipherSuites;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplTransportHttpProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplTransportHttpPropertiesBuilder</returns>
        public static ComDayCqReplicationImplTransportHttpPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplTransportHttpPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplTransportHttpPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplTransportHttpPropertiesBuilder</returns>
        public ComDayCqReplicationImplTransportHttpPropertiesBuilder With()
        {
            return Builder()
                .DisabledCipherSuites(DisabledCipherSuites)
                .EnabledCipherSuites(EnabledCipherSuites);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationImplTransportHttpProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplTransportHttpProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplTransportHttpProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplTransportHttpProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplTransportHttpProperties left, ComDayCqReplicationImplTransportHttpProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplTransportHttpProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplTransportHttpProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplTransportHttpProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplTransportHttpProperties left, ComDayCqReplicationImplTransportHttpProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplTransportHttpProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplTransportHttpPropertiesBuilder
        {
            private ConfigNodePropertyArray _DisabledCipherSuites;
            private ConfigNodePropertyArray _EnabledCipherSuites;

            internal ComDayCqReplicationImplTransportHttpPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportHttpProperties.DisabledCipherSuites property.
            /// </summary>
            /// <param name="value">DisabledCipherSuites</param>
            public ComDayCqReplicationImplTransportHttpPropertiesBuilder DisabledCipherSuites(ConfigNodePropertyArray value)
            {
                _DisabledCipherSuites = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportHttpProperties.EnabledCipherSuites property.
            /// </summary>
            /// <param name="value">EnabledCipherSuites</param>
            public ComDayCqReplicationImplTransportHttpPropertiesBuilder EnabledCipherSuites(ConfigNodePropertyArray value)
            {
                _EnabledCipherSuites = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplTransportHttpProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplTransportHttpProperties</returns>
            public ComDayCqReplicationImplTransportHttpProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplTransportHttpProperties(
                    DisabledCipherSuites: _DisabledCipherSuites,
                    EnabledCipherSuites: _EnabledCipherSuites
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}