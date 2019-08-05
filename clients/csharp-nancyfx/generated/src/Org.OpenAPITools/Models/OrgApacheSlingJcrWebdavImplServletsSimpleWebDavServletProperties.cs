using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties:  IEquatable<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties>
    { 
        /// <summary>
        /// DavRoot
        /// </summary>
        public ConfigNodePropertyString DavRoot { get; private set; }

        /// <summary>
        /// DavCreateAbsoluteUri
        /// </summary>
        public ConfigNodePropertyBoolean DavCreateAbsoluteUri { get; private set; }

        /// <summary>
        /// DavRealm
        /// </summary>
        public ConfigNodePropertyString DavRealm { get; private set; }

        /// <summary>
        /// CollectionTypes
        /// </summary>
        public ConfigNodePropertyArray CollectionTypes { get; private set; }

        /// <summary>
        /// FilterPrefixes
        /// </summary>
        public ConfigNodePropertyArray FilterPrefixes { get; private set; }

        /// <summary>
        /// FilterTypes
        /// </summary>
        public ConfigNodePropertyString FilterTypes { get; private set; }

        /// <summary>
        /// FilterUris
        /// </summary>
        public ConfigNodePropertyString FilterUris { get; private set; }

        /// <summary>
        /// TypeCollections
        /// </summary>
        public ConfigNodePropertyString TypeCollections { get; private set; }

        /// <summary>
        /// TypeNoncollections
        /// </summary>
        public ConfigNodePropertyString TypeNoncollections { get; private set; }

        /// <summary>
        /// TypeContent
        /// </summary>
        public ConfigNodePropertyString TypeContent { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties()
        {
        }

        private OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(ConfigNodePropertyString DavRoot, ConfigNodePropertyBoolean DavCreateAbsoluteUri, ConfigNodePropertyString DavRealm, ConfigNodePropertyArray CollectionTypes, ConfigNodePropertyArray FilterPrefixes, ConfigNodePropertyString FilterTypes, ConfigNodePropertyString FilterUris, ConfigNodePropertyString TypeCollections, ConfigNodePropertyString TypeNoncollections, ConfigNodePropertyString TypeContent)
        {
            
            this.DavRoot = DavRoot;
            
            this.DavCreateAbsoluteUri = DavCreateAbsoluteUri;
            
            this.DavRealm = DavRealm;
            
            this.CollectionTypes = CollectionTypes;
            
            this.FilterPrefixes = FilterPrefixes;
            
            this.FilterTypes = FilterTypes;
            
            this.FilterUris = FilterUris;
            
            this.TypeCollections = TypeCollections;
            
            this.TypeNoncollections = TypeNoncollections;
            
            this.TypeContent = TypeContent;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder</returns>
        public static OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder</returns>
        public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder With()
        {
            return Builder()
                .DavRoot(DavRoot)
                .DavCreateAbsoluteUri(DavCreateAbsoluteUri)
                .DavRealm(DavRealm)
                .CollectionTypes(CollectionTypes)
                .FilterPrefixes(FilterPrefixes)
                .FilterTypes(FilterTypes)
                .FilterUris(FilterUris)
                .TypeCollections(TypeCollections)
                .TypeNoncollections(TypeNoncollections)
                .TypeContent(TypeContent);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties left, OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties left, OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder
        {
            private ConfigNodePropertyString _DavRoot;
            private ConfigNodePropertyBoolean _DavCreateAbsoluteUri;
            private ConfigNodePropertyString _DavRealm;
            private ConfigNodePropertyArray _CollectionTypes;
            private ConfigNodePropertyArray _FilterPrefixes;
            private ConfigNodePropertyString _FilterTypes;
            private ConfigNodePropertyString _FilterUris;
            private ConfigNodePropertyString _TypeCollections;
            private ConfigNodePropertyString _TypeNoncollections;
            private ConfigNodePropertyString _TypeContent;

            internal OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.DavRoot property.
            /// </summary>
            /// <param name="value">DavRoot</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder DavRoot(ConfigNodePropertyString value)
            {
                _DavRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.DavCreateAbsoluteUri property.
            /// </summary>
            /// <param name="value">DavCreateAbsoluteUri</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder DavCreateAbsoluteUri(ConfigNodePropertyBoolean value)
            {
                _DavCreateAbsoluteUri = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.DavRealm property.
            /// </summary>
            /// <param name="value">DavRealm</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder DavRealm(ConfigNodePropertyString value)
            {
                _DavRealm = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.CollectionTypes property.
            /// </summary>
            /// <param name="value">CollectionTypes</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder CollectionTypes(ConfigNodePropertyArray value)
            {
                _CollectionTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.FilterPrefixes property.
            /// </summary>
            /// <param name="value">FilterPrefixes</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder FilterPrefixes(ConfigNodePropertyArray value)
            {
                _FilterPrefixes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.FilterTypes property.
            /// </summary>
            /// <param name="value">FilterTypes</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder FilterTypes(ConfigNodePropertyString value)
            {
                _FilterTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.FilterUris property.
            /// </summary>
            /// <param name="value">FilterUris</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder FilterUris(ConfigNodePropertyString value)
            {
                _FilterUris = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.TypeCollections property.
            /// </summary>
            /// <param name="value">TypeCollections</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder TypeCollections(ConfigNodePropertyString value)
            {
                _TypeCollections = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.TypeNoncollections property.
            /// </summary>
            /// <param name="value">TypeNoncollections</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder TypeNoncollections(ConfigNodePropertyString value)
            {
                _TypeNoncollections = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.TypeContent property.
            /// </summary>
            /// <param name="value">TypeContent</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder TypeContent(ConfigNodePropertyString value)
            {
                _TypeContent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties</returns>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(
                    DavRoot: _DavRoot,
                    DavCreateAbsoluteUri: _DavCreateAbsoluteUri,
                    DavRealm: _DavRealm,
                    CollectionTypes: _CollectionTypes,
                    FilterPrefixes: _FilterPrefixes,
                    FilterTypes: _FilterTypes,
                    FilterUris: _FilterUris,
                    TypeCollections: _TypeCollections,
                    TypeNoncollections: _TypeNoncollections,
                    TypeContent: _TypeContent
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}