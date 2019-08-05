/*
 * OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties_H_
#define _OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties_H_


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

class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties();
	OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachejackrabbitoakauthenticationappName();

	/*! \brief Set 
	 */
	void setOrgapachejackrabbitoakauthenticationappName(ConfigNodePropertyString  orgapachejackrabbitoakauthenticationappName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOrgapachejackrabbitoakauthenticationconfigSpiName();

	/*! \brief Set 
	 */
	void setOrgapachejackrabbitoakauthenticationconfigSpiName(ConfigNodePropertyString  orgapachejackrabbitoakauthenticationconfigSpiName);

private:
	ConfigNodePropertyString orgapachejackrabbitoakauthenticationappName;
	ConfigNodePropertyString orgapachejackrabbitoakauthenticationconfigSpiName;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties_H_ */
