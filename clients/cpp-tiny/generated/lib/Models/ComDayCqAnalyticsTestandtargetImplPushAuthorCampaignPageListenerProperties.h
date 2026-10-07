
/*
 * ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties();
    ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled(ConfigNodePropertyBoolean cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled);


    private:
    ConfigNodePropertyBoolean cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties_H_ */
