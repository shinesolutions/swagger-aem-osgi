using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDtmImplServiceDTMWebServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties:  IEquatable<ComAdobeCqDtmImplServiceDTMWebServiceImplProperties>
    { 
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
        /// Use ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties()
        {
        }

        private ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(ConfigNodePropertyInteger ConnectionTimeout, ConfigNodePropertyInteger SocketTimeout)
        {
            
            this.ConnectionTimeout = ConnectionTimeout;
            
            this.SocketTimeout = SocketTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder</returns>
        public ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder With()
        {
            return Builder()
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

        public bool Equals(ComAdobeCqDtmImplServiceDTMWebServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties left, ComAdobeCqDtmImplServiceDTMWebServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties left, ComAdobeCqDtmImplServiceDTMWebServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ConnectionTimeout;
            private ConfigNodePropertyInteger _SocketTimeout;

            internal ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.ConnectionTimeout property.
            /// </summary>
            /// <param name="value">ConnectionTimeout</param>
            public ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder ConnectionTimeout(ConfigNodePropertyInteger value)
            {
                _ConnectionTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.SocketTimeout property.
            /// </summary>
            /// <param name="value">SocketTimeout</param>
            public ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder SocketTimeout(ConfigNodePropertyInteger value)
            {
                _SocketTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqDtmImplServiceDTMWebServiceImplProperties</returns>
            public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(
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