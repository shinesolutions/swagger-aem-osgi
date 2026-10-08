
/*
 * ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties();
    ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDefaulttimeout();

	/*! \brief Set 
	 */
	void setDefaulttimeout(ConfigNodePropertyInteger defaulttimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxtimeout();

	/*! \brief Set 
	 */
	void setMaxtimeout(ConfigNodePropertyInteger maxtimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDefaultperiod();

	/*! \brief Set 
	 */
	void setDefaultperiod(ConfigNodePropertyInteger defaultperiod);


    private:
    ConfigNodePropertyInteger defaulttimeout;
    ConfigNodePropertyInteger maxtimeout;
    ConfigNodePropertyInteger defaultperiod;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties_H_ */
