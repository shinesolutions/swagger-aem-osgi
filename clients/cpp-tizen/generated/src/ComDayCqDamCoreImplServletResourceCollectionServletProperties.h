/*
 * ComDayCqDamCoreImplServletResourceCollectionServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletResourceCollectionServletProperties_H_
#define _ComDayCqDamCoreImplServletResourceCollectionServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCoreImplServletResourceCollectionServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletResourceCollectionServletProperties();
	ComDayCqDamCoreImplServletResourceCollectionServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletResourceCollectionServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyArray  slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString  slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString  slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDownloadconfig();

	/*! \brief Set 
	 */
	void setDownloadconfig(ConfigNodePropertyString  downloadconfig);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getViewselector();

	/*! \brief Set 
	 */
	void setViewselector(ConfigNodePropertyString  viewselector);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSendEmail();

	/*! \brief Set 
	 */
	void setSendEmail(ConfigNodePropertyBoolean  send_email);

private:
	ConfigNodePropertyArray slingservletresourceTypes;
	ConfigNodePropertyString slingservletmethods;
	ConfigNodePropertyString slingservletselectors;
	ConfigNodePropertyString downloadconfig;
	ConfigNodePropertyString viewselector;
	ConfigNodePropertyBoolean send_email;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletResourceCollectionServletProperties_H_ */
