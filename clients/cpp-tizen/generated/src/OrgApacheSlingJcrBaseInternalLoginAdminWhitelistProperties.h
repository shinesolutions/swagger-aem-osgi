/*
 * OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_
#define _OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties();
	OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWhitelistbypass();

	/*! \brief Set 
	 */
	void setWhitelistbypass(ConfigNodePropertyBoolean  whitelistbypass);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWhitelistbundlesregexp();

	/*! \brief Set 
	 */
	void setWhitelistbundlesregexp(ConfigNodePropertyString  whitelistbundlesregexp);

private:
	ConfigNodePropertyBoolean whitelistbypass;
	ConfigNodePropertyString whitelistbundlesregexp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties_H_ */
