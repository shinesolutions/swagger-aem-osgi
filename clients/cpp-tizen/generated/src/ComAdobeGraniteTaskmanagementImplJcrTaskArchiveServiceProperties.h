/*
 * ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties_H_
#define _ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties_H_


#include <string>
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

class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties();
	ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getArchivingenabled();

	/*! \brief Set 
	 */
	void setArchivingenabled(ConfigNodePropertyBoolean  archivingenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString  schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getArchivesincedayscompleted();

	/*! \brief Set 
	 */
	void setArchivesincedayscompleted(ConfigNodePropertyInteger  archivesincedayscompleted);

private:
	ConfigNodePropertyBoolean archivingenabled;
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyInteger archivesincedayscompleted;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties_H_ */
