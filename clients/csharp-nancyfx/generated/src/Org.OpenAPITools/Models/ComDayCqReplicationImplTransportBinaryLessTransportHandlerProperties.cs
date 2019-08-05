using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties:  IEquatable<ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties>
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
        /// Use ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties()
        {
        }

        private ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties(ConfigNodePropertyArray DisabledCipherSuites, ConfigNodePropertyArray EnabledCipherSuites)
        {
            
            this.DisabledCipherSuites = DisabledCipherSuites;
            
            this.EnabledCipherSuites = EnabledCipherSuites;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder</returns>
        public static ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder</returns>
        public ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder With()
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

        public bool Equals(ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties left, ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties left, ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _DisabledCipherSuites;
            private ConfigNodePropertyArray _EnabledCipherSuites;

            internal ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.DisabledCipherSuites property.
            /// </summary>
            /// <param name="value">DisabledCipherSuites</param>
            public ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder DisabledCipherSuites(ConfigNodePropertyArray value)
            {
                _DisabledCipherSuites = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.EnabledCipherSuites property.
            /// </summary>
            /// <param name="value">EnabledCipherSuites</param>
            public ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder EnabledCipherSuites(ConfigNodePropertyArray value)
            {
                _EnabledCipherSuites = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties</returns>
            public ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties(
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