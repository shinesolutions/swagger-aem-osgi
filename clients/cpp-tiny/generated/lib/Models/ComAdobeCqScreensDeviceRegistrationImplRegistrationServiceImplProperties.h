
/*
 * ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties();
    ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDeviceRegistrationTimeout();

	/*! \brief Set 
	 */
	void setDeviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout);


    private:
    ConfigNodePropertyInteger deviceRegistrationTimeout;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties_H_ */
