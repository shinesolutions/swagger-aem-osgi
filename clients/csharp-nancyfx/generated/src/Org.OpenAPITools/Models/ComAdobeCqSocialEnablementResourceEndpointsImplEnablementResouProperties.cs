using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties:  IEquatable<ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties>
    { 
        /// <summary>
        /// FieldWhitelist
        /// </summary>
        public ConfigNodePropertyArray FieldWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties()
        {
        }

        private ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties(ConfigNodePropertyArray FieldWhitelist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder</returns>
        public static ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder</returns>
        public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder With()
        {
            return Builder()
                .FieldWhitelist(FieldWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties left, ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties left, ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;

            internal ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties</returns>
            public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties(
                    FieldWhitelist: _FieldWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}