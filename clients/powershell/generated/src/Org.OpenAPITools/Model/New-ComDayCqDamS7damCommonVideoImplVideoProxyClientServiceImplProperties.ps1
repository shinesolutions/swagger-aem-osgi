function New-ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodminsizePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodpartsizePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodnumthreadPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodreadtimeoutPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodconnectiontimeoutPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodmaxretrycountPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePerioduploadprogressPeriodintervalPeriodname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties -ArgumentList @(
            ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodminsizePeriodname},
            ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodpartsizePeriodname},
            ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodnumthreadPeriodname},
            ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodreadtimeoutPeriodname},
            ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodconnectiontimeoutPeriodname},
            ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodmaxretrycountPeriodname},
            ${cqPerioddamPeriods7damPeriodvideoproxyclientservicePerioduploadprogressPeriodintervalPeriodname}
        )
    }
}
