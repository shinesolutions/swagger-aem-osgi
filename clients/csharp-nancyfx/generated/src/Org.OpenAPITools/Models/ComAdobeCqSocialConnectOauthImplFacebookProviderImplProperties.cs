using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties:  IEquatable<ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties>
    { 
        /// <summary>
        /// OauthProviderId
        /// </summary>
        public ConfigNodePropertyString OauthProviderId { get; private set; }

        /// <summary>
        /// OauthCloudConfigRoot
        /// </summary>
        public ConfigNodePropertyString OauthCloudConfigRoot { get; private set; }

        /// <summary>
        /// ProviderConfigRoot
        /// </summary>
        public ConfigNodePropertyString ProviderConfigRoot { get; private set; }

        /// <summary>
        /// ProviderConfigCreateTagsEnabled
        /// </summary>
        public ConfigNodePropertyBoolean ProviderConfigCreateTagsEnabled { get; private set; }

        /// <summary>
        /// ProviderConfigUserFolder
        /// </summary>
        public ConfigNodePropertyDropDown ProviderConfigUserFolder { get; private set; }

        /// <summary>
        /// ProviderConfigFacebookFetchFields
        /// </summary>
        public ConfigNodePropertyBoolean ProviderConfigFacebookFetchFields { get; private set; }

        /// <summary>
        /// ProviderConfigFacebookFields
        /// </summary>
        public ConfigNodePropertyArray ProviderConfigFacebookFields { get; private set; }

        /// <summary>
        /// ProviderConfigRefreshUserdataEnabled
        /// </summary>
        public ConfigNodePropertyBoolean ProviderConfigRefreshUserdataEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties()
        {
        }

        private ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(ConfigNodePropertyString OauthProviderId, ConfigNodePropertyString OauthCloudConfigRoot, ConfigNodePropertyString ProviderConfigRoot, ConfigNodePropertyBoolean ProviderConfigCreateTagsEnabled, ConfigNodePropertyDropDown ProviderConfigUserFolder, ConfigNodePropertyBoolean ProviderConfigFacebookFetchFields, ConfigNodePropertyArray ProviderConfigFacebookFields, ConfigNodePropertyBoolean ProviderConfigRefreshUserdataEnabled)
        {
            
            this.OauthProviderId = OauthProviderId;
            
            this.OauthCloudConfigRoot = OauthCloudConfigRoot;
            
            this.ProviderConfigRoot = ProviderConfigRoot;
            
            this.ProviderConfigCreateTagsEnabled = ProviderConfigCreateTagsEnabled;
            
            this.ProviderConfigUserFolder = ProviderConfigUserFolder;
            
            this.ProviderConfigFacebookFetchFields = ProviderConfigFacebookFetchFields;
            
            this.ProviderConfigFacebookFields = ProviderConfigFacebookFields;
            
            this.ProviderConfigRefreshUserdataEnabled = ProviderConfigRefreshUserdataEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder</returns>
        public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder With()
        {
            return Builder()
                .OauthProviderId(OauthProviderId)
                .OauthCloudConfigRoot(OauthCloudConfigRoot)
                .ProviderConfigRoot(ProviderConfigRoot)
                .ProviderConfigCreateTagsEnabled(ProviderConfigCreateTagsEnabled)
                .ProviderConfigUserFolder(ProviderConfigUserFolder)
                .ProviderConfigFacebookFetchFields(ProviderConfigFacebookFetchFields)
                .ProviderConfigFacebookFields(ProviderConfigFacebookFields)
                .ProviderConfigRefreshUserdataEnabled(ProviderConfigRefreshUserdataEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties left, ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties left, ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;
            private ConfigNodePropertyString _OauthCloudConfigRoot;
            private ConfigNodePropertyString _ProviderConfigRoot;
            private ConfigNodePropertyBoolean _ProviderConfigCreateTagsEnabled;
            private ConfigNodePropertyDropDown _ProviderConfigUserFolder;
            private ConfigNodePropertyBoolean _ProviderConfigFacebookFetchFields;
            private ConfigNodePropertyArray _ProviderConfigFacebookFields;
            private ConfigNodePropertyBoolean _ProviderConfigRefreshUserdataEnabled;

            internal ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.OauthCloudConfigRoot property.
            /// </summary>
            /// <param name="value">OauthCloudConfigRoot</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder OauthCloudConfigRoot(ConfigNodePropertyString value)
            {
                _OauthCloudConfigRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.ProviderConfigRoot property.
            /// </summary>
            /// <param name="value">ProviderConfigRoot</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder ProviderConfigRoot(ConfigNodePropertyString value)
            {
                _ProviderConfigRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.ProviderConfigCreateTagsEnabled property.
            /// </summary>
            /// <param name="value">ProviderConfigCreateTagsEnabled</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder ProviderConfigCreateTagsEnabled(ConfigNodePropertyBoolean value)
            {
                _ProviderConfigCreateTagsEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.ProviderConfigUserFolder property.
            /// </summary>
            /// <param name="value">ProviderConfigUserFolder</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder ProviderConfigUserFolder(ConfigNodePropertyDropDown value)
            {
                _ProviderConfigUserFolder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.ProviderConfigFacebookFetchFields property.
            /// </summary>
            /// <param name="value">ProviderConfigFacebookFetchFields</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder ProviderConfigFacebookFetchFields(ConfigNodePropertyBoolean value)
            {
                _ProviderConfigFacebookFetchFields = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.ProviderConfigFacebookFields property.
            /// </summary>
            /// <param name="value">ProviderConfigFacebookFields</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder ProviderConfigFacebookFields(ConfigNodePropertyArray value)
            {
                _ProviderConfigFacebookFields = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.ProviderConfigRefreshUserdataEnabled property.
            /// </summary>
            /// <param name="value">ProviderConfigRefreshUserdataEnabled</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesBuilder ProviderConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean value)
            {
                _ProviderConfigRefreshUserdataEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties</returns>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(
                    OauthProviderId: _OauthProviderId,
                    OauthCloudConfigRoot: _OauthCloudConfigRoot,
                    ProviderConfigRoot: _ProviderConfigRoot,
                    ProviderConfigCreateTagsEnabled: _ProviderConfigCreateTagsEnabled,
                    ProviderConfigUserFolder: _ProviderConfigUserFolder,
                    ProviderConfigFacebookFetchFields: _ProviderConfigFacebookFetchFields,
                    ProviderConfigFacebookFields: _ProviderConfigFacebookFields,
                    ProviderConfigRefreshUserdataEnabled: _ProviderConfigRefreshUserdataEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}