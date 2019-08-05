/*
 * ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_
#define _ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties();
	ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFacebook();

	/*! \brief Set 
	 */
	void setFacebook(ConfigNodePropertyArray  facebook);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTwitter();

	/*! \brief Set 
	 */
	void setTwitter(ConfigNodePropertyArray  twitter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderconfiguserfolder();

	/*! \brief Set 
	 */
	void setProviderconfiguserfolder(ConfigNodePropertyString  providerconfiguserfolder);

private:
	ConfigNodePropertyArray facebook;
	ConfigNodePropertyArray twitter;
	ConfigNodePropertyString providerconfiguserfolder;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_ */
