/*
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties_H_
#define _OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties();
	OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepositoryhome();

	/*! \brief Set 
	 */
	void setRepositoryhome(ConfigNodePropertyString  repositoryhome);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTarmkmode();

	/*! \brief Set 
	 */
	void setTarmkmode(ConfigNodePropertyString  tarmkmode);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTarmksize();

	/*! \brief Set 
	 */
	void setTarmksize(ConfigNodePropertyInteger  tarmksize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSegmentCachesize();

	/*! \brief Set 
	 */
	void setSegmentCachesize(ConfigNodePropertyInteger  segmentCachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getStringCachesize();

	/*! \brief Set 
	 */
	void setStringCachesize(ConfigNodePropertyInteger  stringCachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTemplateCachesize();

	/*! \brief Set 
	 */
	void setTemplateCachesize(ConfigNodePropertyInteger  templateCachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getStringDeduplicationCachesize();

	/*! \brief Set 
	 */
	void setStringDeduplicationCachesize(ConfigNodePropertyInteger  stringDeduplicationCachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTemplateDeduplicationCachesize();

	/*! \brief Set 
	 */
	void setTemplateDeduplicationCachesize(ConfigNodePropertyInteger  templateDeduplicationCachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNodeDeduplicationCachesize();

	/*! \brief Set 
	 */
	void setNodeDeduplicationCachesize(ConfigNodePropertyInteger  nodeDeduplicationCachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPauseCompaction();

	/*! \brief Set 
	 */
	void setPauseCompaction(ConfigNodePropertyBoolean  pauseCompaction);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCompactionretryCount();

	/*! \brief Set 
	 */
	void setCompactionretryCount(ConfigNodePropertyInteger  compactionretryCount);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCompactionforcetimeout();

	/*! \brief Set 
	 */
	void setCompactionforcetimeout(ConfigNodePropertyInteger  compactionforcetimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCompactionsizeDeltaEstimation();

	/*! \brief Set 
	 */
	void setCompactionsizeDeltaEstimation(ConfigNodePropertyInteger  compactionsizeDeltaEstimation);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCompactiondisableEstimation();

	/*! \brief Set 
	 */
	void setCompactiondisableEstimation(ConfigNodePropertyBoolean  compactiondisableEstimation);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCompactionretainedGenerations();

	/*! \brief Set 
	 */
	void setCompactionretainedGenerations(ConfigNodePropertyInteger  compactionretainedGenerations);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCompactionmemoryThreshold();

	/*! \brief Set 
	 */
	void setCompactionmemoryThreshold(ConfigNodePropertyInteger  compactionmemoryThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCompactionprogressLog();

	/*! \brief Set 
	 */
	void setCompactionprogressLog(ConfigNodePropertyInteger  compactionprogressLog);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getStandby();

	/*! \brief Set 
	 */
	void setStandby(ConfigNodePropertyBoolean  standby);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCustomBlobStore();

	/*! \brief Set 
	 */
	void setCustomBlobStore(ConfigNodePropertyBoolean  customBlobStore);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCustomSegmentStore();

	/*! \brief Set 
	 */
	void setCustomSegmentStore(ConfigNodePropertyBoolean  customSegmentStore);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSplitPersistence();

	/*! \brief Set 
	 */
	void setSplitPersistence(ConfigNodePropertyBoolean  splitPersistence);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRepositorybackupdir();

	/*! \brief Set 
	 */
	void setRepositorybackupdir(ConfigNodePropertyString  repositorybackupdir);
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

private:
	ConfigNodePropertyString repositoryhome;
	ConfigNodePropertyString tarmkmode;
	ConfigNodePropertyInteger tarmksize;
	ConfigNodePropertyInteger segmentCachesize;
	ConfigNodePropertyInteger stringCachesize;
	ConfigNodePropertyInteger templateCachesize;
	ConfigNodePropertyInteger stringDeduplicationCachesize;
	ConfigNodePropertyInteger templateDeduplicationCachesize;
	ConfigNodePropertyInteger nodeDeduplicationCachesize;
	ConfigNodePropertyBoolean pauseCompaction;
	ConfigNodePropertyInteger compactionretryCount;
	ConfigNodePropertyInteger compactionforcetimeout;
	ConfigNodePropertyInteger compactionsizeDeltaEstimation;
	ConfigNodePropertyBoolean compactiondisableEstimation;
	ConfigNodePropertyInteger compactionretainedGenerations;
	ConfigNodePropertyInteger compactionmemoryThreshold;
	ConfigNodePropertyInteger compactionprogressLog;
	ConfigNodePropertyBoolean standby;
	ConfigNodePropertyBoolean customBlobStore;
	ConfigNodePropertyBoolean customSegmentStore;
	ConfigNodePropertyBoolean splitPersistence;
	ConfigNodePropertyString repositorybackupdir;
	ConfigNodePropertyInteger blobGcMaxAgeInSecs;
	ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties_H_ */
