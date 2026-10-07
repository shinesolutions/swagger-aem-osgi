/*
 * ComDayCqWcmFoundationFormsImplMailServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationFormsImplMailServletProperties_H_
#define _ComDayCqWcmFoundationFormsImplMailServletProperties_H_


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

class ComDayCqWcmFoundationFormsImplMailServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationFormsImplMailServletProperties();
	ComDayCqWcmFoundationFormsImplMailServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationFormsImplMailServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyString  slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString  slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourcewhitelist();

	/*! \brief Set 
	 */
	void setResourcewhitelist(ConfigNodePropertyArray  resourcewhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getResourceblacklist();

	/*! \brief Set 
	 */
	void setResourceblacklist(ConfigNodePropertyString  resourceblacklist);

private:
	ConfigNodePropertyString slingservletresourceTypes;
	ConfigNodePropertyString slingservletselectors;
	ConfigNodePropertyArray resourcewhitelist;
	ConfigNodePropertyString resourceblacklist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmFoundationFormsImplMailServletProperties_H_ */
