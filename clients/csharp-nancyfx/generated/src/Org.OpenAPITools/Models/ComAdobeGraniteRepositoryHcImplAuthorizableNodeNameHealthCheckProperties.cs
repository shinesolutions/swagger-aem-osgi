using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties:  IEquatable<ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties()
        {
        }

        private ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties</returns>
            public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}