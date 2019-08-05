using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties
    /// </summary>
    public sealed class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties:  IEquatable<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties>
    { 
        /// <summary>
        /// Size
        /// </summary>
        public ConfigNodePropertyInteger Size { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties()
        {
        }

        private ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties(ConfigNodePropertyInteger Size)
        {
            
            this.Size = Size;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder</returns>
        public static ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder</returns>
        public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder With()
        {
            return Builder()
                .Size(Size);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties left, ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties left, ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.
        /// </summary>
        public sealed class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Size;

            internal ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.Size property.
            /// </summary>
            /// <param name="value">Size</param>
            public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesBuilder Size(ConfigNodePropertyInteger value)
            {
                _Size = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties</returns>
            public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties Build()
            {
                Validate();
                return new ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties(
                    Size: _Size
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}