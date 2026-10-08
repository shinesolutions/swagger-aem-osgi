
/*
 * ComDayCqMcmCampaignImplIntegrationConfigImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqMcmCampaignImplIntegrationConfigImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqMcmCampaignImplIntegrationConfigImplProperties_H_


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

class ComDayCqMcmCampaignImplIntegrationConfigImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqMcmCampaignImplIntegrationConfigImplProperties();
    ComDayCqMcmCampaignImplIntegrationConfigImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqMcmCampaignImplIntegrationConfigImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAemmcmcampaignformConstraints();

	/*! \brief Set 
	 */
	void setAemmcmcampaignformConstraints(ConfigNodePropertyArray aemmcmcampaignformConstraints);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAemmcmcampaignpublicUrl();

	/*! \brief Set 
	 */
	void setAemmcmcampaignpublicUrl(ConfigNodePropertyString aemmcmcampaignpublicUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAemmcmcampaignrelaxedSSL();

	/*! \brief Set 
	 */
	void setAemmcmcampaignrelaxedSSL(ConfigNodePropertyBoolean aemmcmcampaignrelaxedSSL);


    private:
    ConfigNodePropertyArray aemmcmcampaignformConstraints;
    ConfigNodePropertyString aemmcmcampaignpublicUrl;
    ConfigNodePropertyBoolean aemmcmcampaignrelaxedSSL;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqMcmCampaignImplIntegrationConfigImplProperties_H_ */
