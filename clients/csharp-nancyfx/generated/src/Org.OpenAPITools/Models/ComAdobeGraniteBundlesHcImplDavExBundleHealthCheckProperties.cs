using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties left, ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties left, ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}