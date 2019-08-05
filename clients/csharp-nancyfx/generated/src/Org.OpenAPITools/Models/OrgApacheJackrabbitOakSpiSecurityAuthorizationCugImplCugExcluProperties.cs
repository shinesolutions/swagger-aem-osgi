using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties>
    { 
        /// <summary>
        /// PrincipalNames
        /// </summary>
        public ConfigNodePropertyArray PrincipalNames { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties(ConfigNodePropertyArray PrincipalNames)
        {
            
            this.PrincipalNames = PrincipalNames;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder With()
        {
            return Builder()
                .PrincipalNames(PrincipalNames);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties left, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties left, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder
        {
            private ConfigNodePropertyArray _PrincipalNames;

            internal OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.PrincipalNames property.
            /// </summary>
            /// <param name="value">PrincipalNames</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder PrincipalNames(ConfigNodePropertyArray value)
            {
                _PrincipalNames = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties(
                    PrincipalNames: _PrincipalNames
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}