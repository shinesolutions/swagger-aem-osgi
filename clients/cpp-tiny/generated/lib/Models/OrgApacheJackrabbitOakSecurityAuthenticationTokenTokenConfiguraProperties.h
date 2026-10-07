
/*
 * OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties();
    OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTokenExpiration();

	/*! \brief Set 
	 */
	void setTokenExpiration(ConfigNodePropertyString tokenExpiration);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTokenLength();

	/*! \brief Set 
	 */
	void setTokenLength(ConfigNodePropertyString tokenLength);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTokenRefresh();

	/*! \brief Set 
	 */
	void setTokenRefresh(ConfigNodePropertyBoolean tokenRefresh);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTokenCleanupThreshold();

	/*! \brief Set 
	 */
	void setTokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPasswordHashAlgorithm();

	/*! \brief Set 
	 */
	void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPasswordHashIterations();

	/*! \brief Set 
	 */
	void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPasswordSaltSize();

	/*! \brief Set 
	 */
	void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize);


    private:
    ConfigNodePropertyString tokenExpiration;
    ConfigNodePropertyString tokenLength;
    ConfigNodePropertyBoolean tokenRefresh;
    ConfigNodePropertyInteger tokenCleanupThreshold;
    ConfigNodePropertyString passwordHashAlgorithm;
    ConfigNodePropertyInteger passwordHashIterations;
    ConfigNodePropertyInteger passwordSaltSize;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties_H_ */
