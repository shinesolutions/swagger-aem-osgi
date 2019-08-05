using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties>
    { 
        /// <summary>
        /// ConnectProtocol
        /// </summary>
        public ConfigNodePropertyDropDown ConnectProtocol { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties(ConfigNodePropertyDropDown ConnectProtocol)
        {
            
            this.ConnectProtocol = ConnectProtocol;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder With()
        {
            return Builder()
                .ConnectProtocol(ConnectProtocol);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties left, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties left, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _ConnectProtocol;

            internal ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.ConnectProtocol property.
            /// </summary>
            /// <param name="value">ConnectProtocol</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder ConnectProtocol(ConfigNodePropertyDropDown value)
            {
                _ConnectProtocol = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties(
                    ConnectProtocol: _ConnectProtocol
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}