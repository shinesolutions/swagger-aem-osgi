using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
    /// </summary>
    public sealed class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties:  IEquatable<ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties>
    { 
        /// <summary>
        /// CqWcmQrcodeServletWhitelist
        /// </summary>
        public ConfigNodePropertyArray CqWcmQrcodeServletWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties()
        {
        }

        private ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties(ConfigNodePropertyArray CqWcmQrcodeServletWhitelist)
        {
            
            this.CqWcmQrcodeServletWhitelist = CqWcmQrcodeServletWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.
        /// </summary>
        /// <returns>ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder</returns>
        public static ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder Builder()
        {
            return new ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder</returns>
        public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder With()
        {
            return Builder()
                .CqWcmQrcodeServletWhitelist(CqWcmQrcodeServletWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties left, ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties left, ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.
        /// </summary>
        public sealed class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqWcmQrcodeServletWhitelist;

            internal ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.CqWcmQrcodeServletWhitelist property.
            /// </summary>
            /// <param name="value">CqWcmQrcodeServletWhitelist</param>
            public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder CqWcmQrcodeServletWhitelist(ConfigNodePropertyArray value)
            {
                _CqWcmQrcodeServletWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.
            /// </summary>
            /// <returns>ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties</returns>
            public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties Build()
            {
                Validate();
                return new ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties(
                    CqWcmQrcodeServletWhitelist: _CqWcmQrcodeServletWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}