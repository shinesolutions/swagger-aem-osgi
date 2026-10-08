
/*
 * ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPayloadmovewhitelist();

	/*! \brief Set 
	 */
	void setPayloadmovewhitelist(ConfigNodePropertyArray payloadmovewhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPayloadmovehandlefromworkflowprocess();

	/*! \brief Set 
	 */
	void setPayloadmovehandlefromworkflowprocess(ConfigNodePropertyBoolean payloadmovehandlefromworkflowprocess);


    private:
    ConfigNodePropertyArray payloadmovewhitelist;
    ConfigNodePropertyBoolean payloadmovehandlefromworkflowprocess;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_ */
