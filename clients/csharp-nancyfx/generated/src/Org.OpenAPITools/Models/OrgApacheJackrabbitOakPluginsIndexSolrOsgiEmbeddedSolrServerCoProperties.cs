using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties>
    { 
        /// <summary>
        /// SolrHomePath
        /// </summary>
        public ConfigNodePropertyString SolrHomePath { get; private set; }

        /// <summary>
        /// SolrCoreName
        /// </summary>
        public ConfigNodePropertyString SolrCoreName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(ConfigNodePropertyString SolrHomePath, ConfigNodePropertyString SolrCoreName)
        {
            
            this.SolrHomePath = SolrHomePath;
            
            this.SolrCoreName = SolrCoreName;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder With()
        {
            return Builder()
                .SolrHomePath(SolrHomePath)
                .SolrCoreName(SolrCoreName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder
        {
            private ConfigNodePropertyString _SolrHomePath;
            private ConfigNodePropertyString _SolrCoreName;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.SolrHomePath property.
            /// </summary>
            /// <param name="value">SolrHomePath</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder SolrHomePath(ConfigNodePropertyString value)
            {
                _SolrHomePath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.SolrCoreName property.
            /// </summary>
            /// <param name="value">SolrCoreName</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder SolrCoreName(ConfigNodePropertyString value)
            {
                _SolrCoreName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(
                    SolrHomePath: _SolrHomePath,
                    SolrCoreName: _SolrCoreName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}