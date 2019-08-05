using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties left, ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties left, ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}