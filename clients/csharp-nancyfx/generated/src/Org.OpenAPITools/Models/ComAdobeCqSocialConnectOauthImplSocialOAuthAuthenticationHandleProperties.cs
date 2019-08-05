using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties
    /// </summary>
    public sealed class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties:  IEquatable<ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyArray Path { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties()
        {
        }

        private ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(ConfigNodePropertyArray Path, ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.Path = Path;
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder</returns>
        public static ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder</returns>
        public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .ServiceRanking(ServiceRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties left, ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties left, ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder
        {
            private ConfigNodePropertyArray _Path;
            private ConfigNodePropertyInteger _ServiceRanking;

            internal ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder Path(ConfigNodePropertyArray value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties</returns>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(
                    Path: _Path,
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}