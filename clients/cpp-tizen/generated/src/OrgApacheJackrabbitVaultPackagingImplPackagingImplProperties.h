/*
 * OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties_H_
#define _OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties_H_


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

class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties();
	OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPackageRoots();

	/*! \brief Set 
	 */
	void setPackageRoots(ConfigNodePropertyArray  packageRoots);

private:
	ConfigNodePropertyArray packageRoots;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties_H_ */
