using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties
    /// </summary>
    public sealed class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties:  IEquatable<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties>
    { 
        /// <summary>
        /// CommunitiesIntegrationLivefyreSlingEventFilter
        /// </summary>
        public ConfigNodePropertyString CommunitiesIntegrationLivefyreSlingEventFilter { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties()
        {
        }

        private ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(ConfigNodePropertyString CommunitiesIntegrationLivefyreSlingEventFilter)
        {
            
            this.CommunitiesIntegrationLivefyreSlingEventFilter = CommunitiesIntegrationLivefyreSlingEventFilter;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.
        /// </summary>
        /// <returns>ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder</returns>
        public static ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder Builder()
        {
            return new ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder</returns>
        public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder With()
        {
            return Builder()
                .CommunitiesIntegrationLivefyreSlingEventFilter(CommunitiesIntegrationLivefyreSlingEventFilter);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties</param>
        /// <param name="right">Compared (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties left, ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties</param>
        /// <param name="right">Compared (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties left, ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.
        /// </summary>
        public sealed class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder
        {
            private ConfigNodePropertyString _CommunitiesIntegrationLivefyreSlingEventFilter;

            internal ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.CommunitiesIntegrationLivefyreSlingEventFilter property.
            /// </summary>
            /// <param name="value">CommunitiesIntegrationLivefyreSlingEventFilter</param>
            public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesBuilder CommunitiesIntegrationLivefyreSlingEventFilter(ConfigNodePropertyString value)
            {
                _CommunitiesIntegrationLivefyreSlingEventFilter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.
            /// </summary>
            /// <returns>ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties</returns>
            public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties Build()
            {
                Validate();
                return new ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(
                    CommunitiesIntegrationLivefyreSlingEventFilter: _CommunitiesIntegrationLivefyreSlingEventFilter
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}