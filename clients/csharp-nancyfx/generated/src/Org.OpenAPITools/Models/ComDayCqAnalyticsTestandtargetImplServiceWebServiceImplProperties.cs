using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties:  IEquatable<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties>
    { 
        /// <summary>
        /// EndpointUri
        /// </summary>
        public ConfigNodePropertyString EndpointUri { get; private set; }

        /// <summary>
        /// ConnectionTimeout
        /// </summary>
        public ConfigNodePropertyInteger ConnectionTimeout { get; private set; }

        /// <summary>
        /// SocketTimeout
        /// </summary>
        public ConfigNodePropertyInteger SocketTimeout { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(ConfigNodePropertyString EndpointUri, ConfigNodePropertyInteger ConnectionTimeout, ConfigNodePropertyInteger SocketTimeout)
        {
            
            this.EndpointUri = EndpointUri;
            
            this.ConnectionTimeout = ConnectionTimeout;
            
            this.SocketTimeout = SocketTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder With()
        {
            return Builder()
                .EndpointUri(EndpointUri)
                .ConnectionTimeout(ConnectionTimeout)
                .SocketTimeout(SocketTimeout);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties left, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties left, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _EndpointUri;
            private ConfigNodePropertyInteger _ConnectionTimeout;
            private ConfigNodePropertyInteger _SocketTimeout;

            internal ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.EndpointUri property.
            /// </summary>
            /// <param name="value">EndpointUri</param>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder EndpointUri(ConfigNodePropertyString value)
            {
                _EndpointUri = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.ConnectionTimeout property.
            /// </summary>
            /// <param name="value">ConnectionTimeout</param>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder ConnectionTimeout(ConfigNodePropertyInteger value)
            {
                _ConnectionTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.SocketTimeout property.
            /// </summary>
            /// <param name="value">SocketTimeout</param>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder SocketTimeout(ConfigNodePropertyInteger value)
            {
                _SocketTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties</returns>
            public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(
                    EndpointUri: _EndpointUri,
                    ConnectionTimeout: _ConnectionTimeout,
                    SocketTimeout: _SocketTimeout
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}