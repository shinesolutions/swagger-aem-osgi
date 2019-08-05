function New-OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties -ArgumentList @(
            ${name},
            ${description},
            ${enabled}
        )
    }
}
