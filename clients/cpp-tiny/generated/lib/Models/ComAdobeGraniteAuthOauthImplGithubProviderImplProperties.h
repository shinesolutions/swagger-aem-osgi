
/*
 * ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplGithubProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplGithubProviderImplProperties_H_


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

class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthOauthImplGithubProviderImplProperties();
    ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthOauthImplGithubProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderid();

	/*! \brief Set 
	 */
	void setOauthproviderid(ConfigNodePropertyString oauthproviderid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergithubauthorizationurl();

	/*! \brief Set 
	 */
	void setOauthprovidergithubauthorizationurl(ConfigNodePropertyString oauthprovidergithubauthorizationurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergithubtokenurl();

	/*! \brief Set 
	 */
	void setOauthprovidergithubtokenurl(ConfigNodePropertyString oauthprovidergithubtokenurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergithubprofileurl();

	/*! \brief Set 
	 */
	void setOauthprovidergithubprofileurl(ConfigNodePropertyString oauthprovidergithubprofileurl);


    private:
    ConfigNodePropertyString oauthproviderid;
    ConfigNodePropertyString oauthprovidergithubauthorizationurl;
    ConfigNodePropertyString oauthprovidergithubtokenurl;
    ConfigNodePropertyString oauthprovidergithubprofileurl;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplGithubProviderImplProperties_H_ */
