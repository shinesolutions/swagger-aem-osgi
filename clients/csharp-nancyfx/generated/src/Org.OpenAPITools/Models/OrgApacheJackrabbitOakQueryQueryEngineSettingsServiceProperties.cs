using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties:  IEquatable<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties>
    { 
        /// <summary>
        /// QueryLimitInMemory
        /// </summary>
        public ConfigNodePropertyInteger QueryLimitInMemory { get; private set; }

        /// <summary>
        /// QueryLimitReads
        /// </summary>
        public ConfigNodePropertyInteger QueryLimitReads { get; private set; }

        /// <summary>
        /// QueryFailTraversal
        /// </summary>
        public ConfigNodePropertyBoolean QueryFailTraversal { get; private set; }

        /// <summary>
        /// FastQuerySize
        /// </summary>
        public ConfigNodePropertyBoolean FastQuerySize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties()
        {
        }

        private OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(ConfigNodePropertyInteger QueryLimitInMemory, ConfigNodePropertyInteger QueryLimitReads, ConfigNodePropertyBoolean QueryFailTraversal, ConfigNodePropertyBoolean FastQuerySize)
        {
            
            this.QueryLimitInMemory = QueryLimitInMemory;
            
            this.QueryLimitReads = QueryLimitReads;
            
            this.QueryFailTraversal = QueryFailTraversal;
            
            this.FastQuerySize = FastQuerySize;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder With()
        {
            return Builder()
                .QueryLimitInMemory(QueryLimitInMemory)
                .QueryLimitReads(QueryLimitReads)
                .QueryFailTraversal(QueryFailTraversal)
                .FastQuerySize(FastQuerySize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties left, OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties left, OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _QueryLimitInMemory;
            private ConfigNodePropertyInteger _QueryLimitReads;
            private ConfigNodePropertyBoolean _QueryFailTraversal;
            private ConfigNodePropertyBoolean _FastQuerySize;

            internal OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.QueryLimitInMemory property.
            /// </summary>
            /// <param name="value">QueryLimitInMemory</param>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder QueryLimitInMemory(ConfigNodePropertyInteger value)
            {
                _QueryLimitInMemory = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.QueryLimitReads property.
            /// </summary>
            /// <param name="value">QueryLimitReads</param>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder QueryLimitReads(ConfigNodePropertyInteger value)
            {
                _QueryLimitReads = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.QueryFailTraversal property.
            /// </summary>
            /// <param name="value">QueryFailTraversal</param>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder QueryFailTraversal(ConfigNodePropertyBoolean value)
            {
                _QueryFailTraversal = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.FastQuerySize property.
            /// </summary>
            /// <param name="value">FastQuerySize</param>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder FastQuerySize(ConfigNodePropertyBoolean value)
            {
                _FastQuerySize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties</returns>
            public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(
                    QueryLimitInMemory: _QueryLimitInMemory,
                    QueryLimitReads: _QueryLimitReads,
                    QueryFailTraversal: _QueryFailTraversal,
                    FastQuerySize: _FastQuerySize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}