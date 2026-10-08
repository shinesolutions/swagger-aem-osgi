
/*
 * OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplScriptableHealthCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplScriptableHealthCheckProperties_H_


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

class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingHcCoreImplScriptableHealthCheckProperties();
    OrgApacheSlingHcCoreImplScriptableHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingHcCoreImplScriptableHealthCheckProperties();


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
	ConfigNodePropertyString getExpression();

	/*! \brief Set 
	 */
	void setExpression(ConfigNodePropertyString expression);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLanguageextension();

	/*! \brief Set 
	 */
	void setLanguageextension(ConfigNodePropertyString languageextension);


    private:
    ConfigNodePropertyString hcname;
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyString hcmbeanname;
    ConfigNodePropertyString expression;
    ConfigNodePropertyString languageextension;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplScriptableHealthCheckProperties_H_ */
