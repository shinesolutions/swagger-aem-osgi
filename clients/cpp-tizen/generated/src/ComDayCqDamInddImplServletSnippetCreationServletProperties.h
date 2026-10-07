/*
 * ComDayCqDamInddImplServletSnippetCreationServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamInddImplServletSnippetCreationServletProperties_H_
#define _ComDayCqDamInddImplServletSnippetCreationServletProperties_H_


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

class ComDayCqDamInddImplServletSnippetCreationServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamInddImplServletSnippetCreationServletProperties();
	ComDayCqDamInddImplServletSnippetCreationServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamInddImplServletSnippetCreationServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSnippetcreationmaxcollections();

	/*! \brief Set 
	 */
	void setSnippetcreationmaxcollections(ConfigNodePropertyInteger  snippetcreationmaxcollections);

private:
	ConfigNodePropertyInteger snippetcreationmaxcollections;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamInddImplServletSnippetCreationServletProperties_H_ */
