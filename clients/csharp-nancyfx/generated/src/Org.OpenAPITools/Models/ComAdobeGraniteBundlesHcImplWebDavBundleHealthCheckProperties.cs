using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties left, ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties left, ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}