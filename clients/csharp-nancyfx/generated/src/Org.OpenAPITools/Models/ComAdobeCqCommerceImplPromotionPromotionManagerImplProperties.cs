using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties
    /// </summary>
    public sealed class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties:  IEquatable<ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties>
    { 
        /// <summary>
        /// CqCommercePromotionRoot
        /// </summary>
        public ConfigNodePropertyString CqCommercePromotionRoot { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties()
        {
        }

        private ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties(ConfigNodePropertyString CqCommercePromotionRoot)
        {
            
            this.CqCommercePromotionRoot = CqCommercePromotionRoot;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder</returns>
        public static ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder</returns>
        public ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder With()
        {
            return Builder()
                .CqCommercePromotionRoot(CqCommercePromotionRoot);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties left, ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties left, ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _CqCommercePromotionRoot;

            internal ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.CqCommercePromotionRoot property.
            /// </summary>
            /// <param name="value">CqCommercePromotionRoot</param>
            public ComAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesBuilder CqCommercePromotionRoot(ConfigNodePropertyString value)
            {
                _CqCommercePromotionRoot = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties</returns>
            public ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties(
                    CqCommercePromotionRoot: _CqCommercePromotionRoot
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}