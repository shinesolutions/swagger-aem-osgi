/*
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties_H_
#define _OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties();
	OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMongouri();

	/*! \brief Set 
	 */
	void setMongouri(ConfigNodePropertyString  mongouri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDb();

	/*! \brief Set 
	 */
	void setDb(ConfigNodePropertyString  db);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSocketKeepAlive();

	/*! \brief Set 
	 */
	void setSocketKeepAlive(ConfigNodePropertyBoolean  socketKeepAlive);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCache();

	/*! \brief Set 
	 */
	void setCache(ConfigNodePropertyInteger  cache);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNodeCachePercentage();

	/*! \brief Set 
	 */
	void setNodeCachePercentage(ConfigNodePropertyInteger  nodeCachePercentage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPrevDocCachePercentage();

	/*! \brief Set 
	 */
	void setPrevDocCachePercentage(ConfigNodePropertyInteger  prevDocCachePercentage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getChildrenCachePercentage();

	/*! \brief Set 
	 */
	void setChildrenCachePercentage(ConfigNodePropertyInteger  childrenCachePercentage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDiffCachePercentage();

	/*! \brief Set 
	 */
	void setDiffCachePercentage(ConfigNodePropertyInteger  diffCachePercentage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCacheSegmentCount();

	/*! \brief Set 
	 */
	void setCacheSegmentCount(ConfigNodePropertyInteger  cacheSegmentCount);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCacheStackMoveDistance();

	/*! \brief Set 
	 */
	void setCacheStackMoveDistance(ConfigNodePropertyInteger  cacheStackMoveDistance);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBlobCacheSize();

	/*! \brief Set 
	 */
	void setBlobCacheSize(ConfigNodePropertyInteger  blobCacheSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPersistentCache();

	/*! \brief Set 
	 */
	void setPersistentCache(ConfigNodePropertyString  persistentCache);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJournalCache();

	/*! \brief Set 
	 */
	void setJournalCache(ConfigNodePropertyString  journalCache);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCustomBlobStore();

	/*! \brief Set 
	 */
	void setCustomBlobStore(ConfigNodePropertyBoolean  customBlobStore);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJournalGCInterval();

	/*! \brief Set 
	 */
	void setJournalGCInterval(ConfigNodePropertyInteger  journalGCInterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJournalGCMaxAge();

	/*! \brief Set 
	 */
	void setJournalGCMaxAge(ConfigNodePropertyInteger  journalGCMaxAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPrefetchExternalChanges();

	/*! \brief Set 
	 */
	void setPrefetchExternalChanges(ConfigNodePropertyBoolean  prefetchExternalChanges);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRole();

	/*! \brief Set 
	 */
	void setRole(ConfigNodePropertyString  role);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionGcMaxAgeInSecs();

	/*! \brief Set 
	 */
	void setVersionGcMaxAgeInSecs(ConfigNodePropertyInteger  versionGcMaxAgeInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getVersionGCExpression();

	/*! \brief Set 
	 */
	void setVersionGCExpression(ConfigNodePropertyString  versionGCExpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionGCTimeLimitInSecs();

	/*! \brief Set 
	 */
	void setVersionGCTimeLimitInSecs(ConfigNodePropertyInteger  versionGCTimeLimitInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBlobGcMaxAgeInSecs();

	/*! \brief Set 
	 */
	void setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger  blobGcMaxAgeInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBlobTrackSnapshotIntervalInSecs();

	/*! \brief Set 
	 */
	void setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger  blobTrackSnapshotIntervalInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepositoryhome();

	/*! \brief Set 
	 */
	void setRepositoryhome(ConfigNodePropertyString  repositoryhome);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxReplicationLagInSecs();

	/*! \brief Set 
	 */
	void setMaxReplicationLagInSecs(ConfigNodePropertyInteger  maxReplicationLagInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDocumentStoreType();

	/*! \brief Set 
	 */
	void setDocumentStoreType(ConfigNodePropertyDropDown  documentStoreType);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getBundlingDisabled();

	/*! \brief Set 
	 */
	void setBundlingDisabled(ConfigNodePropertyBoolean  bundlingDisabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getUpdateLimit();

	/*! \brief Set 
	 */
	void setUpdateLimit(ConfigNodePropertyInteger  updateLimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPersistentCacheIncludes();

	/*! \brief Set 
	 */
	void setPersistentCacheIncludes(ConfigNodePropertyArray  persistentCacheIncludes);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLeaseCheckMode();

	/*! \brief Set 
	 */
	void setLeaseCheckMode(ConfigNodePropertyDropDown  leaseCheckMode);

private:
	ConfigNodePropertyString mongouri;
	ConfigNodePropertyString db;
	ConfigNodePropertyBoolean socketKeepAlive;
	ConfigNodePropertyInteger cache;
	ConfigNodePropertyInteger nodeCachePercentage;
	ConfigNodePropertyInteger prevDocCachePercentage;
	ConfigNodePropertyInteger childrenCachePercentage;
	ConfigNodePropertyInteger diffCachePercentage;
	ConfigNodePropertyInteger cacheSegmentCount;
	ConfigNodePropertyInteger cacheStackMoveDistance;
	ConfigNodePropertyInteger blobCacheSize;
	ConfigNodePropertyString persistentCache;
	ConfigNodePropertyString journalCache;
	ConfigNodePropertyBoolean customBlobStore;
	ConfigNodePropertyInteger journalGCInterval;
	ConfigNodePropertyInteger journalGCMaxAge;
	ConfigNodePropertyBoolean prefetchExternalChanges;
	ConfigNodePropertyString role;
	ConfigNodePropertyInteger versionGcMaxAgeInSecs;
	ConfigNodePropertyString versionGCExpression;
	ConfigNodePropertyInteger versionGCTimeLimitInSecs;
	ConfigNodePropertyInteger blobGcMaxAgeInSecs;
	ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs;
	ConfigNodePropertyString repositoryhome;
	ConfigNodePropertyInteger maxReplicationLagInSecs;
	ConfigNodePropertyDropDown documentStoreType;
	ConfigNodePropertyBoolean bundlingDisabled;
	ConfigNodePropertyInteger updateLimit;
	ConfigNodePropertyArray persistentCacheIncludes;
	ConfigNodePropertyDropDown leaseCheckMode;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties_H_ */
