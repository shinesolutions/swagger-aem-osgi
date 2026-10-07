
/*
 * ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties_H_


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

class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties();
    ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqsearchpromoteconfighandlerenabled();

	/*! \brief Set 
	 */
	void setCqsearchpromoteconfighandlerenabled(ConfigNodePropertyBoolean cqsearchpromoteconfighandlerenabled);


    private:
    ConfigNodePropertyBoolean cqsearchpromoteconfighandlerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties_H_ */
