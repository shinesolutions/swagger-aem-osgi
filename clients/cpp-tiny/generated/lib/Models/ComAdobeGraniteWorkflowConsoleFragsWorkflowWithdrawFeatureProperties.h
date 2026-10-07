
/*
 * ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties_H_


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

class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties();
    ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);


    private:
    ConfigNodePropertyBoolean enabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties_H_ */
