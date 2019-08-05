using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties left, ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties left, ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}