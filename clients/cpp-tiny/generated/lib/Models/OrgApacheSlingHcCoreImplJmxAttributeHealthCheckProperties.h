
/*
 * OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties_H_


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

class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties();
    OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcname();

	/*! \brief Set 
	 */
	void setHcname(ConfigNodePropertyString hcname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcmbeanname();

	/*! \brief Set 
	 */
	void setHcmbeanname(ConfigNodePropertyString hcmbeanname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMbeanname();

	/*! \brief Set 
	 */
	void setMbeanname(ConfigNodePropertyString mbeanname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAttributename();

	/*! \brief Set 
	 */
	void setAttributename(ConfigNodePropertyString attributename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAttributevalueconstraint();

	/*! \brief Set 
	 */
	void setAttributevalueconstraint(ConfigNodePropertyString attributevalueconstraint);


    private:
    ConfigNodePropertyString hcname;
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyString hcmbeanname;
    ConfigNodePropertyString mbeanname;
    ConfigNodePropertyString attributename;
    ConfigNodePropertyString attributevalueconstraint;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties_H_ */
