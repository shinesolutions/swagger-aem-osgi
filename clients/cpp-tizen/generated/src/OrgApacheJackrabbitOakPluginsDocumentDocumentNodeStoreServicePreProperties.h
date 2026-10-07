/*
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties_H_
#define _OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties();
	OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPersistentCacheIncludes();

	/*! \brief Set 
	 */
	void setPersistentCacheIncludes(ConfigNodePropertyArray  persistentCacheIncludes);

private:
	ConfigNodePropertyArray persistentCacheIncludes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties_H_ */
