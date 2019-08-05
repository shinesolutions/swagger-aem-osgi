using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties
    /// </summary>
    public sealed class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties:  IEquatable<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties>
    { 
        /// <summary>
        /// CqSocialContentFragmentsServicesEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqSocialContentFragmentsServicesEnabled { get; private set; }

        /// <summary>
        /// CqSocialContentFragmentsServicesWaitTimeSeconds
        /// </summary>
        public ConfigNodePropertyInteger CqSocialContentFragmentsServicesWaitTimeSeconds { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties()
        {
        }

        private ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(ConfigNodePropertyBoolean CqSocialContentFragmentsServicesEnabled, ConfigNodePropertyInteger CqSocialContentFragmentsServicesWaitTimeSeconds)
        {
            
            this.CqSocialContentFragmentsServicesEnabled = CqSocialContentFragmentsServicesEnabled;
            
            this.CqSocialContentFragmentsServicesWaitTimeSeconds = CqSocialContentFragmentsServicesWaitTimeSeconds;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder</returns>
        public static ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder</returns>
        public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder With()
        {
            return Builder()
                .CqSocialContentFragmentsServicesEnabled(CqSocialContentFragmentsServicesEnabled)
                .CqSocialContentFragmentsServicesWaitTimeSeconds(CqSocialContentFragmentsServicesWaitTimeSeconds);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties left, ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties left, ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqSocialContentFragmentsServicesEnabled;
            private ConfigNodePropertyInteger _CqSocialContentFragmentsServicesWaitTimeSeconds;

            internal ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.CqSocialContentFragmentsServicesEnabled property.
            /// </summary>
            /// <param name="value">CqSocialContentFragmentsServicesEnabled</param>
            public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder CqSocialContentFragmentsServicesEnabled(ConfigNodePropertyBoolean value)
            {
                _CqSocialContentFragmentsServicesEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.CqSocialContentFragmentsServicesWaitTimeSeconds property.
            /// </summary>
            /// <param name="value">CqSocialContentFragmentsServicesWaitTimeSeconds</param>
            public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesBuilder CqSocialContentFragmentsServicesWaitTimeSeconds(ConfigNodePropertyInteger value)
            {
                _CqSocialContentFragmentsServicesWaitTimeSeconds = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties</returns>
            public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(
                    CqSocialContentFragmentsServicesEnabled: _CqSocialContentFragmentsServicesEnabled,
                    CqSocialContentFragmentsServicesWaitTimeSeconds: _CqSocialContentFragmentsServicesWaitTimeSeconds
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}