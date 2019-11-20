/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.h
 *
 * 
 */

#ifndef OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties_H_
#define OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
    : public ModelBase
{
public:
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties();
    virtual ~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getMongouri() const;
    void setMongouri(ConfigNodePropertyString const& value);
    bool mongouriIsSet() const;
    void unsetMongouri();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getDb() const;
    void setDb(ConfigNodePropertyString const& value);
    bool dbIsSet() const;
    void unsetDb();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getSocketKeepAlive() const;
    void setSocketKeepAlive(ConfigNodePropertyBoolean const& value);
    bool socketKeepAliveIsSet() const;
    void unsetSocketKeepAlive();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getCache() const;
    void setCache(ConfigNodePropertyInteger const& value);
    bool cacheIsSet() const;
    void unsetCache();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getNodeCachePercentage() const;
    void setNodeCachePercentage(ConfigNodePropertyInteger const& value);
    bool nodeCachePercentageIsSet() const;
    void unsetNodeCachePercentage();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getPrevDocCachePercentage() const;
    void setPrevDocCachePercentage(ConfigNodePropertyInteger const& value);
    bool prevDocCachePercentageIsSet() const;
    void unsetPrevDocCachePercentage();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getChildrenCachePercentage() const;
    void setChildrenCachePercentage(ConfigNodePropertyInteger const& value);
    bool childrenCachePercentageIsSet() const;
    void unsetChildrenCachePercentage();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getDiffCachePercentage() const;
    void setDiffCachePercentage(ConfigNodePropertyInteger const& value);
    bool diffCachePercentageIsSet() const;
    void unsetDiffCachePercentage();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getCacheSegmentCount() const;
    void setCacheSegmentCount(ConfigNodePropertyInteger const& value);
    bool cacheSegmentCountIsSet() const;
    void unsetCacheSegmentCount();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getCacheStackMoveDistance() const;
    void setCacheStackMoveDistance(ConfigNodePropertyInteger const& value);
    bool cacheStackMoveDistanceIsSet() const;
    void unsetCacheStackMoveDistance();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getBlobCacheSize() const;
    void setBlobCacheSize(ConfigNodePropertyInteger const& value);
    bool blobCacheSizeIsSet() const;
    void unsetBlobCacheSize();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getPersistentCache() const;
    void setPersistentCache(ConfigNodePropertyString const& value);
    bool persistentCacheIsSet() const;
    void unsetPersistentCache();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getJournalCache() const;
    void setJournalCache(ConfigNodePropertyString const& value);
    bool journalCacheIsSet() const;
    void unsetJournalCache();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getCustomBlobStore() const;
    void setCustomBlobStore(ConfigNodePropertyBoolean const& value);
    bool customBlobStoreIsSet() const;
    void unsetCustomBlobStore();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getJournalGCInterval() const;
    void setJournalGCInterval(ConfigNodePropertyInteger const& value);
    bool journalGCIntervalIsSet() const;
    void unsetJournalGCInterval();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getJournalGCMaxAge() const;
    void setJournalGCMaxAge(ConfigNodePropertyInteger const& value);
    bool journalGCMaxAgeIsSet() const;
    void unsetJournalGCMaxAge();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getPrefetchExternalChanges() const;
    void setPrefetchExternalChanges(ConfigNodePropertyBoolean const& value);
    bool prefetchExternalChangesIsSet() const;
    void unsetPrefetchExternalChanges();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getRole() const;
    void setRole(ConfigNodePropertyString const& value);
    bool roleIsSet() const;
    void unsetRole();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getVersionGcMaxAgeInSecs() const;
    void setVersionGcMaxAgeInSecs(ConfigNodePropertyInteger const& value);
    bool versionGcMaxAgeInSecsIsSet() const;
    void unsetVersionGcMaxAgeInSecs();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getVersionGCExpression() const;
    void setVersionGCExpression(ConfigNodePropertyString const& value);
    bool versionGCExpressionIsSet() const;
    void unsetVersionGCExpression();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getVersionGCTimeLimitInSecs() const;
    void setVersionGCTimeLimitInSecs(ConfigNodePropertyInteger const& value);
    bool versionGCTimeLimitInSecsIsSet() const;
    void unsetVersionGCTimeLimitInSecs();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getBlobGcMaxAgeInSecs() const;
    void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger const& value);
    bool blobGcMaxAgeInSecsIsSet() const;
    void unsetBlobGcMaxAgeInSecs();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs() const;
    void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger const& value);
    bool blobTrackSnapshotIntervalInSecsIsSet() const;
    void unsetBlobTrackSnapshotIntervalInSecs();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getRepositoryHome() const;
    void setRepositoryHome(ConfigNodePropertyString const& value);
    bool repositoryHomeIsSet() const;
    void unsetRepository_home();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getMaxReplicationLagInSecs() const;
    void setMaxReplicationLagInSecs(ConfigNodePropertyInteger const& value);
    bool maxReplicationLagInSecsIsSet() const;
    void unsetMaxReplicationLagInSecs();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyDropDown getDocumentStoreType() const;
    void setDocumentStoreType(ConfigNodePropertyDropDown const& value);
    bool documentStoreTypeIsSet() const;
    void unsetDocumentStoreType();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getBundlingDisabled() const;
    void setBundlingDisabled(ConfigNodePropertyBoolean const& value);
    bool bundlingDisabledIsSet() const;
    void unsetBundlingDisabled();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getUpdateLimit() const;
    void setUpdateLimit(ConfigNodePropertyInteger const& value);
    bool updateLimitIsSet() const;
    void unsetUpdateLimit();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getPersistentCacheIncludes() const;
    void setPersistentCacheIncludes(ConfigNodePropertyArray const& value);
    bool persistentCacheIncludesIsSet() const;
    void unsetPersistentCacheIncludes();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyDropDown getLeaseCheckMode() const;
    void setLeaseCheckMode(ConfigNodePropertyDropDown const& value);
    bool leaseCheckModeIsSet() const;
    void unsetLeaseCheckMode();

protected:
    ConfigNodePropertyString m_Mongouri;
    bool m_MongouriIsSet;
    ConfigNodePropertyString m_Db;
    bool m_DbIsSet;
    ConfigNodePropertyBoolean m_SocketKeepAlive;
    bool m_SocketKeepAliveIsSet;
    ConfigNodePropertyInteger m_Cache;
    bool m_CacheIsSet;
    ConfigNodePropertyInteger m_NodeCachePercentage;
    bool m_NodeCachePercentageIsSet;
    ConfigNodePropertyInteger m_PrevDocCachePercentage;
    bool m_PrevDocCachePercentageIsSet;
    ConfigNodePropertyInteger m_ChildrenCachePercentage;
    bool m_ChildrenCachePercentageIsSet;
    ConfigNodePropertyInteger m_DiffCachePercentage;
    bool m_DiffCachePercentageIsSet;
    ConfigNodePropertyInteger m_CacheSegmentCount;
    bool m_CacheSegmentCountIsSet;
    ConfigNodePropertyInteger m_CacheStackMoveDistance;
    bool m_CacheStackMoveDistanceIsSet;
    ConfigNodePropertyInteger m_BlobCacheSize;
    bool m_BlobCacheSizeIsSet;
    ConfigNodePropertyString m_PersistentCache;
    bool m_PersistentCacheIsSet;
    ConfigNodePropertyString m_JournalCache;
    bool m_JournalCacheIsSet;
    ConfigNodePropertyBoolean m_CustomBlobStore;
    bool m_CustomBlobStoreIsSet;
    ConfigNodePropertyInteger m_JournalGCInterval;
    bool m_JournalGCIntervalIsSet;
    ConfigNodePropertyInteger m_JournalGCMaxAge;
    bool m_JournalGCMaxAgeIsSet;
    ConfigNodePropertyBoolean m_PrefetchExternalChanges;
    bool m_PrefetchExternalChangesIsSet;
    ConfigNodePropertyString m_Role;
    bool m_RoleIsSet;
    ConfigNodePropertyInteger m_VersionGcMaxAgeInSecs;
    bool m_VersionGcMaxAgeInSecsIsSet;
    ConfigNodePropertyString m_VersionGCExpression;
    bool m_VersionGCExpressionIsSet;
    ConfigNodePropertyInteger m_VersionGCTimeLimitInSecs;
    bool m_VersionGCTimeLimitInSecsIsSet;
    ConfigNodePropertyInteger m_BlobGcMaxAgeInSecs;
    bool m_BlobGcMaxAgeInSecsIsSet;
    ConfigNodePropertyInteger m_BlobTrackSnapshotIntervalInSecs;
    bool m_BlobTrackSnapshotIntervalInSecsIsSet;
    ConfigNodePropertyString m_Repository_home;
    bool m_Repository_homeIsSet;
    ConfigNodePropertyInteger m_MaxReplicationLagInSecs;
    bool m_MaxReplicationLagInSecsIsSet;
    ConfigNodePropertyDropDown m_DocumentStoreType;
    bool m_DocumentStoreTypeIsSet;
    ConfigNodePropertyBoolean m_BundlingDisabled;
    bool m_BundlingDisabledIsSet;
    ConfigNodePropertyInteger m_UpdateLimit;
    bool m_UpdateLimitIsSet;
    ConfigNodePropertyArray m_PersistentCacheIncludes;
    bool m_PersistentCacheIncludesIsSet;
    ConfigNodePropertyDropDown m_LeaseCheckMode;
    bool m_LeaseCheckModeIsSet;
};

}
}
}
}

#endif /* OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties_H_ */