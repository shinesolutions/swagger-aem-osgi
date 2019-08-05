using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
    /// </summary>
    public sealed class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties:  IEquatable<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties>
    { 
        /// <summary>
        /// CqCommerceAssetHandlerFallback
        /// </summary>
        public ConfigNodePropertyString CqCommerceAssetHandlerFallback { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties()
        {
        }

        private ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties(ConfigNodePropertyString CqCommerceAssetHandlerFallback)
        {
            
            this.CqCommerceAssetHandlerFallback = CqCommerceAssetHandlerFallback;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder</returns>
        public static ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder</returns>
        public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder With()
        {
            return Builder()
                .CqCommerceAssetHandlerFallback(CqCommerceAssetHandlerFallback);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties left, ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties left, ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _CqCommerceAssetHandlerFallback;

            internal ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.CqCommerceAssetHandlerFallback property.
            /// </summary>
            /// <param name="value">CqCommerceAssetHandlerFallback</param>
            public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesBuilder CqCommerceAssetHandlerFallback(ConfigNodePropertyString value)
            {
                _CqCommerceAssetHandlerFallback = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties</returns>
            public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties(
                    CqCommerceAssetHandlerFallback: _CqCommerceAssetHandlerFallback
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}