
/*
 * ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_


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

class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();


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
	ConfigNodePropertyDropDown getProviderconfiguserfolder();

	/*! \brief Set 
	 */
	void setProviderconfiguserfolder(ConfigNodePropertyDropDown providerconfiguserfolder);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProviderconfigtwitterenableparams();

	/*! \brief Set 
	 */
	void setProviderconfigtwitterenableparams(ConfigNodePropertyBoolean providerconfigtwitterenableparams);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getProviderconfigtwitterparams();

	/*! \brief Set 
	 */
	void setProviderconfigtwitterparams(ConfigNodePropertyArray providerconfigtwitterparams);
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
    ConfigNodePropertyDropDown providerconfiguserfolder;
    ConfigNodePropertyBoolean providerconfigtwitterenableparams;
    ConfigNodePropertyArray providerconfigtwitterparams;
    ConfigNodePropertyBoolean providerconfigrefreshuserdataenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_ */
