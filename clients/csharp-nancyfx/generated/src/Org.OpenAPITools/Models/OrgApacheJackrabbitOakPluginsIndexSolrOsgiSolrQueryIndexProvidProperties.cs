using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties>
    { 
        /// <summary>
        /// QueryAggregation
        /// </summary>
        public ConfigNodePropertyBoolean QueryAggregation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties(ConfigNodePropertyBoolean QueryAggregation)
        {
            
            this.QueryAggregation = QueryAggregation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder With()
        {
            return Builder()
                .QueryAggregation(QueryAggregation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _QueryAggregation;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.QueryAggregation property.
            /// </summary>
            /// <param name="value">QueryAggregation</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder QueryAggregation(ConfigNodePropertyBoolean value)
            {
                _QueryAggregation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties(
                    QueryAggregation: _QueryAggregation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}