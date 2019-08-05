using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties:  IEquatable<ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties>
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
        /// Verbs
        /// </summary>
        public ConfigNodePropertyArray Verbs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties()
        {
        }

        private ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(ConfigNodePropertyString EventTopics, ConfigNodePropertyString EventFilter, ConfigNodePropertyArray Verbs)
        {
            
            this.EventTopics = EventTopics;
            
            this.EventFilter = EventFilter;
            
            this.Verbs = Verbs;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder With()
        {
            return Builder()
                .EventTopics(EventTopics)
                .EventFilter(EventFilter)
                .Verbs(Verbs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties left, ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties left, ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _EventTopics;
            private ConfigNodePropertyString _EventFilter;
            private ConfigNodePropertyArray _Verbs;

            internal ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.EventTopics property.
            /// </summary>
            /// <param name="value">EventTopics</param>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder EventTopics(ConfigNodePropertyString value)
            {
                _EventTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.Verbs property.
            /// </summary>
            /// <param name="value">Verbs</param>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesBuilder Verbs(ConfigNodePropertyArray value)
            {
                _Verbs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties</returns>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(
                    EventTopics: _EventTopics,
                    EventFilter: _EventFilter,
                    Verbs: _Verbs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}