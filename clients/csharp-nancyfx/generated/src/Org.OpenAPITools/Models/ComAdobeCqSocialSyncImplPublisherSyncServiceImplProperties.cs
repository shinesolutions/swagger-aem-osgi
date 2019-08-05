using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties:  IEquatable<ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties>
    { 
        /// <summary>
        /// ActiveRunModes
        /// </summary>
        public ConfigNodePropertyArray ActiveRunModes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
        {
        }

        private ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(ConfigNodePropertyArray ActiveRunModes)
        {
            
            this.ActiveRunModes = ActiveRunModes;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder</returns>
        public ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder With()
        {
            return Builder()
                .ActiveRunModes(ActiveRunModes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties left, ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties left, ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ActiveRunModes;

            internal ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.ActiveRunModes property.
            /// </summary>
            /// <param name="value">ActiveRunModes</param>
            public ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesBuilder ActiveRunModes(ConfigNodePropertyArray value)
            {
                _ActiveRunModes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties</returns>
            public ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(
                    ActiveRunModes: _ActiveRunModes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}