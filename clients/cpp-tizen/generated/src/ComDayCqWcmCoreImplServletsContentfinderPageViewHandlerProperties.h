/*
 * ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties_H_
#define _ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties();
	ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getGuessTotal();

	/*! \brief Set 
	 */
	void setGuessTotal(ConfigNodePropertyString  guessTotal);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTagTitleSearch();

	/*! \brief Set 
	 */
	void setTagTitleSearch(ConfigNodePropertyBoolean  tagTitleSearch);

private:
	ConfigNodePropertyString guessTotal;
	ConfigNodePropertyBoolean tagTitleSearch;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties_H_ */
