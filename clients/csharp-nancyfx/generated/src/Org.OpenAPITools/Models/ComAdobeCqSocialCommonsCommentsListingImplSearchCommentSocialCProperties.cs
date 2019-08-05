using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties:  IEquatable<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties>
    { 
        /// <summary>
        /// NumUserLimit
        /// </summary>
        public ConfigNodePropertyInteger NumUserLimit { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties()
        {
        }

        private ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties(ConfigNodePropertyInteger NumUserLimit)
        {
            
            this.NumUserLimit = NumUserLimit;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder With()
        {
            return Builder()
                .NumUserLimit(NumUserLimit);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties left, ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties left, ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder
        {
            private ConfigNodePropertyInteger _NumUserLimit;

            internal ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.NumUserLimit property.
            /// </summary>
            /// <param name="value">NumUserLimit</param>
            public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder NumUserLimit(ConfigNodePropertyInteger value)
            {
                _NumUserLimit = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties</returns>
            public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties(
                    NumUserLimit: _NumUserLimit
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}