
/*
 * ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_


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

class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties();
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFacebook();

	/*! \brief Set 
	 */
	void setFacebook(ConfigNodePropertyArray facebook);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTwitter();

	/*! \brief Set 
	 */
	void setTwitter(ConfigNodePropertyArray twitter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderconfiguserfolder();

	/*! \brief Set 
	 */
	void setProviderconfiguserfolder(ConfigNodePropertyString providerconfiguserfolder);


    private:
    ConfigNodePropertyArray facebook;
    ConfigNodePropertyArray twitter;
    ConfigNodePropertyString providerconfiguserfolder;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_ */
