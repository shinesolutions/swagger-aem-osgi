using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties>
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
        /// Use ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties(ConfigNodePropertyInteger PriorityOrder, ConfigNodePropertyArray ReplyEmailPatterns)
        {
            
            this.PriorityOrder = PriorityOrder;
            
            this.ReplyEmailPatterns = ReplyEmailPatterns;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder
        {
            private ConfigNodePropertyInteger _PriorityOrder;
            private ConfigNodePropertyArray _ReplyEmailPatterns;

            internal ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.PriorityOrder property.
            /// </summary>
            /// <param name="value">PriorityOrder</param>
            public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder PriorityOrder(ConfigNodePropertyInteger value)
            {
                _PriorityOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.ReplyEmailPatterns property.
            /// </summary>
            /// <param name="value">ReplyEmailPatterns</param>
            public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder ReplyEmailPatterns(ConfigNodePropertyArray value)
            {
                _ReplyEmailPatterns = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties(
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