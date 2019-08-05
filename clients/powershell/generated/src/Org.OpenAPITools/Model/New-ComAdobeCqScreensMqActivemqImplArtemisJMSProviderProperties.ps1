function New-ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${globalPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPerioddiskPeriodusage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${persistencePeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${threadPeriodpoolPeriodmaxPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${scheduledPeriodthreadPeriodpoolPeriodmaxPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${gracefulPeriodshutdownPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${queues},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${topics},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${addressesPeriodmaxPerioddeliveryPeriodattempts},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${addressesPeriodexpiryPerioddelay},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${addressesPeriodaddressPeriodfullPeriodmessagePeriodpolicy},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${addressesPeriodmaxPeriodsizePeriodbytes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${addressesPeriodpagePeriodsizePeriodbytes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${addressesPeriodpagePeriodcachePeriodmaxPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${clusterPerioduser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${clusterPeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodcallPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodcallPeriodfailoverPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodclientPeriodfailurePeriodcheckPeriodperiod},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodnotificationPeriodattempts},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodnotificationPeriodinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${idPeriodcachePeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodconfirmationPeriodwindowPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodconnectionPeriodttl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${clusterPeriodduplicatePerioddetection},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodinitialPeriodconnectPeriodattempts},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodmaxPeriodretryPeriodinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodminPeriodlargePeriodmessagePeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodproducerPeriodwindowPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodreconnectPeriodattempts},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodretryPeriodinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyFloat]]
        ${clusterPeriodretryPeriodintervalPeriodmultiplier}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties -ArgumentList @(
            ${servicePeriodranking},
            ${globalPeriodsize},
            ${maxPerioddiskPeriodusage},
            ${persistencePeriodenabled},
            ${threadPeriodpoolPeriodmaxPeriodsize},
            ${scheduledPeriodthreadPeriodpoolPeriodmaxPeriodsize},
            ${gracefulPeriodshutdownPeriodtimeout},
            ${queues},
            ${topics},
            ${addressesPeriodmaxPerioddeliveryPeriodattempts},
            ${addressesPeriodexpiryPerioddelay},
            ${addressesPeriodaddressPeriodfullPeriodmessagePeriodpolicy},
            ${addressesPeriodmaxPeriodsizePeriodbytes},
            ${addressesPeriodpagePeriodsizePeriodbytes},
            ${addressesPeriodpagePeriodcachePeriodmaxPeriodsize},
            ${clusterPerioduser},
            ${clusterPeriodpassword},
            ${clusterPeriodcallPeriodtimeout},
            ${clusterPeriodcallPeriodfailoverPeriodtimeout},
            ${clusterPeriodclientPeriodfailurePeriodcheckPeriodperiod},
            ${clusterPeriodnotificationPeriodattempts},
            ${clusterPeriodnotificationPeriodinterval},
            ${idPeriodcachePeriodsize},
            ${clusterPeriodconfirmationPeriodwindowPeriodsize},
            ${clusterPeriodconnectionPeriodttl},
            ${clusterPeriodduplicatePerioddetection},
            ${clusterPeriodinitialPeriodconnectPeriodattempts},
            ${clusterPeriodmaxPeriodretryPeriodinterval},
            ${clusterPeriodminPeriodlargePeriodmessagePeriodsize},
            ${clusterPeriodproducerPeriodwindowPeriodsize},
            ${clusterPeriodreconnectPeriodattempts},
            ${clusterPeriodretryPeriodinterval},
            ${clusterPeriodretryPeriodintervalPeriodmultiplier}
        )
    }
}
