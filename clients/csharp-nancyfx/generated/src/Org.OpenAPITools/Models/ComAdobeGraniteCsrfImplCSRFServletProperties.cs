using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCsrfImplCSRFServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteCsrfImplCSRFServletProperties:  IEquatable<ComAdobeGraniteCsrfImplCSRFServletProperties>
    { 
        /// <summary>
        /// CsrfTokenExpiresIn
        /// </summary>
        public ConfigNodePropertyInteger CsrfTokenExpiresIn { get; private set; }

        /// <summary>
        /// SlingAuthRequirements
        /// </summary>
        public ConfigNodePropertyString SlingAuthRequirements { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCsrfImplCSRFServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCsrfImplCSRFServletProperties()
        {
        }

        private ComAdobeGraniteCsrfImplCSRFServletProperties(ConfigNodePropertyInteger CsrfTokenExpiresIn, ConfigNodePropertyString SlingAuthRequirements)
        {
            
            this.CsrfTokenExpiresIn = CsrfTokenExpiresIn;
            
            this.SlingAuthRequirements = SlingAuthRequirements;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCsrfImplCSRFServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder</returns>
        public static ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder</returns>
        public ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder With()
        {
            return Builder()
                .CsrfTokenExpiresIn(CsrfTokenExpiresIn)
                .SlingAuthRequirements(SlingAuthRequirements);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteCsrfImplCSRFServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCsrfImplCSRFServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCsrfImplCSRFServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCsrfImplCSRFServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCsrfImplCSRFServletProperties left, ComAdobeGraniteCsrfImplCSRFServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCsrfImplCSRFServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCsrfImplCSRFServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCsrfImplCSRFServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCsrfImplCSRFServletProperties left, ComAdobeGraniteCsrfImplCSRFServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCsrfImplCSRFServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CsrfTokenExpiresIn;
            private ConfigNodePropertyString _SlingAuthRequirements;

            internal ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFServletProperties.CsrfTokenExpiresIn property.
            /// </summary>
            /// <param name="value">CsrfTokenExpiresIn</param>
            public ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder CsrfTokenExpiresIn(ConfigNodePropertyInteger value)
            {
                _CsrfTokenExpiresIn = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFServletProperties.SlingAuthRequirements property.
            /// </summary>
            /// <param name="value">SlingAuthRequirements</param>
            public ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder SlingAuthRequirements(ConfigNodePropertyString value)
            {
                _SlingAuthRequirements = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCsrfImplCSRFServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteCsrfImplCSRFServletProperties</returns>
            public ComAdobeGraniteCsrfImplCSRFServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteCsrfImplCSRFServletProperties(
                    CsrfTokenExpiresIn: _CsrfTokenExpiresIn,
                    SlingAuthRequirements: _SlingAuthRequirements
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}