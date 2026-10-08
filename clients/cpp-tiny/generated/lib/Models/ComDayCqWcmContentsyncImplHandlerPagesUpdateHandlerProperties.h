
/*
 * ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_


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

class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerimageresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerimageresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlerimageresourcetypes);


    private:
    ConfigNodePropertyArray cqpagesupdatehandlerimageresourcetypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_ */
