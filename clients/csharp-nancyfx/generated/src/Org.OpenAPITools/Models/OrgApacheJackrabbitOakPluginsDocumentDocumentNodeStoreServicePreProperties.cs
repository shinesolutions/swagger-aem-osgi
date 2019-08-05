using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties:  IEquatable<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties>
    { 
        /// <summary>
        /// PersistentCacheIncludes
        /// </summary>
        public ConfigNodePropertyArray PersistentCacheIncludes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties(ConfigNodePropertyArray PersistentCacheIncludes)
        {
            
            this.PersistentCacheIncludes = PersistentCacheIncludes;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder With()
        {
            return Builder()
                .PersistentCacheIncludes(PersistentCacheIncludes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties left, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties left, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder
        {
            private ConfigNodePropertyArray _PersistentCacheIncludes;

            internal OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.PersistentCacheIncludes property.
            /// </summary>
            /// <param name="value">PersistentCacheIncludes</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder PersistentCacheIncludes(ConfigNodePropertyArray value)
            {
                _PersistentCacheIncludes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties</returns>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties(
                    PersistentCacheIncludes: _PersistentCacheIncludes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}