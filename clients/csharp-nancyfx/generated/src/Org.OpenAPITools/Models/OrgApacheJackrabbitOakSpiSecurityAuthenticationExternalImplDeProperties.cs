using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties>
    { 
        /// <summary>
        /// HandlerName
        /// </summary>
        public ConfigNodePropertyString HandlerName { get; private set; }

        /// <summary>
        /// UserExpirationTime
        /// </summary>
        public ConfigNodePropertyString UserExpirationTime { get; private set; }

        /// <summary>
        /// UserAutoMembership
        /// </summary>
        public ConfigNodePropertyArray UserAutoMembership { get; private set; }

        /// <summary>
        /// UserPropertyMapping
        /// </summary>
        public ConfigNodePropertyArray UserPropertyMapping { get; private set; }

        /// <summary>
        /// UserPathPrefix
        /// </summary>
        public ConfigNodePropertyString UserPathPrefix { get; private set; }

        /// <summary>
        /// UserMembershipExpTime
        /// </summary>
        public ConfigNodePropertyString UserMembershipExpTime { get; private set; }

        /// <summary>
        /// UserMembershipNestingDepth
        /// </summary>
        public ConfigNodePropertyInteger UserMembershipNestingDepth { get; private set; }

        /// <summary>
        /// UserDynamicMembership
        /// </summary>
        public ConfigNodePropertyBoolean UserDynamicMembership { get; private set; }

        /// <summary>
        /// UserDisableMissing
        /// </summary>
        public ConfigNodePropertyBoolean UserDisableMissing { get; private set; }

        /// <summary>
        /// GroupExpirationTime
        /// </summary>
        public ConfigNodePropertyString GroupExpirationTime { get; private set; }

        /// <summary>
        /// GroupAutoMembership
        /// </summary>
        public ConfigNodePropertyArray GroupAutoMembership { get; private set; }

        /// <summary>
        /// GroupPropertyMapping
        /// </summary>
        public ConfigNodePropertyArray GroupPropertyMapping { get; private set; }

        /// <summary>
        /// GroupPathPrefix
        /// </summary>
        public ConfigNodePropertyString GroupPathPrefix { get; private set; }

        /// <summary>
        /// EnableRFC7613UsercaseMappedProfile
        /// </summary>
        public ConfigNodePropertyBoolean EnableRFC7613UsercaseMappedProfile { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(ConfigNodePropertyString HandlerName, ConfigNodePropertyString UserExpirationTime, ConfigNodePropertyArray UserAutoMembership, ConfigNodePropertyArray UserPropertyMapping, ConfigNodePropertyString UserPathPrefix, ConfigNodePropertyString UserMembershipExpTime, ConfigNodePropertyInteger UserMembershipNestingDepth, ConfigNodePropertyBoolean UserDynamicMembership, ConfigNodePropertyBoolean UserDisableMissing, ConfigNodePropertyString GroupExpirationTime, ConfigNodePropertyArray GroupAutoMembership, ConfigNodePropertyArray GroupPropertyMapping, ConfigNodePropertyString GroupPathPrefix, ConfigNodePropertyBoolean EnableRFC7613UsercaseMappedProfile)
        {
            
            this.HandlerName = HandlerName;
            
            this.UserExpirationTime = UserExpirationTime;
            
            this.UserAutoMembership = UserAutoMembership;
            
            this.UserPropertyMapping = UserPropertyMapping;
            
            this.UserPathPrefix = UserPathPrefix;
            
            this.UserMembershipExpTime = UserMembershipExpTime;
            
            this.UserMembershipNestingDepth = UserMembershipNestingDepth;
            
            this.UserDynamicMembership = UserDynamicMembership;
            
            this.UserDisableMissing = UserDisableMissing;
            
            this.GroupExpirationTime = GroupExpirationTime;
            
            this.GroupAutoMembership = GroupAutoMembership;
            
            this.GroupPropertyMapping = GroupPropertyMapping;
            
            this.GroupPathPrefix = GroupPathPrefix;
            
            this.EnableRFC7613UsercaseMappedProfile = EnableRFC7613UsercaseMappedProfile;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder With()
        {
            return Builder()
                .HandlerName(HandlerName)
                .UserExpirationTime(UserExpirationTime)
                .UserAutoMembership(UserAutoMembership)
                .UserPropertyMapping(UserPropertyMapping)
                .UserPathPrefix(UserPathPrefix)
                .UserMembershipExpTime(UserMembershipExpTime)
                .UserMembershipNestingDepth(UserMembershipNestingDepth)
                .UserDynamicMembership(UserDynamicMembership)
                .UserDisableMissing(UserDisableMissing)
                .GroupExpirationTime(GroupExpirationTime)
                .GroupAutoMembership(GroupAutoMembership)
                .GroupPropertyMapping(GroupPropertyMapping)
                .GroupPathPrefix(GroupPathPrefix)
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

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder
        {
            private ConfigNodePropertyString _HandlerName;
            private ConfigNodePropertyString _UserExpirationTime;
            private ConfigNodePropertyArray _UserAutoMembership;
            private ConfigNodePropertyArray _UserPropertyMapping;
            private ConfigNodePropertyString _UserPathPrefix;
            private ConfigNodePropertyString _UserMembershipExpTime;
            private ConfigNodePropertyInteger _UserMembershipNestingDepth;
            private ConfigNodePropertyBoolean _UserDynamicMembership;
            private ConfigNodePropertyBoolean _UserDisableMissing;
            private ConfigNodePropertyString _GroupExpirationTime;
            private ConfigNodePropertyArray _GroupAutoMembership;
            private ConfigNodePropertyArray _GroupPropertyMapping;
            private ConfigNodePropertyString _GroupPathPrefix;
            private ConfigNodePropertyBoolean _EnableRFC7613UsercaseMappedProfile;

            internal OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.HandlerName property.
            /// </summary>
            /// <param name="value">HandlerName</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder HandlerName(ConfigNodePropertyString value)
            {
                _HandlerName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.UserExpirationTime property.
            /// </summary>
            /// <param name="value">UserExpirationTime</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder UserExpirationTime(ConfigNodePropertyString value)
            {
                _UserExpirationTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.UserAutoMembership property.
            /// </summary>
            /// <param name="value">UserAutoMembership</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder UserAutoMembership(ConfigNodePropertyArray value)
            {
                _UserAutoMembership = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.UserPropertyMapping property.
            /// </summary>
            /// <param name="value">UserPropertyMapping</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder UserPropertyMapping(ConfigNodePropertyArray value)
            {
                _UserPropertyMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.UserPathPrefix property.
            /// </summary>
            /// <param name="value">UserPathPrefix</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder UserPathPrefix(ConfigNodePropertyString value)
            {
                _UserPathPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.UserMembershipExpTime property.
            /// </summary>
            /// <param name="value">UserMembershipExpTime</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder UserMembershipExpTime(ConfigNodePropertyString value)
            {
                _UserMembershipExpTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.UserMembershipNestingDepth property.
            /// </summary>
            /// <param name="value">UserMembershipNestingDepth</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder UserMembershipNestingDepth(ConfigNodePropertyInteger value)
            {
                _UserMembershipNestingDepth = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.UserDynamicMembership property.
            /// </summary>
            /// <param name="value">UserDynamicMembership</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder UserDynamicMembership(ConfigNodePropertyBoolean value)
            {
                _UserDynamicMembership = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.UserDisableMissing property.
            /// </summary>
            /// <param name="value">UserDisableMissing</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder UserDisableMissing(ConfigNodePropertyBoolean value)
            {
                _UserDisableMissing = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.GroupExpirationTime property.
            /// </summary>
            /// <param name="value">GroupExpirationTime</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder GroupExpirationTime(ConfigNodePropertyString value)
            {
                _GroupExpirationTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.GroupAutoMembership property.
            /// </summary>
            /// <param name="value">GroupAutoMembership</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder GroupAutoMembership(ConfigNodePropertyArray value)
            {
                _GroupAutoMembership = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.GroupPropertyMapping property.
            /// </summary>
            /// <param name="value">GroupPropertyMapping</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder GroupPropertyMapping(ConfigNodePropertyArray value)
            {
                _GroupPropertyMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.GroupPathPrefix property.
            /// </summary>
            /// <param name="value">GroupPathPrefix</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder GroupPathPrefix(ConfigNodePropertyString value)
            {
                _GroupPathPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.EnableRFC7613UsercaseMappedProfile property.
            /// </summary>
            /// <param name="value">EnableRFC7613UsercaseMappedProfile</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder EnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean value)
            {
                _EnableRFC7613UsercaseMappedProfile = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(
                    HandlerName: _HandlerName,
                    UserExpirationTime: _UserExpirationTime,
                    UserAutoMembership: _UserAutoMembership,
                    UserPropertyMapping: _UserPropertyMapping,
                    UserPathPrefix: _UserPathPrefix,
                    UserMembershipExpTime: _UserMembershipExpTime,
                    UserMembershipNestingDepth: _UserMembershipNestingDepth,
                    UserDynamicMembership: _UserDynamicMembership,
                    UserDisableMissing: _UserDisableMissing,
                    GroupExpirationTime: _GroupExpirationTime,
                    GroupAutoMembership: _GroupAutoMembership,
                    GroupPropertyMapping: _GroupPropertyMapping,
                    GroupPathPrefix: _GroupPathPrefix,
                    EnableRFC7613UsercaseMappedProfile: _EnableRFC7613UsercaseMappedProfile
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}