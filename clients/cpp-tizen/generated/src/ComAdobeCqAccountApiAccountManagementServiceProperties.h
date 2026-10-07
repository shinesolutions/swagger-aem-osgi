/*
 * ComAdobeCqAccountApiAccountManagementServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqAccountApiAccountManagementServiceProperties_H_
#define _ComAdobeCqAccountApiAccountManagementServiceProperties_H_


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

class ComAdobeCqAccountApiAccountManagementServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqAccountApiAccountManagementServiceProperties();
	ComAdobeCqAccountApiAccountManagementServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqAccountApiAccountManagementServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqaccountmanagertokenvalidityperiod();

	/*! \brief Set 
	 */
	void setCqaccountmanagertokenvalidityperiod(ConfigNodePropertyInteger  cqaccountmanagertokenvalidityperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqaccountmanagerconfigrequestnewaccountmail();

	/*! \brief Set 
	 */
	void setCqaccountmanagerconfigrequestnewaccountmail(ConfigNodePropertyString  cqaccountmanagerconfigrequestnewaccountmail);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqaccountmanagerconfigrequestnewpwdmail();

	/*! \brief Set 
	 */
	void setCqaccountmanagerconfigrequestnewpwdmail(ConfigNodePropertyString  cqaccountmanagerconfigrequestnewpwdmail);

private:
	ConfigNodePropertyInteger cqaccountmanagertokenvalidityperiod;
	ConfigNodePropertyString cqaccountmanagerconfigrequestnewaccountmail;
	ConfigNodePropertyString cqaccountmanagerconfigrequestnewpwdmail;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqAccountApiAccountManagementServiceProperties_H_ */
