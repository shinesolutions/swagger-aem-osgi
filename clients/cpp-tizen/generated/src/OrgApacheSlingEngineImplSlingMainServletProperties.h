/*
 * OrgApacheSlingEngineImplSlingMainServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEngineImplSlingMainServletProperties_H_
#define _OrgApacheSlingEngineImplSlingMainServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEngineImplSlingMainServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEngineImplSlingMainServletProperties();
	OrgApacheSlingEngineImplSlingMainServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEngineImplSlingMainServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingmaxcalls();

	/*! \brief Set 
	 */
	void setSlingmaxcalls(ConfigNodePropertyInteger  slingmaxcalls);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingmaxinclusions();

	/*! \brief Set 
	 */
	void setSlingmaxinclusions(ConfigNodePropertyInteger  slingmaxinclusions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSlingtraceallow();

	/*! \brief Set 
	 */
	void setSlingtraceallow(ConfigNodePropertyBoolean  slingtraceallow);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingmaxrecordrequests();

	/*! \brief Set 
	 */
	void setSlingmaxrecordrequests(ConfigNodePropertyInteger  slingmaxrecordrequests);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingstorepatternrequests();

	/*! \brief Set 
	 */
	void setSlingstorepatternrequests(ConfigNodePropertyArray  slingstorepatternrequests);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingserverinfo();

	/*! \brief Set 
	 */
	void setSlingserverinfo(ConfigNodePropertyString  slingserverinfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingadditionalresponseheaders();

	/*! \brief Set 
	 */
	void setSlingadditionalresponseheaders(ConfigNodePropertyArray  slingadditionalresponseheaders);

private:
	ConfigNodePropertyInteger slingmaxcalls;
	ConfigNodePropertyInteger slingmaxinclusions;
	ConfigNodePropertyBoolean slingtraceallow;
	ConfigNodePropertyInteger slingmaxrecordrequests;
	ConfigNodePropertyArray slingstorepatternrequests;
	ConfigNodePropertyString slingserverinfo;
	ConfigNodePropertyArray slingadditionalresponseheaders;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEngineImplSlingMainServletProperties_H_ */
