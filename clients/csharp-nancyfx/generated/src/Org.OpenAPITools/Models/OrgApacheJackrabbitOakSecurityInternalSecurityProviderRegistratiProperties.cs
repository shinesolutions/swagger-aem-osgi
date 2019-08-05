using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties:  IEquatable<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties>
    { 
        /// <summary>
        /// RequiredServicePids
        /// </summary>
        public ConfigNodePropertyArray RequiredServicePids { get; private set; }

        /// <summary>
        /// AuthorizationCompositionType
        /// </summary>
        public ConfigNodePropertyDropDown AuthorizationCompositionType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties()
        {
        }

        private OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(ConfigNodePropertyArray RequiredServicePids, ConfigNodePropertyDropDown AuthorizationCompositionType)
        {
            
            this.RequiredServicePids = RequiredServicePids;
            
            this.AuthorizationCompositionType = AuthorizationCompositionType;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder With()
        {
            return Builder()
                .RequiredServicePids(RequiredServicePids)
                .AuthorizationCompositionType(AuthorizationCompositionType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties left, OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties left, OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder
        {
            private ConfigNodePropertyArray _RequiredServicePids;
            private ConfigNodePropertyDropDown _AuthorizationCompositionType;

            internal OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.RequiredServicePids property.
            /// </summary>
            /// <param name="value">RequiredServicePids</param>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder RequiredServicePids(ConfigNodePropertyArray value)
            {
                _RequiredServicePids = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.AuthorizationCompositionType property.
            /// </summary>
            /// <param name="value">AuthorizationCompositionType</param>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder AuthorizationCompositionType(ConfigNodePropertyDropDown value)
            {
                _AuthorizationCompositionType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties</returns>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(
                    RequiredServicePids: _RequiredServicePids,
                    AuthorizationCompositionType: _AuthorizationCompositionType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}