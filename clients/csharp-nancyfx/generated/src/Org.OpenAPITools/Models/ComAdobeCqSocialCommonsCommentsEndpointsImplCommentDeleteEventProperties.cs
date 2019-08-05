using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties:  IEquatable<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties>
    { 
        /// <summary>
        /// Ranking
        /// </summary>
        public ConfigNodePropertyInteger Ranking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties()
        {
        }

        private ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(ConfigNodePropertyInteger Ranking)
        {
            
            this.Ranking = Ranking;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder With()
        {
            return Builder()
                .Ranking(Ranking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties left, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties left, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Ranking;

            internal ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.Ranking property.
            /// </summary>
            /// <param name="value">Ranking</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder Ranking(ConfigNodePropertyInteger value)
            {
                _Ranking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties</returns>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(
                    Ranking: _Ranking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}