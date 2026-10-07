
/*
 * ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties_H_


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

class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties();
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingpostoperation();

	/*! \brief Set 
	 */
	void setSlingpostoperation(ConfigNodePropertyString slingpostoperation);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString slingservletmethods);


    private:
    ConfigNodePropertyString slingpostoperation;
    ConfigNodePropertyString slingservletmethods;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties_H_ */
