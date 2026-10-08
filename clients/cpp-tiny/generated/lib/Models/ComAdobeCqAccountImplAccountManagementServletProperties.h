
/*
 * ComAdobeCqAccountImplAccountManagementServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqAccountImplAccountManagementServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqAccountImplAccountManagementServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqAccountImplAccountManagementServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqAccountImplAccountManagementServletProperties();
    ComAdobeCqAccountImplAccountManagementServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqAccountImplAccountManagementServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqaccountmanagerconfiginformnewaccountmail();

	/*! \brief Set 
	 */
	void setCqaccountmanagerconfiginformnewaccountmail(ConfigNodePropertyString cqaccountmanagerconfiginformnewaccountmail);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqaccountmanagerconfiginformnewpwdmail();

	/*! \brief Set 
	 */
	void setCqaccountmanagerconfiginformnewpwdmail(ConfigNodePropertyString cqaccountmanagerconfiginformnewpwdmail);


    private:
    ConfigNodePropertyString cqaccountmanagerconfiginformnewaccountmail;
    ConfigNodePropertyString cqaccountmanagerconfiginformnewpwdmail;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqAccountImplAccountManagementServletProperties_H_ */
