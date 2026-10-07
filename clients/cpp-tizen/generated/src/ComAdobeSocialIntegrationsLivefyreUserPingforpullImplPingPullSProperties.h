/*
 * ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.h
 *
 * 
 */

#ifndef _ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties_H_
#define _ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties_H_


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

class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties();
	ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCommunitiesintegrationlivefyreslingeventfilter();

	/*! \brief Set 
	 */
	void setCommunitiesintegrationlivefyreslingeventfilter(ConfigNodePropertyString  communitiesintegrationlivefyreslingeventfilter);

private:
	ConfigNodePropertyString communitiesintegrationlivefyreslingeventfilter;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties_H_ */
