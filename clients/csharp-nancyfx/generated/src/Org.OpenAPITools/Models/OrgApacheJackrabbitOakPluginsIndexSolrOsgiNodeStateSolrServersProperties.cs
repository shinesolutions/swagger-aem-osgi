using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties(ConfigNodePropertyBoolean Enabled)
        {
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties(
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}