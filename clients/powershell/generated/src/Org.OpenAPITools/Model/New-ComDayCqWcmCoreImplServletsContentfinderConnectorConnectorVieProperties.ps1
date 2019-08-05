function New-ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${itemPeriodresourcePeriodtypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties -ArgumentList @(
            ${itemPeriodresourcePeriodtypes}
        )
    }
}
