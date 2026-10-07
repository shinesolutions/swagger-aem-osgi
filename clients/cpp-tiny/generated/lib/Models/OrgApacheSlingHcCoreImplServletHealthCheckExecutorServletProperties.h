
/*
 * OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties();
    OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getServletPath();

	/*! \brief Set 
	 */
	void setServletPath(ConfigNodePropertyString servletPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDisabled();

	/*! \brief Set 
	 */
	void setDisabled(ConfigNodePropertyBoolean disabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCorsaccessControlAllowOrigin();

	/*! \brief Set 
	 */
	void setCorsaccessControlAllowOrigin(ConfigNodePropertyString corsaccessControlAllowOrigin);


    private:
    ConfigNodePropertyString servletPath;
    ConfigNodePropertyBoolean disabled;
    ConfigNodePropertyString corsaccessControlAllowOrigin;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties_H_ */
