using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
    /// </summary>
    public sealed class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties:  IEquatable<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties>
    { 
        /// <summary>
        /// Facebook
        /// </summary>
        public ConfigNodePropertyArray Facebook { get; private set; }

        /// <summary>
        /// Twitter
        /// </summary>
        public ConfigNodePropertyArray Twitter { get; private set; }

        /// <summary>
        /// ProviderConfigUserFolder
        /// </summary>
        public ConfigNodePropertyString ProviderConfigUserFolder { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties()
        {
        }

        private ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(ConfigNodePropertyArray Facebook, ConfigNodePropertyArray Twitter, ConfigNodePropertyString ProviderConfigUserFolder)
        {
            
            this.Facebook = Facebook;
            
            this.Twitter = Twitter;
            
            this.ProviderConfigUserFolder = ProviderConfigUserFolder;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder</returns>
        public static ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder</returns>
        public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder With()
        {
            return Builder()
                .Facebook(Facebook)
                .Twitter(Twitter)
                .ProviderConfigUserFolder(ProviderConfigUserFolder);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties left, ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties left, ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder
        {
            private ConfigNodePropertyArray _Facebook;
            private ConfigNodePropertyArray _Twitter;
            private ConfigNodePropertyString _ProviderConfigUserFolder;

            internal ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.Facebook property.
            /// </summary>
            /// <param name="value">Facebook</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder Facebook(ConfigNodePropertyArray value)
            {
                _Facebook = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.Twitter property.
            /// </summary>
            /// <param name="value">Twitter</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder Twitter(ConfigNodePropertyArray value)
            {
                _Twitter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.ProviderConfigUserFolder property.
            /// </summary>
            /// <param name="value">ProviderConfigUserFolder</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder ProviderConfigUserFolder(ConfigNodePropertyString value)
            {
                _ProviderConfigUserFolder = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties</returns>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(
                    Facebook: _Facebook,
                    Twitter: _Twitter,
                    ProviderConfigUserFolder: _ProviderConfigUserFolder
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}