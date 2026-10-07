
/*
 * ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H_


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

class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties();
    ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties();


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
	ConfigNodePropertyString getDispatcheraddress();

	/*! \brief Set 
	 */
	void setDispatcheraddress(ConfigNodePropertyString dispatcheraddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDispatcherfilterallowed();

	/*! \brief Set 
	 */
	void setDispatcherfilterallowed(ConfigNodePropertyArray dispatcherfilterallowed);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDispatcherfilterblocked();

	/*! \brief Set 
	 */
	void setDispatcherfilterblocked(ConfigNodePropertyArray dispatcherfilterblocked);


    private:
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyString dispatcheraddress;
    ConfigNodePropertyArray dispatcherfilterallowed;
    ConfigNodePropertyArray dispatcherfilterblocked;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H_ */
