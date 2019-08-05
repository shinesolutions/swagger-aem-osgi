using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties:  IEquatable<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties>
    { 
        /// <summary>
        /// Dir
        /// </summary>
        public ConfigNodePropertyString Dir { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties(ConfigNodePropertyString Dir)
        {
            
            this.Dir = Dir;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder With()
        {
            return Builder()
                .Dir(Dir);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties left, OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties left, OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder
        {
            private ConfigNodePropertyString _Dir;

            internal OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.Dir property.
            /// </summary>
            /// <param name="value">Dir</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder Dir(ConfigNodePropertyString value)
            {
                _Dir = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties</returns>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties(
                    Dir: _Dir
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}