
/*
 * ComDayCqPollingImporterImplPollingImporterImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqPollingImporterImplPollingImporterImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqPollingImporterImplPollingImporterImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqPollingImporterImplPollingImporterImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqPollingImporterImplPollingImporterImplProperties();
    ComDayCqPollingImporterImplPollingImporterImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqPollingImporterImplPollingImporterImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getImportermininterval();

	/*! \brief Set 
	 */
	void setImportermininterval(ConfigNodePropertyInteger importermininterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImporteruser();

	/*! \brief Set 
	 */
	void setImporteruser(ConfigNodePropertyString importeruser);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludepaths();

	/*! \brief Set 
	 */
	void setExcludepaths(ConfigNodePropertyArray excludepaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIncludepaths();

	/*! \brief Set 
	 */
	void setIncludepaths(ConfigNodePropertyArray includepaths);


    private:
    ConfigNodePropertyInteger importermininterval;
    ConfigNodePropertyString importeruser;
    ConfigNodePropertyArray excludepaths;
    ConfigNodePropertyArray includepaths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqPollingImporterImplPollingImporterImplProperties_H_ */
