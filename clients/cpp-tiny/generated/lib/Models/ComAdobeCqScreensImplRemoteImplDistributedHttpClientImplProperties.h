
/*
 * ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_


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

class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties();
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensimplremoterequestTimeout();

	/*! \brief Set 
	 */
	void setComadobeaemscreensimplremoterequestTimeout(ConfigNodePropertyInteger comadobeaemscreensimplremoterequest_timeout);


    private:
    ConfigNodePropertyInteger comadobeaemscreensimplremoterequest_timeout;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_ */
