function New-ComDayCqDamCoreImplServletHealthCheckServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodsyncPeriodworkflowPeriodid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodsyncPeriodfolderPeriodtypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletHealthCheckServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletHealthCheckServletProperties -ArgumentList @(
            ${cqPerioddamPeriodsyncPeriodworkflowPeriodid},
            ${cqPerioddamPeriodsyncPeriodfolderPeriodtypes}
        )
    }
}
