/*
 * ComDayCqDamCoreImplServletCollectionsServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletCollectionsServletProperties_H_
#define _ComDayCqDamCoreImplServletCollectionsServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqDamCoreImplServletCollectionsServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletCollectionsServletProperties();
	ComDayCqDamCoreImplServletCollectionsServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletCollectionsServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdambatchcollectionsproperties();

	/*! \brief Set 
	 */
	void setCqdambatchcollectionsproperties(ConfigNodePropertyArray  cqdambatchcollectionsproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchcollectionslimit();

	/*! \brief Set 
	 */
	void setCqdambatchcollectionslimit(ConfigNodePropertyInteger  cqdambatchcollectionslimit);

private:
	ConfigNodePropertyArray cqdambatchcollectionsproperties;
	ConfigNodePropertyInteger cqdambatchcollectionslimit;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletCollectionsServletProperties_H_ */
