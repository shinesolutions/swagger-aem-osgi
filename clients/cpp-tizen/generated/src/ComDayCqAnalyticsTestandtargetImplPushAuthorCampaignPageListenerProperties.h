/*
 * ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties_H_
#define _ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties();
	ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetpushauthorcampaignpagelistenerenabled(ConfigNodePropertyBoolean  cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled);

private:
	ConfigNodePropertyBoolean cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties_H_ */
