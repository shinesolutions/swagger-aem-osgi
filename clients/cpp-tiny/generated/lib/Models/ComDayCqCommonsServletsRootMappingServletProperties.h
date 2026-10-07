
/*
 * ComDayCqCommonsServletsRootMappingServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqCommonsServletsRootMappingServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqCommonsServletsRootMappingServletProperties_H_


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

class ComDayCqCommonsServletsRootMappingServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqCommonsServletsRootMappingServletProperties();
    ComDayCqCommonsServletsRootMappingServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqCommonsServletsRootMappingServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRootmappingtarget();

	/*! \brief Set 
	 */
	void setRootmappingtarget(ConfigNodePropertyString rootmappingtarget);


    private:
    ConfigNodePropertyString rootmappingtarget;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqCommonsServletsRootMappingServletProperties_H_ */
