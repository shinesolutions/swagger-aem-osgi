function New-OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${providerType}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties -ArgumentList @(
            ${providerType}
        )
    }
}
