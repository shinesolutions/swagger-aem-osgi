/*
 * ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties_H_
#define _ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties();
	ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyArray  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);

private:
	ConfigNodePropertyArray path;
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties_H_ */
