
/*
 * ComDayCqStatisticsImplStatisticsServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqStatisticsImplStatisticsServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqStatisticsImplStatisticsServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqStatisticsImplStatisticsServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqStatisticsImplStatisticsServiceImplProperties();
    ComDayCqStatisticsImplStatisticsServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqStatisticsImplStatisticsServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSchedulerperiod();

	/*! \brief Set 
	 */
	void setSchedulerperiod(ConfigNodePropertyInteger schedulerperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSchedulerconcurrent();

	/*! \brief Set 
	 */
	void setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWorkspace();

	/*! \brief Set 
	 */
	void setWorkspace(ConfigNodePropertyString workspace);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKeywordsPath();

	/*! \brief Set 
	 */
	void setKeywordsPath(ConfigNodePropertyString keywordsPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAsyncEntries();

	/*! \brief Set 
	 */
	void setAsyncEntries(ConfigNodePropertyBoolean asyncEntries);


    private:
    ConfigNodePropertyInteger schedulerperiod;
    ConfigNodePropertyBoolean schedulerconcurrent;
    ConfigNodePropertyString path;
    ConfigNodePropertyString workspace;
    ConfigNodePropertyString keywordsPath;
    ConfigNodePropertyBoolean asyncEntries;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqStatisticsImplStatisticsServiceImplProperties_H_ */
