
/*
 * ComAdobeGraniteAuthImsImplIMSProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplIMSProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplIMSProviderImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthImsImplIMSProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthImsImplIMSProviderImplProperties();
    ComAdobeGraniteAuthImsImplIMSProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthImsImplIMSProviderImplProperties();


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
	ConfigNodePropertyString getOauthproviderimsauthorizationurl();

	/*! \brief Set 
	 */
	void setOauthproviderimsauthorizationurl(ConfigNodePropertyString oauthproviderimsauthorizationurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimstokenurl();

	/*! \brief Set 
	 */
	void setOauthproviderimstokenurl(ConfigNodePropertyString oauthproviderimstokenurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsprofileurl();

	/*! \brief Set 
	 */
	void setOauthproviderimsprofileurl(ConfigNodePropertyString oauthproviderimsprofileurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOauthproviderimsextendeddetailsurls();

	/*! \brief Set 
	 */
	void setOauthproviderimsextendeddetailsurls(ConfigNodePropertyArray oauthproviderimsextendeddetailsurls);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsvalidatetokenurl();

	/*! \brief Set 
	 */
	void setOauthproviderimsvalidatetokenurl(ConfigNodePropertyString oauthproviderimsvalidatetokenurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimssessionproperty();

	/*! \brief Set 
	 */
	void setOauthproviderimssessionproperty(ConfigNodePropertyString oauthproviderimssessionproperty);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsservicetokenclientid();

	/*! \brief Set 
	 */
	void setOauthproviderimsservicetokenclientid(ConfigNodePropertyString oauthproviderimsservicetokenclientid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsservicetokenclientsecret();

	/*! \brief Set 
	 */
	void setOauthproviderimsservicetokenclientsecret(ConfigNodePropertyString oauthproviderimsservicetokenclientsecret);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderimsservicetoken();

	/*! \brief Set 
	 */
	void setOauthproviderimsservicetoken(ConfigNodePropertyString oauthproviderimsservicetoken);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImsorgref();

	/*! \brief Set 
	 */
	void setImsorgref(ConfigNodePropertyString imsorgref);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getImsgroupmapping();

	/*! \brief Set 
	 */
	void setImsgroupmapping(ConfigNodePropertyArray imsgroupmapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthproviderimsonlylicensegroup();

	/*! \brief Set 
	 */
	void setOauthproviderimsonlylicensegroup(ConfigNodePropertyBoolean oauthproviderimsonlylicensegroup);


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
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplIMSProviderImplProperties_H_ */
