using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// MinimumCodeCacheSize
        /// </summary>
        public ConfigNodePropertyInteger MinimumCodeCacheSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(ConfigNodePropertyArray HcTags, ConfigNodePropertyInteger MinimumCodeCacheSize)
        {
            
            this.HcTags = HcTags;
            
            this.MinimumCodeCacheSize = MinimumCodeCacheSize;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags)
                .MinimumCodeCacheSize(MinimumCodeCacheSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties left, ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties left, ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyInteger _MinimumCodeCacheSize;

            internal ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.MinimumCodeCacheSize property.
            /// </summary>
            /// <param name="value">MinimumCodeCacheSize</param>
            public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesBuilder MinimumCodeCacheSize(ConfigNodePropertyInteger value)
            {
                _MinimumCodeCacheSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(
                    HcTags: _HcTags,
                    MinimumCodeCacheSize: _MinimumCodeCacheSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}