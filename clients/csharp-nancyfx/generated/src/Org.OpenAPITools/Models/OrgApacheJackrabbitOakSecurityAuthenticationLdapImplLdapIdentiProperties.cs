using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties:  IEquatable<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties>
    { 
        /// <summary>
        /// ProviderName
        /// </summary>
        public ConfigNodePropertyString ProviderName { get; private set; }

        /// <summary>
        /// HostName
        /// </summary>
        public ConfigNodePropertyString HostName { get; private set; }

        /// <summary>
        /// HostPort
        /// </summary>
        public ConfigNodePropertyInteger HostPort { get; private set; }

        /// <summary>
        /// HostSsl
        /// </summary>
        public ConfigNodePropertyBoolean HostSsl { get; private set; }

        /// <summary>
        /// HostTls
        /// </summary>
        public ConfigNodePropertyBoolean HostTls { get; private set; }

        /// <summary>
        /// HostNoCertCheck
        /// </summary>
        public ConfigNodePropertyBoolean HostNoCertCheck { get; private set; }

        /// <summary>
        /// BindDn
        /// </summary>
        public ConfigNodePropertyString BindDn { get; private set; }

        /// <summary>
        /// BindPassword
        /// </summary>
        public ConfigNodePropertyString BindPassword { get; private set; }

        /// <summary>
        /// SearchTimeout
        /// </summary>
        public ConfigNodePropertyString SearchTimeout { get; private set; }

        /// <summary>
        /// AdminPoolMaxActive
        /// </summary>
        public ConfigNodePropertyInteger AdminPoolMaxActive { get; private set; }

        /// <summary>
        /// AdminPoolLookupOnValidate
        /// </summary>
        public ConfigNodePropertyBoolean AdminPoolLookupOnValidate { get; private set; }

        /// <summary>
        /// UserPoolMaxActive
        /// </summary>
        public ConfigNodePropertyInteger UserPoolMaxActive { get; private set; }

        /// <summary>
        /// UserPoolLookupOnValidate
        /// </summary>
        public ConfigNodePropertyBoolean UserPoolLookupOnValidate { get; private set; }

        /// <summary>
        /// UserBaseDN
        /// </summary>
        public ConfigNodePropertyString UserBaseDN { get; private set; }

        /// <summary>
        /// UserObjectclass
        /// </summary>
        public ConfigNodePropertyArray UserObjectclass { get; private set; }

        /// <summary>
        /// UserIdAttribute
        /// </summary>
        public ConfigNodePropertyString UserIdAttribute { get; private set; }

        /// <summary>
        /// UserExtraFilter
        /// </summary>
        public ConfigNodePropertyString UserExtraFilter { get; private set; }

        /// <summary>
        /// UserMakeDnPath
        /// </summary>
        public ConfigNodePropertyBoolean UserMakeDnPath { get; private set; }

        /// <summary>
        /// GroupBaseDN
        /// </summary>
        public ConfigNodePropertyString GroupBaseDN { get; private set; }

        /// <summary>
        /// GroupObjectclass
        /// </summary>
        public ConfigNodePropertyArray GroupObjectclass { get; private set; }

        /// <summary>
        /// GroupNameAttribute
        /// </summary>
        public ConfigNodePropertyString GroupNameAttribute { get; private set; }

        /// <summary>
        /// GroupExtraFilter
        /// </summary>
        public ConfigNodePropertyString GroupExtraFilter { get; private set; }

        /// <summary>
        /// GroupMakeDnPath
        /// </summary>
        public ConfigNodePropertyBoolean GroupMakeDnPath { get; private set; }

        /// <summary>
        /// GroupMemberAttribute
        /// </summary>
        public ConfigNodePropertyString GroupMemberAttribute { get; private set; }

        /// <summary>
        /// UseUidForExtId
        /// </summary>
        public ConfigNodePropertyBoolean UseUidForExtId { get; private set; }

        /// <summary>
        /// Customattributes
        /// </summary>
        public ConfigNodePropertyArray Customattributes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties()
        {
        }

        private OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(ConfigNodePropertyString ProviderName, ConfigNodePropertyString HostName, ConfigNodePropertyInteger HostPort, ConfigNodePropertyBoolean HostSsl, ConfigNodePropertyBoolean HostTls, ConfigNodePropertyBoolean HostNoCertCheck, ConfigNodePropertyString BindDn, ConfigNodePropertyString BindPassword, ConfigNodePropertyString SearchTimeout, ConfigNodePropertyInteger AdminPoolMaxActive, ConfigNodePropertyBoolean AdminPoolLookupOnValidate, ConfigNodePropertyInteger UserPoolMaxActive, ConfigNodePropertyBoolean UserPoolLookupOnValidate, ConfigNodePropertyString UserBaseDN, ConfigNodePropertyArray UserObjectclass, ConfigNodePropertyString UserIdAttribute, ConfigNodePropertyString UserExtraFilter, ConfigNodePropertyBoolean UserMakeDnPath, ConfigNodePropertyString GroupBaseDN, ConfigNodePropertyArray GroupObjectclass, ConfigNodePropertyString GroupNameAttribute, ConfigNodePropertyString GroupExtraFilter, ConfigNodePropertyBoolean GroupMakeDnPath, ConfigNodePropertyString GroupMemberAttribute, ConfigNodePropertyBoolean UseUidForExtId, ConfigNodePropertyArray Customattributes)
        {
            
            this.ProviderName = ProviderName;
            
            this.HostName = HostName;
            
            this.HostPort = HostPort;
            
            this.HostSsl = HostSsl;
            
            this.HostTls = HostTls;
            
            this.HostNoCertCheck = HostNoCertCheck;
            
            this.BindDn = BindDn;
            
            this.BindPassword = BindPassword;
            
            this.SearchTimeout = SearchTimeout;
            
            this.AdminPoolMaxActive = AdminPoolMaxActive;
            
            this.AdminPoolLookupOnValidate = AdminPoolLookupOnValidate;
            
            this.UserPoolMaxActive = UserPoolMaxActive;
            
            this.UserPoolLookupOnValidate = UserPoolLookupOnValidate;
            
            this.UserBaseDN = UserBaseDN;
            
            this.UserObjectclass = UserObjectclass;
            
            this.UserIdAttribute = UserIdAttribute;
            
            this.UserExtraFilter = UserExtraFilter;
            
            this.UserMakeDnPath = UserMakeDnPath;
            
            this.GroupBaseDN = GroupBaseDN;
            
            this.GroupObjectclass = GroupObjectclass;
            
            this.GroupNameAttribute = GroupNameAttribute;
            
            this.GroupExtraFilter = GroupExtraFilter;
            
            this.GroupMakeDnPath = GroupMakeDnPath;
            
            this.GroupMemberAttribute = GroupMemberAttribute;
            
            this.UseUidForExtId = UseUidForExtId;
            
            this.Customattributes = Customattributes;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder With()
        {
            return Builder()
                .ProviderName(ProviderName)
                .HostName(HostName)
                .HostPort(HostPort)
                .HostSsl(HostSsl)
                .HostTls(HostTls)
                .HostNoCertCheck(HostNoCertCheck)
                .BindDn(BindDn)
                .BindPassword(BindPassword)
                .SearchTimeout(SearchTimeout)
                .AdminPoolMaxActive(AdminPoolMaxActive)
                .AdminPoolLookupOnValidate(AdminPoolLookupOnValidate)
                .UserPoolMaxActive(UserPoolMaxActive)
                .UserPoolLookupOnValidate(UserPoolLookupOnValidate)
                .UserBaseDN(UserBaseDN)
                .UserObjectclass(UserObjectclass)
                .UserIdAttribute(UserIdAttribute)
                .UserExtraFilter(UserExtraFilter)
                .UserMakeDnPath(UserMakeDnPath)
                .GroupBaseDN(GroupBaseDN)
                .GroupObjectclass(GroupObjectclass)
                .GroupNameAttribute(GroupNameAttribute)
                .GroupExtraFilter(GroupExtraFilter)
                .GroupMakeDnPath(GroupMakeDnPath)
                .GroupMemberAttribute(GroupMemberAttribute)
                .UseUidForExtId(UseUidForExtId)
                .Customattributes(Customattributes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties left, OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties left, OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder
        {
            private ConfigNodePropertyString _ProviderName;
            private ConfigNodePropertyString _HostName;
            private ConfigNodePropertyInteger _HostPort;
            private ConfigNodePropertyBoolean _HostSsl;
            private ConfigNodePropertyBoolean _HostTls;
            private ConfigNodePropertyBoolean _HostNoCertCheck;
            private ConfigNodePropertyString _BindDn;
            private ConfigNodePropertyString _BindPassword;
            private ConfigNodePropertyString _SearchTimeout;
            private ConfigNodePropertyInteger _AdminPoolMaxActive;
            private ConfigNodePropertyBoolean _AdminPoolLookupOnValidate;
            private ConfigNodePropertyInteger _UserPoolMaxActive;
            private ConfigNodePropertyBoolean _UserPoolLookupOnValidate;
            private ConfigNodePropertyString _UserBaseDN;
            private ConfigNodePropertyArray _UserObjectclass;
            private ConfigNodePropertyString _UserIdAttribute;
            private ConfigNodePropertyString _UserExtraFilter;
            private ConfigNodePropertyBoolean _UserMakeDnPath;
            private ConfigNodePropertyString _GroupBaseDN;
            private ConfigNodePropertyArray _GroupObjectclass;
            private ConfigNodePropertyString _GroupNameAttribute;
            private ConfigNodePropertyString _GroupExtraFilter;
            private ConfigNodePropertyBoolean _GroupMakeDnPath;
            private ConfigNodePropertyString _GroupMemberAttribute;
            private ConfigNodePropertyBoolean _UseUidForExtId;
            private ConfigNodePropertyArray _Customattributes;

            internal OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.ProviderName property.
            /// </summary>
            /// <param name="value">ProviderName</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder ProviderName(ConfigNodePropertyString value)
            {
                _ProviderName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.HostName property.
            /// </summary>
            /// <param name="value">HostName</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder HostName(ConfigNodePropertyString value)
            {
                _HostName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.HostPort property.
            /// </summary>
            /// <param name="value">HostPort</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder HostPort(ConfigNodePropertyInteger value)
            {
                _HostPort = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.HostSsl property.
            /// </summary>
            /// <param name="value">HostSsl</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder HostSsl(ConfigNodePropertyBoolean value)
            {
                _HostSsl = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.HostTls property.
            /// </summary>
            /// <param name="value">HostTls</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder HostTls(ConfigNodePropertyBoolean value)
            {
                _HostTls = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.HostNoCertCheck property.
            /// </summary>
            /// <param name="value">HostNoCertCheck</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder HostNoCertCheck(ConfigNodePropertyBoolean value)
            {
                _HostNoCertCheck = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.BindDn property.
            /// </summary>
            /// <param name="value">BindDn</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder BindDn(ConfigNodePropertyString value)
            {
                _BindDn = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.BindPassword property.
            /// </summary>
            /// <param name="value">BindPassword</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder BindPassword(ConfigNodePropertyString value)
            {
                _BindPassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.SearchTimeout property.
            /// </summary>
            /// <param name="value">SearchTimeout</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder SearchTimeout(ConfigNodePropertyString value)
            {
                _SearchTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.AdminPoolMaxActive property.
            /// </summary>
            /// <param name="value">AdminPoolMaxActive</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder AdminPoolMaxActive(ConfigNodePropertyInteger value)
            {
                _AdminPoolMaxActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.AdminPoolLookupOnValidate property.
            /// </summary>
            /// <param name="value">AdminPoolLookupOnValidate</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder AdminPoolLookupOnValidate(ConfigNodePropertyBoolean value)
            {
                _AdminPoolLookupOnValidate = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.UserPoolMaxActive property.
            /// </summary>
            /// <param name="value">UserPoolMaxActive</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder UserPoolMaxActive(ConfigNodePropertyInteger value)
            {
                _UserPoolMaxActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.UserPoolLookupOnValidate property.
            /// </summary>
            /// <param name="value">UserPoolLookupOnValidate</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder UserPoolLookupOnValidate(ConfigNodePropertyBoolean value)
            {
                _UserPoolLookupOnValidate = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.UserBaseDN property.
            /// </summary>
            /// <param name="value">UserBaseDN</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder UserBaseDN(ConfigNodePropertyString value)
            {
                _UserBaseDN = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.UserObjectclass property.
            /// </summary>
            /// <param name="value">UserObjectclass</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder UserObjectclass(ConfigNodePropertyArray value)
            {
                _UserObjectclass = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.UserIdAttribute property.
            /// </summary>
            /// <param name="value">UserIdAttribute</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder UserIdAttribute(ConfigNodePropertyString value)
            {
                _UserIdAttribute = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.UserExtraFilter property.
            /// </summary>
            /// <param name="value">UserExtraFilter</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder UserExtraFilter(ConfigNodePropertyString value)
            {
                _UserExtraFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.UserMakeDnPath property.
            /// </summary>
            /// <param name="value">UserMakeDnPath</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder UserMakeDnPath(ConfigNodePropertyBoolean value)
            {
                _UserMakeDnPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.GroupBaseDN property.
            /// </summary>
            /// <param name="value">GroupBaseDN</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder GroupBaseDN(ConfigNodePropertyString value)
            {
                _GroupBaseDN = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.GroupObjectclass property.
            /// </summary>
            /// <param name="value">GroupObjectclass</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder GroupObjectclass(ConfigNodePropertyArray value)
            {
                _GroupObjectclass = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.GroupNameAttribute property.
            /// </summary>
            /// <param name="value">GroupNameAttribute</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder GroupNameAttribute(ConfigNodePropertyString value)
            {
                _GroupNameAttribute = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.GroupExtraFilter property.
            /// </summary>
            /// <param name="value">GroupExtraFilter</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder GroupExtraFilter(ConfigNodePropertyString value)
            {
                _GroupExtraFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.GroupMakeDnPath property.
            /// </summary>
            /// <param name="value">GroupMakeDnPath</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder GroupMakeDnPath(ConfigNodePropertyBoolean value)
            {
                _GroupMakeDnPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.GroupMemberAttribute property.
            /// </summary>
            /// <param name="value">GroupMemberAttribute</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder GroupMemberAttribute(ConfigNodePropertyString value)
            {
                _GroupMemberAttribute = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.UseUidForExtId property.
            /// </summary>
            /// <param name="value">UseUidForExtId</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder UseUidForExtId(ConfigNodePropertyBoolean value)
            {
                _UseUidForExtId = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.Customattributes property.
            /// </summary>
            /// <param name="value">Customattributes</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder Customattributes(ConfigNodePropertyArray value)
            {
                _Customattributes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties</returns>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(
                    ProviderName: _ProviderName,
                    HostName: _HostName,
                    HostPort: _HostPort,
                    HostSsl: _HostSsl,
                    HostTls: _HostTls,
                    HostNoCertCheck: _HostNoCertCheck,
                    BindDn: _BindDn,
                    BindPassword: _BindPassword,
                    SearchTimeout: _SearchTimeout,
                    AdminPoolMaxActive: _AdminPoolMaxActive,
                    AdminPoolLookupOnValidate: _AdminPoolLookupOnValidate,
                    UserPoolMaxActive: _UserPoolMaxActive,
                    UserPoolLookupOnValidate: _UserPoolLookupOnValidate,
                    UserBaseDN: _UserBaseDN,
                    UserObjectclass: _UserObjectclass,
                    UserIdAttribute: _UserIdAttribute,
                    UserExtraFilter: _UserExtraFilter,
                    UserMakeDnPath: _UserMakeDnPath,
                    GroupBaseDN: _GroupBaseDN,
                    GroupObjectclass: _GroupObjectclass,
                    GroupNameAttribute: _GroupNameAttribute,
                    GroupExtraFilter: _GroupExtraFilter,
                    GroupMakeDnPath: _GroupMakeDnPath,
                    GroupMemberAttribute: _GroupMemberAttribute,
                    UseUidForExtId: _UseUidForExtId,
                    Customattributes: _Customattributes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}