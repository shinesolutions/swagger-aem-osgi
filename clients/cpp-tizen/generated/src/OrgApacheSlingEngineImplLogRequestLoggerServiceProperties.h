/*
 * OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_
#define _OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_


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

class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
	OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestlogserviceformat();

	/*! \brief Set 
	 */
	void setRequestlogserviceformat(ConfigNodePropertyString  requestlogserviceformat);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestlogserviceoutput();

	/*! \brief Set 
	 */
	void setRequestlogserviceoutput(ConfigNodePropertyString  requestlogserviceoutput);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getRequestlogserviceoutputtype();

	/*! \brief Set 
	 */
	void setRequestlogserviceoutputtype(ConfigNodePropertyDropDown  requestlogserviceoutputtype);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRequestlogserviceonentry();

	/*! \brief Set 
	 */
	void setRequestlogserviceonentry(ConfigNodePropertyBoolean  requestlogserviceonentry);

private:
	ConfigNodePropertyString requestlogserviceformat;
	ConfigNodePropertyString requestlogserviceoutput;
	ConfigNodePropertyDropDown requestlogserviceoutputtype;
	ConfigNodePropertyBoolean requestlogserviceonentry;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_ */
