using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties:  IEquatable<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties>
    { 
        /// <summary>
        /// TokenExpiration
        /// </summary>
        public ConfigNodePropertyString TokenExpiration { get; private set; }

        /// <summary>
        /// TokenLength
        /// </summary>
        public ConfigNodePropertyString TokenLength { get; private set; }

        /// <summary>
        /// TokenRefresh
        /// </summary>
        public ConfigNodePropertyBoolean TokenRefresh { get; private set; }

        /// <summary>
        /// TokenCleanupThreshold
        /// </summary>
        public ConfigNodePropertyInteger TokenCleanupThreshold { get; private set; }

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
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties()
        {
        }

        private OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(ConfigNodePropertyString TokenExpiration, ConfigNodePropertyString TokenLength, ConfigNodePropertyBoolean TokenRefresh, ConfigNodePropertyInteger TokenCleanupThreshold, ConfigNodePropertyString PasswordHashAlgorithm, ConfigNodePropertyInteger PasswordHashIterations, ConfigNodePropertyInteger PasswordSaltSize)
        {
            
            this.TokenExpiration = TokenExpiration;
            
            this.TokenLength = TokenLength;
            
            this.TokenRefresh = TokenRefresh;
            
            this.TokenCleanupThreshold = TokenCleanupThreshold;
            
            this.PasswordHashAlgorithm = PasswordHashAlgorithm;
            
            this.PasswordHashIterations = PasswordHashIterations;
            
            this.PasswordSaltSize = PasswordSaltSize;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder With()
        {
            return Builder()
                .TokenExpiration(TokenExpiration)
                .TokenLength(TokenLength)
                .TokenRefresh(TokenRefresh)
                .TokenCleanupThreshold(TokenCleanupThreshold)
                .PasswordHashAlgorithm(PasswordHashAlgorithm)
                .PasswordHashIterations(PasswordHashIterations)
                .PasswordSaltSize(PasswordSaltSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties left, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties left, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder
        {
            private ConfigNodePropertyString _TokenExpiration;
            private ConfigNodePropertyString _TokenLength;
            private ConfigNodePropertyBoolean _TokenRefresh;
            private ConfigNodePropertyInteger _TokenCleanupThreshold;
            private ConfigNodePropertyString _PasswordHashAlgorithm;
            private ConfigNodePropertyInteger _PasswordHashIterations;
            private ConfigNodePropertyInteger _PasswordSaltSize;

            internal OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.TokenExpiration property.
            /// </summary>
            /// <param name="value">TokenExpiration</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder TokenExpiration(ConfigNodePropertyString value)
            {
                _TokenExpiration = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.TokenLength property.
            /// </summary>
            /// <param name="value">TokenLength</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder TokenLength(ConfigNodePropertyString value)
            {
                _TokenLength = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.TokenRefresh property.
            /// </summary>
            /// <param name="value">TokenRefresh</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder TokenRefresh(ConfigNodePropertyBoolean value)
            {
                _TokenRefresh = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.TokenCleanupThreshold property.
            /// </summary>
            /// <param name="value">TokenCleanupThreshold</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder TokenCleanupThreshold(ConfigNodePropertyInteger value)
            {
                _TokenCleanupThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.PasswordHashAlgorithm property.
            /// </summary>
            /// <param name="value">PasswordHashAlgorithm</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder PasswordHashAlgorithm(ConfigNodePropertyString value)
            {
                _PasswordHashAlgorithm = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.PasswordHashIterations property.
            /// </summary>
            /// <param name="value">PasswordHashIterations</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder PasswordHashIterations(ConfigNodePropertyInteger value)
            {
                _PasswordHashIterations = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.PasswordSaltSize property.
            /// </summary>
            /// <param name="value">PasswordSaltSize</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder PasswordSaltSize(ConfigNodePropertyInteger value)
            {
                _PasswordSaltSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties</returns>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(
                    TokenExpiration: _TokenExpiration,
                    TokenLength: _TokenLength,
                    TokenRefresh: _TokenRefresh,
                    TokenCleanupThreshold: _TokenCleanupThreshold,
                    PasswordHashAlgorithm: _PasswordHashAlgorithm,
                    PasswordHashIterations: _PasswordHashIterations,
                    PasswordSaltSize: _PasswordSaltSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}