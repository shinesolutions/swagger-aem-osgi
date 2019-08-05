/*
 * OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties_H_
#define _OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties();
	OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getWhitelistname();

	/*! \brief Set 
	 */
	void setWhitelistname(ConfigNodePropertyString  whitelistname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWhitelistbundles();

	/*! \brief Set 
	 */
	void setWhitelistbundles(ConfigNodePropertyArray  whitelistbundles);

private:
	ConfigNodePropertyString whitelistname;
	ConfigNodePropertyArray whitelistbundles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties_H_ */
