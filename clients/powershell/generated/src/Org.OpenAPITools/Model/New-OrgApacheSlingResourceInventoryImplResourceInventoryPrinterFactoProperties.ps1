function New-OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${felixPeriodinventoryPeriodprinterPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${felixPeriodinventoryPeriodprinterPeriodtitle},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${path}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties -ArgumentList @(
            ${felixPeriodinventoryPeriodprinterPeriodname},
            ${felixPeriodinventoryPeriodprinterPeriodtitle},
            ${path}
        )
    }
}
