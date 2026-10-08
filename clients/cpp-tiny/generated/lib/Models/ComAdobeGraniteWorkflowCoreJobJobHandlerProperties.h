
/*
 * ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJobJobHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJobJobHandlerProperties_H_


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

class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties();
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCoreJobJobHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJobtopics();

	/*! \brief Set 
	 */
	void setJobtopics(ConfigNodePropertyArray jobtopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowselfprocesstermination();

	/*! \brief Set 
	 */
	void setAllowselfprocesstermination(ConfigNodePropertyBoolean allowselfprocesstermination);


    private:
    ConfigNodePropertyArray jobtopics;
    ConfigNodePropertyBoolean allowselfprocesstermination;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJobJobHandlerProperties_H_ */
