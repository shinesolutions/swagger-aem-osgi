using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties
    /// </summary>
    public sealed class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties:  IEquatable<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties>
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
        /// Use ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties()
        {
        }

        private ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties(ConfigNodePropertyArray ResourceTypeFilters, ConfigNodePropertyInteger Priority)
        {
            
            this.ResourceTypeFilters = ResourceTypeFilters;
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder</returns>
        public static ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder</returns>
        public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties left, ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties left, ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder
        {
            private ConfigNodePropertyArray _ResourceTypeFilters;
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.ResourceTypeFilters property.
            /// </summary>
            /// <param name="value">ResourceTypeFilters</param>
            public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder ResourceTypeFilters(ConfigNodePropertyArray value)
            {
                _ResourceTypeFilters = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties</returns>
            public ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties(
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