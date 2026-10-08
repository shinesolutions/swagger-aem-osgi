
/*
 * ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties_H_


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

class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties();
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqanalyticstestandtargetdeleteauthoractivitylistenerenabled();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetdeleteauthoractivitylistenerenabled(ConfigNodePropertyBoolean cqanalyticstestandtargetdeleteauthoractivitylistenerenabled);


    private:
    ConfigNodePropertyBoolean cqanalyticstestandtargetdeleteauthoractivitylistenerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties_H_ */
