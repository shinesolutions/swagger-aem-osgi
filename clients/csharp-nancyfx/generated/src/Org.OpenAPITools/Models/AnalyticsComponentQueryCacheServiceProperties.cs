using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// AnalyticsComponentQueryCacheServiceProperties
    /// </summary>
    public sealed class AnalyticsComponentQueryCacheServiceProperties:  IEquatable<AnalyticsComponentQueryCacheServiceProperties>
    { 
        /// <summary>
        /// CqAnalyticsComponentQueryCacheSize
        /// </summary>
        public ConfigNodePropertyInteger CqAnalyticsComponentQueryCacheSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AnalyticsComponentQueryCacheServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AnalyticsComponentQueryCacheServiceProperties()
        {
        }

        private AnalyticsComponentQueryCacheServiceProperties(ConfigNodePropertyInteger CqAnalyticsComponentQueryCacheSize)
        {
            
            this.CqAnalyticsComponentQueryCacheSize = CqAnalyticsComponentQueryCacheSize;
            
        }

        /// <summary>
        /// Returns builder of AnalyticsComponentQueryCacheServiceProperties.
        /// </summary>
        /// <returns>AnalyticsComponentQueryCacheServicePropertiesBuilder</returns>
        public static AnalyticsComponentQueryCacheServicePropertiesBuilder Builder()
        {
            return new AnalyticsComponentQueryCacheServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns AnalyticsComponentQueryCacheServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AnalyticsComponentQueryCacheServicePropertiesBuilder</returns>
        public AnalyticsComponentQueryCacheServicePropertiesBuilder With()
        {
            return Builder()
                .CqAnalyticsComponentQueryCacheSize(CqAnalyticsComponentQueryCacheSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AnalyticsComponentQueryCacheServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AnalyticsComponentQueryCacheServiceProperties.
        /// </summary>
        /// <param name="left">Compared (AnalyticsComponentQueryCacheServiceProperties</param>
        /// <param name="right">Compared (AnalyticsComponentQueryCacheServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AnalyticsComponentQueryCacheServiceProperties left, AnalyticsComponentQueryCacheServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AnalyticsComponentQueryCacheServiceProperties.
        /// </summary>
        /// <param name="left">Compared (AnalyticsComponentQueryCacheServiceProperties</param>
        /// <param name="right">Compared (AnalyticsComponentQueryCacheServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AnalyticsComponentQueryCacheServiceProperties left, AnalyticsComponentQueryCacheServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AnalyticsComponentQueryCacheServiceProperties.
        /// </summary>
        public sealed class AnalyticsComponentQueryCacheServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqAnalyticsComponentQueryCacheSize;

            internal AnalyticsComponentQueryCacheServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AnalyticsComponentQueryCacheServiceProperties.CqAnalyticsComponentQueryCacheSize property.
            /// </summary>
            /// <param name="value">CqAnalyticsComponentQueryCacheSize</param>
            public AnalyticsComponentQueryCacheServicePropertiesBuilder CqAnalyticsComponentQueryCacheSize(ConfigNodePropertyInteger value)
            {
                _CqAnalyticsComponentQueryCacheSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AnalyticsComponentQueryCacheServiceProperties.
            /// </summary>
            /// <returns>AnalyticsComponentQueryCacheServiceProperties</returns>
            public AnalyticsComponentQueryCacheServiceProperties Build()
            {
                Validate();
                return new AnalyticsComponentQueryCacheServiceProperties(
                    CqAnalyticsComponentQueryCacheSize: _CqAnalyticsComponentQueryCacheSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}