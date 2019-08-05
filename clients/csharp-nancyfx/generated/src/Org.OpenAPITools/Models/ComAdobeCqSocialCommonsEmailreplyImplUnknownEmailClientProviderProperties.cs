using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties>
    { 
        /// <summary>
        /// ReplyEmailPatterns
        /// </summary>
        public ConfigNodePropertyArray ReplyEmailPatterns { get; private set; }

        /// <summary>
        /// PriorityOrder
        /// </summary>
        public ConfigNodePropertyInteger PriorityOrder { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(ConfigNodePropertyArray ReplyEmailPatterns, ConfigNodePropertyInteger PriorityOrder)
        {
            
            this.ReplyEmailPatterns = ReplyEmailPatterns;
            
            this.PriorityOrder = PriorityOrder;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder With()
        {
            return Builder()
                .ReplyEmailPatterns(ReplyEmailPatterns)
                .PriorityOrder(PriorityOrder);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder
        {
            private ConfigNodePropertyArray _ReplyEmailPatterns;
            private ConfigNodePropertyInteger _PriorityOrder;

            internal ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.ReplyEmailPatterns property.
            /// </summary>
            /// <param name="value">ReplyEmailPatterns</param>
            public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder ReplyEmailPatterns(ConfigNodePropertyArray value)
            {
                _ReplyEmailPatterns = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.PriorityOrder property.
            /// </summary>
            /// <param name="value">PriorityOrder</param>
            public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder PriorityOrder(ConfigNodePropertyInteger value)
            {
                _PriorityOrder = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(
                    ReplyEmailPatterns: _ReplyEmailPatterns,
                    PriorityOrder: _PriorityOrder
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}