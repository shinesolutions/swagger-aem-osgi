using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties:  IEquatable<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties>
    { 
        /// <summary>
        /// CqAnalyticsTestandtargetApiUrl
        /// </summary>
        public ConfigNodePropertyString CqAnalyticsTestandtargetApiUrl { get; private set; }

        /// <summary>
        /// CqAnalyticsTestandtargetTimeout
        /// </summary>
        public ConfigNodePropertyInteger CqAnalyticsTestandtargetTimeout { get; private set; }

        /// <summary>
        /// CqAnalyticsTestandtargetSockettimeout
        /// </summary>
        public ConfigNodePropertyInteger CqAnalyticsTestandtargetSockettimeout { get; private set; }

        /// <summary>
        /// CqAnalyticsTestandtargetRecommendationsUrlReplace
        /// </summary>
        public ConfigNodePropertyString CqAnalyticsTestandtargetRecommendationsUrlReplace { get; private set; }

        /// <summary>
        /// CqAnalyticsTestandtargetRecommendationsUrlReplacewith
        /// </summary>
        public ConfigNodePropertyString CqAnalyticsTestandtargetRecommendationsUrlReplacewith { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(ConfigNodePropertyString CqAnalyticsTestandtargetApiUrl, ConfigNodePropertyInteger CqAnalyticsTestandtargetTimeout, ConfigNodePropertyInteger CqAnalyticsTestandtargetSockettimeout, ConfigNodePropertyString CqAnalyticsTestandtargetRecommendationsUrlReplace, ConfigNodePropertyString CqAnalyticsTestandtargetRecommendationsUrlReplacewith)
        {
            
            this.CqAnalyticsTestandtargetApiUrl = CqAnalyticsTestandtargetApiUrl;
            
            this.CqAnalyticsTestandtargetTimeout = CqAnalyticsTestandtargetTimeout;
            
            this.CqAnalyticsTestandtargetSockettimeout = CqAnalyticsTestandtargetSockettimeout;
            
            this.CqAnalyticsTestandtargetRecommendationsUrlReplace = CqAnalyticsTestandtargetRecommendationsUrlReplace;
            
            this.CqAnalyticsTestandtargetRecommendationsUrlReplacewith = CqAnalyticsTestandtargetRecommendationsUrlReplacewith;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder With()
        {
            return Builder()
                .CqAnalyticsTestandtargetApiUrl(CqAnalyticsTestandtargetApiUrl)
                .CqAnalyticsTestandtargetTimeout(CqAnalyticsTestandtargetTimeout)
                .CqAnalyticsTestandtargetSockettimeout(CqAnalyticsTestandtargetSockettimeout)
                .CqAnalyticsTestandtargetRecommendationsUrlReplace(CqAnalyticsTestandtargetRecommendationsUrlReplace)
                .CqAnalyticsTestandtargetRecommendationsUrlReplacewith(CqAnalyticsTestandtargetRecommendationsUrlReplacewith);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties left, ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties left, ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder
        {
            private ConfigNodePropertyString _CqAnalyticsTestandtargetApiUrl;
            private ConfigNodePropertyInteger _CqAnalyticsTestandtargetTimeout;
            private ConfigNodePropertyInteger _CqAnalyticsTestandtargetSockettimeout;
            private ConfigNodePropertyString _CqAnalyticsTestandtargetRecommendationsUrlReplace;
            private ConfigNodePropertyString _CqAnalyticsTestandtargetRecommendationsUrlReplacewith;

            internal ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.CqAnalyticsTestandtargetApiUrl property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetApiUrl</param>
            public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder CqAnalyticsTestandtargetApiUrl(ConfigNodePropertyString value)
            {
                _CqAnalyticsTestandtargetApiUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.CqAnalyticsTestandtargetTimeout property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetTimeout</param>
            public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder CqAnalyticsTestandtargetTimeout(ConfigNodePropertyInteger value)
            {
                _CqAnalyticsTestandtargetTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.CqAnalyticsTestandtargetSockettimeout property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetSockettimeout</param>
            public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder CqAnalyticsTestandtargetSockettimeout(ConfigNodePropertyInteger value)
            {
                _CqAnalyticsTestandtargetSockettimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.CqAnalyticsTestandtargetRecommendationsUrlReplace property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetRecommendationsUrlReplace</param>
            public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder CqAnalyticsTestandtargetRecommendationsUrlReplace(ConfigNodePropertyString value)
            {
                _CqAnalyticsTestandtargetRecommendationsUrlReplace = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.CqAnalyticsTestandtargetRecommendationsUrlReplacewith property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetRecommendationsUrlReplacewith</param>
            public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder CqAnalyticsTestandtargetRecommendationsUrlReplacewith(ConfigNodePropertyString value)
            {
                _CqAnalyticsTestandtargetRecommendationsUrlReplacewith = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties</returns>
            public ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(
                    CqAnalyticsTestandtargetApiUrl: _CqAnalyticsTestandtargetApiUrl,
                    CqAnalyticsTestandtargetTimeout: _CqAnalyticsTestandtargetTimeout,
                    CqAnalyticsTestandtargetSockettimeout: _CqAnalyticsTestandtargetSockettimeout,
                    CqAnalyticsTestandtargetRecommendationsUrlReplace: _CqAnalyticsTestandtargetRecommendationsUrlReplace,
                    CqAnalyticsTestandtargetRecommendationsUrlReplacewith: _CqAnalyticsTestandtargetRecommendationsUrlReplacewith
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}