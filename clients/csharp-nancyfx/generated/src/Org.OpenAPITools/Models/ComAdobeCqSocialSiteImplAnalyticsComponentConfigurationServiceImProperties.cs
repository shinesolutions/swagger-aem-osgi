using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties
    /// </summary>
    public sealed class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties:  IEquatable<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties>
    { 
        /// <summary>
        /// CqSocialConsoleAnalyticsComponents
        /// </summary>
        public ConfigNodePropertyArray CqSocialConsoleAnalyticsComponents { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties()
        {
        }

        private ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties(ConfigNodePropertyArray CqSocialConsoleAnalyticsComponents)
        {
            
            this.CqSocialConsoleAnalyticsComponents = CqSocialConsoleAnalyticsComponents;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder</returns>
        public static ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder</returns>
        public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder With()
        {
            return Builder()
                .CqSocialConsoleAnalyticsComponents(CqSocialConsoleAnalyticsComponents);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties left, ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties left, ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqSocialConsoleAnalyticsComponents;

            internal ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.CqSocialConsoleAnalyticsComponents property.
            /// </summary>
            /// <param name="value">CqSocialConsoleAnalyticsComponents</param>
            public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesBuilder CqSocialConsoleAnalyticsComponents(ConfigNodePropertyArray value)
            {
                _CqSocialConsoleAnalyticsComponents = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties</returns>
            public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties(
                    CqSocialConsoleAnalyticsComponents: _CqSocialConsoleAnalyticsComponents
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}