
/*
 * ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties_H_


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

class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties();
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowWorkflowPublishEventServiceenabled();

	/*! \brief Set 
	 */
	void setGraniteworkflowWorkflowPublishEventServiceenabled(ConfigNodePropertyBoolean graniteworkflowWorkflowPublishEventServiceenabled);


    private:
    ConfigNodePropertyBoolean graniteworkflowWorkflowPublishEventServiceenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties_H_ */
