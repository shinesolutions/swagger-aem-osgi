using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties:  IEquatable<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties>
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
        /// IdpUrl
        /// </summary>
        public ConfigNodePropertyString IdpUrl { get; private set; }

        /// <summary>
        /// IdpCertAlias
        /// </summary>
        public ConfigNodePropertyString IdpCertAlias { get; private set; }

        /// <summary>
        /// IdpHttpRedirect
        /// </summary>
        public ConfigNodePropertyBoolean IdpHttpRedirect { get; private set; }

        /// <summary>
        /// ServiceProviderEntityId
        /// </summary>
        public ConfigNodePropertyString ServiceProviderEntityId { get; private set; }

        /// <summary>
        /// AssertionConsumerServiceURL
        /// </summary>
        public ConfigNodePropertyString AssertionConsumerServiceURL { get; private set; }

        /// <summary>
        /// SpPrivateKeyAlias
        /// </summary>
        public ConfigNodePropertyString SpPrivateKeyAlias { get; private set; }

        /// <summary>
        /// KeyStorePassword
        /// </summary>
        public ConfigNodePropertyString KeyStorePassword { get; private set; }

        /// <summary>
        /// DefaultRedirectUrl
        /// </summary>
        public ConfigNodePropertyString DefaultRedirectUrl { get; private set; }

        /// <summary>
        /// UserIDAttribute
        /// </summary>
        public ConfigNodePropertyString UserIDAttribute { get; private set; }

        /// <summary>
        /// UseEncryption
        /// </summary>
        public ConfigNodePropertyBoolean UseEncryption { get; private set; }

        /// <summary>
        /// CreateUser
        /// </summary>
        public ConfigNodePropertyBoolean CreateUser { get; private set; }

        /// <summary>
        /// UserIntermediatePath
        /// </summary>
        public ConfigNodePropertyString UserIntermediatePath { get; private set; }

        /// <summary>
        /// AddGroupMemberships
        /// </summary>
        public ConfigNodePropertyBoolean AddGroupMemberships { get; private set; }

        /// <summary>
        /// GroupMembershipAttribute
        /// </summary>
        public ConfigNodePropertyString GroupMembershipAttribute { get; private set; }

        /// <summary>
        /// DefaultGroups
        /// </summary>
        public ConfigNodePropertyArray DefaultGroups { get; private set; }

        /// <summary>
        /// NameIdFormat
        /// </summary>
        public ConfigNodePropertyString NameIdFormat { get; private set; }

        /// <summary>
        /// SynchronizeAttributes
        /// </summary>
        public ConfigNodePropertyArray SynchronizeAttributes { get; private set; }

        /// <summary>
        /// HandleLogout
        /// </summary>
        public ConfigNodePropertyBoolean HandleLogout { get; private set; }

        /// <summary>
        /// LogoutUrl
        /// </summary>
        public ConfigNodePropertyString LogoutUrl { get; private set; }

        /// <summary>
        /// ClockTolerance
        /// </summary>
        public ConfigNodePropertyInteger ClockTolerance { get; private set; }

        /// <summary>
        /// DigestMethod
        /// </summary>
        public ConfigNodePropertyString DigestMethod { get; private set; }

        /// <summary>
        /// SignatureMethod
        /// </summary>
        public ConfigNodePropertyString SignatureMethod { get; private set; }

        /// <summary>
        /// IdentitySyncType
        /// </summary>
        public ConfigNodePropertyDropDown IdentitySyncType { get; private set; }

        /// <summary>
        /// IdpIdentifier
        /// </summary>
        public ConfigNodePropertyString IdpIdentifier { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties()
        {
        }

        private ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(ConfigNodePropertyArray Path, ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString IdpUrl, ConfigNodePropertyString IdpCertAlias, ConfigNodePropertyBoolean IdpHttpRedirect, ConfigNodePropertyString ServiceProviderEntityId, ConfigNodePropertyString AssertionConsumerServiceURL, ConfigNodePropertyString SpPrivateKeyAlias, ConfigNodePropertyString KeyStorePassword, ConfigNodePropertyString DefaultRedirectUrl, ConfigNodePropertyString UserIDAttribute, ConfigNodePropertyBoolean UseEncryption, ConfigNodePropertyBoolean CreateUser, ConfigNodePropertyString UserIntermediatePath, ConfigNodePropertyBoolean AddGroupMemberships, ConfigNodePropertyString GroupMembershipAttribute, ConfigNodePropertyArray DefaultGroups, ConfigNodePropertyString NameIdFormat, ConfigNodePropertyArray SynchronizeAttributes, ConfigNodePropertyBoolean HandleLogout, ConfigNodePropertyString LogoutUrl, ConfigNodePropertyInteger ClockTolerance, ConfigNodePropertyString DigestMethod, ConfigNodePropertyString SignatureMethod, ConfigNodePropertyDropDown IdentitySyncType, ConfigNodePropertyString IdpIdentifier)
        {
            
            this.Path = Path;
            
            this.ServiceRanking = ServiceRanking;
            
            this.IdpUrl = IdpUrl;
            
            this.IdpCertAlias = IdpCertAlias;
            
            this.IdpHttpRedirect = IdpHttpRedirect;
            
            this.ServiceProviderEntityId = ServiceProviderEntityId;
            
            this.AssertionConsumerServiceURL = AssertionConsumerServiceURL;
            
            this.SpPrivateKeyAlias = SpPrivateKeyAlias;
            
            this.KeyStorePassword = KeyStorePassword;
            
            this.DefaultRedirectUrl = DefaultRedirectUrl;
            
            this.UserIDAttribute = UserIDAttribute;
            
            this.UseEncryption = UseEncryption;
            
            this.CreateUser = CreateUser;
            
            this.UserIntermediatePath = UserIntermediatePath;
            
            this.AddGroupMemberships = AddGroupMemberships;
            
            this.GroupMembershipAttribute = GroupMembershipAttribute;
            
            this.DefaultGroups = DefaultGroups;
            
            this.NameIdFormat = NameIdFormat;
            
            this.SynchronizeAttributes = SynchronizeAttributes;
            
            this.HandleLogout = HandleLogout;
            
            this.LogoutUrl = LogoutUrl;
            
            this.ClockTolerance = ClockTolerance;
            
            this.DigestMethod = DigestMethod;
            
            this.SignatureMethod = SignatureMethod;
            
            this.IdentitySyncType = IdentitySyncType;
            
            this.IdpIdentifier = IdpIdentifier;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder</returns>
        public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .ServiceRanking(ServiceRanking)
                .IdpUrl(IdpUrl)
                .IdpCertAlias(IdpCertAlias)
                .IdpHttpRedirect(IdpHttpRedirect)
                .ServiceProviderEntityId(ServiceProviderEntityId)
                .AssertionConsumerServiceURL(AssertionConsumerServiceURL)
                .SpPrivateKeyAlias(SpPrivateKeyAlias)
                .KeyStorePassword(KeyStorePassword)
                .DefaultRedirectUrl(DefaultRedirectUrl)
                .UserIDAttribute(UserIDAttribute)
                .UseEncryption(UseEncryption)
                .CreateUser(CreateUser)
                .UserIntermediatePath(UserIntermediatePath)
                .AddGroupMemberships(AddGroupMemberships)
                .GroupMembershipAttribute(GroupMembershipAttribute)
                .DefaultGroups(DefaultGroups)
                .NameIdFormat(NameIdFormat)
                .SynchronizeAttributes(SynchronizeAttributes)
                .HandleLogout(HandleLogout)
                .LogoutUrl(LogoutUrl)
                .ClockTolerance(ClockTolerance)
                .DigestMethod(DigestMethod)
                .SignatureMethod(SignatureMethod)
                .IdentitySyncType(IdentitySyncType)
                .IdpIdentifier(IdpIdentifier);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties left, ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties left, ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _Path;
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _IdpUrl;
            private ConfigNodePropertyString _IdpCertAlias;
            private ConfigNodePropertyBoolean _IdpHttpRedirect;
            private ConfigNodePropertyString _ServiceProviderEntityId;
            private ConfigNodePropertyString _AssertionConsumerServiceURL;
            private ConfigNodePropertyString _SpPrivateKeyAlias;
            private ConfigNodePropertyString _KeyStorePassword;
            private ConfigNodePropertyString _DefaultRedirectUrl;
            private ConfigNodePropertyString _UserIDAttribute;
            private ConfigNodePropertyBoolean _UseEncryption;
            private ConfigNodePropertyBoolean _CreateUser;
            private ConfigNodePropertyString _UserIntermediatePath;
            private ConfigNodePropertyBoolean _AddGroupMemberships;
            private ConfigNodePropertyString _GroupMembershipAttribute;
            private ConfigNodePropertyArray _DefaultGroups;
            private ConfigNodePropertyString _NameIdFormat;
            private ConfigNodePropertyArray _SynchronizeAttributes;
            private ConfigNodePropertyBoolean _HandleLogout;
            private ConfigNodePropertyString _LogoutUrl;
            private ConfigNodePropertyInteger _ClockTolerance;
            private ConfigNodePropertyString _DigestMethod;
            private ConfigNodePropertyString _SignatureMethod;
            private ConfigNodePropertyDropDown _IdentitySyncType;
            private ConfigNodePropertyString _IdpIdentifier;

            internal ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder Path(ConfigNodePropertyArray value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.IdpUrl property.
            /// </summary>
            /// <param name="value">IdpUrl</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder IdpUrl(ConfigNodePropertyString value)
            {
                _IdpUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.IdpCertAlias property.
            /// </summary>
            /// <param name="value">IdpCertAlias</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder IdpCertAlias(ConfigNodePropertyString value)
            {
                _IdpCertAlias = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.IdpHttpRedirect property.
            /// </summary>
            /// <param name="value">IdpHttpRedirect</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder IdpHttpRedirect(ConfigNodePropertyBoolean value)
            {
                _IdpHttpRedirect = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.ServiceProviderEntityId property.
            /// </summary>
            /// <param name="value">ServiceProviderEntityId</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder ServiceProviderEntityId(ConfigNodePropertyString value)
            {
                _ServiceProviderEntityId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.AssertionConsumerServiceURL property.
            /// </summary>
            /// <param name="value">AssertionConsumerServiceURL</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder AssertionConsumerServiceURL(ConfigNodePropertyString value)
            {
                _AssertionConsumerServiceURL = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.SpPrivateKeyAlias property.
            /// </summary>
            /// <param name="value">SpPrivateKeyAlias</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder SpPrivateKeyAlias(ConfigNodePropertyString value)
            {
                _SpPrivateKeyAlias = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.KeyStorePassword property.
            /// </summary>
            /// <param name="value">KeyStorePassword</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder KeyStorePassword(ConfigNodePropertyString value)
            {
                _KeyStorePassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.DefaultRedirectUrl property.
            /// </summary>
            /// <param name="value">DefaultRedirectUrl</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder DefaultRedirectUrl(ConfigNodePropertyString value)
            {
                _DefaultRedirectUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.UserIDAttribute property.
            /// </summary>
            /// <param name="value">UserIDAttribute</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder UserIDAttribute(ConfigNodePropertyString value)
            {
                _UserIDAttribute = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.UseEncryption property.
            /// </summary>
            /// <param name="value">UseEncryption</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder UseEncryption(ConfigNodePropertyBoolean value)
            {
                _UseEncryption = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.CreateUser property.
            /// </summary>
            /// <param name="value">CreateUser</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder CreateUser(ConfigNodePropertyBoolean value)
            {
                _CreateUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.UserIntermediatePath property.
            /// </summary>
            /// <param name="value">UserIntermediatePath</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder UserIntermediatePath(ConfigNodePropertyString value)
            {
                _UserIntermediatePath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.AddGroupMemberships property.
            /// </summary>
            /// <param name="value">AddGroupMemberships</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder AddGroupMemberships(ConfigNodePropertyBoolean value)
            {
                _AddGroupMemberships = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.GroupMembershipAttribute property.
            /// </summary>
            /// <param name="value">GroupMembershipAttribute</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder GroupMembershipAttribute(ConfigNodePropertyString value)
            {
                _GroupMembershipAttribute = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.DefaultGroups property.
            /// </summary>
            /// <param name="value">DefaultGroups</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder DefaultGroups(ConfigNodePropertyArray value)
            {
                _DefaultGroups = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.NameIdFormat property.
            /// </summary>
            /// <param name="value">NameIdFormat</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder NameIdFormat(ConfigNodePropertyString value)
            {
                _NameIdFormat = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.SynchronizeAttributes property.
            /// </summary>
            /// <param name="value">SynchronizeAttributes</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder SynchronizeAttributes(ConfigNodePropertyArray value)
            {
                _SynchronizeAttributes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.HandleLogout property.
            /// </summary>
            /// <param name="value">HandleLogout</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder HandleLogout(ConfigNodePropertyBoolean value)
            {
                _HandleLogout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.LogoutUrl property.
            /// </summary>
            /// <param name="value">LogoutUrl</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder LogoutUrl(ConfigNodePropertyString value)
            {
                _LogoutUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.ClockTolerance property.
            /// </summary>
            /// <param name="value">ClockTolerance</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder ClockTolerance(ConfigNodePropertyInteger value)
            {
                _ClockTolerance = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.DigestMethod property.
            /// </summary>
            /// <param name="value">DigestMethod</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder DigestMethod(ConfigNodePropertyString value)
            {
                _DigestMethod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.SignatureMethod property.
            /// </summary>
            /// <param name="value">SignatureMethod</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder SignatureMethod(ConfigNodePropertyString value)
            {
                _SignatureMethod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.IdentitySyncType property.
            /// </summary>
            /// <param name="value">IdentitySyncType</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder IdentitySyncType(ConfigNodePropertyDropDown value)
            {
                _IdentitySyncType = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.IdpIdentifier property.
            /// </summary>
            /// <param name="value">IdpIdentifier</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder IdpIdentifier(ConfigNodePropertyString value)
            {
                _IdpIdentifier = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties</returns>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(
                    Path: _Path,
                    ServiceRanking: _ServiceRanking,
                    IdpUrl: _IdpUrl,
                    IdpCertAlias: _IdpCertAlias,
                    IdpHttpRedirect: _IdpHttpRedirect,
                    ServiceProviderEntityId: _ServiceProviderEntityId,
                    AssertionConsumerServiceURL: _AssertionConsumerServiceURL,
                    SpPrivateKeyAlias: _SpPrivateKeyAlias,
                    KeyStorePassword: _KeyStorePassword,
                    DefaultRedirectUrl: _DefaultRedirectUrl,
                    UserIDAttribute: _UserIDAttribute,
                    UseEncryption: _UseEncryption,
                    CreateUser: _CreateUser,
                    UserIntermediatePath: _UserIntermediatePath,
                    AddGroupMemberships: _AddGroupMemberships,
                    GroupMembershipAttribute: _GroupMembershipAttribute,
                    DefaultGroups: _DefaultGroups,
                    NameIdFormat: _NameIdFormat,
                    SynchronizeAttributes: _SynchronizeAttributes,
                    HandleLogout: _HandleLogout,
                    LogoutUrl: _LogoutUrl,
                    ClockTolerance: _ClockTolerance,
                    DigestMethod: _DigestMethod,
                    SignatureMethod: _SignatureMethod,
                    IdentitySyncType: _IdentitySyncType,
                    IdpIdentifier: _IdpIdentifier
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}