using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties:  IEquatable<ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties>
    { 
        /// <summary>
        /// DefaultConnectorName
        /// </summary>
        public ConfigNodePropertyString DefaultConnectorName { get; private set; }

        /// <summary>
        /// DefaultCategory
        /// </summary>
        public ConfigNodePropertyString DefaultCategory { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties()
        {
        }

        private ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(ConfigNodePropertyString DefaultConnectorName, ConfigNodePropertyString DefaultCategory)
        {
            
            this.DefaultConnectorName = DefaultConnectorName;
            
            this.DefaultCategory = DefaultCategory;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder</returns>
        public static ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder</returns>
        public ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder With()
        {
            return Builder()
                .DefaultConnectorName(DefaultConnectorName)
                .DefaultCategory(DefaultCategory);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties left, ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties left, ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _DefaultConnectorName;
            private ConfigNodePropertyString _DefaultCategory;

            internal ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.DefaultConnectorName property.
            /// </summary>
            /// <param name="value">DefaultConnectorName</param>
            public ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder DefaultConnectorName(ConfigNodePropertyString value)
            {
                _DefaultConnectorName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.DefaultCategory property.
            /// </summary>
            /// <param name="value">DefaultCategory</param>
            public ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder DefaultCategory(ConfigNodePropertyString value)
            {
                _DefaultCategory = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties</returns>
            public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(
                    DefaultConnectorName: _DefaultConnectorName,
                    DefaultCategory: _DefaultCategory
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}