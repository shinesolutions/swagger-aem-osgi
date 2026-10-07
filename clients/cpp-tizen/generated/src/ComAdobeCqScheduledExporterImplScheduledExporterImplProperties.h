/*
 * ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScheduledExporterImplScheduledExporterImplProperties_H_
#define _ComAdobeCqScheduledExporterImplScheduledExporterImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScheduledExporterImplScheduledExporterImplProperties();
	ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScheduledExporterImplScheduledExporterImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIncludepaths();

	/*! \brief Set 
	 */
	void setIncludepaths(ConfigNodePropertyArray  includepaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExporteruser();

	/*! \brief Set 
	 */
	void setExporteruser(ConfigNodePropertyString  exporteruser);

private:
	ConfigNodePropertyArray includepaths;
	ConfigNodePropertyString exporteruser;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScheduledExporterImplScheduledExporterImplProperties_H_ */
