
/*
 * ComDayCqDamCoreImplServletHealthCheckServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletHealthCheckServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletHealthCheckServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletHealthCheckServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletHealthCheckServletProperties();
    ComDayCqDamCoreImplServletHealthCheckServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletHealthCheckServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamsyncworkflowid();

	/*! \brief Set 
	 */
	void setCqdamsyncworkflowid(ConfigNodePropertyString cqdamsyncworkflowid);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdamsyncfoldertypes();

	/*! \brief Set 
	 */
	void setCqdamsyncfoldertypes(ConfigNodePropertyArray cqdamsyncfoldertypes);


    private:
    ConfigNodePropertyString cqdamsyncworkflowid;
    ConfigNodePropertyArray cqdamsyncfoldertypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletHealthCheckServletProperties_H_ */
