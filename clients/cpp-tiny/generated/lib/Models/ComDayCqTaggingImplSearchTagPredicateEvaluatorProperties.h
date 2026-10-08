
/*
 * ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties();
    ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIgnorePath();

	/*! \brief Set 
	 */
	void setIgnorePath(ConfigNodePropertyBoolean ignore_path);


    private:
    ConfigNodePropertyBoolean ignore_path;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties_H_ */
