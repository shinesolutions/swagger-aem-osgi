
/*
 * ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties();
    ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties();


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
	ConfigNodePropertyString getOauthcloudconfigroot();

	/*! \brief Set 
	 */
	void setOauthcloudconfigroot(ConfigNodePropertyString oauthcloudconfigroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderconfigroot();

	/*! \brief Set 
	 */
	void setProviderconfigroot(ConfigNodePropertyString providerconfigroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProviderconfigcreatetagsenabled();

	/*! \brief Set 
	 */
	void setProviderconfigcreatetagsenabled(ConfigNodePropertyBoolean providerconfigcreatetagsenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getProviderconfiguserfolder();

	/*! \brief Set 
	 */
	void setProviderconfiguserfolder(ConfigNodePropertyDropDown providerconfiguserfolder);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProviderconfigfacebookfetchfields();

	/*! \brief Set 
	 */
	void setProviderconfigfacebookfetchfields(ConfigNodePropertyBoolean providerconfigfacebookfetchfields);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getProviderconfigfacebookfields();

	/*! \brief Set 
	 */
	void setProviderconfigfacebookfields(ConfigNodePropertyArray providerconfigfacebookfields);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProviderconfigrefreshuserdataenabled();

	/*! \brief Set 
	 */
	void setProviderconfigrefreshuserdataenabled(ConfigNodePropertyBoolean providerconfigrefreshuserdataenabled);


    private:
    ConfigNodePropertyString oauthproviderid;
    ConfigNodePropertyString oauthcloudconfigroot;
    ConfigNodePropertyString providerconfigroot;
    ConfigNodePropertyBoolean providerconfigcreatetagsenabled;
    ConfigNodePropertyDropDown providerconfiguserfolder;
    ConfigNodePropertyBoolean providerconfigfacebookfetchfields;
    ConfigNodePropertyArray providerconfigfacebookfields;
    ConfigNodePropertyBoolean providerconfigrefreshuserdataenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H_ */
