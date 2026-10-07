
/*
 * ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties_H_


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

class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties();
    ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthconfigmanagerimsconfigid();

	/*! \brief Set 
	 */
	void setOauthconfigmanagerimsconfigid(ConfigNodePropertyString oauthconfigmanagerimsconfigid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImsowningEntity();

	/*! \brief Set 
	 */
	void setImsowningEntity(ConfigNodePropertyString imsowningEntity);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAeminstanceId();

	/*! \brief Set 
	 */
	void setAeminstanceId(ConfigNodePropertyString aeminstanceId);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImsserviceCode();

	/*! \brief Set 
	 */
	void setImsserviceCode(ConfigNodePropertyString imsserviceCode);


    private:
    ConfigNodePropertyString oauthconfigmanagerimsconfigid;
    ConfigNodePropertyString imsowningEntity;
    ConfigNodePropertyString aeminstanceId;
    ConfigNodePropertyString imsserviceCode;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties_H_ */
