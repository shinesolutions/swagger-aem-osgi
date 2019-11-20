/*
 * ComDayCqDamHandlerFfmpegLocatorImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamHandlerFfmpegLocatorImplProperties_H_
#define _ComDayCqDamHandlerFfmpegLocatorImplProperties_H_


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

class ComDayCqDamHandlerFfmpegLocatorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamHandlerFfmpegLocatorImplProperties();
	ComDayCqDamHandlerFfmpegLocatorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamHandlerFfmpegLocatorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExecutablesearchpath();

	/*! \brief Set 
	 */
	void setExecutablesearchpath(ConfigNodePropertyArray  executablesearchpath);

private:
	ConfigNodePropertyArray executablesearchpath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamHandlerFfmpegLocatorImplProperties_H_ */