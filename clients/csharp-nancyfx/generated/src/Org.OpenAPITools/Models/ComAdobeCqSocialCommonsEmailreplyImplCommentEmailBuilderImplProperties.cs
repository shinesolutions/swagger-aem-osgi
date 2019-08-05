using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties>
    { 
        /// <summary>
        /// ContextPath
        /// </summary>
        public ConfigNodePropertyString ContextPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties(ConfigNodePropertyString ContextPath)
        {
            
            this.ContextPath = ContextPath;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder With()
        {
            return Builder()
                .ContextPath(ContextPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties left, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties left, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _ContextPath;

            internal ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.ContextPath property.
            /// </summary>
            /// <param name="value">ContextPath</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder ContextPath(ConfigNodePropertyString value)
            {
                _ContextPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties(
                    ContextPath: _ContextPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}