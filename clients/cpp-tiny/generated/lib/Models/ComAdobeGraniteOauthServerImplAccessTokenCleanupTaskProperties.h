
/*
 * ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties();
    ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);


    private:
    ConfigNodePropertyString schedulerexpression;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties_H_ */
