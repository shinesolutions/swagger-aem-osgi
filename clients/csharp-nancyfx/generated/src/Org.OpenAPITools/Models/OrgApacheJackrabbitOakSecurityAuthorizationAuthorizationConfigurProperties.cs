using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties:  IEquatable<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties>
    { 
        /// <summary>
        /// PermissionsJr2
        /// </summary>
        public ConfigNodePropertyDropDown PermissionsJr2 { get; private set; }

        /// <summary>
        /// ImportBehavior
        /// </summary>
        public ConfigNodePropertyDropDown ImportBehavior { get; private set; }

        /// <summary>
        /// ReadPaths
        /// </summary>
        public ConfigNodePropertyArray ReadPaths { get; private set; }

        /// <summary>
        /// AdministrativePrincipals
        /// </summary>
        public ConfigNodePropertyArray AdministrativePrincipals { get; private set; }

        /// <summary>
        /// ConfigurationRanking
        /// </summary>
        public ConfigNodePropertyInteger ConfigurationRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties()
        {
        }

        private OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(ConfigNodePropertyDropDown PermissionsJr2, ConfigNodePropertyDropDown ImportBehavior, ConfigNodePropertyArray ReadPaths, ConfigNodePropertyArray AdministrativePrincipals, ConfigNodePropertyInteger ConfigurationRanking)
        {
            
            this.PermissionsJr2 = PermissionsJr2;
            
            this.ImportBehavior = ImportBehavior;
            
            this.ReadPaths = ReadPaths;
            
            this.AdministrativePrincipals = AdministrativePrincipals;
            
            this.ConfigurationRanking = ConfigurationRanking;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder With()
        {
            return Builder()
                .PermissionsJr2(PermissionsJr2)
                .ImportBehavior(ImportBehavior)
                .ReadPaths(ReadPaths)
                .AdministrativePrincipals(AdministrativePrincipals)
                .ConfigurationRanking(ConfigurationRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties left, OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties left, OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _PermissionsJr2;
            private ConfigNodePropertyDropDown _ImportBehavior;
            private ConfigNodePropertyArray _ReadPaths;
            private ConfigNodePropertyArray _AdministrativePrincipals;
            private ConfigNodePropertyInteger _ConfigurationRanking;

            internal OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.PermissionsJr2 property.
            /// </summary>
            /// <param name="value">PermissionsJr2</param>
            public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder PermissionsJr2(ConfigNodePropertyDropDown value)
            {
                _PermissionsJr2 = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.ImportBehavior property.
            /// </summary>
            /// <param name="value">ImportBehavior</param>
            public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder ImportBehavior(ConfigNodePropertyDropDown value)
            {
                _ImportBehavior = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.ReadPaths property.
            /// </summary>
            /// <param name="value">ReadPaths</param>
            public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder ReadPaths(ConfigNodePropertyArray value)
            {
                _ReadPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.AdministrativePrincipals property.
            /// </summary>
            /// <param name="value">AdministrativePrincipals</param>
            public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder AdministrativePrincipals(ConfigNodePropertyArray value)
            {
                _AdministrativePrincipals = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.ConfigurationRanking property.
            /// </summary>
            /// <param name="value">ConfigurationRanking</param>
            public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder ConfigurationRanking(ConfigNodePropertyInteger value)
            {
                _ConfigurationRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties</returns>
            public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(
                    PermissionsJr2: _PermissionsJr2,
                    ImportBehavior: _ImportBehavior,
                    ReadPaths: _ReadPaths,
                    AdministrativePrincipals: _AdministrativePrincipals,
                    ConfigurationRanking: _ConfigurationRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}