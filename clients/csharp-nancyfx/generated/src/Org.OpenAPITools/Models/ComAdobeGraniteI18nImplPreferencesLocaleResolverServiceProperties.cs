using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties
    /// </summary>
    public sealed class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties:  IEquatable<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties>
    { 
        /// <summary>
        /// SecurityPreferencesName
        /// </summary>
        public ConfigNodePropertyString SecurityPreferencesName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties()
        {
        }

        private ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(ConfigNodePropertyString SecurityPreferencesName)
        {
            
            this.SecurityPreferencesName = SecurityPreferencesName;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder</returns>
        public static ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder</returns>
        public ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder With()
        {
            return Builder()
                .SecurityPreferencesName(SecurityPreferencesName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties left, ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties left, ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.
        /// </summary>
        public sealed class ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder
        {
            private ConfigNodePropertyString _SecurityPreferencesName;

            internal ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.SecurityPreferencesName property.
            /// </summary>
            /// <param name="value">SecurityPreferencesName</param>
            public ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder SecurityPreferencesName(ConfigNodePropertyString value)
            {
                _SecurityPreferencesName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties</returns>
            public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties Build()
            {
                Validate();
                return new ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(
                    SecurityPreferencesName: _SecurityPreferencesName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}