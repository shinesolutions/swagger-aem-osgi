
/*
 * ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties();
    ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWebserveraddress();

	/*! \brief Set 
	 */
	void setWebserveraddress(ConfigNodePropertyString webserveraddress);


    private:
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyString webserveraddress;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties_H_ */
