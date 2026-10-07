/*
 * ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.h
 *
 * 
 */

#ifndef _ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties_H_
#define _ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties();
	ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIgnorePath();

	/*! \brief Set 
	 */
	void setIgnorePath(ConfigNodePropertyBoolean  ignore_path);

private:
	ConfigNodePropertyBoolean ignore_path;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties_H_ */
