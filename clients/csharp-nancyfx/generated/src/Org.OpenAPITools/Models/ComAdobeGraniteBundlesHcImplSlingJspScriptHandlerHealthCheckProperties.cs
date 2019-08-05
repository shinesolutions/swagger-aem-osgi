using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties left, ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties left, ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}