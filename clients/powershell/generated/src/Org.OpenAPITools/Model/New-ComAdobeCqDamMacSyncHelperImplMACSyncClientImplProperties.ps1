function New-ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePerioddamPeriodmacPeriodsyncPeriodclientPeriodsoPeriodtimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties -ArgumentList @(
            ${comPeriodadobePerioddamPeriodmacPeriodsyncPeriodclientPeriodsoPeriodtimeout}
        )
    }
}
