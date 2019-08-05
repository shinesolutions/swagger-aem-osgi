using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties:  IEquatable<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties>
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
        /// Use ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties()
        {
        }

        private ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties(ConfigNodePropertyString EventTopics, ConfigNodePropertyString EventFilter)
        {
            
            this.EventTopics = EventTopics;
            
            this.EventFilter = EventFilter;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder</returns>
        public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties left, ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties left, ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _EventTopics;
            private ConfigNodePropertyString _EventFilter;

            internal ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.EventTopics property.
            /// </summary>
            /// <param name="value">EventTopics</param>
            public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder EventTopics(ConfigNodePropertyString value)
            {
                _EventTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties</returns>
            public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties(
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