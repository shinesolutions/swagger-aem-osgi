using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties:  IEquatable<OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties>
    { 
        /// <summary>
        /// RepositoryHome
        /// </summary>
        public ConfigNodePropertyString RepositoryHome { get; private set; }

        /// <summary>
        /// TarmkMode
        /// </summary>
        public ConfigNodePropertyString TarmkMode { get; private set; }

        /// <summary>
        /// TarmkSize
        /// </summary>
        public ConfigNodePropertyInteger TarmkSize { get; private set; }

        /// <summary>
        /// SegmentCacheSize
        /// </summary>
        public ConfigNodePropertyInteger SegmentCacheSize { get; private set; }

        /// <summary>
        /// StringCacheSize
        /// </summary>
        public ConfigNodePropertyInteger StringCacheSize { get; private set; }

        /// <summary>
        /// TemplateCacheSize
        /// </summary>
        public ConfigNodePropertyInteger TemplateCacheSize { get; private set; }

        /// <summary>
        /// StringDeduplicationCacheSize
        /// </summary>
        public ConfigNodePropertyInteger StringDeduplicationCacheSize { get; private set; }

        /// <summary>
        /// TemplateDeduplicationCacheSize
        /// </summary>
        public ConfigNodePropertyInteger TemplateDeduplicationCacheSize { get; private set; }

        /// <summary>
        /// NodeDeduplicationCacheSize
        /// </summary>
        public ConfigNodePropertyInteger NodeDeduplicationCacheSize { get; private set; }

        /// <summary>
        /// PauseCompaction
        /// </summary>
        public ConfigNodePropertyBoolean PauseCompaction { get; private set; }

        /// <summary>
        /// CompactionRetryCount
        /// </summary>
        public ConfigNodePropertyInteger CompactionRetryCount { get; private set; }

        /// <summary>
        /// CompactionForceTimeout
        /// </summary>
        public ConfigNodePropertyInteger CompactionForceTimeout { get; private set; }

        /// <summary>
        /// CompactionSizeDeltaEstimation
        /// </summary>
        public ConfigNodePropertyInteger CompactionSizeDeltaEstimation { get; private set; }

        /// <summary>
        /// CompactionDisableEstimation
        /// </summary>
        public ConfigNodePropertyBoolean CompactionDisableEstimation { get; private set; }

        /// <summary>
        /// CompactionRetainedGenerations
        /// </summary>
        public ConfigNodePropertyInteger CompactionRetainedGenerations { get; private set; }

        /// <summary>
        /// CompactionMemoryThreshold
        /// </summary>
        public ConfigNodePropertyInteger CompactionMemoryThreshold { get; private set; }

        /// <summary>
        /// CompactionProgressLog
        /// </summary>
        public ConfigNodePropertyInteger CompactionProgressLog { get; private set; }

        /// <summary>
        /// Standby
        /// </summary>
        public ConfigNodePropertyBoolean Standby { get; private set; }

        /// <summary>
        /// CustomBlobStore
        /// </summary>
        public ConfigNodePropertyBoolean CustomBlobStore { get; private set; }

        /// <summary>
        /// CustomSegmentStore
        /// </summary>
        public ConfigNodePropertyBoolean CustomSegmentStore { get; private set; }

        /// <summary>
        /// SplitPersistence
        /// </summary>
        public ConfigNodePropertyBoolean SplitPersistence { get; private set; }

        /// <summary>
        /// RepositoryBackupDir
        /// </summary>
        public ConfigNodePropertyString RepositoryBackupDir { get; private set; }

        /// <summary>
        /// BlobGcMaxAgeInSecs
        /// </summary>
        public ConfigNodePropertyInteger BlobGcMaxAgeInSecs { get; private set; }

        /// <summary>
        /// BlobTrackSnapshotIntervalInSecs
        /// </summary>
        public ConfigNodePropertyInteger BlobTrackSnapshotIntervalInSecs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties()
        {
        }

        private OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties(ConfigNodePropertyString RepositoryHome, ConfigNodePropertyString TarmkMode, ConfigNodePropertyInteger TarmkSize, ConfigNodePropertyInteger SegmentCacheSize, ConfigNodePropertyInteger StringCacheSize, ConfigNodePropertyInteger TemplateCacheSize, ConfigNodePropertyInteger StringDeduplicationCacheSize, ConfigNodePropertyInteger TemplateDeduplicationCacheSize, ConfigNodePropertyInteger NodeDeduplicationCacheSize, ConfigNodePropertyBoolean PauseCompaction, ConfigNodePropertyInteger CompactionRetryCount, ConfigNodePropertyInteger CompactionForceTimeout, ConfigNodePropertyInteger CompactionSizeDeltaEstimation, ConfigNodePropertyBoolean CompactionDisableEstimation, ConfigNodePropertyInteger CompactionRetainedGenerations, ConfigNodePropertyInteger CompactionMemoryThreshold, ConfigNodePropertyInteger CompactionProgressLog, ConfigNodePropertyBoolean Standby, ConfigNodePropertyBoolean CustomBlobStore, ConfigNodePropertyBoolean CustomSegmentStore, ConfigNodePropertyBoolean SplitPersistence, ConfigNodePropertyString RepositoryBackupDir, ConfigNodePropertyInteger BlobGcMaxAgeInSecs, ConfigNodePropertyInteger BlobTrackSnapshotIntervalInSecs)
        {
            
            this.RepositoryHome = RepositoryHome;
            
            this.TarmkMode = TarmkMode;
            
            this.TarmkSize = TarmkSize;
            
            this.SegmentCacheSize = SegmentCacheSize;
            
            this.StringCacheSize = StringCacheSize;
            
            this.TemplateCacheSize = TemplateCacheSize;
            
            this.StringDeduplicationCacheSize = StringDeduplicationCacheSize;
            
            this.TemplateDeduplicationCacheSize = TemplateDeduplicationCacheSize;
            
            this.NodeDeduplicationCacheSize = NodeDeduplicationCacheSize;
            
            this.PauseCompaction = PauseCompaction;
            
            this.CompactionRetryCount = CompactionRetryCount;
            
            this.CompactionForceTimeout = CompactionForceTimeout;
            
            this.CompactionSizeDeltaEstimation = CompactionSizeDeltaEstimation;
            
            this.CompactionDisableEstimation = CompactionDisableEstimation;
            
            this.CompactionRetainedGenerations = CompactionRetainedGenerations;
            
            this.CompactionMemoryThreshold = CompactionMemoryThreshold;
            
            this.CompactionProgressLog = CompactionProgressLog;
            
            this.Standby = Standby;
            
            this.CustomBlobStore = CustomBlobStore;
            
            this.CustomSegmentStore = CustomSegmentStore;
            
            this.SplitPersistence = SplitPersistence;
            
            this.RepositoryBackupDir = RepositoryBackupDir;
            
            this.BlobGcMaxAgeInSecs = BlobGcMaxAgeInSecs;
            
            this.BlobTrackSnapshotIntervalInSecs = BlobTrackSnapshotIntervalInSecs;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder With()
        {
            return Builder()
                .RepositoryHome(RepositoryHome)
                .TarmkMode(TarmkMode)
                .TarmkSize(TarmkSize)
                .SegmentCacheSize(SegmentCacheSize)
                .StringCacheSize(StringCacheSize)
                .TemplateCacheSize(TemplateCacheSize)
                .StringDeduplicationCacheSize(StringDeduplicationCacheSize)
                .TemplateDeduplicationCacheSize(TemplateDeduplicationCacheSize)
                .NodeDeduplicationCacheSize(NodeDeduplicationCacheSize)
                .PauseCompaction(PauseCompaction)
                .CompactionRetryCount(CompactionRetryCount)
                .CompactionForceTimeout(CompactionForceTimeout)
                .CompactionSizeDeltaEstimation(CompactionSizeDeltaEstimation)
                .CompactionDisableEstimation(CompactionDisableEstimation)
                .CompactionRetainedGenerations(CompactionRetainedGenerations)
                .CompactionMemoryThreshold(CompactionMemoryThreshold)
                .CompactionProgressLog(CompactionProgressLog)
                .Standby(Standby)
                .CustomBlobStore(CustomBlobStore)
                .CustomSegmentStore(CustomSegmentStore)
                .SplitPersistence(SplitPersistence)
                .RepositoryBackupDir(RepositoryBackupDir)
                .BlobGcMaxAgeInSecs(BlobGcMaxAgeInSecs)
                .BlobTrackSnapshotIntervalInSecs(BlobTrackSnapshotIntervalInSecs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder
        {
            private ConfigNodePropertyString _RepositoryHome;
            private ConfigNodePropertyString _TarmkMode;
            private ConfigNodePropertyInteger _TarmkSize;
            private ConfigNodePropertyInteger _SegmentCacheSize;
            private ConfigNodePropertyInteger _StringCacheSize;
            private ConfigNodePropertyInteger _TemplateCacheSize;
            private ConfigNodePropertyInteger _StringDeduplicationCacheSize;
            private ConfigNodePropertyInteger _TemplateDeduplicationCacheSize;
            private ConfigNodePropertyInteger _NodeDeduplicationCacheSize;
            private ConfigNodePropertyBoolean _PauseCompaction;
            private ConfigNodePropertyInteger _CompactionRetryCount;
            private ConfigNodePropertyInteger _CompactionForceTimeout;
            private ConfigNodePropertyInteger _CompactionSizeDeltaEstimation;
            private ConfigNodePropertyBoolean _CompactionDisableEstimation;
            private ConfigNodePropertyInteger _CompactionRetainedGenerations;
            private ConfigNodePropertyInteger _CompactionMemoryThreshold;
            private ConfigNodePropertyInteger _CompactionProgressLog;
            private ConfigNodePropertyBoolean _Standby;
            private ConfigNodePropertyBoolean _CustomBlobStore;
            private ConfigNodePropertyBoolean _CustomSegmentStore;
            private ConfigNodePropertyBoolean _SplitPersistence;
            private ConfigNodePropertyString _RepositoryBackupDir;
            private ConfigNodePropertyInteger _BlobGcMaxAgeInSecs;
            private ConfigNodePropertyInteger _BlobTrackSnapshotIntervalInSecs;

            internal OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.RepositoryHome property.
            /// </summary>
            /// <param name="value">RepositoryHome</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder RepositoryHome(ConfigNodePropertyString value)
            {
                _RepositoryHome = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.TarmkMode property.
            /// </summary>
            /// <param name="value">TarmkMode</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder TarmkMode(ConfigNodePropertyString value)
            {
                _TarmkMode = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.TarmkSize property.
            /// </summary>
            /// <param name="value">TarmkSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder TarmkSize(ConfigNodePropertyInteger value)
            {
                _TarmkSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.SegmentCacheSize property.
            /// </summary>
            /// <param name="value">SegmentCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder SegmentCacheSize(ConfigNodePropertyInteger value)
            {
                _SegmentCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.StringCacheSize property.
            /// </summary>
            /// <param name="value">StringCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder StringCacheSize(ConfigNodePropertyInteger value)
            {
                _StringCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.TemplateCacheSize property.
            /// </summary>
            /// <param name="value">TemplateCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder TemplateCacheSize(ConfigNodePropertyInteger value)
            {
                _TemplateCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.StringDeduplicationCacheSize property.
            /// </summary>
            /// <param name="value">StringDeduplicationCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder StringDeduplicationCacheSize(ConfigNodePropertyInteger value)
            {
                _StringDeduplicationCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.TemplateDeduplicationCacheSize property.
            /// </summary>
            /// <param name="value">TemplateDeduplicationCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder TemplateDeduplicationCacheSize(ConfigNodePropertyInteger value)
            {
                _TemplateDeduplicationCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.NodeDeduplicationCacheSize property.
            /// </summary>
            /// <param name="value">NodeDeduplicationCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder NodeDeduplicationCacheSize(ConfigNodePropertyInteger value)
            {
                _NodeDeduplicationCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.PauseCompaction property.
            /// </summary>
            /// <param name="value">PauseCompaction</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder PauseCompaction(ConfigNodePropertyBoolean value)
            {
                _PauseCompaction = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CompactionRetryCount property.
            /// </summary>
            /// <param name="value">CompactionRetryCount</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CompactionRetryCount(ConfigNodePropertyInteger value)
            {
                _CompactionRetryCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CompactionForceTimeout property.
            /// </summary>
            /// <param name="value">CompactionForceTimeout</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CompactionForceTimeout(ConfigNodePropertyInteger value)
            {
                _CompactionForceTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CompactionSizeDeltaEstimation property.
            /// </summary>
            /// <param name="value">CompactionSizeDeltaEstimation</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CompactionSizeDeltaEstimation(ConfigNodePropertyInteger value)
            {
                _CompactionSizeDeltaEstimation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CompactionDisableEstimation property.
            /// </summary>
            /// <param name="value">CompactionDisableEstimation</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CompactionDisableEstimation(ConfigNodePropertyBoolean value)
            {
                _CompactionDisableEstimation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CompactionRetainedGenerations property.
            /// </summary>
            /// <param name="value">CompactionRetainedGenerations</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CompactionRetainedGenerations(ConfigNodePropertyInteger value)
            {
                _CompactionRetainedGenerations = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CompactionMemoryThreshold property.
            /// </summary>
            /// <param name="value">CompactionMemoryThreshold</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CompactionMemoryThreshold(ConfigNodePropertyInteger value)
            {
                _CompactionMemoryThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CompactionProgressLog property.
            /// </summary>
            /// <param name="value">CompactionProgressLog</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CompactionProgressLog(ConfigNodePropertyInteger value)
            {
                _CompactionProgressLog = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.Standby property.
            /// </summary>
            /// <param name="value">Standby</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder Standby(ConfigNodePropertyBoolean value)
            {
                _Standby = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CustomBlobStore property.
            /// </summary>
            /// <param name="value">CustomBlobStore</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CustomBlobStore(ConfigNodePropertyBoolean value)
            {
                _CustomBlobStore = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.CustomSegmentStore property.
            /// </summary>
            /// <param name="value">CustomSegmentStore</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder CustomSegmentStore(ConfigNodePropertyBoolean value)
            {
                _CustomSegmentStore = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.SplitPersistence property.
            /// </summary>
            /// <param name="value">SplitPersistence</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder SplitPersistence(ConfigNodePropertyBoolean value)
            {
                _SplitPersistence = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.RepositoryBackupDir property.
            /// </summary>
            /// <param name="value">RepositoryBackupDir</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder RepositoryBackupDir(ConfigNodePropertyString value)
            {
                _RepositoryBackupDir = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.BlobGcMaxAgeInSecs property.
            /// </summary>
            /// <param name="value">BlobGcMaxAgeInSecs</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder BlobGcMaxAgeInSecs(ConfigNodePropertyInteger value)
            {
                _BlobGcMaxAgeInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.BlobTrackSnapshotIntervalInSecs property.
            /// </summary>
            /// <param name="value">BlobTrackSnapshotIntervalInSecs</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBuilder BlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger value)
            {
                _BlobTrackSnapshotIntervalInSecs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties</returns>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties(
                    RepositoryHome: _RepositoryHome,
                    TarmkMode: _TarmkMode,
                    TarmkSize: _TarmkSize,
                    SegmentCacheSize: _SegmentCacheSize,
                    StringCacheSize: _StringCacheSize,
                    TemplateCacheSize: _TemplateCacheSize,
                    StringDeduplicationCacheSize: _StringDeduplicationCacheSize,
                    TemplateDeduplicationCacheSize: _TemplateDeduplicationCacheSize,
                    NodeDeduplicationCacheSize: _NodeDeduplicationCacheSize,
                    PauseCompaction: _PauseCompaction,
                    CompactionRetryCount: _CompactionRetryCount,
                    CompactionForceTimeout: _CompactionForceTimeout,
                    CompactionSizeDeltaEstimation: _CompactionSizeDeltaEstimation,
                    CompactionDisableEstimation: _CompactionDisableEstimation,
                    CompactionRetainedGenerations: _CompactionRetainedGenerations,
                    CompactionMemoryThreshold: _CompactionMemoryThreshold,
                    CompactionProgressLog: _CompactionProgressLog,
                    Standby: _Standby,
                    CustomBlobStore: _CustomBlobStore,
                    CustomSegmentStore: _CustomSegmentStore,
                    SplitPersistence: _SplitPersistence,
                    RepositoryBackupDir: _RepositoryBackupDir,
                    BlobGcMaxAgeInSecs: _BlobGcMaxAgeInSecs,
                    BlobTrackSnapshotIntervalInSecs: _BlobTrackSnapshotIntervalInSecs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}