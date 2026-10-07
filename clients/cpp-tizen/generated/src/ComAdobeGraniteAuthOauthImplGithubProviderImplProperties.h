/*
 * ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthImplGithubProviderImplProperties_H_
#define _ComAdobeGraniteAuthOauthImplGithubProviderImplProperties_H_


#include <string>
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

class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthImplGithubProviderImplProperties();
	ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthImplGithubProviderImplProperties();

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
	ConfigNodePropertyString getOauthprovidergithubauthorizationurl();

	/*! \brief Set 
	 */
	void setOauthprovidergithubauthorizationurl(ConfigNodePropertyString  oauthprovidergithubauthorizationurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergithubtokenurl();

	/*! \brief Set 
	 */
	void setOauthprovidergithubtokenurl(ConfigNodePropertyString  oauthprovidergithubtokenurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthprovidergithubprofileurl();

	/*! \brief Set 
	 */
	void setOauthprovidergithubprofileurl(ConfigNodePropertyString  oauthprovidergithubprofileurl);

private:
	ConfigNodePropertyString oauthproviderid;
	ConfigNodePropertyString oauthprovidergithubauthorizationurl;
	ConfigNodePropertyString oauthprovidergithubtokenurl;
	ConfigNodePropertyString oauthprovidergithubprofileurl;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthImplGithubProviderImplProperties_H_ */
