using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties>
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
        /// Use ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties(ConfigNodePropertyInteger PriorityOrder, ConfigNodePropertyArray ReplyEmailPatterns)
        {
            
            this.PriorityOrder = PriorityOrder;
            
            this.ReplyEmailPatterns = ReplyEmailPatterns;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder
        {
            private ConfigNodePropertyInteger _PriorityOrder;
            private ConfigNodePropertyArray _ReplyEmailPatterns;

            internal ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.PriorityOrder property.
            /// </summary>
            /// <param name="value">PriorityOrder</param>
            public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder PriorityOrder(ConfigNodePropertyInteger value)
            {
                _PriorityOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.ReplyEmailPatterns property.
            /// </summary>
            /// <param name="value">ReplyEmailPatterns</param>
            public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder ReplyEmailPatterns(ConfigNodePropertyArray value)
            {
                _ReplyEmailPatterns = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties(
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