/*
 * ComAdobeGraniteAuthOauthProviderProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthProviderProperties_H_
#define _ComAdobeGraniteAuthOauthProviderProperties_H_


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

class ComAdobeGraniteAuthOauthProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthProviderProperties();
	ComAdobeGraniteAuthOauthProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthconfigid();

	/*! \brief Set 
	 */
	void setOauthconfigid(ConfigNodePropertyString  oauthconfigid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthclientid();

	/*! \brief Set 
	 */
	void setOauthclientid(ConfigNodePropertyString  oauthclientid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthclientsecret();

	/*! \brief Set 
	 */
	void setOauthclientsecret(ConfigNodePropertyString  oauthclientsecret);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOauthscope();

	/*! \brief Set 
	 */
	void setOauthscope(ConfigNodePropertyArray  oauthscope);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthconfigproviderid();

	/*! \brief Set 
	 */
	void setOauthconfigproviderid(ConfigNodePropertyString  oauthconfigproviderid);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthcreateusers();

	/*! \brief Set 
	 */
	void setOauthcreateusers(ConfigNodePropertyBoolean  oauthcreateusers);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthuseridproperty();

	/*! \brief Set 
	 */
	void setOauthuseridproperty(ConfigNodePropertyString  oauthuseridproperty);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getForcestrictusernamematching();

	/*! \brief Set 
	 */
	void setForcestrictusernamematching(ConfigNodePropertyBoolean  forcestrictusernamematching);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthencodeuserids();

	/*! \brief Set 
	 */
	void setOauthencodeuserids(ConfigNodePropertyBoolean  oauthencodeuserids);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthhashuserids();

	/*! \brief Set 
	 */
	void setOauthhashuserids(ConfigNodePropertyBoolean  oauthhashuserids);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthcallBackUrl();

	/*! \brief Set 
	 */
	void setOauthcallBackUrl(ConfigNodePropertyString  oauthcallBackUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthaccesstokenpersist();

	/*! \brief Set 
	 */
	void setOauthaccesstokenpersist(ConfigNodePropertyBoolean  oauthaccesstokenpersist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthaccesstokenpersistcookie();

	/*! \brief Set 
	 */
	void setOauthaccesstokenpersistcookie(ConfigNodePropertyBoolean  oauthaccesstokenpersistcookie);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthcsrfstateprotection();

	/*! \brief Set 
	 */
	void setOauthcsrfstateprotection(ConfigNodePropertyBoolean  oauthcsrfstateprotection);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthredirectrequestparams();

	/*! \brief Set 
	 */
	void setOauthredirectrequestparams(ConfigNodePropertyBoolean  oauthredirectrequestparams);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthconfigsiblingsallow();

	/*! \brief Set 
	 */
	void setOauthconfigsiblingsallow(ConfigNodePropertyBoolean  oauthconfigsiblingsallow);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthProviderProperties_H_ */
