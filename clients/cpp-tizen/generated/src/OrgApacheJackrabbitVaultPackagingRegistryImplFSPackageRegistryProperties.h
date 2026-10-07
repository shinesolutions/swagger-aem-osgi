/*
 * OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties_H_
#define _OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties_H_


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

class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties();
	OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHomePath();

	/*! \brief Set 
	 */
	void setHomePath(ConfigNodePropertyString  homePath);

private:
	ConfigNodePropertyString homePath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties_H_ */
