function New-ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodprojectPath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodscheduleFrequency}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties -ArgumentList @(
            ${comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodprojectPath},
            ${comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodscheduleFrequency}
        )
    }
}
