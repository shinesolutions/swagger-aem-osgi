
/*
 * ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties_H_


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

class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties();
    ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletextensions();

	/*! \brief Set 
	 */
	void setSlingservletextensions(ConfigNodePropertyString slingservletextensions);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString slingservletpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString slingservletmethods);


    private:
    ConfigNodePropertyString slingservletextensions;
    ConfigNodePropertyString slingservletpaths;
    ConfigNodePropertyString slingservletmethods;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties_H_ */
