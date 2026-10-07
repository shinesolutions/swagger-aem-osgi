/*
 * OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties_H_
#define _OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties_H_


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

class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties();
	OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);

private:
	ConfigNodePropertyString path;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties_H_ */
