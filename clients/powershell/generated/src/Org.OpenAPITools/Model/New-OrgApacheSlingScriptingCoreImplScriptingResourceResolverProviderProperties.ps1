function New-OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${logPeriodstacktracePeriodonclose}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties -ArgumentList @(
            ${logPeriodstacktracePeriodonclose}
        )
    }
}
