using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties:  IEquatable<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties()
        {
        }

        private ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties left, ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties left, ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties</returns>
            public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}