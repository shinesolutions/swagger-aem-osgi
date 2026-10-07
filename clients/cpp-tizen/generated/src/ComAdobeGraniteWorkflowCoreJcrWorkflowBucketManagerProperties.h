/*
 * ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties_H_
#define _ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties_H_


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

class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties();
	ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBucketSize();

	/*! \brief Set 
	 */
	void setBucketSize(ConfigNodePropertyInteger  bucketSize);

private:
	ConfigNodePropertyInteger bucketSize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties_H_ */
