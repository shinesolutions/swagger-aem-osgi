using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplAssetVideoHandlerProperties
    /// </summary>
    public sealed class ComAdobeCqCommerceImplAssetVideoHandlerProperties:  IEquatable<ComAdobeCqCommerceImplAssetVideoHandlerProperties>
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
        /// Use ComAdobeCqCommerceImplAssetVideoHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplAssetVideoHandlerProperties()
        {
        }

        private ComAdobeCqCommerceImplAssetVideoHandlerProperties(ConfigNodePropertyBoolean CqCommerceAssetHandlerActive, ConfigNodePropertyString CqCommerceAssetHandlerName)
        {
            
            this.CqCommerceAssetHandlerActive = CqCommerceAssetHandlerActive;
            
            this.CqCommerceAssetHandlerName = CqCommerceAssetHandlerName;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplAssetVideoHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder</returns>
        public static ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder</returns>
        public ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqCommerceImplAssetVideoHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplAssetVideoHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetVideoHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetVideoHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplAssetVideoHandlerProperties left, ComAdobeCqCommerceImplAssetVideoHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplAssetVideoHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetVideoHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetVideoHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplAssetVideoHandlerProperties left, ComAdobeCqCommerceImplAssetVideoHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplAssetVideoHandlerProperties.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqCommerceAssetHandlerActive;
            private ConfigNodePropertyString _CqCommerceAssetHandlerName;

            internal ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetVideoHandlerProperties.CqCommerceAssetHandlerActive property.
            /// </summary>
            /// <param name="value">CqCommerceAssetHandlerActive</param>
            public ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder CqCommerceAssetHandlerActive(ConfigNodePropertyBoolean value)
            {
                _CqCommerceAssetHandlerActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetVideoHandlerProperties.CqCommerceAssetHandlerName property.
            /// </summary>
            /// <param name="value">CqCommerceAssetHandlerName</param>
            public ComAdobeCqCommerceImplAssetVideoHandlerPropertiesBuilder CqCommerceAssetHandlerName(ConfigNodePropertyString value)
            {
                _CqCommerceAssetHandlerName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplAssetVideoHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplAssetVideoHandlerProperties</returns>
            public ComAdobeCqCommerceImplAssetVideoHandlerProperties Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplAssetVideoHandlerProperties(
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