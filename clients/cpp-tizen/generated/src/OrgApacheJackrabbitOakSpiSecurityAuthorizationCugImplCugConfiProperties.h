/*
 * OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties_H_
#define _OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties();
	OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCugSupportedPaths();

	/*! \brief Set 
	 */
	void setCugSupportedPaths(ConfigNodePropertyArray  cugSupportedPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCugEnabled();

	/*! \brief Set 
	 */
	void setCugEnabled(ConfigNodePropertyBoolean  cugEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConfigurationRanking();

	/*! \brief Set 
	 */
	void setConfigurationRanking(ConfigNodePropertyInteger  configurationRanking);

private:
	ConfigNodePropertyArray cugSupportedPaths;
	ConfigNodePropertyBoolean cugEnabled;
	ConfigNodePropertyInteger configurationRanking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties_H_ */
