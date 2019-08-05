using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties:  IEquatable<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties>
    { 
        /// <summary>
        /// UsersPath
        /// </summary>
        public ConfigNodePropertyString UsersPath { get; private set; }

        /// <summary>
        /// GroupsPath
        /// </summary>
        public ConfigNodePropertyString GroupsPath { get; private set; }

        /// <summary>
        /// SystemRelativePath
        /// </summary>
        public ConfigNodePropertyString SystemRelativePath { get; private set; }

        /// <summary>
        /// DefaultDepth
        /// </summary>
        public ConfigNodePropertyInteger DefaultDepth { get; private set; }

        /// <summary>
        /// ImportBehavior
        /// </summary>
        public ConfigNodePropertyDropDown ImportBehavior { get; private set; }

        /// <summary>
        /// PasswordHashAlgorithm
        /// </summary>
        public ConfigNodePropertyString PasswordHashAlgorithm { get; private set; }

        /// <summary>
        /// PasswordHashIterations
        /// </summary>
        public ConfigNodePropertyInteger PasswordHashIterations { get; private set; }

        /// <summary>
        /// PasswordSaltSize
        /// </summary>
        public ConfigNodePropertyInteger PasswordSaltSize { get; private set; }

        /// <summary>
        /// OmitAdminPw
        /// </summary>
        public ConfigNodePropertyBoolean OmitAdminPw { get; private set; }

        /// <summary>
        /// SupportAutoSave
        /// </summary>
        public ConfigNodePropertyBoolean SupportAutoSave { get; private set; }

        /// <summary>
        /// PasswordMaxAge
        /// </summary>
        public ConfigNodePropertyInteger PasswordMaxAge { get; private set; }

        /// <summary>
        /// InitialPasswordChange
        /// </summary>
        public ConfigNodePropertyBoolean InitialPasswordChange { get; private set; }

        /// <summary>
        /// PasswordHistorySize
        /// </summary>
        public ConfigNodePropertyInteger PasswordHistorySize { get; private set; }

        /// <summary>
        /// PasswordExpiryForAdmin
        /// </summary>
        public ConfigNodePropertyBoolean PasswordExpiryForAdmin { get; private set; }

        /// <summary>
        /// CacheExpiration
        /// </summary>
        public ConfigNodePropertyInteger CacheExpiration { get; private set; }

        /// <summary>
        /// EnableRFC7613UsercaseMappedProfile
        /// </summary>
        public ConfigNodePropertyBoolean EnableRFC7613UsercaseMappedProfile { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties()
        {
        }

        private OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(ConfigNodePropertyString UsersPath, ConfigNodePropertyString GroupsPath, ConfigNodePropertyString SystemRelativePath, ConfigNodePropertyInteger DefaultDepth, ConfigNodePropertyDropDown ImportBehavior, ConfigNodePropertyString PasswordHashAlgorithm, ConfigNodePropertyInteger PasswordHashIterations, ConfigNodePropertyInteger PasswordSaltSize, ConfigNodePropertyBoolean OmitAdminPw, ConfigNodePropertyBoolean SupportAutoSave, ConfigNodePropertyInteger PasswordMaxAge, ConfigNodePropertyBoolean InitialPasswordChange, ConfigNodePropertyInteger PasswordHistorySize, ConfigNodePropertyBoolean PasswordExpiryForAdmin, ConfigNodePropertyInteger CacheExpiration, ConfigNodePropertyBoolean EnableRFC7613UsercaseMappedProfile)
        {
            
            this.UsersPath = UsersPath;
            
            this.GroupsPath = GroupsPath;
            
            this.SystemRelativePath = SystemRelativePath;
            
            this.DefaultDepth = DefaultDepth;
            
            this.ImportBehavior = ImportBehavior;
            
            this.PasswordHashAlgorithm = PasswordHashAlgorithm;
            
            this.PasswordHashIterations = PasswordHashIterations;
            
            this.PasswordSaltSize = PasswordSaltSize;
            
            this.OmitAdminPw = OmitAdminPw;
            
            this.SupportAutoSave = SupportAutoSave;
            
            this.PasswordMaxAge = PasswordMaxAge;
            
            this.InitialPasswordChange = InitialPasswordChange;
            
            this.PasswordHistorySize = PasswordHistorySize;
            
            this.PasswordExpiryForAdmin = PasswordExpiryForAdmin;
            
            this.CacheExpiration = CacheExpiration;
            
            this.EnableRFC7613UsercaseMappedProfile = EnableRFC7613UsercaseMappedProfile;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder With()
        {
            return Builder()
                .UsersPath(UsersPath)
                .GroupsPath(GroupsPath)
                .SystemRelativePath(SystemRelativePath)
                .DefaultDepth(DefaultDepth)
                .ImportBehavior(ImportBehavior)
                .PasswordHashAlgorithm(PasswordHashAlgorithm)
                .PasswordHashIterations(PasswordHashIterations)
                .PasswordSaltSize(PasswordSaltSize)
                .OmitAdminPw(OmitAdminPw)
                .SupportAutoSave(SupportAutoSave)
                .PasswordMaxAge(PasswordMaxAge)
                .InitialPasswordChange(InitialPasswordChange)
                .PasswordHistorySize(PasswordHistorySize)
                .PasswordExpiryForAdmin(PasswordExpiryForAdmin)
                .CacheExpiration(CacheExpiration)
                .EnableRFC7613UsercaseMappedProfile(EnableRFC7613UsercaseMappedProfile);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties left, OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties left, OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder
        {
            private ConfigNodePropertyString _UsersPath;
            private ConfigNodePropertyString _GroupsPath;
            private ConfigNodePropertyString _SystemRelativePath;
            private ConfigNodePropertyInteger _DefaultDepth;
            private ConfigNodePropertyDropDown _ImportBehavior;
            private ConfigNodePropertyString _PasswordHashAlgorithm;
            private ConfigNodePropertyInteger _PasswordHashIterations;
            private ConfigNodePropertyInteger _PasswordSaltSize;
            private ConfigNodePropertyBoolean _OmitAdminPw;
            private ConfigNodePropertyBoolean _SupportAutoSave;
            private ConfigNodePropertyInteger _PasswordMaxAge;
            private ConfigNodePropertyBoolean _InitialPasswordChange;
            private ConfigNodePropertyInteger _PasswordHistorySize;
            private ConfigNodePropertyBoolean _PasswordExpiryForAdmin;
            private ConfigNodePropertyInteger _CacheExpiration;
            private ConfigNodePropertyBoolean _EnableRFC7613UsercaseMappedProfile;

            internal OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.UsersPath property.
            /// </summary>
            /// <param name="value">UsersPath</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder UsersPath(ConfigNodePropertyString value)
            {
                _UsersPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.GroupsPath property.
            /// </summary>
            /// <param name="value">GroupsPath</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder GroupsPath(ConfigNodePropertyString value)
            {
                _GroupsPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.SystemRelativePath property.
            /// </summary>
            /// <param name="value">SystemRelativePath</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder SystemRelativePath(ConfigNodePropertyString value)
            {
                _SystemRelativePath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.DefaultDepth property.
            /// </summary>
            /// <param name="value">DefaultDepth</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder DefaultDepth(ConfigNodePropertyInteger value)
            {
                _DefaultDepth = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.ImportBehavior property.
            /// </summary>
            /// <param name="value">ImportBehavior</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder ImportBehavior(ConfigNodePropertyDropDown value)
            {
                _ImportBehavior = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.PasswordHashAlgorithm property.
            /// </summary>
            /// <param name="value">PasswordHashAlgorithm</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder PasswordHashAlgorithm(ConfigNodePropertyString value)
            {
                _PasswordHashAlgorithm = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.PasswordHashIterations property.
            /// </summary>
            /// <param name="value">PasswordHashIterations</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder PasswordHashIterations(ConfigNodePropertyInteger value)
            {
                _PasswordHashIterations = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.PasswordSaltSize property.
            /// </summary>
            /// <param name="value">PasswordSaltSize</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder PasswordSaltSize(ConfigNodePropertyInteger value)
            {
                _PasswordSaltSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.OmitAdminPw property.
            /// </summary>
            /// <param name="value">OmitAdminPw</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder OmitAdminPw(ConfigNodePropertyBoolean value)
            {
                _OmitAdminPw = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.SupportAutoSave property.
            /// </summary>
            /// <param name="value">SupportAutoSave</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder SupportAutoSave(ConfigNodePropertyBoolean value)
            {
                _SupportAutoSave = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.PasswordMaxAge property.
            /// </summary>
            /// <param name="value">PasswordMaxAge</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder PasswordMaxAge(ConfigNodePropertyInteger value)
            {
                _PasswordMaxAge = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.InitialPasswordChange property.
            /// </summary>
            /// <param name="value">InitialPasswordChange</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder InitialPasswordChange(ConfigNodePropertyBoolean value)
            {
                _InitialPasswordChange = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.PasswordHistorySize property.
            /// </summary>
            /// <param name="value">PasswordHistorySize</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder PasswordHistorySize(ConfigNodePropertyInteger value)
            {
                _PasswordHistorySize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.PasswordExpiryForAdmin property.
            /// </summary>
            /// <param name="value">PasswordExpiryForAdmin</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder PasswordExpiryForAdmin(ConfigNodePropertyBoolean value)
            {
                _PasswordExpiryForAdmin = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.CacheExpiration property.
            /// </summary>
            /// <param name="value">CacheExpiration</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder CacheExpiration(ConfigNodePropertyInteger value)
            {
                _CacheExpiration = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.EnableRFC7613UsercaseMappedProfile property.
            /// </summary>
            /// <param name="value">EnableRFC7613UsercaseMappedProfile</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder EnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean value)
            {
                _EnableRFC7613UsercaseMappedProfile = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties</returns>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(
                    UsersPath: _UsersPath,
                    GroupsPath: _GroupsPath,
                    SystemRelativePath: _SystemRelativePath,
                    DefaultDepth: _DefaultDepth,
                    ImportBehavior: _ImportBehavior,
                    PasswordHashAlgorithm: _PasswordHashAlgorithm,
                    PasswordHashIterations: _PasswordHashIterations,
                    PasswordSaltSize: _PasswordSaltSize,
                    OmitAdminPw: _OmitAdminPw,
                    SupportAutoSave: _SupportAutoSave,
                    PasswordMaxAge: _PasswordMaxAge,
                    InitialPasswordChange: _InitialPasswordChange,
                    PasswordHistorySize: _PasswordHistorySize,
                    PasswordExpiryForAdmin: _PasswordExpiryForAdmin,
                    CacheExpiration: _CacheExpiration,
                    EnableRFC7613UsercaseMappedProfile: _EnableRFC7613UsercaseMappedProfile
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}