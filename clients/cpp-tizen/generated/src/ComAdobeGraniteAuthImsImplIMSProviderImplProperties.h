/*
 * ComAdobeGraniteAuthImsImplIMSProviderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthImsImplIMSProviderImplProperties_H_
#define _ComAdobeGraniteAuthImsImplIMSProviderImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteAuthImsImplIMSProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthImsImplIMSProviderImplProperties();
	ComAdobeGraniteAuthImsImplIMSProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthImsImplIMSProviderImplProperties();

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
	ConfigNodePropertyString getOauthproviderimsauthorizationurl();

	/*! \brief Set 
	 */
	void setOauthproviderimsauthorizationurl(ConfigNodePropertyString  oauthproviderimsauthorizationurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimstokenurl();

	/*! \brief Set 
	 */
	void setOauthproviderimstokenurl(ConfigNodePropertyString  oauthproviderimstokenurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsprofileurl();

	/*! \brief Set 
	 */
	void setOauthproviderimsprofileurl(ConfigNodePropertyString  oauthproviderimsprofileurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOauthproviderimsextendeddetailsurls();

	/*! \brief Set 
	 */
	void setOauthproviderimsextendeddetailsurls(ConfigNodePropertyArray  oauthproviderimsextendeddetailsurls);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsvalidatetokenurl();

	/*! \brief Set 
	 */
	void setOauthproviderimsvalidatetokenurl(ConfigNodePropertyString  oauthproviderimsvalidatetokenurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimssessionproperty();

	/*! \brief Set 
	 */
	void setOauthproviderimssessionproperty(ConfigNodePropertyString  oauthproviderimssessionproperty);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsservicetokenclientid();

	/*! \brief Set 
	 */
	void setOauthproviderimsservicetokenclientid(ConfigNodePropertyString  oauthproviderimsservicetokenclientid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsservicetokenclientsecret();

	/*! \brief Set 
	 */
	void setOauthproviderimsservicetokenclientsecret(ConfigNodePropertyString  oauthproviderimsservicetokenclientsecret);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsservicetoken();

	/*! \brief Set 
	 */
	void setOauthproviderimsservicetoken(ConfigNodePropertyString  oauthproviderimsservicetoken);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImsorgref();

	/*! \brief Set 
	 */
	void setImsorgref(ConfigNodePropertyString  imsorgref);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getImsgroupmapping();

	/*! \brief Set 
	 */
	void setImsgroupmapping(ConfigNodePropertyArray  imsgroupmapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthproviderimsonlylicensegroup();

	/*! \brief Set 
	 */
	void setOauthproviderimsonlylicensegroup(ConfigNodePropertyBoolean  oauthproviderimsonlylicensegroup);

private:
	ConfigNodePropertyString oauthproviderid;
	ConfigNodePropertyString oauthproviderimsauthorizationurl;
	ConfigNodePropertyString oauthproviderimstokenurl;
	ConfigNodePropertyString oauthproviderimsprofileurl;
	ConfigNodePropertyArray oauthproviderimsextendeddetailsurls;
	ConfigNodePropertyString oauthproviderimsvalidatetokenurl;
	ConfigNodePropertyString oauthproviderimssessionproperty;
	ConfigNodePropertyString oauthproviderimsservicetokenclientid;
	ConfigNodePropertyString oauthproviderimsservicetokenclientsecret;
	ConfigNodePropertyString oauthproviderimsservicetoken;
	ConfigNodePropertyString imsorgref;
	ConfigNodePropertyArray imsgroupmapping;
	ConfigNodePropertyBoolean oauthproviderimsonlylicensegroup;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthImsImplIMSProviderImplProperties_H_ */
