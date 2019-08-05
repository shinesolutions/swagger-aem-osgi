using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties
    /// </summary>
    public sealed class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties:  IEquatable<ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties>
    { 
        /// <summary>
        /// ComAdobeGraniteHttpcacheUrlPaths
        /// </summary>
        public ConfigNodePropertyArray ComAdobeGraniteHttpcacheUrlPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties()
        {
        }

        private ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(ConfigNodePropertyArray ComAdobeGraniteHttpcacheUrlPaths)
        {
            
            this.ComAdobeGraniteHttpcacheUrlPaths = ComAdobeGraniteHttpcacheUrlPaths;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder</returns>
        public static ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder</returns>
        public ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeGraniteHttpcacheUrlPaths(ComAdobeGraniteHttpcacheUrlPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties left, ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties left, ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.
        /// </summary>
        public sealed class ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder
        {
            private ConfigNodePropertyArray _ComAdobeGraniteHttpcacheUrlPaths;

            internal ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.ComAdobeGraniteHttpcacheUrlPaths property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteHttpcacheUrlPaths</param>
            public ComAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesBuilder ComAdobeGraniteHttpcacheUrlPaths(ConfigNodePropertyArray value)
            {
                _ComAdobeGraniteHttpcacheUrlPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties</returns>
            public ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties Build()
            {
                Validate();
                return new ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(
                    ComAdobeGraniteHttpcacheUrlPaths: _ComAdobeGraniteHttpcacheUrlPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}