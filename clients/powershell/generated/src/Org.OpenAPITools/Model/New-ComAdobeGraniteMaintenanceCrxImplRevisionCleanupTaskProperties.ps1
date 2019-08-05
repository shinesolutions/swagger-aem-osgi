function New-ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fullPeriodgcPerioddays}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties -ArgumentList @(
            ${fullPeriodgcPerioddays}
        )
    }
}
