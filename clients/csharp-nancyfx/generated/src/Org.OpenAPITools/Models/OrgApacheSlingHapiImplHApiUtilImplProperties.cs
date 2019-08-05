using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHapiImplHApiUtilImplProperties
    /// </summary>
    public sealed class OrgApacheSlingHapiImplHApiUtilImplProperties:  IEquatable<OrgApacheSlingHapiImplHApiUtilImplProperties>
    { 
        /// <summary>
        /// OrgApacheSlingHapiToolsResourcetype
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingHapiToolsResourcetype { get; private set; }

        /// <summary>
        /// OrgApacheSlingHapiToolsCollectionresourcetype
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingHapiToolsCollectionresourcetype { get; private set; }

        /// <summary>
        /// OrgApacheSlingHapiToolsSearchpaths
        /// </summary>
        public ConfigNodePropertyArray OrgApacheSlingHapiToolsSearchpaths { get; private set; }

        /// <summary>
        /// OrgApacheSlingHapiToolsExternalurl
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingHapiToolsExternalurl { get; private set; }

        /// <summary>
        /// OrgApacheSlingHapiToolsEnabled
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheSlingHapiToolsEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHapiImplHApiUtilImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHapiImplHApiUtilImplProperties()
        {
        }

        private OrgApacheSlingHapiImplHApiUtilImplProperties(ConfigNodePropertyString OrgApacheSlingHapiToolsResourcetype, ConfigNodePropertyString OrgApacheSlingHapiToolsCollectionresourcetype, ConfigNodePropertyArray OrgApacheSlingHapiToolsSearchpaths, ConfigNodePropertyString OrgApacheSlingHapiToolsExternalurl, ConfigNodePropertyBoolean OrgApacheSlingHapiToolsEnabled)
        {
            
            this.OrgApacheSlingHapiToolsResourcetype = OrgApacheSlingHapiToolsResourcetype;
            
            this.OrgApacheSlingHapiToolsCollectionresourcetype = OrgApacheSlingHapiToolsCollectionresourcetype;
            
            this.OrgApacheSlingHapiToolsSearchpaths = OrgApacheSlingHapiToolsSearchpaths;
            
            this.OrgApacheSlingHapiToolsExternalurl = OrgApacheSlingHapiToolsExternalurl;
            
            this.OrgApacheSlingHapiToolsEnabled = OrgApacheSlingHapiToolsEnabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHapiImplHApiUtilImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder</returns>
        public static OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder</returns>
        public OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingHapiToolsResourcetype(OrgApacheSlingHapiToolsResourcetype)
                .OrgApacheSlingHapiToolsCollectionresourcetype(OrgApacheSlingHapiToolsCollectionresourcetype)
                .OrgApacheSlingHapiToolsSearchpaths(OrgApacheSlingHapiToolsSearchpaths)
                .OrgApacheSlingHapiToolsExternalurl(OrgApacheSlingHapiToolsExternalurl)
                .OrgApacheSlingHapiToolsEnabled(OrgApacheSlingHapiToolsEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingHapiImplHApiUtilImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHapiImplHApiUtilImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHapiImplHApiUtilImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHapiImplHApiUtilImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHapiImplHApiUtilImplProperties left, OrgApacheSlingHapiImplHApiUtilImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHapiImplHApiUtilImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHapiImplHApiUtilImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHapiImplHApiUtilImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHapiImplHApiUtilImplProperties left, OrgApacheSlingHapiImplHApiUtilImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHapiImplHApiUtilImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder
        {
            private ConfigNodePropertyString _OrgApacheSlingHapiToolsResourcetype;
            private ConfigNodePropertyString _OrgApacheSlingHapiToolsCollectionresourcetype;
            private ConfigNodePropertyArray _OrgApacheSlingHapiToolsSearchpaths;
            private ConfigNodePropertyString _OrgApacheSlingHapiToolsExternalurl;
            private ConfigNodePropertyBoolean _OrgApacheSlingHapiToolsEnabled;

            internal OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplProperties.OrgApacheSlingHapiToolsResourcetype property.
            /// </summary>
            /// <param name="value">OrgApacheSlingHapiToolsResourcetype</param>
            public OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder OrgApacheSlingHapiToolsResourcetype(ConfigNodePropertyString value)
            {
                _OrgApacheSlingHapiToolsResourcetype = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplProperties.OrgApacheSlingHapiToolsCollectionresourcetype property.
            /// </summary>
            /// <param name="value">OrgApacheSlingHapiToolsCollectionresourcetype</param>
            public OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder OrgApacheSlingHapiToolsCollectionresourcetype(ConfigNodePropertyString value)
            {
                _OrgApacheSlingHapiToolsCollectionresourcetype = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplProperties.OrgApacheSlingHapiToolsSearchpaths property.
            /// </summary>
            /// <param name="value">OrgApacheSlingHapiToolsSearchpaths</param>
            public OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder OrgApacheSlingHapiToolsSearchpaths(ConfigNodePropertyArray value)
            {
                _OrgApacheSlingHapiToolsSearchpaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplProperties.OrgApacheSlingHapiToolsExternalurl property.
            /// </summary>
            /// <param name="value">OrgApacheSlingHapiToolsExternalurl</param>
            public OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder OrgApacheSlingHapiToolsExternalurl(ConfigNodePropertyString value)
            {
                _OrgApacheSlingHapiToolsExternalurl = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplProperties.OrgApacheSlingHapiToolsEnabled property.
            /// </summary>
            /// <param name="value">OrgApacheSlingHapiToolsEnabled</param>
            public OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder OrgApacheSlingHapiToolsEnabled(ConfigNodePropertyBoolean value)
            {
                _OrgApacheSlingHapiToolsEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHapiImplHApiUtilImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingHapiImplHApiUtilImplProperties</returns>
            public OrgApacheSlingHapiImplHApiUtilImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingHapiImplHApiUtilImplProperties(
                    OrgApacheSlingHapiToolsResourcetype: _OrgApacheSlingHapiToolsResourcetype,
                    OrgApacheSlingHapiToolsCollectionresourcetype: _OrgApacheSlingHapiToolsCollectionresourcetype,
                    OrgApacheSlingHapiToolsSearchpaths: _OrgApacheSlingHapiToolsSearchpaths,
                    OrgApacheSlingHapiToolsExternalurl: _OrgApacheSlingHapiToolsExternalurl,
                    OrgApacheSlingHapiToolsEnabled: _OrgApacheSlingHapiToolsEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}