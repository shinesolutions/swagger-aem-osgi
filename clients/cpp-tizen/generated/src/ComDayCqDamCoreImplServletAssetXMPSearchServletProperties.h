/*
 * ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletAssetXMPSearchServletProperties_H_
#define _ComDayCqDamCoreImplServletAssetXMPSearchServletProperties_H_


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

class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletAssetXMPSearchServletProperties();
	ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletAssetXMPSearchServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchindesignmaxassets();

	/*! \brief Set 
	 */
	void setCqdambatchindesignmaxassets(ConfigNodePropertyInteger  cqdambatchindesignmaxassets);

private:
	ConfigNodePropertyInteger cqdambatchindesignmaxassets;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletAssetXMPSearchServletProperties_H_ */
