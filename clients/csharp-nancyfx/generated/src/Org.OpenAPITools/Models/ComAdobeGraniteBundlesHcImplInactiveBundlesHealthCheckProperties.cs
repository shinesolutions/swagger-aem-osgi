using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// IgnoredBundles
        /// </summary>
        public ConfigNodePropertyArray IgnoredBundles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(ConfigNodePropertyArray HcTags, ConfigNodePropertyArray IgnoredBundles)
        {
            
            this.HcTags = HcTags;
            
            this.IgnoredBundles = IgnoredBundles;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags)
                .IgnoredBundles(IgnoredBundles);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties left, ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties left, ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyArray _IgnoredBundles;

            internal ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.IgnoredBundles property.
            /// </summary>
            /// <param name="value">IgnoredBundles</param>
            public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesBuilder IgnoredBundles(ConfigNodePropertyArray value)
            {
                _IgnoredBundles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(
                    HcTags: _HcTags,
                    IgnoredBundles: _IgnoredBundles
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}