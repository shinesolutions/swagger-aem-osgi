using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties>
    { 
        /// <summary>
        /// JaasRanking
        /// </summary>
        public ConfigNodePropertyInteger JaasRanking { get; private set; }

        /// <summary>
        /// JaasControlFlag
        /// </summary>
        public ConfigNodePropertyString JaasControlFlag { get; private set; }

        /// <summary>
        /// JaasRealmName
        /// </summary>
        public ConfigNodePropertyString JaasRealmName { get; private set; }

        /// <summary>
        /// IdpName
        /// </summary>
        public ConfigNodePropertyString IdpName { get; private set; }

        /// <summary>
        /// SyncHandlerName
        /// </summary>
        public ConfigNodePropertyString SyncHandlerName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(ConfigNodePropertyInteger JaasRanking, ConfigNodePropertyString JaasControlFlag, ConfigNodePropertyString JaasRealmName, ConfigNodePropertyString IdpName, ConfigNodePropertyString SyncHandlerName)
        {
            
            this.JaasRanking = JaasRanking;
            
            this.JaasControlFlag = JaasControlFlag;
            
            this.JaasRealmName = JaasRealmName;
            
            this.IdpName = IdpName;
            
            this.SyncHandlerName = SyncHandlerName;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder With()
        {
            return Builder()
                .JaasRanking(JaasRanking)
                .JaasControlFlag(JaasControlFlag)
                .JaasRealmName(JaasRealmName)
                .IdpName(IdpName)
                .SyncHandlerName(SyncHandlerName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder
        {
            private ConfigNodePropertyInteger _JaasRanking;
            private ConfigNodePropertyString _JaasControlFlag;
            private ConfigNodePropertyString _JaasRealmName;
            private ConfigNodePropertyString _IdpName;
            private ConfigNodePropertyString _SyncHandlerName;

            internal OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.JaasRanking property.
            /// </summary>
            /// <param name="value">JaasRanking</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder JaasRanking(ConfigNodePropertyInteger value)
            {
                _JaasRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.JaasControlFlag property.
            /// </summary>
            /// <param name="value">JaasControlFlag</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder JaasControlFlag(ConfigNodePropertyString value)
            {
                _JaasControlFlag = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.JaasRealmName property.
            /// </summary>
            /// <param name="value">JaasRealmName</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder JaasRealmName(ConfigNodePropertyString value)
            {
                _JaasRealmName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.IdpName property.
            /// </summary>
            /// <param name="value">IdpName</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder IdpName(ConfigNodePropertyString value)
            {
                _IdpName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.SyncHandlerName property.
            /// </summary>
            /// <param name="value">SyncHandlerName</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder SyncHandlerName(ConfigNodePropertyString value)
            {
                _SyncHandlerName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(
                    JaasRanking: _JaasRanking,
                    JaasControlFlag: _JaasControlFlag,
                    JaasRealmName: _JaasRealmName,
                    IdpName: _IdpName,
                    SyncHandlerName: _SyncHandlerName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}