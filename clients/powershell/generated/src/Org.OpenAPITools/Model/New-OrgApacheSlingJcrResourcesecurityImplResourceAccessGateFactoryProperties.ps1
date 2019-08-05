function New-OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${path},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${checkpathPeriodprefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jcrPath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties -ArgumentList @(
            ${path},
            ${checkpathPeriodprefix},
            ${jcrPath}
        )
    }
}
