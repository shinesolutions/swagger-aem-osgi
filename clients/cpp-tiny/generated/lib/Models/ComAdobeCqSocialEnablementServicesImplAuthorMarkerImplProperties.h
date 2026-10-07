
/*
 * ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties_H_


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

class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties();
    ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);


    private:
    ConfigNodePropertyInteger serviceranking;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties_H_ */
