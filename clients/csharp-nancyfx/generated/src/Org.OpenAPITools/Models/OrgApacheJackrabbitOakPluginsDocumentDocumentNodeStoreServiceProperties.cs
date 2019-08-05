using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties:  IEquatable<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties>
    { 
        /// <summary>
        /// Mongouri
        /// </summary>
        public ConfigNodePropertyString Mongouri { get; private set; }

        /// <summary>
        /// Db
        /// </summary>
        public ConfigNodePropertyString Db { get; private set; }

        /// <summary>
        /// SocketKeepAlive
        /// </summary>
        public ConfigNodePropertyBoolean SocketKeepAlive { get; private set; }

        /// <summary>
        /// Cache
        /// </summary>
        public ConfigNodePropertyInteger Cache { get; private set; }

        /// <summary>
        /// NodeCachePercentage
        /// </summary>
        public ConfigNodePropertyInteger NodeCachePercentage { get; private set; }

        /// <summary>
        /// PrevDocCachePercentage
        /// </summary>
        public ConfigNodePropertyInteger PrevDocCachePercentage { get; private set; }

        /// <summary>
        /// ChildrenCachePercentage
        /// </summary>
        public ConfigNodePropertyInteger ChildrenCachePercentage { get; private set; }

        /// <summary>
        /// DiffCachePercentage
        /// </summary>
        public ConfigNodePropertyInteger DiffCachePercentage { get; private set; }

        /// <summary>
        /// CacheSegmentCount
        /// </summary>
        public ConfigNodePropertyInteger CacheSegmentCount { get; private set; }

        /// <summary>
        /// CacheStackMoveDistance
        /// </summary>
        public ConfigNodePropertyInteger CacheStackMoveDistance { get; private set; }

        /// <summary>
        /// BlobCacheSize
        /// </summary>
        public ConfigNodePropertyInteger BlobCacheSize { get; private set; }

        /// <summary>
        /// PersistentCache
        /// </summary>
        public ConfigNodePropertyString PersistentCache { get; private set; }

        /// <summary>
        /// JournalCache
        /// </summary>
        public ConfigNodePropertyString JournalCache { get; private set; }

        /// <summary>
        /// CustomBlobStore
        /// </summary>
        public ConfigNodePropertyBoolean CustomBlobStore { get; private set; }

        /// <summary>
        /// JournalGCInterval
        /// </summary>
        public ConfigNodePropertyInteger JournalGCInterval { get; private set; }

        /// <summary>
        /// JournalGCMaxAge
        /// </summary>
        public ConfigNodePropertyInteger JournalGCMaxAge { get; private set; }

        /// <summary>
        /// PrefetchExternalChanges
        /// </summary>
        public ConfigNodePropertyBoolean PrefetchExternalChanges { get; private set; }

        /// <summary>
        /// Role
        /// </summary>
        public ConfigNodePropertyString Role { get; private set; }

        /// <summary>
        /// VersionGcMaxAgeInSecs
        /// </summary>
        public ConfigNodePropertyInteger VersionGcMaxAgeInSecs { get; private set; }

        /// <summary>
        /// VersionGCExpression
        /// </summary>
        public ConfigNodePropertyString VersionGCExpression { get; private set; }

        /// <summary>
        /// VersionGCTimeLimitInSecs
        /// </summary>
        public ConfigNodePropertyInteger VersionGCTimeLimitInSecs { get; private set; }

        /// <summary>
        /// BlobGcMaxAgeInSecs
        /// </summary>
        public ConfigNodePropertyInteger BlobGcMaxAgeInSecs { get; private set; }

        /// <summary>
        /// BlobTrackSnapshotIntervalInSecs
        /// </summary>
        public ConfigNodePropertyInteger BlobTrackSnapshotIntervalInSecs { get; private set; }

        /// <summary>
        /// RepositoryHome
        /// </summary>
        public ConfigNodePropertyString RepositoryHome { get; private set; }

        /// <summary>
        /// MaxReplicationLagInSecs
        /// </summary>
        public ConfigNodePropertyInteger MaxReplicationLagInSecs { get; private set; }

        /// <summary>
        /// DocumentStoreType
        /// </summary>
        public ConfigNodePropertyDropDown DocumentStoreType { get; private set; }

        /// <summary>
        /// BundlingDisabled
        /// </summary>
        public ConfigNodePropertyBoolean BundlingDisabled { get; private set; }

        /// <summary>
        /// UpdateLimit
        /// </summary>
        public ConfigNodePropertyInteger UpdateLimit { get; private set; }

        /// <summary>
        /// PersistentCacheIncludes
        /// </summary>
        public ConfigNodePropertyArray PersistentCacheIncludes { get; private set; }

        /// <summary>
        /// LeaseCheckMode
        /// </summary>
        public ConfigNodePropertyDropDown LeaseCheckMode { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(ConfigNodePropertyString Mongouri, ConfigNodePropertyString Db, ConfigNodePropertyBoolean SocketKeepAlive, ConfigNodePropertyInteger Cache, ConfigNodePropertyInteger NodeCachePercentage, ConfigNodePropertyInteger PrevDocCachePercentage, ConfigNodePropertyInteger ChildrenCachePercentage, ConfigNodePropertyInteger DiffCachePercentage, ConfigNodePropertyInteger CacheSegmentCount, ConfigNodePropertyInteger CacheStackMoveDistance, ConfigNodePropertyInteger BlobCacheSize, ConfigNodePropertyString PersistentCache, ConfigNodePropertyString JournalCache, ConfigNodePropertyBoolean CustomBlobStore, ConfigNodePropertyInteger JournalGCInterval, ConfigNodePropertyInteger JournalGCMaxAge, ConfigNodePropertyBoolean PrefetchExternalChanges, ConfigNodePropertyString Role, ConfigNodePropertyInteger VersionGcMaxAgeInSecs, ConfigNodePropertyString VersionGCExpression, ConfigNodePropertyInteger VersionGCTimeLimitInSecs, ConfigNodePropertyInteger BlobGcMaxAgeInSecs, ConfigNodePropertyInteger BlobTrackSnapshotIntervalInSecs, ConfigNodePropertyString RepositoryHome, ConfigNodePropertyInteger MaxReplicationLagInSecs, ConfigNodePropertyDropDown DocumentStoreType, ConfigNodePropertyBoolean BundlingDisabled, ConfigNodePropertyInteger UpdateLimit, ConfigNodePropertyArray PersistentCacheIncludes, ConfigNodePropertyDropDown LeaseCheckMode)
        {
            
            this.Mongouri = Mongouri;
            
            this.Db = Db;
            
            this.SocketKeepAlive = SocketKeepAlive;
            
            this.Cache = Cache;
            
            this.NodeCachePercentage = NodeCachePercentage;
            
            this.PrevDocCachePercentage = PrevDocCachePercentage;
            
            this.ChildrenCachePercentage = ChildrenCachePercentage;
            
            this.DiffCachePercentage = DiffCachePercentage;
            
            this.CacheSegmentCount = CacheSegmentCount;
            
            this.CacheStackMoveDistance = CacheStackMoveDistance;
            
            this.BlobCacheSize = BlobCacheSize;
            
            this.PersistentCache = PersistentCache;
            
            this.JournalCache = JournalCache;
            
            this.CustomBlobStore = CustomBlobStore;
            
            this.JournalGCInterval = JournalGCInterval;
            
            this.JournalGCMaxAge = JournalGCMaxAge;
            
            this.PrefetchExternalChanges = PrefetchExternalChanges;
            
            this.Role = Role;
            
            this.VersionGcMaxAgeInSecs = VersionGcMaxAgeInSecs;
            
            this.VersionGCExpression = VersionGCExpression;
            
            this.VersionGCTimeLimitInSecs = VersionGCTimeLimitInSecs;
            
            this.BlobGcMaxAgeInSecs = BlobGcMaxAgeInSecs;
            
            this.BlobTrackSnapshotIntervalInSecs = BlobTrackSnapshotIntervalInSecs;
            
            this.RepositoryHome = RepositoryHome;
            
            this.MaxReplicationLagInSecs = MaxReplicationLagInSecs;
            
            this.DocumentStoreType = DocumentStoreType;
            
            this.BundlingDisabled = BundlingDisabled;
            
            this.UpdateLimit = UpdateLimit;
            
            this.PersistentCacheIncludes = PersistentCacheIncludes;
            
            this.LeaseCheckMode = LeaseCheckMode;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder With()
        {
            return Builder()
                .Mongouri(Mongouri)
                .Db(Db)
                .SocketKeepAlive(SocketKeepAlive)
                .Cache(Cache)
                .NodeCachePercentage(NodeCachePercentage)
                .PrevDocCachePercentage(PrevDocCachePercentage)
                .ChildrenCachePercentage(ChildrenCachePercentage)
                .DiffCachePercentage(DiffCachePercentage)
                .CacheSegmentCount(CacheSegmentCount)
                .CacheStackMoveDistance(CacheStackMoveDistance)
                .BlobCacheSize(BlobCacheSize)
                .PersistentCache(PersistentCache)
                .JournalCache(JournalCache)
                .CustomBlobStore(CustomBlobStore)
                .JournalGCInterval(JournalGCInterval)
                .JournalGCMaxAge(JournalGCMaxAge)
                .PrefetchExternalChanges(PrefetchExternalChanges)
                .Role(Role)
                .VersionGcMaxAgeInSecs(VersionGcMaxAgeInSecs)
                .VersionGCExpression(VersionGCExpression)
                .VersionGCTimeLimitInSecs(VersionGCTimeLimitInSecs)
                .BlobGcMaxAgeInSecs(BlobGcMaxAgeInSecs)
                .BlobTrackSnapshotIntervalInSecs(BlobTrackSnapshotIntervalInSecs)
                .RepositoryHome(RepositoryHome)
                .MaxReplicationLagInSecs(MaxReplicationLagInSecs)
                .DocumentStoreType(DocumentStoreType)
                .BundlingDisabled(BundlingDisabled)
                .UpdateLimit(UpdateLimit)
                .PersistentCacheIncludes(PersistentCacheIncludes)
                .LeaseCheckMode(LeaseCheckMode);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties left, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties left, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder
        {
            private ConfigNodePropertyString _Mongouri;
            private ConfigNodePropertyString _Db;
            private ConfigNodePropertyBoolean _SocketKeepAlive;
            private ConfigNodePropertyInteger _Cache;
            private ConfigNodePropertyInteger _NodeCachePercentage;
            private ConfigNodePropertyInteger _PrevDocCachePercentage;
            private ConfigNodePropertyInteger _ChildrenCachePercentage;
            private ConfigNodePropertyInteger _DiffCachePercentage;
            private ConfigNodePropertyInteger _CacheSegmentCount;
            private ConfigNodePropertyInteger _CacheStackMoveDistance;
            private ConfigNodePropertyInteger _BlobCacheSize;
            private ConfigNodePropertyString _PersistentCache;
            private ConfigNodePropertyString _JournalCache;
            private ConfigNodePropertyBoolean _CustomBlobStore;
            private ConfigNodePropertyInteger _JournalGCInterval;
            private ConfigNodePropertyInteger _JournalGCMaxAge;
            private ConfigNodePropertyBoolean _PrefetchExternalChanges;
            private ConfigNodePropertyString _Role;
            private ConfigNodePropertyInteger _VersionGcMaxAgeInSecs;
            private ConfigNodePropertyString _VersionGCExpression;
            private ConfigNodePropertyInteger _VersionGCTimeLimitInSecs;
            private ConfigNodePropertyInteger _BlobGcMaxAgeInSecs;
            private ConfigNodePropertyInteger _BlobTrackSnapshotIntervalInSecs;
            private ConfigNodePropertyString _RepositoryHome;
            private ConfigNodePropertyInteger _MaxReplicationLagInSecs;
            private ConfigNodePropertyDropDown _DocumentStoreType;
            private ConfigNodePropertyBoolean _BundlingDisabled;
            private ConfigNodePropertyInteger _UpdateLimit;
            private ConfigNodePropertyArray _PersistentCacheIncludes;
            private ConfigNodePropertyDropDown _LeaseCheckMode;

            internal OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.Mongouri property.
            /// </summary>
            /// <param name="value">Mongouri</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder Mongouri(ConfigNodePropertyString value)
            {
                _Mongouri = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.Db property.
            /// </summary>
            /// <param name="value">Db</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder Db(ConfigNodePropertyString value)
            {
                _Db = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.SocketKeepAlive property.
            /// </summary>
            /// <param name="value">SocketKeepAlive</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder SocketKeepAlive(ConfigNodePropertyBoolean value)
            {
                _SocketKeepAlive = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.Cache property.
            /// </summary>
            /// <param name="value">Cache</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder Cache(ConfigNodePropertyInteger value)
            {
                _Cache = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.NodeCachePercentage property.
            /// </summary>
            /// <param name="value">NodeCachePercentage</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder NodeCachePercentage(ConfigNodePropertyInteger value)
            {
                _NodeCachePercentage = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.PrevDocCachePercentage property.
            /// </summary>
            /// <param name="value">PrevDocCachePercentage</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder PrevDocCachePercentage(ConfigNodePropertyInteger value)
            {
                _PrevDocCachePercentage = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.ChildrenCachePercentage property.
            /// </summary>
            /// <param name="value">ChildrenCachePercentage</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder ChildrenCachePercentage(ConfigNodePropertyInteger value)
            {
                _ChildrenCachePercentage = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.DiffCachePercentage property.
            /// </summary>
            /// <param name="value">DiffCachePercentage</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder DiffCachePercentage(ConfigNodePropertyInteger value)
            {
                _DiffCachePercentage = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.CacheSegmentCount property.
            /// </summary>
            /// <param name="value">CacheSegmentCount</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder CacheSegmentCount(ConfigNodePropertyInteger value)
            {
                _CacheSegmentCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.CacheStackMoveDistance property.
            /// </summary>
            /// <param name="value">CacheStackMoveDistance</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder CacheStackMoveDistance(ConfigNodePropertyInteger value)
            {
                _CacheStackMoveDistance = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.BlobCacheSize property.
            /// </summary>
            /// <param name="value">BlobCacheSize</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder BlobCacheSize(ConfigNodePropertyInteger value)
            {
                _BlobCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.PersistentCache property.
            /// </summary>
            /// <param name="value">PersistentCache</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder PersistentCache(ConfigNodePropertyString value)
            {
                _PersistentCache = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.JournalCache property.
            /// </summary>
            /// <param name="value">JournalCache</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder JournalCache(ConfigNodePropertyString value)
            {
                _JournalCache = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.CustomBlobStore property.
            /// </summary>
            /// <param name="value">CustomBlobStore</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder CustomBlobStore(ConfigNodePropertyBoolean value)
            {
                _CustomBlobStore = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.JournalGCInterval property.
            /// </summary>
            /// <param name="value">JournalGCInterval</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder JournalGCInterval(ConfigNodePropertyInteger value)
            {
                _JournalGCInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.JournalGCMaxAge property.
            /// </summary>
            /// <param name="value">JournalGCMaxAge</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder JournalGCMaxAge(ConfigNodePropertyInteger value)
            {
                _JournalGCMaxAge = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.PrefetchExternalChanges property.
            /// </summary>
            /// <param name="value">PrefetchExternalChanges</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder PrefetchExternalChanges(ConfigNodePropertyBoolean value)
            {
                _PrefetchExternalChanges = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.Role property.
            /// </summary>
            /// <param name="value">Role</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder Role(ConfigNodePropertyString value)
            {
                _Role = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.VersionGcMaxAgeInSecs property.
            /// </summary>
            /// <param name="value">VersionGcMaxAgeInSecs</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder VersionGcMaxAgeInSecs(ConfigNodePropertyInteger value)
            {
                _VersionGcMaxAgeInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.VersionGCExpression property.
            /// </summary>
            /// <param name="value">VersionGCExpression</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder VersionGCExpression(ConfigNodePropertyString value)
            {
                _VersionGCExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.VersionGCTimeLimitInSecs property.
            /// </summary>
            /// <param name="value">VersionGCTimeLimitInSecs</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder VersionGCTimeLimitInSecs(ConfigNodePropertyInteger value)
            {
                _VersionGCTimeLimitInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.BlobGcMaxAgeInSecs property.
            /// </summary>
            /// <param name="value">BlobGcMaxAgeInSecs</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder BlobGcMaxAgeInSecs(ConfigNodePropertyInteger value)
            {
                _BlobGcMaxAgeInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.BlobTrackSnapshotIntervalInSecs property.
            /// </summary>
            /// <param name="value">BlobTrackSnapshotIntervalInSecs</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder BlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger value)
            {
                _BlobTrackSnapshotIntervalInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.RepositoryHome property.
            /// </summary>
            /// <param name="value">RepositoryHome</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder RepositoryHome(ConfigNodePropertyString value)
            {
                _RepositoryHome = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.MaxReplicationLagInSecs property.
            /// </summary>
            /// <param name="value">MaxReplicationLagInSecs</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder MaxReplicationLagInSecs(ConfigNodePropertyInteger value)
            {
                _MaxReplicationLagInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.DocumentStoreType property.
            /// </summary>
            /// <param name="value">DocumentStoreType</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder DocumentStoreType(ConfigNodePropertyDropDown value)
            {
                _DocumentStoreType = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.BundlingDisabled property.
            /// </summary>
            /// <param name="value">BundlingDisabled</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder BundlingDisabled(ConfigNodePropertyBoolean value)
            {
                _BundlingDisabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.UpdateLimit property.
            /// </summary>
            /// <param name="value">UpdateLimit</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder UpdateLimit(ConfigNodePropertyInteger value)
            {
                _UpdateLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.PersistentCacheIncludes property.
            /// </summary>
            /// <param name="value">PersistentCacheIncludes</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder PersistentCacheIncludes(ConfigNodePropertyArray value)
            {
                _PersistentCacheIncludes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.LeaseCheckMode property.
            /// </summary>
            /// <param name="value">LeaseCheckMode</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder LeaseCheckMode(ConfigNodePropertyDropDown value)
            {
                _LeaseCheckMode = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties</returns>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(
                    Mongouri: _Mongouri,
                    Db: _Db,
                    SocketKeepAlive: _SocketKeepAlive,
                    Cache: _Cache,
                    NodeCachePercentage: _NodeCachePercentage,
                    PrevDocCachePercentage: _PrevDocCachePercentage,
                    ChildrenCachePercentage: _ChildrenCachePercentage,
                    DiffCachePercentage: _DiffCachePercentage,
                    CacheSegmentCount: _CacheSegmentCount,
                    CacheStackMoveDistance: _CacheStackMoveDistance,
                    BlobCacheSize: _BlobCacheSize,
                    PersistentCache: _PersistentCache,
                    JournalCache: _JournalCache,
                    CustomBlobStore: _CustomBlobStore,
                    JournalGCInterval: _JournalGCInterval,
                    JournalGCMaxAge: _JournalGCMaxAge,
                    PrefetchExternalChanges: _PrefetchExternalChanges,
                    Role: _Role,
                    VersionGcMaxAgeInSecs: _VersionGcMaxAgeInSecs,
                    VersionGCExpression: _VersionGCExpression,
                    VersionGCTimeLimitInSecs: _VersionGCTimeLimitInSecs,
                    BlobGcMaxAgeInSecs: _BlobGcMaxAgeInSecs,
                    BlobTrackSnapshotIntervalInSecs: _BlobTrackSnapshotIntervalInSecs,
                    RepositoryHome: _RepositoryHome,
                    MaxReplicationLagInSecs: _MaxReplicationLagInSecs,
                    DocumentStoreType: _DocumentStoreType,
                    BundlingDisabled: _BundlingDisabled,
                    UpdateLimit: _UpdateLimit,
                    PersistentCacheIncludes: _PersistentCacheIncludes,
                    LeaseCheckMode: _LeaseCheckMode
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}