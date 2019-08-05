using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties:  IEquatable<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties>
    { 
        /// <summary>
        /// CqAnalyticsSitecatalystServiceDatacenterUrl
        /// </summary>
        public ConfigNodePropertyArray CqAnalyticsSitecatalystServiceDatacenterUrl { get; private set; }

        /// <summary>
        /// Devhostnamepatterns
        /// </summary>
        public ConfigNodePropertyArray Devhostnamepatterns { get; private set; }

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
        /// Use ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties()
        {
        }

        private ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(ConfigNodePropertyArray CqAnalyticsSitecatalystServiceDatacenterUrl, ConfigNodePropertyArray Devhostnamepatterns, ConfigNodePropertyInteger ConnectionTimeout, ConfigNodePropertyInteger SocketTimeout)
        {
            
            this.CqAnalyticsSitecatalystServiceDatacenterUrl = CqAnalyticsSitecatalystServiceDatacenterUrl;
            
            this.Devhostnamepatterns = Devhostnamepatterns;
            
            this.ConnectionTimeout = ConnectionTimeout;
            
            this.SocketTimeout = SocketTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder</returns>
        public static ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder</returns>
        public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder With()
        {
            return Builder()
                .CqAnalyticsSitecatalystServiceDatacenterUrl(CqAnalyticsSitecatalystServiceDatacenterUrl)
                .Devhostnamepatterns(Devhostnamepatterns)
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

        public bool Equals(ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties left, ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties left, ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqAnalyticsSitecatalystServiceDatacenterUrl;
            private ConfigNodePropertyArray _Devhostnamepatterns;
            private ConfigNodePropertyInteger _ConnectionTimeout;
            private ConfigNodePropertyInteger _SocketTimeout;

            internal ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.CqAnalyticsSitecatalystServiceDatacenterUrl property.
            /// </summary>
            /// <param name="value">CqAnalyticsSitecatalystServiceDatacenterUrl</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder CqAnalyticsSitecatalystServiceDatacenterUrl(ConfigNodePropertyArray value)
            {
                _CqAnalyticsSitecatalystServiceDatacenterUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.Devhostnamepatterns property.
            /// </summary>
            /// <param name="value">Devhostnamepatterns</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder Devhostnamepatterns(ConfigNodePropertyArray value)
            {
                _Devhostnamepatterns = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.ConnectionTimeout property.
            /// </summary>
            /// <param name="value">ConnectionTimeout</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder ConnectionTimeout(ConfigNodePropertyInteger value)
            {
                _ConnectionTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.SocketTimeout property.
            /// </summary>
            /// <param name="value">SocketTimeout</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder SocketTimeout(ConfigNodePropertyInteger value)
            {
                _SocketTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties</returns>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(
                    CqAnalyticsSitecatalystServiceDatacenterUrl: _CqAnalyticsSitecatalystServiceDatacenterUrl,
                    Devhostnamepatterns: _Devhostnamepatterns,
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