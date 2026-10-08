
/*
 * OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties();
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDisabled();

	/*! \brief Set 
	 */
	void setDisabled(ConfigNodePropertyBoolean disabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDebug();

	/*! \brief Set 
	 */
	void setDebug(ConfigNodePropertyBoolean debug);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLocalIndexDir();

	/*! \brief Set 
	 */
	void setLocalIndexDir(ConfigNodePropertyString localIndexDir);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableOpenIndexAsync();

	/*! \brief Set 
	 */
	void setEnableOpenIndexAsync(ConfigNodePropertyBoolean enableOpenIndexAsync);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getThreadPoolSize();

	/*! \brief Set 
	 */
	void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPrefetchIndexFiles();

	/*! \brief Set 
	 */
	void setPrefetchIndexFiles(ConfigNodePropertyBoolean prefetchIndexFiles);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getExtractedTextCacheSizeInMB();

	/*! \brief Set 
	 */
	void setExtractedTextCacheSizeInMB(ConfigNodePropertyInteger extractedTextCacheSizeInMB);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getExtractedTextCacheExpiryInSecs();

	/*! \brief Set 
	 */
	void setExtractedTextCacheExpiryInSecs(ConfigNodePropertyInteger extractedTextCacheExpiryInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAlwaysUsePreExtractedCache();

	/*! \brief Set 
	 */
	void setAlwaysUsePreExtractedCache(ConfigNodePropertyBoolean alwaysUsePreExtractedCache);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBooleanClauseLimit();

	/*! \brief Set 
	 */
	void setBooleanClauseLimit(ConfigNodePropertyInteger booleanClauseLimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableHybridIndexing();

	/*! \brief Set 
	 */
	void setEnableHybridIndexing(ConfigNodePropertyBoolean enableHybridIndexing);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHybridQueueSize();

	/*! \brief Set 
	 */
	void setHybridQueueSize(ConfigNodePropertyInteger hybridQueueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDisableStoredIndexDefinition();

	/*! \brief Set 
	 */
	void setDisableStoredIndexDefinition(ConfigNodePropertyBoolean disableStoredIndexDefinition);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDeletedBlobsCollectionEnabled();

	/*! \brief Set 
	 */
	void setDeletedBlobsCollectionEnabled(ConfigNodePropertyBoolean deletedBlobsCollectionEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPropIndexCleanerIntervalInSecs();

	/*! \brief Set 
	 */
	void setPropIndexCleanerIntervalInSecs(ConfigNodePropertyInteger propIndexCleanerIntervalInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableSingleBlobIndexFiles();

	/*! \brief Set 
	 */
	void setEnableSingleBlobIndexFiles(ConfigNodePropertyBoolean enableSingleBlobIndexFiles);


    private:
    ConfigNodePropertyBoolean disabled;
    ConfigNodePropertyBoolean debug;
    ConfigNodePropertyString localIndexDir;
    ConfigNodePropertyBoolean enableOpenIndexAsync;
    ConfigNodePropertyInteger threadPoolSize;
    ConfigNodePropertyBoolean prefetchIndexFiles;
    ConfigNodePropertyInteger extractedTextCacheSizeInMB;
    ConfigNodePropertyInteger extractedTextCacheExpiryInSecs;
    ConfigNodePropertyBoolean alwaysUsePreExtractedCache;
    ConfigNodePropertyInteger booleanClauseLimit;
    ConfigNodePropertyBoolean enableHybridIndexing;
    ConfigNodePropertyInteger hybridQueueSize;
    ConfigNodePropertyBoolean disableStoredIndexDefinition;
    ConfigNodePropertyBoolean deletedBlobsCollectionEnabled;
    ConfigNodePropertyInteger propIndexCleanerIntervalInSecs;
    ConfigNodePropertyBoolean enableSingleBlobIndexFiles;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties_H_ */
