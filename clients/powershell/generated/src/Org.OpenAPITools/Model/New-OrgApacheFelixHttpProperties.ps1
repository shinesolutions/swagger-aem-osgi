function New-OrgApacheFelixHttpProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodhost},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodosgiPeriodservicePeriodhttpPeriodport},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodcontextUnderscorepath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodmbeans},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodthreadpoolPeriodmax},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodacceptors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodselectors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodheaderBufferSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodrequestBufferSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodresponseBufferSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodmaxFormSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodpathUnderscoreexclusions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodexcluded},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodincluded},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodsendServerHeader},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodincluded},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodexcluded},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodproxyPeriodloadPeriodbalancerPeriodconnectionPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodrenegotiateAllowed},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodhttpOnly},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodsecure},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionIdPathParameterName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodeclipsePeriodjettyPeriodservletPeriodCheckingRemoteSessionIdEncoding},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionCookie},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionDomain},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionPath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodeclipsePeriodjettyPeriodservletPeriodMaxAge},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgziphandlerPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodminGzipSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodcompressionLevel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodinflateBufferSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodsyncFlush},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedUserAgents},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMethods},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMethods},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedPaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedPaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMimeTypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMimeTypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodinvalidate},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPerioduniqueid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixHttpProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixHttpProperties -ArgumentList @(
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodhost},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodenable},
            ${orgPeriodosgiPeriodservicePeriodhttpPeriodport},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodtimeout},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodenable},
            ${orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodcontextUnderscorepath},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodmbeans},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodtimeout},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodthreadpoolPeriodmax},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodacceptors},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodselectors},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodheaderBufferSize},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodrequestBufferSize},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodresponseBufferSize},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodmaxFormSize},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodpathUnderscoreexclusions},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodexcluded},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodincluded},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodsendServerHeader},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodincluded},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodexcluded},
            ${orgPeriodapachePeriodfelixPeriodproxyPeriodloadPeriodbalancerPeriodconnectionPeriodenable},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodrenegotiateAllowed},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodhttpOnly},
            ${orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodsecure},
            ${orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionIdPathParameterName},
            ${orgPeriodeclipsePeriodjettyPeriodservletPeriodCheckingRemoteSessionIdEncoding},
            ${orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionCookie},
            ${orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionDomain},
            ${orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionPath},
            ${orgPeriodeclipsePeriodjettyPeriodservletPeriodMaxAge},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodname},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgziphandlerPeriodenable},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodminGzipSize},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodcompressionLevel},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodinflateBufferSize},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodsyncFlush},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedUserAgents},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMethods},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMethods},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedPaths},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedPaths},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMimeTypes},
            ${orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMimeTypes},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodinvalidate},
            ${orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPerioduniqueid}
        )
    }
}
