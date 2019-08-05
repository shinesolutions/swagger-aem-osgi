using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties:  IEquatable<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties>
    { 
        /// <summary>
        /// WhitelistBypass
        /// </summary>
        public ConfigNodePropertyBoolean WhitelistBypass { get; private set; }

        /// <summary>
        /// WhitelistBundlesRegexp
        /// </summary>
        public ConfigNodePropertyString WhitelistBundlesRegexp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties()
        {
        }

        private OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(ConfigNodePropertyBoolean WhitelistBypass, ConfigNodePropertyString WhitelistBundlesRegexp)
        {
            
            this.WhitelistBypass = WhitelistBypass;
            
            this.WhitelistBundlesRegexp = WhitelistBundlesRegexp;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder</returns>
        public static OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder</returns>
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder With()
        {
            return Builder()
                .WhitelistBypass(WhitelistBypass)
                .WhitelistBundlesRegexp(WhitelistBundlesRegexp);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties left, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties left, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _WhitelistBypass;
            private ConfigNodePropertyString _WhitelistBundlesRegexp;

            internal OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.WhitelistBypass property.
            /// </summary>
            /// <param name="value">WhitelistBypass</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder WhitelistBypass(ConfigNodePropertyBoolean value)
            {
                _WhitelistBypass = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.WhitelistBundlesRegexp property.
            /// </summary>
            /// <param name="value">WhitelistBundlesRegexp</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder WhitelistBundlesRegexp(ConfigNodePropertyString value)
            {
                _WhitelistBundlesRegexp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties</returns>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(
                    WhitelistBypass: _WhitelistBypass,
                    WhitelistBundlesRegexp: _WhitelistBundlesRegexp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}