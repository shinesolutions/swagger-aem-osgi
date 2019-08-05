using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties:  IEquatable<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties>
    { 
        /// <summary>
        /// OrgApacheJackrabbitOakAuthenticationAppName
        /// </summary>
        public ConfigNodePropertyString OrgApacheJackrabbitOakAuthenticationAppName { get; private set; }

        /// <summary>
        /// OrgApacheJackrabbitOakAuthenticationConfigSpiName
        /// </summary>
        public ConfigNodePropertyString OrgApacheJackrabbitOakAuthenticationConfigSpiName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties()
        {
        }

        private OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(ConfigNodePropertyString OrgApacheJackrabbitOakAuthenticationAppName, ConfigNodePropertyString OrgApacheJackrabbitOakAuthenticationConfigSpiName)
        {
            
            this.OrgApacheJackrabbitOakAuthenticationAppName = OrgApacheJackrabbitOakAuthenticationAppName;
            
            this.OrgApacheJackrabbitOakAuthenticationConfigSpiName = OrgApacheJackrabbitOakAuthenticationConfigSpiName;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheJackrabbitOakAuthenticationAppName(OrgApacheJackrabbitOakAuthenticationAppName)
                .OrgApacheJackrabbitOakAuthenticationConfigSpiName(OrgApacheJackrabbitOakAuthenticationConfigSpiName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties left, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties left, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder
        {
            private ConfigNodePropertyString _OrgApacheJackrabbitOakAuthenticationAppName;
            private ConfigNodePropertyString _OrgApacheJackrabbitOakAuthenticationConfigSpiName;

            internal OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.OrgApacheJackrabbitOakAuthenticationAppName property.
            /// </summary>
            /// <param name="value">OrgApacheJackrabbitOakAuthenticationAppName</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder OrgApacheJackrabbitOakAuthenticationAppName(ConfigNodePropertyString value)
            {
                _OrgApacheJackrabbitOakAuthenticationAppName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.OrgApacheJackrabbitOakAuthenticationConfigSpiName property.
            /// </summary>
            /// <param name="value">OrgApacheJackrabbitOakAuthenticationConfigSpiName</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesBuilder OrgApacheJackrabbitOakAuthenticationConfigSpiName(ConfigNodePropertyString value)
            {
                _OrgApacheJackrabbitOakAuthenticationConfigSpiName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties</returns>
            public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(
                    OrgApacheJackrabbitOakAuthenticationAppName: _OrgApacheJackrabbitOakAuthenticationAppName,
                    OrgApacheJackrabbitOakAuthenticationConfigSpiName: _OrgApacheJackrabbitOakAuthenticationConfigSpiName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}