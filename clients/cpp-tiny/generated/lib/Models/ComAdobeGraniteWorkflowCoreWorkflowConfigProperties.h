
/*
 * ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_


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

class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCoreWorkflowConfigProperties();
    ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCoreWorkflowConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqworkflowconfigworkflowpackagesrootpath();

	/*! \brief Set 
	 */
	void setCqworkflowconfigworkflowpackagesrootpath(ConfigNodePropertyArray cqworkflowconfigworkflowpackagesrootpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqworkflowconfigworkflowprocesslegacymode();

	/*! \brief Set 
	 */
	void setCqworkflowconfigworkflowprocesslegacymode(ConfigNodePropertyBoolean cqworkflowconfigworkflowprocesslegacymode);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqworkflowconfigallowlocking();

	/*! \brief Set 
	 */
	void setCqworkflowconfigallowlocking(ConfigNodePropertyBoolean cqworkflowconfigallowlocking);


    private:
    ConfigNodePropertyArray cqworkflowconfigworkflowpackagesrootpath;
    ConfigNodePropertyBoolean cqworkflowconfigworkflowprocesslegacymode;
    ConfigNodePropertyBoolean cqworkflowconfigallowlocking;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_ */
