using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties>
    { 
        /// <summary>
        /// CugSupportedPaths
        /// </summary>
        public ConfigNodePropertyArray CugSupportedPaths { get; private set; }

        /// <summary>
        /// CugEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CugEnabled { get; private set; }

        /// <summary>
        /// ConfigurationRanking
        /// </summary>
        public ConfigNodePropertyInteger ConfigurationRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(ConfigNodePropertyArray CugSupportedPaths, ConfigNodePropertyBoolean CugEnabled, ConfigNodePropertyInteger ConfigurationRanking)
        {
            
            this.CugSupportedPaths = CugSupportedPaths;
            
            this.CugEnabled = CugEnabled;
            
            this.ConfigurationRanking = ConfigurationRanking;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder With()
        {
            return Builder()
                .CugSupportedPaths(CugSupportedPaths)
                .CugEnabled(CugEnabled)
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

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties left, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties left, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder
        {
            private ConfigNodePropertyArray _CugSupportedPaths;
            private ConfigNodePropertyBoolean _CugEnabled;
            private ConfigNodePropertyInteger _ConfigurationRanking;

            internal OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.CugSupportedPaths property.
            /// </summary>
            /// <param name="value">CugSupportedPaths</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder CugSupportedPaths(ConfigNodePropertyArray value)
            {
                _CugSupportedPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.CugEnabled property.
            /// </summary>
            /// <param name="value">CugEnabled</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder CugEnabled(ConfigNodePropertyBoolean value)
            {
                _CugEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.ConfigurationRanking property.
            /// </summary>
            /// <param name="value">ConfigurationRanking</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder ConfigurationRanking(ConfigNodePropertyInteger value)
            {
                _ConfigurationRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(
                    CugSupportedPaths: _CugSupportedPaths,
                    CugEnabled: _CugEnabled,
                    ConfigurationRanking: _ConfigurationRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}