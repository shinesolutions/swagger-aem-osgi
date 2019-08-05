using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties:  IEquatable<OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties>
    { 
        /// <summary>
        /// HomePath
        /// </summary>
        public ConfigNodePropertyString HomePath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties()
        {
        }

        private OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties(ConfigNodePropertyString HomePath)
        {
            
            this.HomePath = HomePath;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder</returns>
        public static OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder</returns>
        public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder With()
        {
            return Builder()
                .HomePath(HomePath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties left, OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties left, OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder
        {
            private ConfigNodePropertyString _HomePath;

            internal OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.HomePath property.
            /// </summary>
            /// <param name="value">HomePath</param>
            public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder HomePath(ConfigNodePropertyString value)
            {
                _HomePath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties</returns>
            public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties(
                    HomePath: _HomePath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}