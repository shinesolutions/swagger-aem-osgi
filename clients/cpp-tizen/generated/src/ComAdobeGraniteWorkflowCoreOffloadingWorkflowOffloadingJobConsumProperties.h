/*
 * ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties_H_
#define _ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties_H_


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

class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties();
	ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJobtopics();

	/*! \brief Set 
	 */
	void setJobtopics(ConfigNodePropertyString  jobtopics);

private:
	ConfigNodePropertyString jobtopics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties_H_ */
