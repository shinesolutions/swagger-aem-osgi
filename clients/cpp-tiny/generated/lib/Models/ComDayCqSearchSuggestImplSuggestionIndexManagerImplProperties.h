
/*
 * ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties();
    ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathBuildertarget();

	/*! \brief Set 
	 */
	void setPathBuildertarget(ConfigNodePropertyString pathBuildertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSuggestbasepath();

	/*! \brief Set 
	 */
	void setSuggestbasepath(ConfigNodePropertyString suggestbasepath);


    private:
    ConfigNodePropertyString pathBuildertarget;
    ConfigNodePropertyString suggestbasepath;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties_H_ */
