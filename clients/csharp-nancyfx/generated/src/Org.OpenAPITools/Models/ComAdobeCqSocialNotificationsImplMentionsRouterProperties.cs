using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialNotificationsImplMentionsRouterProperties
    /// </summary>
    public sealed class ComAdobeCqSocialNotificationsImplMentionsRouterProperties:  IEquatable<ComAdobeCqSocialNotificationsImplMentionsRouterProperties>
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
        /// Use ComAdobeCqSocialNotificationsImplMentionsRouterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialNotificationsImplMentionsRouterProperties()
        {
        }

        private ComAdobeCqSocialNotificationsImplMentionsRouterProperties(ConfigNodePropertyString EventTopics, ConfigNodePropertyString EventFilter)
        {
            
            this.EventTopics = EventTopics;
            
            this.EventFilter = EventFilter;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialNotificationsImplMentionsRouterProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder</returns>
        public static ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder</returns>
        public ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialNotificationsImplMentionsRouterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialNotificationsImplMentionsRouterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplMentionsRouterProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplMentionsRouterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialNotificationsImplMentionsRouterProperties left, ComAdobeCqSocialNotificationsImplMentionsRouterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialNotificationsImplMentionsRouterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplMentionsRouterProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplMentionsRouterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialNotificationsImplMentionsRouterProperties left, ComAdobeCqSocialNotificationsImplMentionsRouterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialNotificationsImplMentionsRouterProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder
        {
            private ConfigNodePropertyString _EventTopics;
            private ConfigNodePropertyString _EventFilter;

            internal ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplMentionsRouterProperties.EventTopics property.
            /// </summary>
            /// <param name="value">EventTopics</param>
            public ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder EventTopics(ConfigNodePropertyString value)
            {
                _EventTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplMentionsRouterProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComAdobeCqSocialNotificationsImplMentionsRouterPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialNotificationsImplMentionsRouterProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialNotificationsImplMentionsRouterProperties</returns>
            public ComAdobeCqSocialNotificationsImplMentionsRouterProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialNotificationsImplMentionsRouterProperties(
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