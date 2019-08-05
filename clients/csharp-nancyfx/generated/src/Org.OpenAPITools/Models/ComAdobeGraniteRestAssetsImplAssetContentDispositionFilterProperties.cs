using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
    /// </summary>
    public sealed class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties:  IEquatable<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties>
    { 
        /// <summary>
        /// MimeAllowEmpty
        /// </summary>
        public ConfigNodePropertyBoolean MimeAllowEmpty { get; private set; }

        /// <summary>
        /// MimeAllowed
        /// </summary>
        public ConfigNodePropertyArray MimeAllowed { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties()
        {
        }

        private ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(ConfigNodePropertyBoolean MimeAllowEmpty, ConfigNodePropertyArray MimeAllowed)
        {
            
            this.MimeAllowEmpty = MimeAllowEmpty;
            
            this.MimeAllowed = MimeAllowed;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder</returns>
        public static ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder</returns>
        public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder With()
        {
            return Builder()
                .MimeAllowEmpty(MimeAllowEmpty)
                .MimeAllowed(MimeAllowed);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties left, ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties left, ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _MimeAllowEmpty;
            private ConfigNodePropertyArray _MimeAllowed;

            internal ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.MimeAllowEmpty property.
            /// </summary>
            /// <param name="value">MimeAllowEmpty</param>
            public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder MimeAllowEmpty(ConfigNodePropertyBoolean value)
            {
                _MimeAllowEmpty = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.MimeAllowed property.
            /// </summary>
            /// <param name="value">MimeAllowed</param>
            public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesBuilder MimeAllowed(ConfigNodePropertyArray value)
            {
                _MimeAllowed = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties</returns>
            public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(
                    MimeAllowEmpty: _MimeAllowEmpty,
                    MimeAllowed: _MimeAllowed
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}