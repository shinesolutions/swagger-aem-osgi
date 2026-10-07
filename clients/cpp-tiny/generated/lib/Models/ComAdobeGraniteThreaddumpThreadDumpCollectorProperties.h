
/*
 * ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteThreaddumpThreadDumpCollectorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteThreaddumpThreadDumpCollectorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteThreaddumpThreadDumpCollectorProperties();
    ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteThreaddumpThreadDumpCollectorProperties();


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
	ConfigNodePropertyDropDown getSchedulerrunOn();

	/*! \brief Set 
	 */
	void setSchedulerrunOn(ConfigNodePropertyDropDown schedulerrunOn);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitethreaddumpenabled();

	/*! \brief Set 
	 */
	void setGranitethreaddumpenabled(ConfigNodePropertyBoolean granitethreaddumpenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGranitethreaddumpdumpsPerFile();

	/*! \brief Set 
	 */
	void setGranitethreaddumpdumpsPerFile(ConfigNodePropertyInteger granitethreaddumpdumpsPerFile);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitethreaddumpenableGzipCompression();

	/*! \brief Set 
	 */
	void setGranitethreaddumpenableGzipCompression(ConfigNodePropertyBoolean granitethreaddumpenableGzipCompression);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitethreaddumpenableDirectoriesCompression();

	/*! \brief Set 
	 */
	void setGranitethreaddumpenableDirectoriesCompression(ConfigNodePropertyBoolean granitethreaddumpenableDirectoriesCompression);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitethreaddumpenableJStack();

	/*! \brief Set 
	 */
	void setGranitethreaddumpenableJStack(ConfigNodePropertyBoolean granitethreaddumpenableJStack);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGranitethreaddumpmaxBackupDays();

	/*! \brief Set 
	 */
	void setGranitethreaddumpmaxBackupDays(ConfigNodePropertyInteger granitethreaddumpmaxBackupDays);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGranitethreaddumpbackupCleanTrigger();

	/*! \brief Set 
	 */
	void setGranitethreaddumpbackupCleanTrigger(ConfigNodePropertyString granitethreaddumpbackupCleanTrigger);


    private:
    ConfigNodePropertyInteger schedulerperiod;
    ConfigNodePropertyDropDown schedulerrunOn;
    ConfigNodePropertyBoolean granitethreaddumpenabled;
    ConfigNodePropertyInteger granitethreaddumpdumpsPerFile;
    ConfigNodePropertyBoolean granitethreaddumpenableGzipCompression;
    ConfigNodePropertyBoolean granitethreaddumpenableDirectoriesCompression;
    ConfigNodePropertyBoolean granitethreaddumpenableJStack;
    ConfigNodePropertyInteger granitethreaddumpmaxBackupDays;
    ConfigNodePropertyString granitethreaddumpbackupCleanTrigger;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteThreaddumpThreadDumpCollectorProperties_H_ */
