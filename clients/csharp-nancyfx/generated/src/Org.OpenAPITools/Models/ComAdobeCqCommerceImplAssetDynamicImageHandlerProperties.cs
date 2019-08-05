using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties
    /// </summary>
    public sealed class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties:  IEquatable<ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties>
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
        /// Use ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties()
        {
        }

        private ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties(ConfigNodePropertyBoolean CqCommerceAssetHandlerActive, ConfigNodePropertyString CqCommerceAssetHandlerName)
        {
            
            this.CqCommerceAssetHandlerActive = CqCommerceAssetHandlerActive;
            
            this.CqCommerceAssetHandlerName = CqCommerceAssetHandlerName;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder</returns>
        public static ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder</returns>
        public ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties left, ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties left, ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqCommerceAssetHandlerActive;
            private ConfigNodePropertyString _CqCommerceAssetHandlerName;

            internal ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.CqCommerceAssetHandlerActive property.
            /// </summary>
            /// <param name="value">CqCommerceAssetHandlerActive</param>
            public ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder CqCommerceAssetHandlerActive(ConfigNodePropertyBoolean value)
            {
                _CqCommerceAssetHandlerActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.CqCommerceAssetHandlerName property.
            /// </summary>
            /// <param name="value">CqCommerceAssetHandlerName</param>
            public ComAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesBuilder CqCommerceAssetHandlerName(ConfigNodePropertyString value)
            {
                _CqCommerceAssetHandlerName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties</returns>
            public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties(
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