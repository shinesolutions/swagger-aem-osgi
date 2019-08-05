using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialNotificationsImplNotificationsRouterProperties
    /// </summary>
    public sealed class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties:  IEquatable<ComAdobeCqSocialNotificationsImplNotificationsRouterProperties>
    { 
        /// <summary>
        /// EventTopics
        /// </summary>
        public ConfigNodePropertyString EventTopics { get; private set; }

        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialNotificationsImplNotificationsRouterProperties()
        {
        }

        private ComAdobeCqSocialNotificationsImplNotificationsRouterProperties(ConfigNodePropertyString EventTopics, ConfigNodePropertyString EventFilter)
        {
            
            this.EventTopics = EventTopics;
            
            this.EventFilter = EventFilter;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder</returns>
        public static ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder</returns>
        public ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder With()
        {
            return Builder()
                .EventTopics(EventTopics)
                .EventFilter(EventFilter);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialNotificationsImplNotificationsRouterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties left, ComAdobeCqSocialNotificationsImplNotificationsRouterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialNotificationsImplNotificationsRouterProperties left, ComAdobeCqSocialNotificationsImplNotificationsRouterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder
        {
            private ConfigNodePropertyString _EventTopics;
            private ConfigNodePropertyString _EventFilter;

            internal ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.EventTopics property.
            /// </summary>
            /// <param name="value">EventTopics</param>
            public ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder EventTopics(ConfigNodePropertyString value)
            {
                _EventTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComAdobeCqSocialNotificationsImplNotificationsRouterPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialNotificationsImplNotificationsRouterProperties</returns>
            public ComAdobeCqSocialNotificationsImplNotificationsRouterProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialNotificationsImplNotificationsRouterProperties(
                    EventTopics: _EventTopics,
                    EventFilter: _EventFilter
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}