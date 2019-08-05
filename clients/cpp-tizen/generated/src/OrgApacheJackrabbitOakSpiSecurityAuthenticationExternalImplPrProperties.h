/*
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties_H_
#define _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties();
	OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProtectExternalId();

	/*! \brief Set 
	 */
	void setProtectExternalId(ConfigNodePropertyBoolean  protectExternalId);

private:
	ConfigNodePropertyBoolean protectExternalId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties_H_ */
