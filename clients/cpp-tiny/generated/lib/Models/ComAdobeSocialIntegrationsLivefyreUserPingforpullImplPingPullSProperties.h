
/*
 * ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties_H_
#define TINY_CPP_CLIENT_ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties_H_


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

class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties();
    ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCommunitiesintegrationlivefyreslingeventfilter();

	/*! \brief Set 
	 */
	void setCommunitiesintegrationlivefyreslingeventfilter(ConfigNodePropertyString communitiesintegrationlivefyreslingeventfilter);


    private:
    ConfigNodePropertyString communitiesintegrationlivefyreslingeventfilter;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties_H_ */
