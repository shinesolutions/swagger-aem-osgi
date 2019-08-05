/*
 * ComDayCqDamCoreImplServletCollectionServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletCollectionServletProperties_H_
#define _ComDayCqDamCoreImplServletCollectionServletProperties_H_


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

class ComDayCqDamCoreImplServletCollectionServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletCollectionServletProperties();
	ComDayCqDamCoreImplServletCollectionServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletCollectionServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdambatchcollectionproperties();

	/*! \brief Set 
	 */
	void setCqdambatchcollectionproperties(ConfigNodePropertyArray  cqdambatchcollectionproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchcollectionmaxcollections();

	/*! \brief Set 
	 */
	void setCqdambatchcollectionmaxcollections(ConfigNodePropertyInteger  cqdambatchcollectionmaxcollections);

private:
	ConfigNodePropertyArray cqdambatchcollectionproperties;
	ConfigNodePropertyInteger cqdambatchcollectionmaxcollections;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletCollectionServletProperties_H_ */
