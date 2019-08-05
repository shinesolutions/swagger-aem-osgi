function New-ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodschedulerPeriodperiod},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodstagingPeriodtimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties -ArgumentList @(
            ${cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodenable},
            ${cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodschedulerPeriodperiod},
            ${cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodstagingPeriodtimeout}
        )
    }
}
