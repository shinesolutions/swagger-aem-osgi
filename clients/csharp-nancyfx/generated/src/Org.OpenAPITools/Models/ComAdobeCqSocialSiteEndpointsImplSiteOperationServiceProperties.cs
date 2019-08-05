using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties
    /// </summary>
    public sealed class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties:  IEquatable<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties>
    { 
        /// <summary>
        /// FieldWhitelist
        /// </summary>
        public ConfigNodePropertyArray FieldWhitelist { get; private set; }

        /// <summary>
        /// SitePathFilters
        /// </summary>
        public ConfigNodePropertyArray SitePathFilters { get; private set; }

        /// <summary>
        /// SitePackageGroup
        /// </summary>
        public ConfigNodePropertyString SitePackageGroup { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties()
        {
        }

        private ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray SitePathFilters, ConfigNodePropertyString SitePackageGroup)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.SitePathFilters = SitePathFilters;
            
            this.SitePackageGroup = SitePackageGroup;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder</returns>
        public static ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder</returns>
        public ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder With()
        {
            return Builder()
                .FieldWhitelist(FieldWhitelist)
                .SitePathFilters(SitePathFilters)
                .SitePackageGroup(SitePackageGroup);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties left, ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties left, ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _SitePathFilters;
            private ConfigNodePropertyString _SitePackageGroup;

            internal ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.SitePathFilters property.
            /// </summary>
            /// <param name="value">SitePathFilters</param>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder SitePathFilters(ConfigNodePropertyArray value)
            {
                _SitePathFilters = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.SitePackageGroup property.
            /// </summary>
            /// <param name="value">SitePackageGroup</param>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder SitePackageGroup(ConfigNodePropertyString value)
            {
                _SitePackageGroup = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties</returns>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(
                    FieldWhitelist: _FieldWhitelist,
                    SitePathFilters: _SitePathFilters,
                    SitePackageGroup: _SitePackageGroup
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}