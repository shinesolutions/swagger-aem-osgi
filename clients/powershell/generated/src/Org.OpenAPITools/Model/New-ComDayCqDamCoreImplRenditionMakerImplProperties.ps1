function New-ComDayCqDamCoreImplRenditionMakerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${xmpPeriodpropagate},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${xmpPeriodexcludes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplRenditionMakerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplRenditionMakerImplProperties -ArgumentList @(
            ${xmpPeriodpropagate},
            ${xmpPeriodexcludes}
        )
    }
}
