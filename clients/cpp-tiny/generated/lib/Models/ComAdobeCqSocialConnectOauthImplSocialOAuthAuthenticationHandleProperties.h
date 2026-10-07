
/*
 * ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties();
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyArray path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);


    private:
    ConfigNodePropertyArray path;
    ConfigNodePropertyInteger serviceranking;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties_H_ */
