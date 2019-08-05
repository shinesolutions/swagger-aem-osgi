using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties>
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
        /// Use ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties(ConfigNodePropertyInteger PriorityOrder, ConfigNodePropertyArray ReplyEmailPatterns)
        {
            
            this.PriorityOrder = PriorityOrder;
            
            this.ReplyEmailPatterns = ReplyEmailPatterns;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties left, ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder
        {
            private ConfigNodePropertyInteger _PriorityOrder;
            private ConfigNodePropertyArray _ReplyEmailPatterns;

            internal ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.PriorityOrder property.
            /// </summary>
            /// <param name="value">PriorityOrder</param>
            public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder PriorityOrder(ConfigNodePropertyInteger value)
            {
                _PriorityOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.ReplyEmailPatterns property.
            /// </summary>
            /// <param name="value">ReplyEmailPatterns</param>
            public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesBuilder ReplyEmailPatterns(ConfigNodePropertyArray value)
            {
                _ReplyEmailPatterns = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties(
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