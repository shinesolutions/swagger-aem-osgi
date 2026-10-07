
/*
 * ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties();
    ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSearchpattern();

	/*! \brief Set 
	 */
	void setSearchpattern(ConfigNodePropertyString searchpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getReplacepattern();

	/*! \brief Set 
	 */
	void setReplacepattern(ConfigNodePropertyString replacepattern);


    private:
    ConfigNodePropertyString searchpattern;
    ConfigNodePropertyString replacepattern;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties_H_ */
