
/*
 * ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties_H_


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

class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties();
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqanalyticstestandtargetaccountoptionsupdaterenabled();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetaccountoptionsupdaterenabled(ConfigNodePropertyBoolean cqanalyticstestandtargetaccountoptionsupdaterenabled);


    private:
    ConfigNodePropertyBoolean cqanalyticstestandtargetaccountoptionsupdaterenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties_H_ */
