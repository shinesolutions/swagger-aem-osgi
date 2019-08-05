/*
 * ComDayCqDamCoreImplServletCreateAssetServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletCreateAssetServletProperties_H_
#define _ComDayCqDamCoreImplServletCreateAssetServletProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCoreImplServletCreateAssetServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletCreateAssetServletProperties();
	ComDayCqDamCoreImplServletCreateAssetServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletCreateAssetServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDetectDuplicate();

	/*! \brief Set 
	 */
	void setDetectDuplicate(ConfigNodePropertyBoolean  detect_duplicate);

private:
	ConfigNodePropertyBoolean detect_duplicate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletCreateAssetServletProperties_H_ */
