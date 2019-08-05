using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties:  IEquatable<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties>
    { 
        /// <summary>
        /// EnabledActions
        /// </summary>
        public ConfigNodePropertyDropDown EnabledActions { get; private set; }

        /// <summary>
        /// UserPrivilegeNames
        /// </summary>
        public ConfigNodePropertyArray UserPrivilegeNames { get; private set; }

        /// <summary>
        /// GroupPrivilegeNames
        /// </summary>
        public ConfigNodePropertyArray GroupPrivilegeNames { get; private set; }

        /// <summary>
        /// Constraint
        /// </summary>
        public ConfigNodePropertyString Constraint { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(ConfigNodePropertyDropDown EnabledActions, ConfigNodePropertyArray UserPrivilegeNames, ConfigNodePropertyArray GroupPrivilegeNames, ConfigNodePropertyString Constraint)
        {
            
            this.EnabledActions = EnabledActions;
            
            this.UserPrivilegeNames = UserPrivilegeNames;
            
            this.GroupPrivilegeNames = GroupPrivilegeNames;
            
            this.Constraint = Constraint;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder With()
        {
            return Builder()
                .EnabledActions(EnabledActions)
                .UserPrivilegeNames(UserPrivilegeNames)
                .GroupPrivilegeNames(GroupPrivilegeNames)
                .Constraint(Constraint);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties left, OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties left, OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder
        {
            private ConfigNodePropertyDropDown _EnabledActions;
            private ConfigNodePropertyArray _UserPrivilegeNames;
            private ConfigNodePropertyArray _GroupPrivilegeNames;
            private ConfigNodePropertyString _Constraint;

            internal OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.EnabledActions property.
            /// </summary>
            /// <param name="value">EnabledActions</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder EnabledActions(ConfigNodePropertyDropDown value)
            {
                _EnabledActions = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.UserPrivilegeNames property.
            /// </summary>
            /// <param name="value">UserPrivilegeNames</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder UserPrivilegeNames(ConfigNodePropertyArray value)
            {
                _UserPrivilegeNames = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.GroupPrivilegeNames property.
            /// </summary>
            /// <param name="value">GroupPrivilegeNames</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder GroupPrivilegeNames(ConfigNodePropertyArray value)
            {
                _GroupPrivilegeNames = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.Constraint property.
            /// </summary>
            /// <param name="value">Constraint</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder Constraint(ConfigNodePropertyString value)
            {
                _Constraint = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties</returns>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(
                    EnabledActions: _EnabledActions,
                    UserPrivilegeNames: _UserPrivilegeNames,
                    GroupPrivilegeNames: _GroupPrivilegeNames,
                    Constraint: _Constraint
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}