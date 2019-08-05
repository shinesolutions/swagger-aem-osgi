using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties:  IEquatable<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties(ConfigNodePropertyString Path)
        {
            
            this.Path = Path;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder With()
        {
            return Builder()
                .Path(Path);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties left, OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties left, OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder
        {
            private ConfigNodePropertyString _Path;

            internal OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties</returns>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties(
                    Path: _Path
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}