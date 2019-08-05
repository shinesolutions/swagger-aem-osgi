/*
 * ApacheSlingHealthCheckResultHTMLSerializerProperties.h
 *
 * 
 */

#ifndef _ApacheSlingHealthCheckResultHTMLSerializerProperties_H_
#define _ApacheSlingHealthCheckResultHTMLSerializerProperties_H_


#include <string>
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

class ApacheSlingHealthCheckResultHTMLSerializerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ApacheSlingHealthCheckResultHTMLSerializerProperties();
	ApacheSlingHealthCheckResultHTMLSerializerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApacheSlingHealthCheckResultHTMLSerializerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getStyleString();

	/*! \brief Set 
	 */
	void setStyleString(ConfigNodePropertyString  styleString);

private:
	ConfigNodePropertyString styleString;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ApacheSlingHealthCheckResultHTMLSerializerProperties_H_ */
