using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties
    /// </summary>
    public sealed class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties:  IEquatable<ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties>
    { 
        /// <summary>
        /// CqSearchpromoteConfigurationServerUri
        /// </summary>
        public ConfigNodePropertyString CqSearchpromoteConfigurationServerUri { get; private set; }

        /// <summary>
        /// CqSearchpromoteConfigurationEnvironment
        /// </summary>
        public ConfigNodePropertyString CqSearchpromoteConfigurationEnvironment { get; private set; }

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
        /// Use ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties()
        {
        }

        private ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(ConfigNodePropertyString CqSearchpromoteConfigurationServerUri, ConfigNodePropertyString CqSearchpromoteConfigurationEnvironment, ConfigNodePropertyInteger ConnectionTimeout, ConfigNodePropertyInteger SocketTimeout)
        {
            
            this.CqSearchpromoteConfigurationServerUri = CqSearchpromoteConfigurationServerUri;
            
            this.CqSearchpromoteConfigurationEnvironment = CqSearchpromoteConfigurationEnvironment;
            
            this.ConnectionTimeout = ConnectionTimeout;
            
            this.SocketTimeout = SocketTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder</returns>
        public static ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder</returns>
        public ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder With()
        {
            return Builder()
                .CqSearchpromoteConfigurationServerUri(CqSearchpromoteConfigurationServerUri)
                .CqSearchpromoteConfigurationEnvironment(CqSearchpromoteConfigurationEnvironment)
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

        public bool Equals(ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties left, ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties left, ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _CqSearchpromoteConfigurationServerUri;
            private ConfigNodePropertyString _CqSearchpromoteConfigurationEnvironment;
            private ConfigNodePropertyInteger _ConnectionTimeout;
            private ConfigNodePropertyInteger _SocketTimeout;

            internal ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.CqSearchpromoteConfigurationServerUri property.
            /// </summary>
            /// <param name="value">CqSearchpromoteConfigurationServerUri</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder CqSearchpromoteConfigurationServerUri(ConfigNodePropertyString value)
            {
                _CqSearchpromoteConfigurationServerUri = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.CqSearchpromoteConfigurationEnvironment property.
            /// </summary>
            /// <param name="value">CqSearchpromoteConfigurationEnvironment</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder CqSearchpromoteConfigurationEnvironment(ConfigNodePropertyString value)
            {
                _CqSearchpromoteConfigurationEnvironment = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.ConnectionTimeout property.
            /// </summary>
            /// <param name="value">ConnectionTimeout</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder ConnectionTimeout(ConfigNodePropertyInteger value)
            {
                _ConnectionTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.SocketTimeout property.
            /// </summary>
            /// <param name="value">SocketTimeout</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder SocketTimeout(ConfigNodePropertyInteger value)
            {
                _SocketTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties</returns>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(
                    CqSearchpromoteConfigurationServerUri: _CqSearchpromoteConfigurationServerUri,
                    CqSearchpromoteConfigurationEnvironment: _CqSearchpromoteConfigurationEnvironment,
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