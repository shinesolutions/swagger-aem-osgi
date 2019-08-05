using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties:  IEquatable<OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties>
    { 
        /// <summary>
        /// PackageRoots
        /// </summary>
        public ConfigNodePropertyArray PackageRoots { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties()
        {
        }

        private OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(ConfigNodePropertyArray PackageRoots)
        {
            
            this.PackageRoots = PackageRoots;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder</returns>
        public static OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder</returns>
        public OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder With()
        {
            return Builder()
                .PackageRoots(PackageRoots);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties left, OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties left, OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _PackageRoots;

            internal OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.PackageRoots property.
            /// </summary>
            /// <param name="value">PackageRoots</param>
            public OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder PackageRoots(ConfigNodePropertyArray value)
            {
                _PackageRoots = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties</returns>
            public OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(
                    PackageRoots: _PackageRoots
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}