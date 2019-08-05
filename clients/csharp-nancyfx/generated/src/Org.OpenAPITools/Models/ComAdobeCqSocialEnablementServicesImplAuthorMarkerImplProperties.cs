using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties:  IEquatable<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties()
        {
        }

        private ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties(ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder</returns>
        public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties left, ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties left, ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;

            internal ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties</returns>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties(
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}