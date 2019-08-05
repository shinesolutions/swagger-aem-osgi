/*
 * ComDayCqWcmCoreImplServletsThumbnailServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplServletsThumbnailServletProperties_H_
#define _ComDayCqWcmCoreImplServletsThumbnailServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmCoreImplServletsThumbnailServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplServletsThumbnailServletProperties();
	ComDayCqWcmCoreImplServletsThumbnailServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplServletsThumbnailServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getWorkspace();

	/*! \brief Set 
	 */
	void setWorkspace(ConfigNodePropertyString  workspace);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDimensions();

	/*! \brief Set 
	 */
	void setDimensions(ConfigNodePropertyArray  dimensions);

private:
	ConfigNodePropertyString workspace;
	ConfigNodePropertyArray dimensions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplServletsThumbnailServletProperties_H_ */
