using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties>
    { 
        /// <summary>
        /// EventTopics
        /// </summary>
        public ConfigNodePropertyString EventTopics { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties(ConfigNodePropertyString EventTopics)
        {
            
            this.EventTopics = EventTopics;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder With()
        {
            return Builder()
                .EventTopics(EventTopics);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties left, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties left, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyString _EventTopics;

            internal ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.EventTopics property.
            /// </summary>
            /// <param name="value">EventTopics</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder EventTopics(ConfigNodePropertyString value)
            {
                _EventTopics = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties(
                    EventTopics: _EventTopics
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}