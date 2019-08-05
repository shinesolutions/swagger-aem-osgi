/*
 * ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplServletsReferenceSearchServletProperties_H_
#define _ComDayCqWcmCoreImplServletsReferenceSearchServletProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplServletsReferenceSearchServletProperties();
	ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplServletsReferenceSearchServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReferencesearchservletmaxReferencesPerPage();

	/*! \brief Set 
	 */
	void setReferencesearchservletmaxReferencesPerPage(ConfigNodePropertyInteger  referencesearchservletmaxReferencesPerPage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReferencesearchservletmaxPages();

	/*! \brief Set 
	 */
	void setReferencesearchservletmaxPages(ConfigNodePropertyInteger  referencesearchservletmaxPages);

private:
	ConfigNodePropertyInteger referencesearchservletmaxReferencesPerPage;
	ConfigNodePropertyInteger referencesearchservletmaxPages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplServletsReferenceSearchServletProperties_H_ */
