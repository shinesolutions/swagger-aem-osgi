using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties:  IEquatable<ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties>
    { 
        /// <summary>
        /// CorsEnabling
        /// </summary>
        public ConfigNodePropertyBoolean CorsEnabling { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties()
        {
        }

        private ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties(ConfigNodePropertyBoolean CorsEnabling)
        {
            
            this.CorsEnabling = CorsEnabling;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder With()
        {
            return Builder()
                .CorsEnabling(CorsEnabling);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties left, ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties left, ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CorsEnabling;

            internal ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.CorsEnabling property.
            /// </summary>
            /// <param name="value">CorsEnabling</param>
            public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesBuilder CorsEnabling(ConfigNodePropertyBoolean value)
            {
                _CorsEnabling = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties</returns>
            public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties(
                    CorsEnabling: _CorsEnabling
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}