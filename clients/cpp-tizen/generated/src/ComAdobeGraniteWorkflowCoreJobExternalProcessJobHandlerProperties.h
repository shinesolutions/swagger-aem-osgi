/*
 * ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties_H_
#define _ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties();
	ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDefaulttimeout();

	/*! \brief Set 
	 */
	void setDefaulttimeout(ConfigNodePropertyInteger  defaulttimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxtimeout();

	/*! \brief Set 
	 */
	void setMaxtimeout(ConfigNodePropertyInteger  maxtimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDefaultperiod();

	/*! \brief Set 
	 */
	void setDefaultperiod(ConfigNodePropertyInteger  defaultperiod);

private:
	ConfigNodePropertyInteger defaulttimeout;
	ConfigNodePropertyInteger maxtimeout;
	ConfigNodePropertyInteger defaultperiod;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties_H_ */
