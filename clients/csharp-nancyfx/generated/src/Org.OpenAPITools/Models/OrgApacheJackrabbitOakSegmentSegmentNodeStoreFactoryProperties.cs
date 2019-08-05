using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties:  IEquatable<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties>
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
        /// Role
        /// </summary>
        public ConfigNodePropertyString Role { get; private set; }

        /// <summary>
        /// RegisterDescriptors
        /// </summary>
        public ConfigNodePropertyBoolean RegisterDescriptors { get; private set; }

        /// <summary>
        /// DispatchChanges
        /// </summary>
        public ConfigNodePropertyBoolean DispatchChanges { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties()
        {
        }

        private OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(ConfigNodePropertyString RepositoryHome, ConfigNodePropertyString TarmkMode, ConfigNodePropertyInteger TarmkSize, ConfigNodePropertyInteger SegmentCacheSize, ConfigNodePropertyInteger StringCacheSize, ConfigNodePropertyInteger TemplateCacheSize, ConfigNodePropertyInteger StringDeduplicationCacheSize, ConfigNodePropertyInteger TemplateDeduplicationCacheSize, ConfigNodePropertyInteger NodeDeduplicationCacheSize, ConfigNodePropertyBoolean PauseCompaction, ConfigNodePropertyInteger CompactionRetryCount, ConfigNodePropertyInteger CompactionForceTimeout, ConfigNodePropertyInteger CompactionSizeDeltaEstimation, ConfigNodePropertyBoolean CompactionDisableEstimation, ConfigNodePropertyInteger CompactionRetainedGenerations, ConfigNodePropertyInteger CompactionMemoryThreshold, ConfigNodePropertyInteger CompactionProgressLog, ConfigNodePropertyBoolean Standby, ConfigNodePropertyBoolean CustomBlobStore, ConfigNodePropertyBoolean CustomSegmentStore, ConfigNodePropertyBoolean SplitPersistence, ConfigNodePropertyString RepositoryBackupDir, ConfigNodePropertyInteger BlobGcMaxAgeInSecs, ConfigNodePropertyInteger BlobTrackSnapshotIntervalInSecs, ConfigNodePropertyString Role, ConfigNodePropertyBoolean RegisterDescriptors, ConfigNodePropertyBoolean DispatchChanges)
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
            
            this.Role = Role;
            
            this.RegisterDescriptors = RegisterDescriptors;
            
            this.DispatchChanges = DispatchChanges;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder With()
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
                .BlobTrackSnapshotIntervalInSecs(BlobTrackSnapshotIntervalInSecs)
                .Role(Role)
                .RegisterDescriptors(RegisterDescriptors)
                .DispatchChanges(DispatchChanges);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder
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
            private ConfigNodePropertyString _Role;
            private ConfigNodePropertyBoolean _RegisterDescriptors;
            private ConfigNodePropertyBoolean _DispatchChanges;

            internal OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.RepositoryHome property.
            /// </summary>
            /// <param name="value">RepositoryHome</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder RepositoryHome(ConfigNodePropertyString value)
            {
                _RepositoryHome = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.TarmkMode property.
            /// </summary>
            /// <param name="value">TarmkMode</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder TarmkMode(ConfigNodePropertyString value)
            {
                _TarmkMode = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.TarmkSize property.
            /// </summary>
            /// <param name="value">TarmkSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder TarmkSize(ConfigNodePropertyInteger value)
            {
                _TarmkSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.SegmentCacheSize property.
            /// </summary>
            /// <param name="value">SegmentCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder SegmentCacheSize(ConfigNodePropertyInteger value)
            {
                _SegmentCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.StringCacheSize property.
            /// </summary>
            /// <param name="value">StringCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder StringCacheSize(ConfigNodePropertyInteger value)
            {
                _StringCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.TemplateCacheSize property.
            /// </summary>
            /// <param name="value">TemplateCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder TemplateCacheSize(ConfigNodePropertyInteger value)
            {
                _TemplateCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.StringDeduplicationCacheSize property.
            /// </summary>
            /// <param name="value">StringDeduplicationCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder StringDeduplicationCacheSize(ConfigNodePropertyInteger value)
            {
                _StringDeduplicationCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.TemplateDeduplicationCacheSize property.
            /// </summary>
            /// <param name="value">TemplateDeduplicationCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder TemplateDeduplicationCacheSize(ConfigNodePropertyInteger value)
            {
                _TemplateDeduplicationCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.NodeDeduplicationCacheSize property.
            /// </summary>
            /// <param name="value">NodeDeduplicationCacheSize</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder NodeDeduplicationCacheSize(ConfigNodePropertyInteger value)
            {
                _NodeDeduplicationCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.PauseCompaction property.
            /// </summary>
            /// <param name="value">PauseCompaction</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder PauseCompaction(ConfigNodePropertyBoolean value)
            {
                _PauseCompaction = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CompactionRetryCount property.
            /// </summary>
            /// <param name="value">CompactionRetryCount</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CompactionRetryCount(ConfigNodePropertyInteger value)
            {
                _CompactionRetryCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CompactionForceTimeout property.
            /// </summary>
            /// <param name="value">CompactionForceTimeout</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CompactionForceTimeout(ConfigNodePropertyInteger value)
            {
                _CompactionForceTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CompactionSizeDeltaEstimation property.
            /// </summary>
            /// <param name="value">CompactionSizeDeltaEstimation</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CompactionSizeDeltaEstimation(ConfigNodePropertyInteger value)
            {
                _CompactionSizeDeltaEstimation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CompactionDisableEstimation property.
            /// </summary>
            /// <param name="value">CompactionDisableEstimation</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CompactionDisableEstimation(ConfigNodePropertyBoolean value)
            {
                _CompactionDisableEstimation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CompactionRetainedGenerations property.
            /// </summary>
            /// <param name="value">CompactionRetainedGenerations</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CompactionRetainedGenerations(ConfigNodePropertyInteger value)
            {
                _CompactionRetainedGenerations = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CompactionMemoryThreshold property.
            /// </summary>
            /// <param name="value">CompactionMemoryThreshold</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CompactionMemoryThreshold(ConfigNodePropertyInteger value)
            {
                _CompactionMemoryThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CompactionProgressLog property.
            /// </summary>
            /// <param name="value">CompactionProgressLog</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CompactionProgressLog(ConfigNodePropertyInteger value)
            {
                _CompactionProgressLog = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.Standby property.
            /// </summary>
            /// <param name="value">Standby</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder Standby(ConfigNodePropertyBoolean value)
            {
                _Standby = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CustomBlobStore property.
            /// </summary>
            /// <param name="value">CustomBlobStore</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CustomBlobStore(ConfigNodePropertyBoolean value)
            {
                _CustomBlobStore = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.CustomSegmentStore property.
            /// </summary>
            /// <param name="value">CustomSegmentStore</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder CustomSegmentStore(ConfigNodePropertyBoolean value)
            {
                _CustomSegmentStore = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.SplitPersistence property.
            /// </summary>
            /// <param name="value">SplitPersistence</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder SplitPersistence(ConfigNodePropertyBoolean value)
            {
                _SplitPersistence = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.RepositoryBackupDir property.
            /// </summary>
            /// <param name="value">RepositoryBackupDir</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder RepositoryBackupDir(ConfigNodePropertyString value)
            {
                _RepositoryBackupDir = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.BlobGcMaxAgeInSecs property.
            /// </summary>
            /// <param name="value">BlobGcMaxAgeInSecs</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder BlobGcMaxAgeInSecs(ConfigNodePropertyInteger value)
            {
                _BlobGcMaxAgeInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.BlobTrackSnapshotIntervalInSecs property.
            /// </summary>
            /// <param name="value">BlobTrackSnapshotIntervalInSecs</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder BlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger value)
            {
                _BlobTrackSnapshotIntervalInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.Role property.
            /// </summary>
            /// <param name="value">Role</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder Role(ConfigNodePropertyString value)
            {
                _Role = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.RegisterDescriptors property.
            /// </summary>
            /// <param name="value">RegisterDescriptors</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder RegisterDescriptors(ConfigNodePropertyBoolean value)
            {
                _RegisterDescriptors = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.DispatchChanges property.
            /// </summary>
            /// <param name="value">DispatchChanges</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder DispatchChanges(ConfigNodePropertyBoolean value)
            {
                _DispatchChanges = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties</returns>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(
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
                    BlobTrackSnapshotIntervalInSecs: _BlobTrackSnapshotIntervalInSecs,
                    Role: _Role,
                    RegisterDescriptors: _RegisterDescriptors,
                    DispatchChanges: _DispatchChanges
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}