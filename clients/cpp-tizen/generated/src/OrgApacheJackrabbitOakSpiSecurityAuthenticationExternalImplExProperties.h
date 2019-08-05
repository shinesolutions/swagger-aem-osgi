/*
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties_H_
#define _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties();
	OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJaasranking();

	/*! \brief Set 
	 */
	void setJaasranking(ConfigNodePropertyInteger  jaasranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaascontrolFlag();

	/*! \brief Set 
	 */
	void setJaascontrolFlag(ConfigNodePropertyString  jaascontrolFlag);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasrealmName();

	/*! \brief Set 
	 */
	void setJaasrealmName(ConfigNodePropertyString  jaasrealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdpname();

	/*! \brief Set 
	 */
	void setIdpname(ConfigNodePropertyString  idpname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSynchandlerName();

	/*! \brief Set 
	 */
	void setSynchandlerName(ConfigNodePropertyString  synchandlerName);

private:
	ConfigNodePropertyInteger jaasranking;
	ConfigNodePropertyString jaascontrolFlag;
	ConfigNodePropertyString jaasrealmName;
	ConfigNodePropertyString idpname;
	ConfigNodePropertyString synchandlerName;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties_H_ */
