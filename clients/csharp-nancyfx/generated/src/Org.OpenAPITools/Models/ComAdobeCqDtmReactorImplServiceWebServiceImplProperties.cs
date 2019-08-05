using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDtmReactorImplServiceWebServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties:  IEquatable<ComAdobeCqDtmReactorImplServiceWebServiceImplProperties>
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
        /// Use ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties()
        {
        }

        private ComAdobeCqDtmReactorImplServiceWebServiceImplProperties(ConfigNodePropertyString EndpointUri, ConfigNodePropertyInteger ConnectionTimeout, ConfigNodePropertyInteger SocketTimeout)
        {
            
            this.EndpointUri = EndpointUri;
            
            this.ConnectionTimeout = ConnectionTimeout;
            
            this.SocketTimeout = SocketTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder</returns>
        public ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqDtmReactorImplServiceWebServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties left, ComAdobeCqDtmReactorImplServiceWebServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties left, ComAdobeCqDtmReactorImplServiceWebServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _EndpointUri;
            private ConfigNodePropertyInteger _ConnectionTimeout;
            private ConfigNodePropertyInteger _SocketTimeout;

            internal ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.EndpointUri property.
            /// </summary>
            /// <param name="value">EndpointUri</param>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder EndpointUri(ConfigNodePropertyString value)
            {
                _EndpointUri = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.ConnectionTimeout property.
            /// </summary>
            /// <param name="value">ConnectionTimeout</param>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder ConnectionTimeout(ConfigNodePropertyInteger value)
            {
                _ConnectionTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.SocketTimeout property.
            /// </summary>
            /// <param name="value">SocketTimeout</param>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder SocketTimeout(ConfigNodePropertyInteger value)
            {
                _SocketTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqDtmReactorImplServiceWebServiceImplProperties</returns>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqDtmReactorImplServiceWebServiceImplProperties(
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