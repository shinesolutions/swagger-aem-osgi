using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties>
    { 
        /// <summary>
        /// PriorityOrder
        /// </summary>
        public ConfigNodePropertyInteger PriorityOrder { get; private set; }

        /// <summary>
        /// ReplyEmailPatterns
        /// </summary>
        public ConfigNodePropertyArray ReplyEmailPatterns { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties(ConfigNodePropertyInteger PriorityOrder, ConfigNodePropertyArray ReplyEmailPatterns)
        {
            
            this.PriorityOrder = PriorityOrder;
            
            this.ReplyEmailPatterns = ReplyEmailPatterns;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder With()
        {
            return Builder()
                .PriorityOrder(PriorityOrder)
                .ReplyEmailPatterns(ReplyEmailPatterns);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder
        {
            private ConfigNodePropertyInteger _PriorityOrder;
            private ConfigNodePropertyArray _ReplyEmailPatterns;

            internal ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.PriorityOrder property.
            /// </summary>
            /// <param name="value">PriorityOrder</param>
            public ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder PriorityOrder(ConfigNodePropertyInteger value)
            {
                _PriorityOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.ReplyEmailPatterns property.
            /// </summary>
            /// <param name="value">ReplyEmailPatterns</param>
            public ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesBuilder ReplyEmailPatterns(ConfigNodePropertyArray value)
            {
                _ReplyEmailPatterns = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties(
                    PriorityOrder: _PriorityOrder,
                    ReplyEmailPatterns: _ReplyEmailPatterns
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}