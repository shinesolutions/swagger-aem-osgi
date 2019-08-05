using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties:  IEquatable<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties>
    { 
        /// <summary>
        /// Disabled
        /// </summary>
        public ConfigNodePropertyBoolean Disabled { get; private set; }

        /// <summary>
        /// Debug
        /// </summary>
        public ConfigNodePropertyBoolean Debug { get; private set; }

        /// <summary>
        /// LocalIndexDir
        /// </summary>
        public ConfigNodePropertyString LocalIndexDir { get; private set; }

        /// <summary>
        /// EnableOpenIndexAsync
        /// </summary>
        public ConfigNodePropertyBoolean EnableOpenIndexAsync { get; private set; }

        /// <summary>
        /// ThreadPoolSize
        /// </summary>
        public ConfigNodePropertyInteger ThreadPoolSize { get; private set; }

        /// <summary>
        /// PrefetchIndexFiles
        /// </summary>
        public ConfigNodePropertyBoolean PrefetchIndexFiles { get; private set; }

        /// <summary>
        /// ExtractedTextCacheSizeInMB
        /// </summary>
        public ConfigNodePropertyInteger ExtractedTextCacheSizeInMB { get; private set; }

        /// <summary>
        /// ExtractedTextCacheExpiryInSecs
        /// </summary>
        public ConfigNodePropertyInteger ExtractedTextCacheExpiryInSecs { get; private set; }

        /// <summary>
        /// AlwaysUsePreExtractedCache
        /// </summary>
        public ConfigNodePropertyBoolean AlwaysUsePreExtractedCache { get; private set; }

        /// <summary>
        /// BooleanClauseLimit
        /// </summary>
        public ConfigNodePropertyInteger BooleanClauseLimit { get; private set; }

        /// <summary>
        /// EnableHybridIndexing
        /// </summary>
        public ConfigNodePropertyBoolean EnableHybridIndexing { get; private set; }

        /// <summary>
        /// HybridQueueSize
        /// </summary>
        public ConfigNodePropertyInteger HybridQueueSize { get; private set; }

        /// <summary>
        /// DisableStoredIndexDefinition
        /// </summary>
        public ConfigNodePropertyBoolean DisableStoredIndexDefinition { get; private set; }

        /// <summary>
        /// DeletedBlobsCollectionEnabled
        /// </summary>
        public ConfigNodePropertyBoolean DeletedBlobsCollectionEnabled { get; private set; }

        /// <summary>
        /// PropIndexCleanerIntervalInSecs
        /// </summary>
        public ConfigNodePropertyInteger PropIndexCleanerIntervalInSecs { get; private set; }

        /// <summary>
        /// EnableSingleBlobIndexFiles
        /// </summary>
        public ConfigNodePropertyBoolean EnableSingleBlobIndexFiles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(ConfigNodePropertyBoolean Disabled, ConfigNodePropertyBoolean Debug, ConfigNodePropertyString LocalIndexDir, ConfigNodePropertyBoolean EnableOpenIndexAsync, ConfigNodePropertyInteger ThreadPoolSize, ConfigNodePropertyBoolean PrefetchIndexFiles, ConfigNodePropertyInteger ExtractedTextCacheSizeInMB, ConfigNodePropertyInteger ExtractedTextCacheExpiryInSecs, ConfigNodePropertyBoolean AlwaysUsePreExtractedCache, ConfigNodePropertyInteger BooleanClauseLimit, ConfigNodePropertyBoolean EnableHybridIndexing, ConfigNodePropertyInteger HybridQueueSize, ConfigNodePropertyBoolean DisableStoredIndexDefinition, ConfigNodePropertyBoolean DeletedBlobsCollectionEnabled, ConfigNodePropertyInteger PropIndexCleanerIntervalInSecs, ConfigNodePropertyBoolean EnableSingleBlobIndexFiles)
        {
            
            this.Disabled = Disabled;
            
            this.Debug = Debug;
            
            this.LocalIndexDir = LocalIndexDir;
            
            this.EnableOpenIndexAsync = EnableOpenIndexAsync;
            
            this.ThreadPoolSize = ThreadPoolSize;
            
            this.PrefetchIndexFiles = PrefetchIndexFiles;
            
            this.ExtractedTextCacheSizeInMB = ExtractedTextCacheSizeInMB;
            
            this.ExtractedTextCacheExpiryInSecs = ExtractedTextCacheExpiryInSecs;
            
            this.AlwaysUsePreExtractedCache = AlwaysUsePreExtractedCache;
            
            this.BooleanClauseLimit = BooleanClauseLimit;
            
            this.EnableHybridIndexing = EnableHybridIndexing;
            
            this.HybridQueueSize = HybridQueueSize;
            
            this.DisableStoredIndexDefinition = DisableStoredIndexDefinition;
            
            this.DeletedBlobsCollectionEnabled = DeletedBlobsCollectionEnabled;
            
            this.PropIndexCleanerIntervalInSecs = PropIndexCleanerIntervalInSecs;
            
            this.EnableSingleBlobIndexFiles = EnableSingleBlobIndexFiles;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder With()
        {
            return Builder()
                .Disabled(Disabled)
                .Debug(Debug)
                .LocalIndexDir(LocalIndexDir)
                .EnableOpenIndexAsync(EnableOpenIndexAsync)
                .ThreadPoolSize(ThreadPoolSize)
                .PrefetchIndexFiles(PrefetchIndexFiles)
                .ExtractedTextCacheSizeInMB(ExtractedTextCacheSizeInMB)
                .ExtractedTextCacheExpiryInSecs(ExtractedTextCacheExpiryInSecs)
                .AlwaysUsePreExtractedCache(AlwaysUsePreExtractedCache)
                .BooleanClauseLimit(BooleanClauseLimit)
                .EnableHybridIndexing(EnableHybridIndexing)
                .HybridQueueSize(HybridQueueSize)
                .DisableStoredIndexDefinition(DisableStoredIndexDefinition)
                .DeletedBlobsCollectionEnabled(DeletedBlobsCollectionEnabled)
                .PropIndexCleanerIntervalInSecs(PropIndexCleanerIntervalInSecs)
                .EnableSingleBlobIndexFiles(EnableSingleBlobIndexFiles);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties left, OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties left, OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Disabled;
            private ConfigNodePropertyBoolean _Debug;
            private ConfigNodePropertyString _LocalIndexDir;
            private ConfigNodePropertyBoolean _EnableOpenIndexAsync;
            private ConfigNodePropertyInteger _ThreadPoolSize;
            private ConfigNodePropertyBoolean _PrefetchIndexFiles;
            private ConfigNodePropertyInteger _ExtractedTextCacheSizeInMB;
            private ConfigNodePropertyInteger _ExtractedTextCacheExpiryInSecs;
            private ConfigNodePropertyBoolean _AlwaysUsePreExtractedCache;
            private ConfigNodePropertyInteger _BooleanClauseLimit;
            private ConfigNodePropertyBoolean _EnableHybridIndexing;
            private ConfigNodePropertyInteger _HybridQueueSize;
            private ConfigNodePropertyBoolean _DisableStoredIndexDefinition;
            private ConfigNodePropertyBoolean _DeletedBlobsCollectionEnabled;
            private ConfigNodePropertyInteger _PropIndexCleanerIntervalInSecs;
            private ConfigNodePropertyBoolean _EnableSingleBlobIndexFiles;

            internal OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.Disabled property.
            /// </summary>
            /// <param name="value">Disabled</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder Disabled(ConfigNodePropertyBoolean value)
            {
                _Disabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.Debug property.
            /// </summary>
            /// <param name="value">Debug</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder Debug(ConfigNodePropertyBoolean value)
            {
                _Debug = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.LocalIndexDir property.
            /// </summary>
            /// <param name="value">LocalIndexDir</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder LocalIndexDir(ConfigNodePropertyString value)
            {
                _LocalIndexDir = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.EnableOpenIndexAsync property.
            /// </summary>
            /// <param name="value">EnableOpenIndexAsync</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder EnableOpenIndexAsync(ConfigNodePropertyBoolean value)
            {
                _EnableOpenIndexAsync = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.ThreadPoolSize property.
            /// </summary>
            /// <param name="value">ThreadPoolSize</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder ThreadPoolSize(ConfigNodePropertyInteger value)
            {
                _ThreadPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.PrefetchIndexFiles property.
            /// </summary>
            /// <param name="value">PrefetchIndexFiles</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder PrefetchIndexFiles(ConfigNodePropertyBoolean value)
            {
                _PrefetchIndexFiles = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.ExtractedTextCacheSizeInMB property.
            /// </summary>
            /// <param name="value">ExtractedTextCacheSizeInMB</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder ExtractedTextCacheSizeInMB(ConfigNodePropertyInteger value)
            {
                _ExtractedTextCacheSizeInMB = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.ExtractedTextCacheExpiryInSecs property.
            /// </summary>
            /// <param name="value">ExtractedTextCacheExpiryInSecs</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder ExtractedTextCacheExpiryInSecs(ConfigNodePropertyInteger value)
            {
                _ExtractedTextCacheExpiryInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.AlwaysUsePreExtractedCache property.
            /// </summary>
            /// <param name="value">AlwaysUsePreExtractedCache</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder AlwaysUsePreExtractedCache(ConfigNodePropertyBoolean value)
            {
                _AlwaysUsePreExtractedCache = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.BooleanClauseLimit property.
            /// </summary>
            /// <param name="value">BooleanClauseLimit</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder BooleanClauseLimit(ConfigNodePropertyInteger value)
            {
                _BooleanClauseLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.EnableHybridIndexing property.
            /// </summary>
            /// <param name="value">EnableHybridIndexing</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder EnableHybridIndexing(ConfigNodePropertyBoolean value)
            {
                _EnableHybridIndexing = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.HybridQueueSize property.
            /// </summary>
            /// <param name="value">HybridQueueSize</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder HybridQueueSize(ConfigNodePropertyInteger value)
            {
                _HybridQueueSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.DisableStoredIndexDefinition property.
            /// </summary>
            /// <param name="value">DisableStoredIndexDefinition</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder DisableStoredIndexDefinition(ConfigNodePropertyBoolean value)
            {
                _DisableStoredIndexDefinition = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.DeletedBlobsCollectionEnabled property.
            /// </summary>
            /// <param name="value">DeletedBlobsCollectionEnabled</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder DeletedBlobsCollectionEnabled(ConfigNodePropertyBoolean value)
            {
                _DeletedBlobsCollectionEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.PropIndexCleanerIntervalInSecs property.
            /// </summary>
            /// <param name="value">PropIndexCleanerIntervalInSecs</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder PropIndexCleanerIntervalInSecs(ConfigNodePropertyInteger value)
            {
                _PropIndexCleanerIntervalInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.EnableSingleBlobIndexFiles property.
            /// </summary>
            /// <param name="value">EnableSingleBlobIndexFiles</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBuilder EnableSingleBlobIndexFiles(ConfigNodePropertyBoolean value)
            {
                _EnableSingleBlobIndexFiles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties</returns>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(
                    Disabled: _Disabled,
                    Debug: _Debug,
                    LocalIndexDir: _LocalIndexDir,
                    EnableOpenIndexAsync: _EnableOpenIndexAsync,
                    ThreadPoolSize: _ThreadPoolSize,
                    PrefetchIndexFiles: _PrefetchIndexFiles,
                    ExtractedTextCacheSizeInMB: _ExtractedTextCacheSizeInMB,
                    ExtractedTextCacheExpiryInSecs: _ExtractedTextCacheExpiryInSecs,
                    AlwaysUsePreExtractedCache: _AlwaysUsePreExtractedCache,
                    BooleanClauseLimit: _BooleanClauseLimit,
                    EnableHybridIndexing: _EnableHybridIndexing,
                    HybridQueueSize: _HybridQueueSize,
                    DisableStoredIndexDefinition: _DisableStoredIndexDefinition,
                    DeletedBlobsCollectionEnabled: _DeletedBlobsCollectionEnabled,
                    PropIndexCleanerIntervalInSecs: _PropIndexCleanerIntervalInSecs,
                    EnableSingleBlobIndexFiles: _EnableSingleBlobIndexFiles
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}