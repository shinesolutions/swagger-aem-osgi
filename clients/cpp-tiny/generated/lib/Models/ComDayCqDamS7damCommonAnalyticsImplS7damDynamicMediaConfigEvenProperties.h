
/*
 * ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties();
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdams7damdynamicmediaconfigeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqdams7damdynamicmediaconfigeventlistenerenabled(ConfigNodePropertyBoolean cqdams7damdynamicmediaconfigeventlistenerenabled);


    private:
    ConfigNodePropertyBoolean cqdams7damdynamicmediaconfigeventlistenerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties_H_ */
