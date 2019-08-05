/*
 * ComAdobeCqAccountImplAccountManagementServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqAccountImplAccountManagementServletProperties_H_
#define _ComAdobeCqAccountImplAccountManagementServletProperties_H_


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

class ComAdobeCqAccountImplAccountManagementServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqAccountImplAccountManagementServletProperties();
	ComAdobeCqAccountImplAccountManagementServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqAccountImplAccountManagementServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqaccountmanagerconfiginformnewaccountmail();

	/*! \brief Set 
	 */
	void setCqaccountmanagerconfiginformnewaccountmail(ConfigNodePropertyString  cqaccountmanagerconfiginformnewaccountmail);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqaccountmanagerconfiginformnewpwdmail();

	/*! \brief Set 
	 */
	void setCqaccountmanagerconfiginformnewpwdmail(ConfigNodePropertyString  cqaccountmanagerconfiginformnewpwdmail);

private:
	ConfigNodePropertyString cqaccountmanagerconfiginformnewaccountmail;
	ConfigNodePropertyString cqaccountmanagerconfiginformnewpwdmail;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqAccountImplAccountManagementServletProperties_H_ */
