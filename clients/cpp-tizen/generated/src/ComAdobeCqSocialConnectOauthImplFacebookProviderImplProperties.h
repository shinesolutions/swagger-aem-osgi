/*
 * ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H_
#define _ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties();
	ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderid();

	/*! \brief Set 
	 */
	void setOauthproviderid(ConfigNodePropertyString  oauthproviderid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthcloudconfigroot();

	/*! \brief Set 
	 */
	void setOauthcloudconfigroot(ConfigNodePropertyString  oauthcloudconfigroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderconfigroot();

	/*! \brief Set 
	 */
	void setProviderconfigroot(ConfigNodePropertyString  providerconfigroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProviderconfigcreatetagsenabled();

	/*! \brief Set 
	 */
	void setProviderconfigcreatetagsenabled(ConfigNodePropertyBoolean  providerconfigcreatetagsenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getProviderconfiguserfolder();

	/*! \brief Set 
	 */
	void setProviderconfiguserfolder(ConfigNodePropertyDropDown  providerconfiguserfolder);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProviderconfigfacebookfetchfields();

	/*! \brief Set 
	 */
	void setProviderconfigfacebookfetchfields(ConfigNodePropertyBoolean  providerconfigfacebookfetchfields);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getProviderconfigfacebookfields();

	/*! \brief Set 
	 */
	void setProviderconfigfacebookfields(ConfigNodePropertyArray  providerconfigfacebookfields);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProviderconfigrefreshuserdataenabled();

	/*! \brief Set 
	 */
	void setProviderconfigrefreshuserdataenabled(ConfigNodePropertyBoolean  providerconfigrefreshuserdataenabled);

private:
	ConfigNodePropertyString oauthproviderid;
	ConfigNodePropertyString oauthcloudconfigroot;
	ConfigNodePropertyString providerconfigroot;
	ConfigNodePropertyBoolean providerconfigcreatetagsenabled;
	ConfigNodePropertyDropDown providerconfiguserfolder;
	ConfigNodePropertyBoolean providerconfigfacebookfetchfields;
	ConfigNodePropertyArray providerconfigfacebookfields;
	ConfigNodePropertyBoolean providerconfigrefreshuserdataenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H_ */
