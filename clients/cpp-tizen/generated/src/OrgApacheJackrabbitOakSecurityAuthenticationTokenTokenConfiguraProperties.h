/*
 * OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties_H_
#define _OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties();
	OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTokenExpiration();

	/*! \brief Set 
	 */
	void setTokenExpiration(ConfigNodePropertyString  tokenExpiration);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTokenLength();

	/*! \brief Set 
	 */
	void setTokenLength(ConfigNodePropertyString  tokenLength);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTokenRefresh();

	/*! \brief Set 
	 */
	void setTokenRefresh(ConfigNodePropertyBoolean  tokenRefresh);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTokenCleanupThreshold();

	/*! \brief Set 
	 */
	void setTokenCleanupThreshold(ConfigNodePropertyInteger  tokenCleanupThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPasswordHashAlgorithm();

	/*! \brief Set 
	 */
	void setPasswordHashAlgorithm(ConfigNodePropertyString  passwordHashAlgorithm);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPasswordHashIterations();

	/*! \brief Set 
	 */
	void setPasswordHashIterations(ConfigNodePropertyInteger  passwordHashIterations);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPasswordSaltSize();

	/*! \brief Set 
	 */
	void setPasswordSaltSize(ConfigNodePropertyInteger  passwordSaltSize);

private:
	ConfigNodePropertyString tokenExpiration;
	ConfigNodePropertyString tokenLength;
	ConfigNodePropertyBoolean tokenRefresh;
	ConfigNodePropertyInteger tokenCleanupThreshold;
	ConfigNodePropertyString passwordHashAlgorithm;
	ConfigNodePropertyInteger passwordHashIterations;
	ConfigNodePropertyInteger passwordSaltSize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties_H_ */
