using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties:  IEquatable<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties>
    { 
        /// <summary>
        /// WhitelistName
        /// </summary>
        public ConfigNodePropertyString WhitelistName { get; private set; }

        /// <summary>
        /// WhitelistBundles
        /// </summary>
        public ConfigNodePropertyArray WhitelistBundles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties()
        {
        }

        private OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(ConfigNodePropertyString WhitelistName, ConfigNodePropertyArray WhitelistBundles)
        {
            
            this.WhitelistName = WhitelistName;
            
            this.WhitelistBundles = WhitelistBundles;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder</returns>
        public static OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder</returns>
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder With()
        {
            return Builder()
                .WhitelistName(WhitelistName)
                .WhitelistBundles(WhitelistBundles);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties left, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties left, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder
        {
            private ConfigNodePropertyString _WhitelistName;
            private ConfigNodePropertyArray _WhitelistBundles;

            internal OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.WhitelistName property.
            /// </summary>
            /// <param name="value">WhitelistName</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder WhitelistName(ConfigNodePropertyString value)
            {
                _WhitelistName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.WhitelistBundles property.
            /// </summary>
            /// <param name="value">WhitelistBundles</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder WhitelistBundles(ConfigNodePropertyArray value)
            {
                _WhitelistBundles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties</returns>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(
                    WhitelistName: _WhitelistName,
                    WhitelistBundles: _WhitelistBundles
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}