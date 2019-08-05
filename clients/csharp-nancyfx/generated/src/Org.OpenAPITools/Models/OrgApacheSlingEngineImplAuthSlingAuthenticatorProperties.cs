using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
    /// </summary>
    public sealed class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties:  IEquatable<OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties>
    { 
        /// <summary>
        /// OsgiHttpWhiteboardContextSelect
        /// </summary>
        public ConfigNodePropertyString OsgiHttpWhiteboardContextSelect { get; private set; }

        /// <summary>
        /// OsgiHttpWhiteboardListener
        /// </summary>
        public ConfigNodePropertyString OsgiHttpWhiteboardListener { get; private set; }

        /// <summary>
        /// AuthSudoCookie
        /// </summary>
        public ConfigNodePropertyString AuthSudoCookie { get; private set; }

        /// <summary>
        /// AuthSudoParameter
        /// </summary>
        public ConfigNodePropertyString AuthSudoParameter { get; private set; }

        /// <summary>
        /// AuthAnnonymous
        /// </summary>
        public ConfigNodePropertyBoolean AuthAnnonymous { get; private set; }

        /// <summary>
        /// SlingAuthRequirements
        /// </summary>
        public ConfigNodePropertyArray SlingAuthRequirements { get; private set; }

        /// <summary>
        /// SlingAuthAnonymousUser
        /// </summary>
        public ConfigNodePropertyString SlingAuthAnonymousUser { get; private set; }

        /// <summary>
        /// SlingAuthAnonymousPassword
        /// </summary>
        public ConfigNodePropertyString SlingAuthAnonymousPassword { get; private set; }

        /// <summary>
        /// AuthHttp
        /// </summary>
        public ConfigNodePropertyDropDown AuthHttp { get; private set; }

        /// <summary>
        /// AuthHttpRealm
        /// </summary>
        public ConfigNodePropertyString AuthHttpRealm { get; private set; }

        /// <summary>
        /// AuthUriSuffix
        /// </summary>
        public ConfigNodePropertyArray AuthUriSuffix { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties()
        {
        }

        private OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(ConfigNodePropertyString OsgiHttpWhiteboardContextSelect, ConfigNodePropertyString OsgiHttpWhiteboardListener, ConfigNodePropertyString AuthSudoCookie, ConfigNodePropertyString AuthSudoParameter, ConfigNodePropertyBoolean AuthAnnonymous, ConfigNodePropertyArray SlingAuthRequirements, ConfigNodePropertyString SlingAuthAnonymousUser, ConfigNodePropertyString SlingAuthAnonymousPassword, ConfigNodePropertyDropDown AuthHttp, ConfigNodePropertyString AuthHttpRealm, ConfigNodePropertyArray AuthUriSuffix)
        {
            
            this.OsgiHttpWhiteboardContextSelect = OsgiHttpWhiteboardContextSelect;
            
            this.OsgiHttpWhiteboardListener = OsgiHttpWhiteboardListener;
            
            this.AuthSudoCookie = AuthSudoCookie;
            
            this.AuthSudoParameter = AuthSudoParameter;
            
            this.AuthAnnonymous = AuthAnnonymous;
            
            this.SlingAuthRequirements = SlingAuthRequirements;
            
            this.SlingAuthAnonymousUser = SlingAuthAnonymousUser;
            
            this.SlingAuthAnonymousPassword = SlingAuthAnonymousPassword;
            
            this.AuthHttp = AuthHttp;
            
            this.AuthHttpRealm = AuthHttpRealm;
            
            this.AuthUriSuffix = AuthUriSuffix;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder</returns>
        public static OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder</returns>
        public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder With()
        {
            return Builder()
                .OsgiHttpWhiteboardContextSelect(OsgiHttpWhiteboardContextSelect)
                .OsgiHttpWhiteboardListener(OsgiHttpWhiteboardListener)
                .AuthSudoCookie(AuthSudoCookie)
                .AuthSudoParameter(AuthSudoParameter)
                .AuthAnnonymous(AuthAnnonymous)
                .SlingAuthRequirements(SlingAuthRequirements)
                .SlingAuthAnonymousUser(SlingAuthAnonymousUser)
                .SlingAuthAnonymousPassword(SlingAuthAnonymousPassword)
                .AuthHttp(AuthHttp)
                .AuthHttpRealm(AuthHttpRealm)
                .AuthUriSuffix(AuthUriSuffix);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties left, OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties left, OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder
        {
            private ConfigNodePropertyString _OsgiHttpWhiteboardContextSelect;
            private ConfigNodePropertyString _OsgiHttpWhiteboardListener;
            private ConfigNodePropertyString _AuthSudoCookie;
            private ConfigNodePropertyString _AuthSudoParameter;
            private ConfigNodePropertyBoolean _AuthAnnonymous;
            private ConfigNodePropertyArray _SlingAuthRequirements;
            private ConfigNodePropertyString _SlingAuthAnonymousUser;
            private ConfigNodePropertyString _SlingAuthAnonymousPassword;
            private ConfigNodePropertyDropDown _AuthHttp;
            private ConfigNodePropertyString _AuthHttpRealm;
            private ConfigNodePropertyArray _AuthUriSuffix;

            internal OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.OsgiHttpWhiteboardContextSelect property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardContextSelect</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder OsgiHttpWhiteboardContextSelect(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardContextSelect = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.OsgiHttpWhiteboardListener property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardListener</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder OsgiHttpWhiteboardListener(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardListener = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.AuthSudoCookie property.
            /// </summary>
            /// <param name="value">AuthSudoCookie</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder AuthSudoCookie(ConfigNodePropertyString value)
            {
                _AuthSudoCookie = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.AuthSudoParameter property.
            /// </summary>
            /// <param name="value">AuthSudoParameter</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder AuthSudoParameter(ConfigNodePropertyString value)
            {
                _AuthSudoParameter = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.AuthAnnonymous property.
            /// </summary>
            /// <param name="value">AuthAnnonymous</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder AuthAnnonymous(ConfigNodePropertyBoolean value)
            {
                _AuthAnnonymous = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.SlingAuthRequirements property.
            /// </summary>
            /// <param name="value">SlingAuthRequirements</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder SlingAuthRequirements(ConfigNodePropertyArray value)
            {
                _SlingAuthRequirements = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.SlingAuthAnonymousUser property.
            /// </summary>
            /// <param name="value">SlingAuthAnonymousUser</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder SlingAuthAnonymousUser(ConfigNodePropertyString value)
            {
                _SlingAuthAnonymousUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.SlingAuthAnonymousPassword property.
            /// </summary>
            /// <param name="value">SlingAuthAnonymousPassword</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder SlingAuthAnonymousPassword(ConfigNodePropertyString value)
            {
                _SlingAuthAnonymousPassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.AuthHttp property.
            /// </summary>
            /// <param name="value">AuthHttp</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder AuthHttp(ConfigNodePropertyDropDown value)
            {
                _AuthHttp = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.AuthHttpRealm property.
            /// </summary>
            /// <param name="value">AuthHttpRealm</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder AuthHttpRealm(ConfigNodePropertyString value)
            {
                _AuthHttpRealm = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.AuthUriSuffix property.
            /// </summary>
            /// <param name="value">AuthUriSuffix</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder AuthUriSuffix(ConfigNodePropertyArray value)
            {
                _AuthUriSuffix = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties</returns>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(
                    OsgiHttpWhiteboardContextSelect: _OsgiHttpWhiteboardContextSelect,
                    OsgiHttpWhiteboardListener: _OsgiHttpWhiteboardListener,
                    AuthSudoCookie: _AuthSudoCookie,
                    AuthSudoParameter: _AuthSudoParameter,
                    AuthAnnonymous: _AuthAnnonymous,
                    SlingAuthRequirements: _SlingAuthRequirements,
                    SlingAuthAnonymousUser: _SlingAuthAnonymousUser,
                    SlingAuthAnonymousPassword: _SlingAuthAnonymousPassword,
                    AuthHttp: _AuthHttp,
                    AuthHttpRealm: _AuthHttpRealm,
                    AuthUriSuffix: _AuthUriSuffix
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}