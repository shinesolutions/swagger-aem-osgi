/*
 * OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties_H_
#define _OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties();
	OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRequiredServicePids();

	/*! \brief Set 
	 */
	void setRequiredServicePids(ConfigNodePropertyArray  requiredServicePids);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAuthorizationCompositionType();

	/*! \brief Set 
	 */
	void setAuthorizationCompositionType(ConfigNodePropertyDropDown  authorizationCompositionType);

private:
	ConfigNodePropertyArray requiredServicePids;
	ConfigNodePropertyDropDown authorizationCompositionType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties_H_ */
