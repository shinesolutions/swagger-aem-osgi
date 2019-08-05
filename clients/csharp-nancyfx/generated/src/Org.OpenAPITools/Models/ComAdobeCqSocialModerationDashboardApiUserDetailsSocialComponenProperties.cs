using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties
    /// </summary>
    public sealed class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties:  IEquatable<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties>
    { 
        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties()
        {
        }

        private ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties(ConfigNodePropertyInteger Priority)
        {
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder</returns>
        public static ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder</returns>
        public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties left, ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties left, ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties</returns>
            public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties(
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}