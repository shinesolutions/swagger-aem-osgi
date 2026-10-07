/*
 * ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties_H_
#define _ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties_H_


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

class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties();
	ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathBuildertarget();

	/*! \brief Set 
	 */
	void setPathBuildertarget(ConfigNodePropertyString  pathBuildertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSuggestbasepath();

	/*! \brief Set 
	 */
	void setSuggestbasepath(ConfigNodePropertyString  suggestbasepath);

private:
	ConfigNodePropertyString pathBuildertarget;
	ConfigNodePropertyString suggestbasepath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties_H_ */
