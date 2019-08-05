function New-OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${localePerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${preloadPeriodbundles},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${invalidationPerioddelay}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingI18nImplJcrResourceBundleProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingI18nImplJcrResourceBundleProviderProperties -ArgumentList @(
            ${localePerioddefault},
            ${preloadPeriodbundles},
            ${invalidationPerioddelay}
        )
    }
}
