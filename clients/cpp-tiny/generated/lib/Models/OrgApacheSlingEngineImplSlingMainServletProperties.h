
/*
 * OrgApacheSlingEngineImplSlingMainServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEngineImplSlingMainServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEngineImplSlingMainServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEngineImplSlingMainServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEngineImplSlingMainServletProperties();
    OrgApacheSlingEngineImplSlingMainServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEngineImplSlingMainServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingmaxcalls();

	/*! \brief Set 
	 */
	void setSlingmaxcalls(ConfigNodePropertyInteger slingmaxcalls);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingmaxinclusions();

	/*! \brief Set 
	 */
	void setSlingmaxinclusions(ConfigNodePropertyInteger slingmaxinclusions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSlingtraceallow();

	/*! \brief Set 
	 */
	void setSlingtraceallow(ConfigNodePropertyBoolean slingtraceallow);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingmaxrecordrequests();

	/*! \brief Set 
	 */
	void setSlingmaxrecordrequests(ConfigNodePropertyInteger slingmaxrecordrequests);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingstorepatternrequests();

	/*! \brief Set 
	 */
	void setSlingstorepatternrequests(ConfigNodePropertyArray slingstorepatternrequests);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingserverinfo();

	/*! \brief Set 
	 */
	void setSlingserverinfo(ConfigNodePropertyString slingserverinfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingadditionalresponseheaders();

	/*! \brief Set 
	 */
	void setSlingadditionalresponseheaders(ConfigNodePropertyArray slingadditionalresponseheaders);


    private:
    ConfigNodePropertyInteger slingmaxcalls;
    ConfigNodePropertyInteger slingmaxinclusions;
    ConfigNodePropertyBoolean slingtraceallow;
    ConfigNodePropertyInteger slingmaxrecordrequests;
    ConfigNodePropertyArray slingstorepatternrequests;
    ConfigNodePropertyString slingserverinfo;
    ConfigNodePropertyArray slingadditionalresponseheaders;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEngineImplSlingMainServletProperties_H_ */
