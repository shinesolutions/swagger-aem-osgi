using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties
    /// </summary>
    public sealed class ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties:  IEquatable<ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties()
        {
        }

        private ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder</returns>
        public static ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder</returns>
        public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties left, ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties left, ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.
        /// </summary>
        public sealed class ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties</returns>
            public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties Build()
            {
                Validate();
                return new ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}