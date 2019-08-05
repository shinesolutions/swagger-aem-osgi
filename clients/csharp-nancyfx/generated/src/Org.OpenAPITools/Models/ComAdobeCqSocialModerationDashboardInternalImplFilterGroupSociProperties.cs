using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
    /// </summary>
    public sealed class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties:  IEquatable<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties>
    { 
        /// <summary>
        /// ResourceTypeFilters
        /// </summary>
        public ConfigNodePropertyArray ResourceTypeFilters { get; private set; }

        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties()
        {
        }

        private ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(ConfigNodePropertyArray ResourceTypeFilters, ConfigNodePropertyInteger Priority)
        {
            
            this.ResourceTypeFilters = ResourceTypeFilters;
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder</returns>
        public static ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder</returns>
        public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder With()
        {
            return Builder()
                .ResourceTypeFilters(ResourceTypeFilters)
                .Priority(Priority);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties left, ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties left, ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder
        {
            private ConfigNodePropertyArray _ResourceTypeFilters;
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.ResourceTypeFilters property.
            /// </summary>
            /// <param name="value">ResourceTypeFilters</param>
            public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder ResourceTypeFilters(ConfigNodePropertyArray value)
            {
                _ResourceTypeFilters = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties</returns>
            public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(
                    ResourceTypeFilters: _ResourceTypeFilters,
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}