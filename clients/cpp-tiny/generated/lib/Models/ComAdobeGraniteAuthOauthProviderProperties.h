
/*
 * ComAdobeGraniteAuthOauthProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthProviderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthProviderProperties_H_


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

class ComAdobeGraniteAuthOauthProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthOauthProviderProperties();
    ComAdobeGraniteAuthOauthProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthOauthProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthconfigid();

	/*! \brief Set 
	 */
	void setOauthconfigid(ConfigNodePropertyString oauthconfigid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthclientid();

	/*! \brief Set 
	 */
	void setOauthclientid(ConfigNodePropertyString oauthclientid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthclientsecret();

	/*! \brief Set 
	 */
	void setOauthclientsecret(ConfigNodePropertyString oauthclientsecret);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOauthscope();

	/*! \brief Set 
	 */
	void setOauthscope(ConfigNodePropertyArray oauthscope);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthconfigproviderid();

	/*! \brief Set 
	 */
	void setOauthconfigproviderid(ConfigNodePropertyString oauthconfigproviderid);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthcreateusers();

	/*! \brief Set 
	 */
	void setOauthcreateusers(ConfigNodePropertyBoolean oauthcreateusers);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthuseridproperty();

	/*! \brief Set 
	 */
	void setOauthuseridproperty(ConfigNodePropertyString oauthuseridproperty);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getForcestrictusernamematching();

	/*! \brief Set 
	 */
	void setForcestrictusernamematching(ConfigNodePropertyBoolean forcestrictusernamematching);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthencodeuserids();

	/*! \brief Set 
	 */
	void setOauthencodeuserids(ConfigNodePropertyBoolean oauthencodeuserids);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthhashuserids();

	/*! \brief Set 
	 */
	void setOauthhashuserids(ConfigNodePropertyBoolean oauthhashuserids);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthcallBackUrl();

	/*! \brief Set 
	 */
	void setOauthcallBackUrl(ConfigNodePropertyString oauthcallBackUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthaccesstokenpersist();

	/*! \brief Set 
	 */
	void setOauthaccesstokenpersist(ConfigNodePropertyBoolean oauthaccesstokenpersist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthaccesstokenpersistcookie();

	/*! \brief Set 
	 */
	void setOauthaccesstokenpersistcookie(ConfigNodePropertyBoolean oauthaccesstokenpersistcookie);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthcsrfstateprotection();

	/*! \brief Set 
	 */
	void setOauthcsrfstateprotection(ConfigNodePropertyBoolean oauthcsrfstateprotection);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthredirectrequestparams();

	/*! \brief Set 
	 */
	void setOauthredirectrequestparams(ConfigNodePropertyBoolean oauthredirectrequestparams);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthconfigsiblingsallow();

	/*! \brief Set 
	 */
	void setOauthconfigsiblingsallow(ConfigNodePropertyBoolean oauthconfigsiblingsallow);


    private:
    ConfigNodePropertyString oauthconfigid;
    ConfigNodePropertyString oauthclientid;
    ConfigNodePropertyString oauthclientsecret;
    ConfigNodePropertyArray oauthscope;
    ConfigNodePropertyString oauthconfigproviderid;
    ConfigNodePropertyBoolean oauthcreateusers;
    ConfigNodePropertyString oauthuseridproperty;
    ConfigNodePropertyBoolean forcestrictusernamematching;
    ConfigNodePropertyBoolean oauthencodeuserids;
    ConfigNodePropertyBoolean oauthhashuserids;
    ConfigNodePropertyString oauthcallBackUrl;
    ConfigNodePropertyBoolean oauthaccesstokenpersist;
    ConfigNodePropertyBoolean oauthaccesstokenpersistcookie;
    ConfigNodePropertyBoolean oauthcsrfstateprotection;
    ConfigNodePropertyBoolean oauthredirectrequestparams;
    ConfigNodePropertyBoolean oauthconfigsiblingsallow;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthProviderProperties_H_ */
