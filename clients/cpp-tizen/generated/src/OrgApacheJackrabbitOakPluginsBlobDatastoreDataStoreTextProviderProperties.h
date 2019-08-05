/*
 * OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties_H_
#define _OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties_H_


#include <string>
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

class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties();
	OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDir();

	/*! \brief Set 
	 */
	void setDir(ConfigNodePropertyString  dir);

private:
	ConfigNodePropertyString dir;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties_H_ */
