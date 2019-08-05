using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties:  IEquatable<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties>
    { 
        /// <summary>
        /// EnableFallback
        /// </summary>
        public ConfigNodePropertyBoolean EnableFallback { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties()
        {
        }

        private ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties(ConfigNodePropertyBoolean EnableFallback)
        {
            
            this.EnableFallback = EnableFallback;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder</returns>
        public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder With()
        {
            return Builder()
                .EnableFallback(EnableFallback);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties left, ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties left, ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _EnableFallback;

            internal ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.EnableFallback property.
            /// </summary>
            /// <param name="value">EnableFallback</param>
            public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder EnableFallback(ConfigNodePropertyBoolean value)
            {
                _EnableFallback = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties</returns>
            public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties(
                    EnableFallback: _EnableFallback
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}