
/*
 * ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties_H_


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

class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties();
    ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString slingservletpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString slingservletmethods);


    private:
    ConfigNodePropertyString slingservletpaths;
    ConfigNodePropertyString slingservletmethods;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties_H_ */
