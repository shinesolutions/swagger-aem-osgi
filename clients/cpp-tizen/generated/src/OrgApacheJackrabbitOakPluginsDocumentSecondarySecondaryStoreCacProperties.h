/*
 * OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties_H_
#define _OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties();
	OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIncludedPaths();

	/*! \brief Set 
	 */
	void setIncludedPaths(ConfigNodePropertyArray  includedPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableAsyncObserver();

	/*! \brief Set 
	 */
	void setEnableAsyncObserver(ConfigNodePropertyBoolean  enableAsyncObserver);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getObserverQueueSize();

	/*! \brief Set 
	 */
	void setObserverQueueSize(ConfigNodePropertyInteger  observerQueueSize);

private:
	ConfigNodePropertyArray includedPaths;
	ConfigNodePropertyBoolean enableAsyncObserver;
	ConfigNodePropertyInteger observerQueueSize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties_H_ */
