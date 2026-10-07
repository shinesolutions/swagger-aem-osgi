
/*
 * OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties();
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIncludedPaths();

	/*! \brief Set 
	 */
	void setIncludedPaths(ConfigNodePropertyArray includedPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableAsyncObserver();

	/*! \brief Set 
	 */
	void setEnableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getObserverQueueSize();

	/*! \brief Set 
	 */
	void setObserverQueueSize(ConfigNodePropertyInteger observerQueueSize);


    private:
    ConfigNodePropertyArray includedPaths;
    ConfigNodePropertyBoolean enableAsyncObserver;
    ConfigNodePropertyInteger observerQueueSize;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties_H_ */
