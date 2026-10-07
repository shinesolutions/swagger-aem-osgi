/*
 * ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplEventTemplatePostProcessorProperties_H_
#define _ComDayCqWcmCoreImplEventTemplatePostProcessorProperties_H_


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

class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplEventTemplatePostProcessorProperties();
	ComDayCqWcmCoreImplEventTemplatePostProcessorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplEventTemplatePostProcessorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPaths();

	/*! \brief Set 
	 */
	void setPaths(ConfigNodePropertyString  paths);

private:
	ConfigNodePropertyString paths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplEventTemplatePostProcessorProperties_H_ */
