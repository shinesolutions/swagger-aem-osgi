/*
 * ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_
#define _ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_


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

class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
	ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();

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
	ConfigNodePropertyDropDown getProviderconfiguserfolder();

	/*! \brief Set 
	 */
	void setProviderconfiguserfolder(ConfigNodePropertyDropDown  providerconfiguserfolder);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProviderconfigtwitterenableparams();

	/*! \brief Set 
	 */
	void setProviderconfigtwitterenableparams(ConfigNodePropertyBoolean  providerconfigtwitterenableparams);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getProviderconfigtwitterparams();

	/*! \brief Set 
	 */
	void setProviderconfigtwitterparams(ConfigNodePropertyArray  providerconfigtwitterparams);
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
	ConfigNodePropertyDropDown providerconfiguserfolder;
	ConfigNodePropertyBoolean providerconfigtwitterenableparams;
	ConfigNodePropertyArray providerconfigtwitterparams;
	ConfigNodePropertyBoolean providerconfigrefreshuserdataenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_ */
