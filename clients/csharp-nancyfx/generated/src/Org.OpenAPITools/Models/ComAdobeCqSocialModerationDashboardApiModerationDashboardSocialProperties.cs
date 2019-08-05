using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties
    /// </summary>
    public sealed class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties:  IEquatable<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties>
    { 
        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties()
        {
        }

        private ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties(ConfigNodePropertyInteger Priority)
        {
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder</returns>
        public static ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder</returns>
        public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder With()
        {
            return Builder()
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

        public bool Equals(ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties left, ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties left, ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties</returns>
            public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties(
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}