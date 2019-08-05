using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties:  IEquatable<ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties>
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
        /// ProviderConfigUserFolder
        /// </summary>
        public ConfigNodePropertyDropDown ProviderConfigUserFolder { get; private set; }

        /// <summary>
        /// ProviderConfigTwitterEnableParams
        /// </summary>
        public ConfigNodePropertyBoolean ProviderConfigTwitterEnableParams { get; private set; }

        /// <summary>
        /// ProviderConfigTwitterParams
        /// </summary>
        public ConfigNodePropertyArray ProviderConfigTwitterParams { get; private set; }

        /// <summary>
        /// ProviderConfigRefreshUserdataEnabled
        /// </summary>
        public ConfigNodePropertyBoolean ProviderConfigRefreshUserdataEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties()
        {
        }

        private ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(ConfigNodePropertyString OauthProviderId, ConfigNodePropertyString OauthCloudConfigRoot, ConfigNodePropertyString ProviderConfigRoot, ConfigNodePropertyDropDown ProviderConfigUserFolder, ConfigNodePropertyBoolean ProviderConfigTwitterEnableParams, ConfigNodePropertyArray ProviderConfigTwitterParams, ConfigNodePropertyBoolean ProviderConfigRefreshUserdataEnabled)
        {
            
            this.OauthProviderId = OauthProviderId;
            
            this.OauthCloudConfigRoot = OauthCloudConfigRoot;
            
            this.ProviderConfigRoot = ProviderConfigRoot;
            
            this.ProviderConfigUserFolder = ProviderConfigUserFolder;
            
            this.ProviderConfigTwitterEnableParams = ProviderConfigTwitterEnableParams;
            
            this.ProviderConfigTwitterParams = ProviderConfigTwitterParams;
            
            this.ProviderConfigRefreshUserdataEnabled = ProviderConfigRefreshUserdataEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder</returns>
        public ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder With()
        {
            return Builder()
                .OauthProviderId(OauthProviderId)
                .OauthCloudConfigRoot(OauthCloudConfigRoot)
                .ProviderConfigRoot(ProviderConfigRoot)
                .ProviderConfigUserFolder(ProviderConfigUserFolder)
                .ProviderConfigTwitterEnableParams(ProviderConfigTwitterEnableParams)
                .ProviderConfigTwitterParams(ProviderConfigTwitterParams)
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

        public bool Equals(ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties left, ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties left, ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;
            private ConfigNodePropertyString _OauthCloudConfigRoot;
            private ConfigNodePropertyString _ProviderConfigRoot;
            private ConfigNodePropertyDropDown _ProviderConfigUserFolder;
            private ConfigNodePropertyBoolean _ProviderConfigTwitterEnableParams;
            private ConfigNodePropertyArray _ProviderConfigTwitterParams;
            private ConfigNodePropertyBoolean _ProviderConfigRefreshUserdataEnabled;

            internal ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.OauthCloudConfigRoot property.
            /// </summary>
            /// <param name="value">OauthCloudConfigRoot</param>
            public ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder OauthCloudConfigRoot(ConfigNodePropertyString value)
            {
                _OauthCloudConfigRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.ProviderConfigRoot property.
            /// </summary>
            /// <param name="value">ProviderConfigRoot</param>
            public ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder ProviderConfigRoot(ConfigNodePropertyString value)
            {
                _ProviderConfigRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.ProviderConfigUserFolder property.
            /// </summary>
            /// <param name="value">ProviderConfigUserFolder</param>
            public ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder ProviderConfigUserFolder(ConfigNodePropertyDropDown value)
            {
                _ProviderConfigUserFolder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.ProviderConfigTwitterEnableParams property.
            /// </summary>
            /// <param name="value">ProviderConfigTwitterEnableParams</param>
            public ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder ProviderConfigTwitterEnableParams(ConfigNodePropertyBoolean value)
            {
                _ProviderConfigTwitterEnableParams = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.ProviderConfigTwitterParams property.
            /// </summary>
            /// <param name="value">ProviderConfigTwitterParams</param>
            public ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder ProviderConfigTwitterParams(ConfigNodePropertyArray value)
            {
                _ProviderConfigTwitterParams = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.ProviderConfigRefreshUserdataEnabled property.
            /// </summary>
            /// <param name="value">ProviderConfigRefreshUserdataEnabled</param>
            public ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder ProviderConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean value)
            {
                _ProviderConfigRefreshUserdataEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties</returns>
            public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(
                    OauthProviderId: _OauthProviderId,
                    OauthCloudConfigRoot: _OauthCloudConfigRoot,
                    ProviderConfigRoot: _ProviderConfigRoot,
                    ProviderConfigUserFolder: _ProviderConfigUserFolder,
                    ProviderConfigTwitterEnableParams: _ProviderConfigTwitterEnableParams,
                    ProviderConfigTwitterParams: _ProviderConfigTwitterParams,
                    ProviderConfigRefreshUserdataEnabled: _ProviderConfigRefreshUserdataEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}