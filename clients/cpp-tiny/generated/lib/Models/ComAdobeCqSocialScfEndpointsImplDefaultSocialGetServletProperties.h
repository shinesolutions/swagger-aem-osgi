
/*
 * ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties_H_


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

class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties();
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyArray slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletextensions();

	/*! \brief Set 
	 */
	void setSlingservletextensions(ConfigNodePropertyString slingservletextensions);


    private:
    ConfigNodePropertyArray slingservletselectors;
    ConfigNodePropertyString slingservletextensions;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties_H_ */
