using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties left, ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties left, ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}