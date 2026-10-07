/*
 * ComDayCqWcmCoreImplEventPagePostProcessorProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplEventPagePostProcessorProperties_H_
#define _ComDayCqWcmCoreImplEventPagePostProcessorProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmCoreImplEventPagePostProcessorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplEventPagePostProcessorProperties();
	ComDayCqWcmCoreImplEventPagePostProcessorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplEventPagePostProcessorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPaths();

	/*! \brief Set 
	 */
	void setPaths(ConfigNodePropertyArray  paths);

private:
	ConfigNodePropertyArray paths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplEventPagePostProcessorProperties_H_ */
