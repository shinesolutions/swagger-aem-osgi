
/*
 * ComAdobeCqAccountApiAccountManagementServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqAccountApiAccountManagementServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqAccountApiAccountManagementServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqAccountApiAccountManagementServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqAccountApiAccountManagementServiceProperties();
    ComAdobeCqAccountApiAccountManagementServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqAccountApiAccountManagementServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqaccountmanagertokenvalidityperiod();

	/*! \brief Set 
	 */
	void setCqaccountmanagertokenvalidityperiod(ConfigNodePropertyInteger cqaccountmanagertokenvalidityperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqaccountmanagerconfigrequestnewaccountmail();

	/*! \brief Set 
	 */
	void setCqaccountmanagerconfigrequestnewaccountmail(ConfigNodePropertyString cqaccountmanagerconfigrequestnewaccountmail);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqaccountmanagerconfigrequestnewpwdmail();

	/*! \brief Set 
	 */
	void setCqaccountmanagerconfigrequestnewpwdmail(ConfigNodePropertyString cqaccountmanagerconfigrequestnewpwdmail);


    private:
    ConfigNodePropertyInteger cqaccountmanagertokenvalidityperiod;
    ConfigNodePropertyString cqaccountmanagerconfigrequestnewaccountmail;
    ConfigNodePropertyString cqaccountmanagerconfigrequestnewpwdmail;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqAccountApiAccountManagementServiceProperties_H_ */
