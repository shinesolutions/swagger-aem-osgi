using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties:  IEquatable<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties>
    { 
        /// <summary>
        /// IsPrimaryPublisher
        /// </summary>
        public ConfigNodePropertyBoolean IsPrimaryPublisher { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties()
        {
        }

        private ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties(ConfigNodePropertyBoolean IsPrimaryPublisher)
        {
            
            this.IsPrimaryPublisher = IsPrimaryPublisher;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder</returns>
        public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder With()
        {
            return Builder()
                .IsPrimaryPublisher(IsPrimaryPublisher);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties left, ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties left, ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _IsPrimaryPublisher;

            internal ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.IsPrimaryPublisher property.
            /// </summary>
            /// <param name="value">IsPrimaryPublisher</param>
            public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesBuilder IsPrimaryPublisher(ConfigNodePropertyBoolean value)
            {
                _IsPrimaryPublisher = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties</returns>
            public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties(
                    IsPrimaryPublisher: _IsPrimaryPublisher
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}