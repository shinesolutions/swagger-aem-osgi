using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties>
    { 
        /// <summary>
        /// ServerType
        /// </summary>
        public ConfigNodePropertyDropDown ServerType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(ConfigNodePropertyDropDown ServerType)
        {
            
            this.ServerType = ServerType;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder With()
        {
            return Builder()
                .ServerType(ServerType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder
        {
            private ConfigNodePropertyDropDown _ServerType;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.ServerType property.
            /// </summary>
            /// <param name="value">ServerType</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder ServerType(ConfigNodePropertyDropDown value)
            {
                _ServerType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(
                    ServerType: _ServerType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}