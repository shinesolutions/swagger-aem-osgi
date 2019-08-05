using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplAssetStaticImageHandlerProperties
    /// </summary>
    public sealed class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties:  IEquatable<ComAdobeCqCommerceImplAssetStaticImageHandlerProperties>
    { 
        /// <summary>
        /// CqCommerceAssetHandlerActive
        /// </summary>
        public ConfigNodePropertyBoolean CqCommerceAssetHandlerActive { get; private set; }

        /// <summary>
        /// CqCommerceAssetHandlerName
        /// </summary>
        public ConfigNodePropertyString CqCommerceAssetHandlerName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplAssetStaticImageHandlerProperties()
        {
        }

        private ComAdobeCqCommerceImplAssetStaticImageHandlerProperties(ConfigNodePropertyBoolean CqCommerceAssetHandlerActive, ConfigNodePropertyString CqCommerceAssetHandlerName)
        {
            
            this.CqCommerceAssetHandlerActive = CqCommerceAssetHandlerActive;
            
            this.CqCommerceAssetHandlerName = CqCommerceAssetHandlerName;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder</returns>
        public static ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder</returns>
        public ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder With()
        {
            return Builder()
                .CqCommerceAssetHandlerActive(CqCommerceAssetHandlerActive)
                .CqCommerceAssetHandlerName(CqCommerceAssetHandlerName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCommerceImplAssetStaticImageHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties left, ComAdobeCqCommerceImplAssetStaticImageHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplAssetStaticImageHandlerProperties left, ComAdobeCqCommerceImplAssetStaticImageHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqCommerceAssetHandlerActive;
            private ConfigNodePropertyString _CqCommerceAssetHandlerName;

            internal ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.CqCommerceAssetHandlerActive property.
            /// </summary>
            /// <param name="value">CqCommerceAssetHandlerActive</param>
            public ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder CqCommerceAssetHandlerActive(ConfigNodePropertyBoolean value)
            {
                _CqCommerceAssetHandlerActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.CqCommerceAssetHandlerName property.
            /// </summary>
            /// <param name="value">CqCommerceAssetHandlerName</param>
            public ComAdobeCqCommerceImplAssetStaticImageHandlerPropertiesBuilder CqCommerceAssetHandlerName(ConfigNodePropertyString value)
            {
                _CqCommerceAssetHandlerName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplAssetStaticImageHandlerProperties</returns>
            public ComAdobeCqCommerceImplAssetStaticImageHandlerProperties Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplAssetStaticImageHandlerProperties(
                    CqCommerceAssetHandlerActive: _CqCommerceAssetHandlerActive,
                    CqCommerceAssetHandlerName: _CqCommerceAssetHandlerName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}