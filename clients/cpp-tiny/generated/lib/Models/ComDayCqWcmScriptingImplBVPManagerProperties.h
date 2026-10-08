
/*
 * ComDayCqWcmScriptingImplBVPManagerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmScriptingImplBVPManagerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmScriptingImplBVPManagerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmScriptingImplBVPManagerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmScriptingImplBVPManagerProperties();
    ComDayCqWcmScriptingImplBVPManagerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmScriptingImplBVPManagerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComdaycqwcmscriptingbvpscriptengines();

	/*! \brief Set 
	 */
	void setComdaycqwcmscriptingbvpscriptengines(ConfigNodePropertyArray comdaycqwcmscriptingbvpscriptengines);


    private:
    ConfigNodePropertyArray comdaycqwcmscriptingbvpscriptengines;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmScriptingImplBVPManagerProperties_H_ */
