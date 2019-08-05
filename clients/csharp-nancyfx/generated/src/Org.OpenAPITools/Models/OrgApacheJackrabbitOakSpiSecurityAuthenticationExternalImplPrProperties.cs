using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties>
    { 
        /// <summary>
        /// ProtectExternalId
        /// </summary>
        public ConfigNodePropertyBoolean ProtectExternalId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties(ConfigNodePropertyBoolean ProtectExternalId)
        {
            
            this.ProtectExternalId = ProtectExternalId;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder With()
        {
            return Builder()
                .ProtectExternalId(ProtectExternalId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ProtectExternalId;

            internal OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.ProtectExternalId property.
            /// </summary>
            /// <param name="value">ProtectExternalId</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder ProtectExternalId(ConfigNodePropertyBoolean value)
            {
                _ProtectExternalId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties(
                    ProtectExternalId: _ProtectExternalId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}