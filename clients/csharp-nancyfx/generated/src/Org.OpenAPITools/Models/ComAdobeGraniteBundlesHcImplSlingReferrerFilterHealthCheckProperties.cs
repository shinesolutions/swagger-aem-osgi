using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties left, ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties left, ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}