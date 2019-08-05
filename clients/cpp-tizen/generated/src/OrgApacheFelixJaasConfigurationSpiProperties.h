/*
 * OrgApacheFelixJaasConfigurationSpiProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixJaasConfigurationSpiProperties_H_
#define _OrgApacheFelixJaasConfigurationSpiProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheFelixJaasConfigurationSpiProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixJaasConfigurationSpiProperties();
	OrgApacheFelixJaasConfigurationSpiProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixJaasConfigurationSpiProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasdefaultRealmName();

	/*! \brief Set 
	 */
	void setJaasdefaultRealmName(ConfigNodePropertyString  jaasdefaultRealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasconfigProviderName();

	/*! \brief Set 
	 */
	void setJaasconfigProviderName(ConfigNodePropertyString  jaasconfigProviderName);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getJaasglobalConfigPolicy();

	/*! \brief Set 
	 */
	void setJaasglobalConfigPolicy(ConfigNodePropertyDropDown  jaasglobalConfigPolicy);

private:
	ConfigNodePropertyString jaasdefaultRealmName;
	ConfigNodePropertyString jaasconfigProviderName;
	ConfigNodePropertyDropDown jaasglobalConfigPolicy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixJaasConfigurationSpiProperties_H_ */
