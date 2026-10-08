
/*
 * ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties_H_


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

class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties();
    ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqstorelisteneradditionalStorePaths();

	/*! \brief Set 
	 */
	void setCqstorelisteneradditionalStorePaths(ConfigNodePropertyArray cqstorelisteneradditionalStorePaths);


    private:
    ConfigNodePropertyArray cqstorelisteneradditionalStorePaths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties_H_ */
