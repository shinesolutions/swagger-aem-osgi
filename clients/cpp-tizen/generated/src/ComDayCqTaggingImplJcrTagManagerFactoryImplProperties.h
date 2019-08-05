/*
 * ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqTaggingImplJcrTagManagerFactoryImplProperties_H_
#define _ComDayCqTaggingImplJcrTagManagerFactoryImplProperties_H_


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

class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqTaggingImplJcrTagManagerFactoryImplProperties();
	ComDayCqTaggingImplJcrTagManagerFactoryImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqTaggingImplJcrTagManagerFactoryImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getValidationenabled();

	/*! \brief Set 
	 */
	void setValidationenabled(ConfigNodePropertyBoolean  validationenabled);

private:
	ConfigNodePropertyBoolean validationenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqTaggingImplJcrTagManagerFactoryImplProperties_H_ */
