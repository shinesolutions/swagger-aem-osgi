using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialScoringImplScoringEventListenerProperties
    /// </summary>
    public sealed class ComAdobeCqSocialScoringImplScoringEventListenerProperties:  IEquatable<ComAdobeCqSocialScoringImplScoringEventListenerProperties>
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
        /// Use ComAdobeCqSocialScoringImplScoringEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialScoringImplScoringEventListenerProperties()
        {
        }

        private ComAdobeCqSocialScoringImplScoringEventListenerProperties(ConfigNodePropertyString EventTopics, ConfigNodePropertyString EventFilter)
        {
            
            this.EventTopics = EventTopics;
            
            this.EventFilter = EventFilter;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialScoringImplScoringEventListenerProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder</returns>
        public static ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder</returns>
        public ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialScoringImplScoringEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialScoringImplScoringEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScoringImplScoringEventListenerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialScoringImplScoringEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialScoringImplScoringEventListenerProperties left, ComAdobeCqSocialScoringImplScoringEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialScoringImplScoringEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScoringImplScoringEventListenerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialScoringImplScoringEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialScoringImplScoringEventListenerProperties left, ComAdobeCqSocialScoringImplScoringEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialScoringImplScoringEventListenerProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyString _EventTopics;
            private ConfigNodePropertyString _EventFilter;

            internal ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScoringImplScoringEventListenerProperties.EventTopics property.
            /// </summary>
            /// <param name="value">EventTopics</param>
            public ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder EventTopics(ConfigNodePropertyString value)
            {
                _EventTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScoringImplScoringEventListenerProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComAdobeCqSocialScoringImplScoringEventListenerPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialScoringImplScoringEventListenerProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialScoringImplScoringEventListenerProperties</returns>
            public ComAdobeCqSocialScoringImplScoringEventListenerProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialScoringImplScoringEventListenerProperties(
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