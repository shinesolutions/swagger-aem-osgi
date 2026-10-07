/*
 * OrgApacheSlingEngineImplLogRequestLoggerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEngineImplLogRequestLoggerProperties_H_
#define _OrgApacheSlingEngineImplLogRequestLoggerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheSlingEngineImplLogRequestLoggerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEngineImplLogRequestLoggerProperties();
	OrgApacheSlingEngineImplLogRequestLoggerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEngineImplLogRequestLoggerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestlogoutput();

	/*! \brief Set 
	 */
	void setRequestlogoutput(ConfigNodePropertyString  requestlogoutput);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getRequestlogoutputtype();

	/*! \brief Set 
	 */
	void setRequestlogoutputtype(ConfigNodePropertyDropDown  requestlogoutputtype);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRequestlogenabled();

	/*! \brief Set 
	 */
	void setRequestlogenabled(ConfigNodePropertyBoolean  requestlogenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAccesslogoutput();

	/*! \brief Set 
	 */
	void setAccesslogoutput(ConfigNodePropertyString  accesslogoutput);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAccesslogoutputtype();

	/*! \brief Set 
	 */
	void setAccesslogoutputtype(ConfigNodePropertyDropDown  accesslogoutputtype);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAccesslogenabled();

	/*! \brief Set 
	 */
	void setAccesslogenabled(ConfigNodePropertyBoolean  accesslogenabled);

private:
	ConfigNodePropertyString requestlogoutput;
	ConfigNodePropertyDropDown requestlogoutputtype;
	ConfigNodePropertyBoolean requestlogenabled;
	ConfigNodePropertyString accesslogoutput;
	ConfigNodePropertyDropDown accesslogoutputtype;
	ConfigNodePropertyBoolean accesslogenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEngineImplLogRequestLoggerProperties_H_ */
