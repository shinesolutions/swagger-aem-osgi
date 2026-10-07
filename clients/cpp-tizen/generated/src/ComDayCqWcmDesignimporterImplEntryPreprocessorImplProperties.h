/*
 * ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties_H_
#define _ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties_H_


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

class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties();
	ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSearchpattern();

	/*! \brief Set 
	 */
	void setSearchpattern(ConfigNodePropertyString  searchpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getReplacepattern();

	/*! \brief Set 
	 */
	void setReplacepattern(ConfigNodePropertyString  replacepattern);

private:
	ConfigNodePropertyString searchpattern;
	ConfigNodePropertyString replacepattern;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties_H_ */
